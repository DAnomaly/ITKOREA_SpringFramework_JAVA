-- staff 테이블 삭제
DROP TABLE staff;

-- staff 테이블 추가
CREATE TABLE staff
(
	no NUMBER,
	name VARCHAR2(100),
	department VARCHAR2(100),
	hiredate DATE,
	PRIMARY KEY(no)
);

-- staff 테이블 검색
SELECT * FROM STAFF;

-- no의 최대값
SELECT MAX(no) FROM staff;