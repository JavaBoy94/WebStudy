
/* Drop Tables */

DROP TABLE Member1220 CASCADE CONSTRAINTS;

/* Create Tables */

CREATE TABLE Member1220
(
	userid varchar2(10 char) NOT NULL,
	userpw varchar2(10 char) NOT NULL,
	email varchar2(100 char) NOT NULL,
	PRIMARY KEY (userid)
);

select * from member1220;   

create table test_tb_1220(
    userId varchar2(10) not null primary key,
    userPw varchar2(10) not null,
    userName varchar2(20) not null,
    gender varchar2(10) not null,
    hobbys varchar2(50) not null,
    phone varchar2(100) not null,
    memo varchar2(255) not null
);

select * from test_tb_1220;

drop table test_tb_1220;

commit;

