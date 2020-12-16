# DS Learn

# Sobre o projeto

DS Learn é uma aplicação full stack web que está sendo desenvolvida no decorrer do Bootcamp da [DevSuperior](https://devsuperior.com "Site da DevSuperior").

O sistema consiste em uma plataforma de ensino que mantém informações de cursos, suas turmas e alunos, bem como um fórum para perguntas e respostas sobre os conteúdos do curso. 
Um curso é composto de vários “recursos”, que são grupos de conteúdos. Estes recursos podem ser trilhas de aprendizado, bônus, links externos, e o próprio fórum de perguntas e respostas do curso. Cada recurso pode conter seções, e estas seções por sua vez é que vão conter as aulas, que podem ser conteúdos em vídeo e/ou texto, ou tarefas para serem entregues pelos alunos.

## Modelo conceitual
![Modelo Conceitual](https://github.com/santosediego/assets/blob/main/dslearn/dslearn_modelo_conceitual.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- OAuth2
- JWT
- Postgres

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/santosediego/bds-dslearn.git

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

# Autor

[Nelio Alves](https://github.com/acenelio "Perfil GitHub Nelio Alves")

Diego Santos
