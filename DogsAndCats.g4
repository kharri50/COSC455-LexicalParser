//grammar DogsAndCats;

// Traditional BNF Form...
//
//	<S>  ::= <NP> <V> <NP>
//	<NP> ::= <A> <N>
//	<V>  ::= 'loves' | 'hates' | 'eats'
//  <A>  ::= 'a' | 'the';
//	<N>  ::= 'dog' | 'cat' | 'rat'


// ANTLR 3 Syntax....
s 	: np v np;
np 	: a n;
v	: 'loves' | 'hates' | 'eats';
a 	: 'a' | 'the';
n	: 'dog' | 'cat' | 'rat';






// ANTLR 3 Specific for defining "whitespace" to the Lexer.
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

