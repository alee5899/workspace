 #1번
 CREATE TABLE BOOK_INFO (
    도서번호  INT PRIMARY KEY,
    도서명  VARCHAR(30) NOT NULL,
    저자 VARCHAR(30) NOT NULL,    
    도서가격 INT,
    출판사  VARCHAR(30) DEFAULT '미지정',  
    발행일 DATETIME DEFAULT SYSDATE()
    );
   
   SELECT * FROM BOOK_INFO;
    
    #2번
    INSERT INTO BOOK_INFO VALUES(101,'자바기초','홍길동',30000,'A출판','2025-01-15');
    INSERT INTO BOOK_INFO VALUES(102,'리액트기초','이순신',20000,'B출판','2025-01-22');
    
    
    #3번
    UPDATE book_info SET
    도서명 = '자바_고급',
    도서가격 = 25000
	 WHERE 도서번호 = 101;
	 
	 #4번
	 SELECT EMPNO,ENAME,SAL,COMM FROM EMP
	 WHERE SAL BETWEEN 500 AND 3000 AND COMM IS  NULL;
	 
	 #5번
	 SELECT EMPNO,ENAME,JOB,HIREDATE FROM EMP
	 WHERE ENAME LIKE '%병%' OR ENAME LIKE'%김%'
	 ORDER BY JOB ASC, EMPNO DESC;
	 
	 #6번  사원의 사번, 이름, 부서번호, 부서명을 조회해보자. 부서명은 부서번호가 10일 때는 ‘인사부’, 20일 때는 ‘영업부’, 30일 
	#때는 ‘개발부’, 그 외의 값은 ‘생산부’로 조회되어야 한다. 조인 사용하는 문제 아님. CASE 사용.
	SELECT EMPNO,ENAME,DEPTNO,
 	CASE DEPTNO
 		WHEN 10 THEN '인사부'
 		WHEN 20 THEN '영업부'
 		when 30 THEN '개발부'
 		ELSE '생산부'
 	END AS 'DNAME'
 FROM emp;
 
 
 	#7번
 	 SELECT EMPNO,ENAME,HIREDATE,COMM FROM EMP
	 WHERE DAY(NOW()) 
	 AND MOD(HIREDATE,2) = 0
	 ORDER BY COMM ASC;
 
 # 8번 조인을 사용하여 부서명이 ‘인사부’가 아니고 급여가 500이상인 사원의 사번, 이름, 입사일, 급여, 부서번호, 부서명을 
#조회하는 쿼리문을 작성해보자. 단, 정렬은 사번 기준 내림차순으로 정렬 후 사원 이름 기준 오름차순으로 정렬한다.
	 SELECT EMPNO,ENAME,HIREDATE,SAL,D.DEPTNO,E.DEPTNO,DNAME
	 FROM emp E INNER JOIN dept D
	 ON E.DEPTNO = D.DEPTNO
	 WHERE SAL>=500;
