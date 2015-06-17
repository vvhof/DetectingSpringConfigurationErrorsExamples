# Example 6: @Async and Wrong Return Types

## Test Summary:
- Files should have no compilation errors
- Files should have 2 diagnostics

- Diagnostic 1 should be a Warning
- Warning should be in Lecture.java
- Warning should be in Line 20
- Warning message should be:
> @Async requires void or Future as the method's return type

- Diagnostic 2 should be a Warning
- Warning should be in Person.java
- Warning should be in Line 23
- Warning message should be
> @Async requires void or Future as the method's return type
