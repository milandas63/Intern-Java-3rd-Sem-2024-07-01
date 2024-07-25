DROP DATABASE IF EXISTS student;
CREATE DATABASE IF NOT EXISTS student;
USE student;

CREATE TABLE student(
	id			INT(6)			NOT NULL AUTO_INCREMENT,
	name		VARCHAR(30)		NOT NULL UNIQUE,
	father		VARCHAR(30),
	gender		ENUM('F','M'),
	mobile      VARCHAR(15),
	PRIMARY KEY(id)
);
