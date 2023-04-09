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

EXCEL: `TABELA`;        </br>
COLUNA: `COLUNAS`       </br>
RESTRICAO: `RESTRIÇÕES` </br>
AGRUPAR: `COLUNAS`      </br>
ASC/DEC                 </br>
LIMIT `NUM`             </br>

- EXCEL: `TABELA`;: é o equivalente ao `FROM TABELA` onde `TABELA` é a base de dados/página do Excel

- COLUNA: `COLUNAS`: é o equivalente ao `SELECT COLUNAS` onde `COLUNAS` é a sequência de informações o qual se quer mostrar. As informações incluem colunas do excel ou funções agregadoras.
    - `ID`: uma informação possível de ser exibida e representa uma coluna do excel
    - `fun`: uma informação possível de ser exibida e representa uma função agregadora
        - `'COUNT' '('ID')'`: é o equivalente ao `COUNT(ID)` que mostra a quantidade total de dados para `ID`

- RESTRICAO: `RESTRIÇÕES`: é o equivalente ao `WHERE RESTRIÇÕES` onde `RESTRIÇÕES` é a sequência de condições as quais os dados devem obedecer
    - Tipos de `RESTRIÇÕES` aceitas: `ID` = `ID` ou `ID` = `NUM` onde `ID` é uma palavra e `NUM` é um número natural qualquer
    - `ID`: sequência de caracteres que incluem as letras do alfabeto (minúsculo/maiúsculo), números e outros caracteres como `.-_`. Todo `ID` começa com pelo menos 1 letra do alfabeto.

- AGRUPAR: `COLUNAS`: é o equivalente ao `GROUP BY COLUNAS` onde `COLUNAS` é a sequência de colunas do excel o qual se deseja agrupar os dados.

- ASC/DEC: é o equivalente ao `ASC`/`DESC`
    - `ASC`: ordena os dados de forma crescente
    - `DEC`: ordena os dados de forma decrescente

- LIMIT `NUM`: é o equivalente ao `LIMIT NUM` onde `NUM` é o número de linhas o qual se deseja exibir do excel

## Frontend

Desenvolvido através da ferramenta [ANTLR](https://www.antlr.org/), a gramática do projeto está definida da seguinte forma:

````ANTLR
grammar GeradorRelatorio;

//SÍMBOLOS TERMINAIS
NUM: [0-9]+;
ID: [a-zA-Z][a-zA-Z0-9-_.]+;

ESPACO: [ \t\n\r]+ -> skip;

//SÍMBOLOS NÃO TERMINAIS
program
    : 'EXCEL:' ID ';' slct? ordem? len?             #Programa
    ;

igualdade
    : ID '=' (ID | NUM)                             #Igu
    ;

sequenciaID
    : (ID ',')* ID                                  #SeqID
    ;

sequenciaIgualdade
    : (igualdade ',')* igualdade                    #SeqIgu
    ;

elemSlct
    : ID                                            #Str
    | fun                                           #Funcao
    ;

sequenciaSelect
    : (elemSlct ',')* elemSlct                      #SeqSelect
    ;

slct
    : 'COLUNA:' sequenciaSelect whr?                #Select
    ;

whr
    : 'RESTRICAO:' sequenciaIgualdade aggr?         #Where
    ;

aggr
    : 'AGRUPAR:' sequenciaID                        #Agrupar
    ;

fun
    : 'COUNT' '('ID')'                              #Count
    ;

ordem
    : 'ASC'                                         #Crescente
    | 'DEC'                                         #Decrescente
    ;

len
    : 'LIMIT' NUM                                   #Limit
    ;
````

## Backend

