--liquibase formatted sql

--changeset world.donya:1
CREATE TABLE test_table (test_id INT NOT NULL, test_column INT, PRIMARY KEY (test_id))

--changeset world.donya:2
CREATE TABLE from_liquibase_skaffold (test_id INT NOT NULL, test_column INT, PRIMARY KEY (test_id))

--changeset world.donya:3
UPDATE DATABASECHANGELOGLOCK SET LOCKED=false, LOCKGRANTED=null, LOCKEDBY=null;

--changeset world.donya:4
CREATE TABLE from_liquibase_again(id INT NOT NULL, name VARCHAR(255));