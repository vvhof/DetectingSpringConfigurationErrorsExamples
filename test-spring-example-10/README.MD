# Example 10: @Async methods may not use @Transactional

## Test Summary:
- Files should have no compilation errors
- Files should have 1 diagnostic
- Diagnostic should be a Warning
- Warning should be in Person.java
- Warning should be in Line 14
- Warning message should be
> Invalid Use of @Async in conjunction with @Transactional
