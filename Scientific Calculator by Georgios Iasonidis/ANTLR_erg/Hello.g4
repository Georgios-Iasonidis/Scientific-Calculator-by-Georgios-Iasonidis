grammar Hello;

rul: logic_operations+ EOF;

ID: [a-z]+;

WS: [ \t\r\n]+ -> skip;

ADD: '+';
MINUS: '-';
MULTI: '*';
DIV: '/';
POW: '^';
SIN: 'SIN';
COS: 'COS';
TAN: 'TAN';
COT: 'COT';
MOD: '%';
AND: '&&';
OR: '||';
NOT: '!';
XOR: 'XOR'; 
NAND: 'NAND';
LOG: 'LOG';
FACTORIAL: 'FACT';
P: [-]? 'P';
SQRT: 'SQRT';
E: [-]? 'E';

SEMI: ';';
LEFTPAR: '(';
RIGHTPAR: ')';

NUM: [0-9]+ ('.' [0-9]+)?;
LOGIC: 'TRUE' | 'FALSE';

logic_operations:
    add_op
    | minus_op
    | multi_op
    | div_op
    | pow_op
    | sin_op
    | cos_op
    | tan_op
    | cot_op
    | mod_op
    | and_op
    | or_op
    | not_op
    | xor_op 
    | nand_op
    | log_op
    | factorial_op
    | p_op
    | sqrt_op
    | e_op;

add_op: NUM ADD NUM SEMI;
minus_op: NUM MINUS NUM SEMI;
multi_op: NUM MULTI NUM SEMI;
div_op: NUM DIV NUM SEMI;
pow_op: NUM POW NUM SEMI;
sin_op: SIN LEFTPAR NUM RIGHTPAR SEMI;
cos_op: COS LEFTPAR NUM RIGHTPAR SEMI;
tan_op: TAN LEFTPAR NUM RIGHTPAR SEMI;
cot_op: COT LEFTPAR NUM RIGHTPAR SEMI;
mod_op: NUM MOD NUM SEMI;
and_op: LOGIC AND LOGIC SEMI;
or_op: LOGIC OR LOGIC SEMI;
not_op: NOT LOGIC SEMI;
xor_op: LOGIC XOR LOGIC SEMI; 
nand_op: LOGIC NAND LOGIC SEMI;
log_op: LOG LEFTPAR NUM RIGHTPAR SEMI;
factorial_op: NUM FACTORIAL SEMI;
p_op: P SEMI;
sqrt_op: SQRT LEFTPAR NUM RIGHTPAR SEMI;
e_op: E SEMI;
