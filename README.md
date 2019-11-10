# ICPC-WA-Regional-2019
Div 2

## About:
This was the first programming competition I competed in. Our team was #369 called "Deep Mind", and consisted of me (Gregory Hablutzel), Garret Humphrey, and Jacob Sousie @Hyper2Code. I think I can speak for all members of our team in saying that this was one of the best experiences of our lives. I was initially hesitant about participating, but I am very glad I did. I never expected programming, and deriving (very primitive) algorithms to be this level of fun. I'm pretty certain we will all be competiting next year in Div 1.
## Slow Start:
We had finished the practice problem very quickly, and felt confident. However, during the competition we had a really slow start. We didn't realize how important optimizations and edge cases were in the scope of this competition. 
## Optimization Example:
For example, in problem Q, one of the cases was if A was 1, and B was <= 10^9. In this case, we would have run 10^9 operations, doing A++ until it reached the value of B. As a result, we had received a runtime error on our submission. We fixed this by including an if statement, checking if A was 1 and B was 10^9. Surely, this would also occur if B was 2, but I guess for the sake of this competition, the edge cases weren't too exhaustive.


