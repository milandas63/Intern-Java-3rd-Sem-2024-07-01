###############################################################
###############################################################
#####                                                     #####
#####                                                     #####
#####           TRANSACTION PROCESSING SYSTEM             #####
#####                                                     #####
#####                                                     #####
###############################################################
###############################################################
DROP DATABASE IF EXISTS transaction;
CREATE DATABASE IF NOT EXISTS transaction;
USE transaction;


####################
###    USER      ###
####################
SELECT 'USER';
DROP TABLE IF EXISTS user;
CREATE TABLE IF NOT EXISTS user(
    user_id                 INT(6)                  NOT NULL AUTO_INCREMENT,
    user_name               VARCHAR(50)             NOT NULL UNIQUE,
    user_password           VARCHAR(50)             NOT NULL,
    del                     ENUM('*')               DEFAULT NULL,
    PRIMARY KEY(user_id)
);
INSERT INTO user VALUES
    (1, 'Milan Das',            'milandas63',   NULL),
    (2, 'Manashish Moharana',   'moharana',     NULL),
    (3, 'Abijeet Lenka',        'lenka',        NULL),
    (4, 'Hemagoura Chinmay',    'chinmay',      NULL),
    (6, 'Pritiarpan Mohanty',   'mohanty',      NULL),
    (7, 'Subhashis Parida',     'parida',       NULL),
    (8, 'Aditya Mohanty',       'mohanty',      NULL);


################################
###    TRANSACTION-TYPE      ###
################################
SELECT 'TRANSACTION-TYPE';
DROP TABLE IF EXISTS transaction_type;
CREATE TABLE IF NOT EXISTS transaction_type(
    ttype_id                INT(6)                  NOT NULL AUTO_INCREMENT,
    ttype_desc              VARCHAR(50)             NOT NULL UNIQUE,
    ttype_abbr              VARCHAR(10)             DEFAULT NULL UNIQUE,
    del                     ENUM('*')               NOT NULL,
    PRIMARY KEY(ttype_id)
);
INSERT INTO transaction_type(
    ( 1, 'Opening Balance',       'OT', NULL),
    ( 2, 'Cash Transaction',      'CT', NULL),
    ( 3, 'Bank Transaction',      'BT', NULL),
    ( 4, 'Journal Transaction',   'JT', NULL);


##############################
###    HEAD-OF-ACCOUNTS    ###
##############################
SELECT 'HEAD-OF-ACCOUNTS';
DROP TABLE IF EXISTS head_of_accounts;
CREATE TABLE IF NOT EXISTS head_of_accounts(
    id					INT(8)                  NOT NULL AUTO_INCREMENT,
	account_name        VARCHAR(30)				NOT NULL UNIQUE,
	lfno                VARCHAR(10),
	balance				DOUBLE(12,2)			DEFAULT 0.00,
	dlu					DATE,
	PRIMARY KEY(id)
);


#########################
###    TRANSACTION    ###
#########################
SELECT 'TRANSACTION';
DROP TABLE IF EXISTS transaction;
CREATE TABLE IF NOT EXISTS transaction(
    tran_id                 INT(8)          NOT NULL AUTO_INCREMENT,
    tran_date               DATE            NOT NULL,
    ttype_id                INT(6)          NOT NULL REFERENCES transaction_type(ttype_id),
    ttype_ref_no			VARCHAR(15)     DEFAULT NULL,
    account_id              INT(8)			NOT NULL REFERENCES head_of_accounts(id),
	dr_amount               DOUBLE(12,2)    DEFAULT 0.00,
	cr_amount               DOUBLE(12,2)    DEFAULT 0.00,
    PARIMARY KEY(tran_id)
);


