grammar GeradorRelatorio;

//SÍMBOLOS TERMINAIS
NUM: [0-9]+;
STRING: ["][a-zA-Z0-9 \\/:._]+["];

ESPACO: [ \t\n\r]+ -> skip ;

//SÍMBOLOS NÃO TERMINAIS
program
    : exp+ EOF
    ;

exp
    : 'getTopEmpresasMaisContratam' '(' NUM ')' #getTop
    | 'extrairDados' '(' STRING ')'             #extrairDados
    | 'estagiosPorCurso' '(' STRING ')'         #estagiosCurso
    ;


