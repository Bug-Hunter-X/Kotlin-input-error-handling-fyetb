# Kotlin Input Error Handling

This example demonstrates a common error in Kotlin: improper input handling. The `calculateArea` function itself is fine, but the `main` function doesn't handle potential exceptions during input.  If a user enters text instead of an integer, the `toInt()` call will throw a `NumberFormatException`, causing the program to crash.

The solution shows how to gracefully handle this using `try-catch` blocks and provide better feedback to the user.