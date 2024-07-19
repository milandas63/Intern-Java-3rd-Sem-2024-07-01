DROP DATABASE IF EXISTS java3rdsem;
CREATE DATABASE IF NOT EXISTS java3rdsem;
USE java3rdsem;

##################
###  Student   ###
##################
SELECT student;
DROP TABLE IF EXISTS student;
CREATE TABLE student(
	id			INT(6)			NOT NULL AUTO_INCREMENT,
	name		VARCHAR(30)		NOT NULL UNIQUE,
	father		VARCHAR(30),
	email       VARCHAR(30),
	mobile      VARCHAR(12),
	PRIMARY KEY(id)
);
INSERT INTO student VALUES
	(1, 'Narendra Modi', 'P K Modi', 'modinarendra@gmail.com', '9876543210'),
	(2, 'Rahul Gandhi', 'Rajeev Gandhi', 'gandhirahul@gmail.com', '8978675643'),
	(3, 'Mohan Maggi', 'Maggi', 'maggiodisha@gmail.com', '7978277665');
