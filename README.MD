# Exemplary Spring Configuration Errors

This repository contains 12 exemplary types of Spring configuration errors that can occur while using the Spring framework. It is part of a research project to detect these types of errors based on attributed grammars and the Java pluggable annotation processing API.

## Error Types
1. Unused Transaction Manager
2. Invalid Use of @Autowired
3. @Autowired and Primitive Types
4. Unsupported @Required Annotation
5. @PreDestroy on Prototyped Beans
6. @Async and Wrong Return Types
7. @PostConstruct methods may not use @Async
8. @Scheduled and @Configurable results in multiple instances
9. Invalid Use of @Cacheable in conjunction with @CachePut
10. @Async methods may not use @Transactional
11. SQL String ends with semicolon
12. SQL string wildcards do not match and method parameters

Run Maven to build the example project
> mvn clean install
