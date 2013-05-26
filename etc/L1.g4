/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar L1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



prog : ( stat1e (';'? | NL?) | NL )* EOF            #lprog
     ;

stat1e:e                                            #lexpr
       | stat                                       #lstat
       |  FUN_DEF ID '(' parameters? ')' b          #lfunction
       ;

parameters: ID (',' ID)*                           
            ;


b : '{' (NL | b | stat )* '}'                       #lblock
        ;

stat: 'if' e 'then' b ('else' b)?                   #lifstat
    | e '=' e ';'                                   #lassignstat
    | e ';'                                         #ldemaexpr
    | 'return' e ';'                                #lreturn
    | 'print'  e ';'                                #lprint
    ;



elist : e (',' e)*                                 #lparamsvalue
        ;
e :   TRUE                                          #ltrue
     | FALSE                                        #lfalse
     | NUMBER                                       #lnumber
     | STRING                                       #lstring
     | ID                                           #lid
     | ID '(' elist? ')'                            #lcallfun
     | '[' elist ']'                                #larraydef
     | e '[' e ']'                                 #larrayvisit
     | '!' e                                       #lbooleannagative
     | e op=('*' | '/') e                             #lmuldiv 
     | ('-') e                                       #lnegative
     | e op=('+' | '-') e                              #lsubAdd
     | e op=('!=' | '==' | '>=' | '>' | '<=' | '<' ) e #lcondition
     | e '&&' e                                   #land
     | e '||' e                                     #lor
     | '(' e ')'                                    #lcoma
    ;


PRINT : 'print';
RETURN : 'return';
TRUE : 'true';
FALSE : 'false';
THEN : 'then';
SIGN : '!';
NL: '\r'? '\n' ;
COMA: ',' ;
ADD: '+' ;
SUB: '-' ;
MUL: '*';
DIV: '/';
ASSIGN : '=';
AND : '&&';
OR : '||' ;
G : '>';
GE : '>=';
L : '<';
LE : '<=';
EQ : '==';
NEQ : '!=';
LB : '(';
RB : ')';
LP : '[';
RP : ']';
LR : '{';
RR : '}' ;
DEMA: ';';
IF : 'if';
ELSE : 'else';
FUN_DEF : 'defun';

ID: [a-z|A-Z]+ ;

NUMBER : DIGIT+ '.' DIGIT+
       | DIGIT+
       ;
STRING: '"' (ESC | .)*? '"';

fragment ESC : '\\' [btnr"\\] ;
WS : [ \t]+ -> skip;
fragment DIGIT : [0-9];