From postgres

ENV POSTGRES_DB=dblocal
ENV POSTGRES_PASSWORD=postgres
ENV POSTGRES_USER=postgres
ENV PGDATA=/data/postgres

ADD pq_dump.sql /docker-entrypoint-initdb.d/

EXPOSE 5432
