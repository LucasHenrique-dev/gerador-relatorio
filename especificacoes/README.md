# Especificação do Projeto

## Estrutura de Arquivos
Os arquivos deste projeto estão organizados nos seguintes arquivos e pastas:

- src: Programas em Java escritos pelo programador

- src-gen: Programas em Java gerados automaticamente pelo ANTLR

- classes: Arquivos .class gerados pela compilação dos códigos fontes

- antlr.jar: Ferramenta ANTLR versão 4 baixada do site https://www.antlr.org/

- GeradorRelatorio.g4: Linguagem de expressões desenvolvida

- fillo.jar: Ferramenta Fillo versão 1.22 baixada do site https://codoid.com/products/fillo/

- BASE_DE_DADOS.xlsx: Base de dados excel para as consultas SQL

- input.txt/input2.txt: Exemplos de entrada do sistema, contendo consultas SQL

## Estrutura da Linguagem
A linguagem funciona através de uma descrição em estilo SQL. Segue a seguinte estrutura:

EXCEL: `TABELA`         </br>
PAGINA: `PAGINA`        </br>
COLUNA: `COLUNAS`       </br>
RESTRICAO: `RESTRIÇÕES` </br>

- EXCEL: `TABELA`: é a instrução necessária para realizar a conexão com a base de dados (arquivo excel) onde `TABELA` é o nome do arquivo de extensão .xlsx

- PAGINA: `PAGINA`: é o equivalente ao `FROM PAGINA` onde `PAGINA` é uma página do excel e representa uma tabela no contexto de Query SQL

- COLUNA: `COLUNAS`: é o equivalente ao `SELECT COLUNAS` onde `COLUNAS` é a sequência de informações o qual se quer mostrar. As informações são as colunas da página do excel especificada.
    - `ID`: uma informação possível de ser exibida e representa uma coluna da tabela excel
    - `TUDO`: um identificador especial que pode ser usado em `COLUNAS` o qual retorna as informações de todas as colunas do excel

- RESTRICAO: `RESTRIÇÕES`: é o equivalente ao `WHERE RESTRIÇÕES` onde `RESTRIÇÕES` é a sequência de condições as quais os dados devem obedecer
    - Tipos de `RESTRIÇÕES` aceitas:
        - `ID` = `ID`: **Igualdade** de valor entre uma coluna do Excel e um texto buscado
        - `ID` = `NUM`: **Igualdade** de valor entre uma coluna do Excel e um número buscado
        - `ID` > `NUM`: **Comparação** de valor entre uma coluna do Excel e um valor numérico mínimo
        - `ID` >= `NUM`: **Comparação** de valor entre uma coluna do Excel e um valor numérico mínimo, podendo ser igual ao valor de referência
        - `ID` < `NUM`: **Comparação** de valor entre uma coluna do Excel e um valor numérico máximo
        - `ID` <= `NUM`: **Comparação** de valor entre uma coluna do Excel e um valor numérico máximo, podendo ser igual ao valor de referência
        - `NUM` < `ID` < `NUM`: **Comparação** de valor em um intervalo aberto entre uma coluna do Excel e dois valores numéricos de referência
        - `NUM` <= `ID` < `NUM`: **Comparação** de valor em um intervalo fechado à esquerda e aberto à direita entre uma coluna do Excel e dois valores numéricos de referência
        - `NUM` < `ID` <= `NUM`: **Comparação** de valor em um intervalo aberto à esquerda e fechado à direita entre uma coluna do Excel e dois valores numéricos de referência
        - `NUM` <= `ID` <= `NUM`: **Comparação** de valor em um intervalo fechado entre uma coluna do Excel e dois valores numéricos de referência
        - `ID` != `ID`: **Negação** de valor entre uma coluna do Excel e um texto a ser evitado
        - `ID` != `NUM`: **Negação** de valor entre uma coluna do Excel e um número a ser evitado
        - `ID` = '..`ID`': **Semelhança** entre o valor de uma coluna do Excel e um padrão de texto representado por '..ID', texto buscado está no fim
        - `ID` = '`ID`..': **Semelhança** entre o valor de uma coluna do Excel e um padrão de texto representado por 'ID..', texto buscado está no início
        - `ID` = '..`ID`..': **Semelhança** entre o valor de uma coluna do Excel e um padrão de texto representado por '..ID..', texto buscado está no centro
        - `ID` = 'NULL': **Comparação de Nulidade** entre o valor de uma coluna do Excel e o valor nulo (Célula Vazia)
        - `ID` != 'NULL': **Comparação de Não Nulidade** entre o valor de uma coluna do Excel e o valor nulo (Célula Vazia)

