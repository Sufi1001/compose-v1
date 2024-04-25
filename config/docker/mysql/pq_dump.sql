DROP TABLE IF EXISTS nachname;

CREATE TABLE IF NOT EXISTS nachname (
    id  SERIAL  PRIMARY KEY  NOT NULL,
    name VARCHAR(255)
);

Insert into nachname (name)
VALUES
('Donya'),
('World');