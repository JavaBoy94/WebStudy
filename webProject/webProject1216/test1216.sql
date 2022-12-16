
/* Drop Tables */

DROP TABLE Member1216 CASCADE CONSTRAINTS;

/* Create Tables */

CREATE TABLE Member1216
(
	userid varchar2(10) NOT NULL,
	userpw varchar2(20) NOT NULL,
	username varchar2(20) NOT NULL,
	PRIMARY KEY (userid)
);



