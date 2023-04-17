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
    : ID '!=' ID                                   #NegacaoExcalmacao
    | 'NOT' ID                                     #NegacaoNot
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

