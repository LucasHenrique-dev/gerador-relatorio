# Especificação das Fases do Gerador Gráfico de Relatórios

## Frontend

Desenvolvido através da ferramenta [ANTLR](https://www.antlr.org/), a gramática do projeto está definida da seguinte forma:

````ANTLR
// SÍMBOLOS NÃO TERMINAIS:
NUM:    [0-9]+;
STRING: ["][a-zA-Z0-9 \\/:._]+["];
ESPACO: [ \t\n]+ -> skip;

// SÍMBOLOS TERMINAIS
program: exp+ EOF;

exp:  'getTopEmpresasMaisContratam' '(' STRING ',' NUM ')'
    | 'extrairDados' '(' STRING ')'
    | 'estagiosPorCurso' '(' STRING ')'
    ;
````

## Backend

