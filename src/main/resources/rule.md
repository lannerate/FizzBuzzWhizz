## Fizz Buzz Whizz rule

### R1
- times(3) -> Fizz
- times(5) -> Buzz
- times(7) -> Whizz

### R2
- times(3) && times(5) && times(7) -> FizzBuzzWhizz
- times(3) && times(5) -> FizzBuzz
- times(3) && times(7) -> FizzWhizz
- times(5) && times(7) -> BuzzWhizz

### R3

- contains(3) -> "Fizz"
- the priority of `R3` is highest

### R4

- always(n) -> n

### Composition

- R3 || R2 || R1 || R4

### Domain model

- Rule: (Int) -> String
- Matcher: (Int) -> Boolean
- Action: (Int) -> String

- Rule ::= atom | allof | anyof
1. atom: (Matcher, Action) -> String
2. allof: rule1 && rule2 ...
3. anyof: rule2 || rule2 ...