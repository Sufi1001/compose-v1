FROM liquibase/liquibase:4.27-alpine

#ADD lib/postgresql-42.7.3.jar  /liquibase/./lib/
#ADD lib/postgresql-42.7.3.jar  /liquibase/lib/
ADD liquibase.properties /liquibase/
#ADD pom.xml /liquibase/

#ADD database/changelog/changelog-main-01.sql /liquibase/changelog/changelog-main-01.sql
ADD database/changelog/ /liquibase/changelog/
