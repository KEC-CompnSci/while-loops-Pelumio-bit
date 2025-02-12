[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18169068)
# Scanner and Loops Practice

Welcome to the Scanner and Loops practice assignment! In this exercise, you'll apply what you've learned about using Scanner for input and while loops in Java to solve three different programming challenges.

## Getting Started

1. Open the `Assignment.java` file in the `src/main/java` directory
2. You'll find three methods to implement:
   - `repeatWord`
   - `createPyramid`
   - `countTo`
3. Each method has detailed TODO comments explaining what you need to do
4. The `main` method contains code to test your implementations interactively

## The Challenges

### 1. Word Repeater
Create a method that repeats a word a specified number of times:
```java
repeatWord("hello", 3) → "hello hello hello"
repeatWord("java", 2) → "java java"
```
- Words should be separated by single spaces
- No trailing space at the end of the result
- Use a while loop for the repetition

### 2. Number Pyramid
Create a string pyramid where each row repeats its number:
```
For maxNumber = 3:
1
22
333
```
- Use nested while loops
- Each row should end with a newline character (`\n`)
- The last row should not have an extra newline
- Numbers increase from 1 to maxNumber

### 3. Counting Game (FizzBuzz)
Create a string of numbers with special replacements:
```java
countTo(5) → "1 2 Fizz 4 Buzz"
countTo(15) → "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz"
```
- Replace multiples of 3 with "Fizz"
- Replace multiples of 5 with "Buzz"
- Replace multiples of both with "FizzBuzz"
- Numbers/words should be separated by spaces
- No trailing space at the end

## Testing Your Code

### Interactive Testing
Run the `main` method in `Assignment.java` to test your code interactively. This will let you input values and see the results.

### Automated Testing
Run `mvn test` in your terminal to run the automated tests. The tests will check if your implementations work correctly for various inputs.

## Hints and Tips

1. **While Loops**: Remember the basic structure:
   ```java
   while (condition) {
       // code to repeat
   }
   ```

2. **String Building**: You can build strings gradually:
   ```java
   String result = "";
   result = result + "new text";
   ```

3. **Testing Edge Cases**:
   - What happens if the repeat count is 0?
   - What happens if the pyramid number is 1?
   - What happens if the counting game goes to 15?

4. **Common Mistakes to Avoid**:
   - Forgetting to remove trailing spaces
   - Adding extra newlines
   - Not handling the FizzBuzz case correctly (numbers divisible by both 3 and 5)

## Requirements Checklist

Before submitting, make sure:
- [ ] All three methods are implemented
- [ ] You've used while loops (not for loops)
- [ ] Your code passes all the tests (`mvn test`)
- [ ] Output formats match the examples exactly
- [ ] You've tested edge cases
- [ ] Code is properly indented and readable

## Submission

After completing the implementation:
1. Make sure all tests pass
2. Commit your changes
3. Push to your repository
4. Submit through GitHub Classroom

Good luck!