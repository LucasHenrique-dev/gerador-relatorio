# Especificação do Projeto

## Estrutura de Arquivos
Os arquivos deste projeto estão organizados nos seguintes arquivos e pastas:

- src: Programas em Java escritos pelo programador

- src-gen: Programas em Java gerados automaticamente pelo ANTLR

- classes: Arquivos .class gerados pela compilação dos códigos fontes

- antlr.jar: Ferramenta ANTLR versão 4 baixada do site https://www.antlr.org/

- GeradorRelatorio.g4: Linguagem de expressões desenvolvida

## Métodos da Linguagem
As seguintes assinaturas representam os métodos aceitos pela DSL desenvolvida:

- getTopEmpresasMaisContratam( numero ): Este método recebe um número como parâmetro e
    - Parâmetro: número determinando o número de empresas que será exibido no gráfico
    - Objetivo: método responsável por gerar um gráfico das `numero` empresas que mais contratam alunos
    - Retorno: gráfico das `numero` empresas que mais contratam alunos

- extrairDados( texto ): 
    - Parâmetro: texo representando o caminho do arquivo excel
    - Objetivo: método responsável por carregar os dados da planilha excel no sistema
    - Retorno: -

- estagiosPorCurso( texto ):
    - Parâmetro: texo representando o nome do curso o qual deseja-se realizar a busca
    - Objetivo: método responsável por exibir o quantitativo de alunos que estagiam, referentes ao curso passado por parâmetro
    - Retorno: quantidade de alunos estagiando para o curso dado

## Frontend

Desenvolvido através da ferramenta [ANTLR](https://www.antlr.org/), a gramática do projeto está definida da seguinte forma:

````ANTLR
// SÍMBOLOS NÃO TERMINAIS:
NUM:    [0-9]+;
STRING: [a-zA-Z0-9 \\/:._]+;
ESPACO: [ \t\n]+ -> skip;

// SÍMBOLOS TERMINAIS
program: exp+ EOF;

exp:  'getTopEmpresasMaisContratam' '(' NUM ')'
    | 'extrairDados' '(' STRING ')'
    | 'estagiosPorCurso' '(' STRING ')'
    ;
````

## Backend

