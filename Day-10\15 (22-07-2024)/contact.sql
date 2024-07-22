DROP DATABASE IF EXISTS contact_list;
CREATE DATABASE IF NOT EXISTS contact_list;
USE contact_list;

# # # # # # # # # # # #
# #   Relationship  # #
# # # # # # # # # # # #
SELECT 'relationship';
DROP TABLE IF EXISTS relationship;
CREATE TABLE relationship(
	id			INT(6)			NOT NULL AUTO_INCREMENT,
	relation    VARCHAR(30)		NOT NULL UNIQUE,
	PRIMARY KEY(id)
);
INSERT INTO relationship VALUES
	(1, "School Friends"),
	(2, "College Friends"),
	(3, "Professional Friends"),
	(4, "Siblings"),
	(5, "Family"),
	(6, "Relatives");


# # # # # # # # # #
# #   Location  # #
# # # # # # # # # #
SELECT 'location';
DROP TABLE IF EXISTS location;
CREATE TABLE location(
	id			INT(6)			NOT NULL AUTO_INCREMENT,
	location    VARCHAR(30)		NOT NULL UNIQUE,
	PRIMARY KEY(id)
);
INSERT INTO location VALUES
	(1, "Bhubaneswar"),
	(2, "Cuttack"),
	(3, "Berhampur"),
	(4, "Sambalpur"),
	(5, "Balasore"),
	(6, "USA");


# # # # # # # # # #
# #   Contact  # #
# # # # # # # # # #
SELECT 'contact';
DROP TABLE IF EXISTS contact;
CREATE TABLE contact(
	id			INT(6)			NOT NULL AUTO_INCREMENT,
	name        VARCHAR(30)		NOT NULL UNIQUE,
	rel_id      INT(6)          REFERENCES relationship(id),
	loc_id      INT(6)          REFERENCES location(id),
	mobile1     VARCHAR(12)     NOT NULL,
	email       VARCHAR(30),
	PRIMARY KEY(id)
);
