
/* Drop Tables */

DROP TABLE Member1219 CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE Member1219
(
	userid varchar2(10 char) NOT NULL,
	userpw varchar2(10 char) NOT NULL,
	email varchar2(100 char) NOT NULL,
	PRIMARY KEY (userid)
);



