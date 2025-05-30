# clean-code-kata-easy
Easy code kata to practice clean coding.

## Proposed exercises (to be done in 15–30 min)

1. Add a first unit test for function “c” in its initial “dirty” state (put a "safety net" over legacy code)
2. Propose meaningful variable, function and signature names
3. Identify multiple responsibilities, and break them in simpler pieces
4. Handle edge cases (such as division by 0)
5. Refactor more (for example: add an enum, split unit tests so each test cover only one operation, etc.)
6. Bonus: Use the Strategy and Factory design patterns to make the code easier to maintain

**Tips:**
* At each step, make sure to improve your tests *BEFORE* writing new code or refactoring existing code (red, green, refactor).
* The linter is your “friend” and can show you how to take advantage of language features (e.g.: use when instead of nested if…else in Kotlin).

## How to run the tests
### IntelliJ IDEA

1. Open the project in IntelliJ IDEA.
2. Make sure you have the Kotlin plugin installed.
3. Run the tests by right-clicking on the test file and selecting "Run 'All Tests'".
4. You can also run individual tests by right-clicking on the test method and selecting "Run".
5. To run the application, right-click on the main function in the `Main.kt` file and select "Run 'MainKt'".

Happy coding!

## Contributing
If you have suggestions for improvements or additional exercises, feel free to open an issue or submit a pull request. Contributions are welcome!
