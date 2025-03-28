
-- 주석

-- 실행 : 현재 열려있는 쿼리 탭의 모든 쿼리를 일괄 실행
-- 선택실행 : 마우스로 드래그한 쿼리만 실행
-- 현재쿼리실행 : 현재 커서가 올라가 있는 쿼리만 실행

-- 데이터 조회
-- SELECT 컬럼명 FROW 테이블명 WHERE 조건;

-- EMP 테이블의 모든 사원들의 사번을 조회
SELECT EMPNO FROM emp;

-- EMP 테이블에서 모든 사원의 사번,사원명,급여를 조회
SELECT EMPNO,ENAME,SAL FROM emp;

-- 별칭사용. 조회시 조회되는 컬렴명을 변경하여 조회 
SELECT EMPNO AS 사번,ENAME AS 사원명,SAL MONEY FROM emp;

-- EMP테이블의 모든 컬럼을 조회
SELECT * FROM emp;

-- SELECT로 이런것도 조회 가능
SELECT 5 FROM emp;
SELECT 5, 'JAVA',3+3 FROM dept;

-- 문법확인용
SELECT 'DB', 3+5;
-- SELECT EMPNO; 오류! 컬럼명 조회 시는 반드시 테이블명 명시!

-- 조회에 조건 사용하기
-- 크기비교 :  >, <, >=, <=, =, !=, <>
-- 급여가 300이상인 사원들의 사번,사원명,급여를 조회
SELECT EMPNO,ENAME,SAL FROM emp 
WHERE SAL >= 300;


-- 직급이 대리인 사원들의 사번,사원명,직급,일사일을 조회
SELECT EMPNO,ENAME,JOB,HIREDATE FROM emp
WHERE JOB = '대리';

-- 동시에 만족 : AND, 둘중   하나 만족 : OR
-- WHERE 조건1 OR 조건2

-- 급여가 400이상이고 직급이 '과장'인 사원들의 모든 컬럼 조회

SELECT * FROM emp 
WHERE SAL >= 400 AND JOB = '과장';   

-- EMP 테이블의 모든 사원들 중에
-- 급여가 400 이하이거나 700이상인  사원들의 사번, 사원명, 급여 조회

SELECT EMPNO,ENAME,SAL FROM emp
WHERE SAL <= 400 OR SAL >=700;

-- 조건절을 작성할 때는 NULL 체크 문법에 주의!
-- 조건 : COMM이 NULL인 데이터만 조회
SELECT EMPNO,ENAME,SAL,COMM FROM emp
WHERE COMM IS NOT NULL;

-- 1. EMP 테이블에서 모든 사원의 사번, 사원명, 급여, 커미션을 조회하시오
SELECT EMPNO,ENAME,SAL,COMM FROM emp;

-- 2. EMP 테이블에서 사번이 1005번 이상인 사원들의 사번, 사원명, 직급을 조회하되, 사원명은 ‘NAME’이라는 별칭으로 조회하시오.
SELECT EMPNO,ENAME AS NAME,JOB FROM emp
WHERE EMPNO >= 1005;

 -- 3. EMP 테이블에서 직급이 대리이거나과장인 사원들의 사원명, 직급, 급여를 조회하시오.
 SELECT ENAME, JOB ,SAL FROM emp
 WHERE JOB = '대리' OR JOB ='과장';
 
 -- 4. EMP 테이블에서 급여가 300 이상이면서 커미션이 300 이상인 사원들의 모든 컬럼을 조회하시오.
 SELECT *FROM emp
 WHERE SAL >= 300 AND COMM >= 300;
 
 -- 5.EMP 테이블에서 급여가 900 이하고 커미션은 NULL이 아니며 직급은 대리이거나 과장인 사원들의
 --사원명,직급,급여,커뮤션을 조회하세요
 SELECT ENAME,JOB,SAL,COMM FROM emp
 WHERE SAL <= 900 AND COMM IS NOT NULL
 AND (JOB = '대리' OR JOB = '과장');
 




