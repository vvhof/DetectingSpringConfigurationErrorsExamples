# Example 7: @PostConstruct methods may not use @Async

## Test Summary:

- Files should have no compilation errors
- Files should have 2 diagnostics

- Diagnostic 1 should be a Warning
- Warning should be in Lecture.java
- Warning should be in Line 13
- Warning message should be:
> @PostConstruct methods may not use @Async

- Diagnostic 2 should be a Warning
- Warning should be in Person.java
- Warning should be in Line 14
- Warning message should be:
> @PostConstruct methods may not use @Async
