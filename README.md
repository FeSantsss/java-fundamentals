# java-fundamentals

A collection of my Java studies and exercises, organized by topic, from language basics to Spring Boot.

| Folder | Topic | Projects |
|---|---|---|
| [01-basico](01-basico) | Fundamentals: syntax, control flow, arrays, first classes | [EstudosJavaSemana01](01-basico/EstudosJavaSemana01), [EstudosJavaSemana02](01-basico/EstudosJavaSemana02), [EstudosJavaSemana03](01-basico/EstudosJavaSemana03), [ExercicioEspecial01](01-basico/ExercicioEspecial01), [ExercicioEspecial02](01-basico/ExercicioEspecial02), [ExeciciosEspeciais](01-basico/ExeciciosEspeciais), [ExercicioRevisao](01-basico/ExercicioRevisao), [TestesJava](01-basico/TestesJava) |
| [02-poo](02-poo) | Object-oriented programming | [ExercicioFuncionarios](02-poo/ExercicioFuncionarios), [To-do-List](02-poo/To-do-List) |
| [03-excecoes](03-excecoes) | Exception handling | [ExercicioExcecoes](03-excecoes/ExercicioExcecoes), [Exercicio02Excecao](03-excecoes/Exercicio02Excecao) |
| [04-arquivos](04-arquivos) | File I/O | [EstudoArquivos](04-arquivos/EstudoArquivos) |
| [05-interfaces](05-interfaces) | Interfaces | [Estudo-de-Interfaces](05-interfaces/Estudo-de-Interfaces) |
| [06-generics](06-generics) | Generics, Set and Map | [Generics-Set-Map](06-generics/Generics-Set-Map) |
| [07-funcional](07-funcional) | Functional programming (lambdas, streams) | [ProjetoDeParadigmaFuncional](07-funcional/ProjetoDeParadigmaFuncional) |
| [08-jdbc](08-jdbc) | JDBC with MySQL (DAO, CRUD) | [ProjectJDBC](08-jdbc/ProjectJDBC) |
| [09-jpa](09-jpa) | JPA with Maven | [ProjectJPAMaven](09-jpa/ProjectJPAMaven) |
| [10-spring](10-spring) | Spring Boot | [spring-study](10-spring/spring-study), [ProjectSpringStudy](10-spring/ProjectSpringStudy) |
| [11-git](11-git) | Git practice | [testesGit](11-git/testesGit) |
| [12-revisao-2026](12-revisao-2026) | 2026 review | [java-study](12-revisao-2026/java-study) |

## About this repository

Each project started as its own GitHub repository. They were merged here with `git subtree`, so the original commit history of every project is preserved in this repo's log. The only exception is `ProjectSpringStudy`, which was imported as a snapshot of its final version.

## Requirements

- JDK 17 or newer (JDK 21 for `spring-study`)
- Maven, only for `ProjectJPAMaven` and `ProjectSpringStudy` (`spring-study` ships with the Maven Wrapper)
- MySQL, only for `ProjectJDBC` and `ProjectJPAMaven`

## Running the projects

- **Plain Java projects** (everything without a `pom.xml`): open the project folder in your IDE (they were written in Eclipse and IntelliJ) and run the class that has the `main` method. `EstudoArquivos` and `ProjetoDeParadigmaFuncional` ask for the path of an input file when they start.
- **Maven projects**: run `mvn compile` inside `09-jpa/ProjectJPAMaven` or `10-spring/ProjectSpringStudy`.
- **spring-study**: run `./mvnw spring-boot:run` inside `10-spring/spring-study`, then open `http://localhost:8080/v1/hello/<name>`.

## Configuration

No credentials are stored in this repository. Projects that need a database read them from local configuration:

| Project | What to set up |
|---|---|
| `ProjectJDBC` | A `db.properties` file in the project root with `dburl`, `user` and `password` keys, plus the MySQL Connector/J jar on the classpath. `db.properties` is git-ignored. |
| `ProjectJPAMaven` | A MySQL database named `aulajpa` on `localhost:3306`. Replace the `${DB_USER}` and `${DB_PASSWORD}` placeholders in `src/main/resources/META-INF/persistence.xml` with your local credentials, and don't commit them. |
| `ProjectSpringStudy` | Uses the `test` profile with an in-memory H2 database. Set the `DB_PASSWORD` environment variable (any value works for H2). The H2 console is at `/h2-console`. |

## What I learned

<!-- TODO: Felipy writes this -->
