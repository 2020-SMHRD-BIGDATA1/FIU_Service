CREATE TABLE FESTIVALMEMBER (
	id varchar2(100),
	pw varchar2(100),
	name varchar2(100),
	phone varchar2(100),
	location varchar2(100),
	sex varchar2(100),
	age varchar2(100)
)

CREATE TABLE FESTIVAL_INFORMATION(
	FEST_NO NUMBER(7),
	FEST_NAME VARCHAR2(30),
	CITY VARCHAR2(10),
	FEST_TEL VARCHAR2(20),
	FEST_DATE DATE
)

CREATE TABLE FESTIVAL_REVIEW(
	REV_NO NUMBER(11),
	CITY VARCHAR2(10),
	REV_WITH VARCHAR2(10),
	AGE VARCHAR2(10),
	REV_SCORE NUMBER(2,1),
	REV_DATE DATE
)

SELECT * FROM FESTIVALMEMBER;
SELECT * FROM FESTIVAL_INFORMATION;

DELETE FROM FESTIVALMEMBER;

DROP TABLE FESTIVALMEMBER;
