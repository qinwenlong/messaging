DROP TABLE CONTACT IF EXISTS;

CREATE TABLE CONTACT(
    id IDENTITY primary key,
    email VARCHAR (20),
    full_name VARCHAR(20),
    valid_email BOOLEAN NULL
);