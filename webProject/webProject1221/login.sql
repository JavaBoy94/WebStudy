
/* Drop Tables */

DROP TABLE Login1221 CASCADE CONSTRAINTS;


/* Create Tables */

CREATE TABLE Login1221
(
	userid varchar2(10 char) NOT NULL,
	userpw varchar2(10 char) NOT NULL,
	gender varchar2(10 char) NOT NULL,
	hobbys varchar2(100 char) NOT NULL,
	city varchar2(10 char) NOT NULL,
	memo varchar2(255 char) NOT NULL,
	PRIMARY KEY (userid)
);

desc login1221;

select * from login1221;

insert into login1221(userid,userpw,gender,hobbys,city,memo)
    values('m1','11','남자','등산','서울','자기소개1');
insert into login1221(userid,userpw,gender,hobbys,city,memo)
    values('m2','22','여자','게임','경기도','자기소개2');
insert into login1221(userid,userpw,gender,hobbys,city,memo)
    values('m3','33','남자','영화','경상도','자기소개3');
    
commit;    

-- 로그인 => count(*)이 1이면 성공, 0이면 실패(비회원)
select count(*) from login1221 where userid='m1' and userpw='11';

-- 회원정보(상세정보) => where userid=m1
select * from login1221 where userid='m1';