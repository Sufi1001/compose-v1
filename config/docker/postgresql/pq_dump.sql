DROP TABLE IF EXISTS person;

CREATE TABLE IF NOT EXISTS person (
    id  SERIAL  PRIMARY KEY  NOT NULL,
    name VARCHAR(255)
);

Insert into person (name)
VALUES
('Salam Donya'),
('Hello World');