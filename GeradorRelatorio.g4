grammar GeradorRelatorio;

//SÍMBOLOS TERMINAIS
NUM: [0-9]+;
ID: [a-zA-Z][a-zA-Z0-9 \-_.]+;

ESPACO: [ \t\n\r]+ -> skip;

//SÍMBOLOS NÃO TERMINAIS
program
    : 'EXCEL:' ID slct? ord? len?                  #Programa
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

elemOrdem
    : 'ASC'                                         #Ascendente
    | 'DEC'                                         #Decrescente
    ;
    
ord
    : 'ORDEM:' elemOrdem                            #Ordem
    ;

len
    : 'LIMITE:' NUM                                 #Limit
    ;