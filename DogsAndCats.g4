grammar DogsAndCats;

// Traditional BNF Form...
//
//	<S>  ::= <NP> <V> <NP>
//	<NP> ::= <A> <N>
//	<V>  ::= 'loves' | 'hates' | 'eats'
//  <A>  ::= 'a' | 'the';
//	<N>  ::= 'dog' | 'cat' | 'rat'


s  :  np   v   np   comp   t;
np   :  a   an;
an   :  adj   n |  n    ;                   // Illustrates Choices
comp   :  conj  s |  empty  ;    // Illustrates Recursion (and a choice)
a  : 'a' | 'the';
v   : 'loves' | 'hates' | 'eats';
n   : 'dog' | 'cat' | 'rat';
adj : 'furry' | 'fast' | 'lazy' | 'sneaky';
conj  : 'and' | 'or';
empty : ;
t : '.' | ''