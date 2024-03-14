# Concessionaria-API-DIO
Projetos Finais da DIO do TQI Java Developer com API Rest

## Requirements

* Linux
* Git
* Java 8
* Docker
* IntelliJ Community
* Heroku CLI

## DataBase

### Postgres

* [Postgres Docker Hub](https://hub.docker.com/_/postgres)

```shell script
docker run --name concessionaria-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_concessionaria -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=concessionaria postgres
```

### Populate

* [data](https://github.com/dijaelramos/Concessionaria-DIO/tree/main/PostgreSQL)

```shell script
cd ~/.../PostgreSQL
docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash
psql -h localhost -U postgres_user_concessionaria concessionaria -f /tmp/fiat.sql
psql -h localhost -U postgres_user_concessionaria concessionaria -f /tmp/chevrolet.sql
psql -h localhost -U postgres_user_concessionaria concessionaria -f /tmp/honda.sql
psql -h localhost -U postgres_user_concessionaria concessionaria -f /tmp/ford.sql
psql -h localhost -U postgres_user_concessionaria concessionaria -f /tmp/volkswagen.sql
psql -h localhost -U ppostgres_user_concessionaria concessionaria
```

### Access

```shell script
docker exec -it concessionaria-db /bin/bash
psql -U postgres_user_concessionaria concessionaria
```

## Spring Boot

* [https://start.spring.io/](https://start.spring.io/)

+ Java 8
+ Gradle Project
+ Jar
+ Spring Web
+ Spring Data JPA
+ PostgreSQL Driver

### Spring Data

* [jpa.query-methods](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods)

### Properties

* [appendix-application-properties](https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html)
* [jdbc-database-connectio](https://www.codejava.net/java-se/jdbc/jdbc-database-connection-url-for-common-databases)

### Types

* [JsonTypes](https://github.com/vladmihalcea/hibernate-types)
* [UserType](https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/usertype/UserType.html)

## Heroku

* [DevCenter](https://devcenter.heroku.com/articles/getting-started-with-gradle-on-heroku)

## Code Quality

### PMD

+ https://pmd.github.io/pmd-6.8.0/index.html

### Checkstyle

+ https://checkstyle.org/

+ https://checkstyle.org/google_style.html

+ http://google.github.io/styleguide/javaguide.html

```shell script
wget https://raw.githubusercontent.com/checkstyle/checkstyle/master/src/main/resources/google_checks.xml
```