- `ID`: sequência de caracteres que incluem as letras do alfabeto (minúsculo/maiúsculo), números e outros caracteres como `-_`. Todo `ID` começa com pelo menos 1 letra do alfabeto.
- `NUM`: sequência de dígitos que incluem os números de 0 (zero) à 9 (nove). Todo `NUM` possui pelo menos 1 dígito.
- A DSL não trabalha com comparações do tipo data
- Ao omitir `COLUNA:` e `RESTRICAO:` é realizada uma consulta exibindo todas as informações do excel
- Ao usar o identificador `TUDO` em `COLUNAS` não há como especificar manualmente a ordem das colunas a serem exibidas

## Estrutura da Base de Dados

A base de dados utilizada como exemplo para a DSL possui as seguintes colunas e valores:

Curso | Nome_aluno | CPF | Nome_empresa | Tipo_Empresa | Tipo | Inicio | Fim | Orientador
|---  |---         |---  |---           |---           |---   |---     |---  |---
Engenharia Civil, Engenharia da Computacao, Engenharia Eletrica de Telecomunicacoes, Engenharia Eletrica Eletronica, Engenharia Mecanica Industrial, Engenharia Eletrica Eletrotecnica, Engenharia de Controle e Automacao | Intervalo numérico não contínuo de 0 até 687 | Intervalo numérico não contínuo de 0 até 6210 | EMPRESA N onde "N" pertence ao intervalo numérico não contínuo de 1 até 523 | Privada, Publica | Obrigatorio, Nao Obrigatorio | Data do tipo Dia/Mês/Ano onde o ano vai de 2019 até 2022 | Data do tipo Dia/Mês/Ano onde o ano vai de 2020 até 2024 | Intervalo numérico não contínuo de 8000 até 8113

## Frontend

Desenvolvido através da ferramenta [ANTLR](https://www.antlr.org/), a gramática do projeto está definida da seguinte forma:

````ANTLR
grammar GeradorRelatorio;

//SÍMBOLOS TERMINAIS
NUM: [0-9]+;
ID: [a-zA-Z][a-zA-Z0-9 \-_]*;
EXTENSAO: '.xlsx';
APOSTROFO: ['];

ESPACO: [ \t\n\r]+ -> skip;

//SÍMBOLOS NÃO TERMINAIS
program
    : 'EXCEL:' ID EXTENSAO frm slct?               #Programa
    ;

igu
    : ID '=' ID                                    #IgualdadeID
    | ID '=' NUM                                   #IgualdadeNum
    ;
    
comp
    : ID '>' NUM                                   #ComparadorMaior
    | ID '<' NUM                                   #ComparadorMenor
    | ID '>=' NUM                                  #ComparadorMaiorIgual
    | ID '<=' NUM                                  #ComparadorMenorIgual
    | NUM '<' ID '<' NUM                           #ComparadorIntervaloAberto
    | NUM '<=' ID '<=' NUM                         #ComparadorIntervaloFechado
    | NUM '<' ID '<=' NUM                          #ComparadorIntervaloSemiabertoEsquerda
    | NUM '<=' ID '<' NUM                          #ComparadorIntervaloSemiabertoDireita
    ;

neg
    : ID '!=' ID                                   #NegacaoID
    | ID '!=' NUM                                  #NegacaoNum
    ;
    
lk
    : ID '=' APOSTROFO ID '..' APOSTROFO           #LikeDireita
    | ID '=' APOSTROFO '..' ID APOSTROFO           #LikeEsquerda
    | ID '=' APOSTROFO '..' ID '..' APOSTROFO      #LikeDuplo        
    ;
    
nul
    : ID '=' 'NULL'                                 #IsNull
    | ID '!=' 'NULL'                                #IsNotNull
    ;

elemSlct
    : ID                                            #Str
    ;

seqSlct
    : (elemSlct ',')* elemSlct                      #SequenciaSelect
    ;
    
frm
    : 'PAGINA:' ID                                  #From
    ;

slct
    : 'COLUNA:' seqSlct whr?                        #Select
    | 'COLUNA:' 'TUDO' whr?                         #SelectTudo
    ;
    
opWhr
    : igu                                           #Igualdade
    | comp                                          #Comparacao
    | neg                                           #Negacao
    | lk                                            #Like
    | nul                                           #Nulidade
    ;
    
seqWhr
    : (opWhr ',')* opWhr                            #SequenciaWhere
    ;
    
whr
    : 'RESTRICAO:' seqWhr                           #Where
    ;
````

## Backend

