
/* Drop Tables */

DROP TABLE Login1222 CASCADE CONSTRAINTS;


/* Create Tables */

CREATE TABLE Login1222
(
	userid varchar2(10 char) NOT NULL,
	userpw varchar2(10 char) NOT NULL,
	gender varchar2(10 char) NOT NULL,
	hobbys varchar2(100 char) NOT NULL,
	city varchar2(10 char) NOT NULL,
	memo varchar2(255 char) NOT NULL,
	PRIMARY KEY (userid)
);

desc login1222;

select * from login1222;

insert into login1222(userid,userpw,gender,hobbys,city,memo)
    values('m1','11','����','���','����','�ڱ�Ұ�1');
insert into login1222(userid,userpw,gender,hobbys,city,memo)
    values('m2','22','����','����','��⵵','�ڱ�Ұ�2');
insert into login1222(userid,userpw,gender,hobbys,city,memo)
    values('m3','33','����','��ȭ','���','�ڱ�Ұ�3');
    
commit;    

-- �α��� => count(*)�� 1�̸� ����, 0�̸� ����(��ȸ��)
select count(*) from login1222 where userid='m1' and userpw='11';

-- ȸ������(������) => where userid=m1
select * from login1222 where userid='m1';