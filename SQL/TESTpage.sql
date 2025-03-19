
-- 1
CREATE TABLE MY_MEMBER(
회원번호 INT PRIMARY KEY,
아이디 VARCHAR(20) NOT NULL,
비밀번호 int NOT NULL,
회원이름 VARCHAR(20) NOT NULL,
나이 INT,
이메일주소 VARCHAR(20) UNIQUE
);

SELECT * FROM MY_MEMBER;

-- 2
INSERT INTO MY_MEMBER(회원번호,아이디,비밀번호,회원이름,나이,이메일주소)
VALUES(101,'kim',1234,'김자바',30,'kim@gamil.com');

INSERT INTO MY_MEMBER(회원번호,아이디,비밀번호,회원이름,나이,이메일주소)
VALUES(102,'hong',5678,'홍자바',25,'hong@gamil.com');


-- 3	
UPDATE my_member SET
회원이름 = '유관순',
나이 = 30 + 5
WHERE 회원번호 = 101;

--  4. 급여가 500에서 3000 사이이고 커미션이 NULL이 아닌 사원의 사원번호, 사원명, 급여, 커미션을 조회하는 쿼리문을 작성하세요
SELECT EMPNO,ENAME,SAL,COMM FROM emp
WHERE SAL BETWEEN 500 AND 3000
AND COMM IS NOT NULL;

--  5. 사원들 중 이름이 ‘기’로 끝나기나, ‘김’이 들어가는 사원들의 사번, 이름, 입사일을 조회하되, 사번기준 내림차순 정렬하여 조회하는 쿼리문을 작성하세요

SELECT EMPNO,ENAME,HIREDATE FROM emp
WHERE ENAME LIKE '%기' OR '%김%'
ORDER BY EMPNO DESC
