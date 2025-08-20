# Copilot Instructions for AI Agents

## Project Overview

This workspace contains multiple Java projects, organized by topic and technology:
- Core Java concepts (`java_generics.java`, `Lamda_function.java`, `Threads.java`)
- Algorithmic exercises (`cognizant/`)
- Java Collections (`Java_collection/` with subfolders for List, Map, Set)
- JDBC examples (`jdbc/`)
- JUnit testing projects (`Junit-01/`, `Junit03/`, `Junit5-06/`)
- Each topic is separated into its own directory, with source files and compiled `.class` files.

## Architecture & Patterns

- **Single-file exercises:** Most algorithmic and concept demos are implemented as standalone classes with a `main` method.
- **Collections:** Examples are grouped by type (List, Map, Set) and demonstrate usage of Java collection classes.
- **JUnit Projects:** Follow Maven/Gradle conventions with `src/main/java` for source and `src/test/java` for tests. Test classes typically end with `Test.java`.
- **JDBC:** Follows a Maven structure, with JDBC demos in `src/main/java/jdbc/`.

## Developer Workflows

- **Compiling Java files:** Use `javac` for standalone files, or Maven (`mvn compile`) for Maven-based projects (`Junit-01`, `Junit5-06`, `jdbc`).
- **Running Java files:** Use `java <ClassName>` for standalone classes, or Maven (`mvn exec:java`) for Maven projects.
- **Running Tests:** For Maven projects, use `mvn test`. JUnit tests are located in `src/test/java/`.
- **Debugging:** No custom debug configurations; use VS Code's Java debugger or Maven's test/debug plugins.

## Conventions

- **Class Naming:** Classes use camel case, sometimes starting with lowercase (e.g., `elementLessOrEquals`).
- **File Organization:** Each concept or exercise is in its own file. Related files are grouped in topic folders.
- **No custom build scripts:** Standard Java and Maven commands apply.
- **No external dependencies** outside Maven projects (check `pom.xml` for details).

## Integration Points

- **Maven:** Used for dependency management and test execution in `Junit-01`, `Junit5-06`, and `jdbc`.
- **JUnit:** Used for unit testing in dedicated test folders.
- **No external APIs or services** are integrated in the current codebase.

## Examples

- To add a new algorithm, create a new `.java` file in the relevant topic folder and implement a `main` method.
- To add a new test, create a class ending with `Test.java` in the appropriate `src/test/java` directory of a Maven project.

## Key Files & Directories

- `cognizant/`: Algorithm exercises
- `Java_collection/`: Collection usage examples
- `jdbc/`: JDBC demos (Maven structure)
- `Junit-01/`, `Junit5-06/`: JUnit test projects (Maven structure)
