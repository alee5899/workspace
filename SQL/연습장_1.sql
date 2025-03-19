
DELETE FROM rest_member
WHWERE ME_ID = 'aaa';

#회원 한명의 이름과 나이를 변경하는 기능
UPDATE rest_member
SET
MEM_NAME = 'TTT',
MEM_AGE = 35;
WHERE MEM_ID = 'aaa'; 
-- 회원정보 테이블
CREATE TABLE REST_MEMBER(
	MEM_ID VARCHAR(10) PRIMARY KEY,
	MEM_NAME VARCHAR(10) NOT NULL,
	MEM_AGE INT DEFAULT 0,
	MEM_TEL  VARCHAR(15) UNIQUE
);

INSERT INTO REST_MEMBER VALUES('aaa','kim', 20, '010-1111-1111');
INSERT INTO REST_MEMBER VALUES('bbb','lee', 30, '010-1111-2222');
INSERT INTO REST_MEMBER VALUES('ccc','hong', 40,'010-1111-3333');
COMMIT;

SELECT * FROM rest_member;

-- 회원 한명의 모든 컬럼 정보를 조회
SELECT *
FROM rest_member
WHERE mem_id = 'aaa';

SELECT *
FROM rest_member 
WHERE MEM_ID = 'aaa'
AND mem_age = '20'

#회원정보 등록
INSERT INTO RESR_MEMBER (MEM_ID,MEM_NAME,MEM_AGE,MEM_TEL)
VALUES('ddd','park',50,'010');


#게시글 정보 테이블
CREATE TABLE REST_BOARD(
	BOARD_NUM INT PRIMARY KEY,
	TITLE VARCHAR(10) NOT NULL,
	CONTENT VARCHAR(20),
	WRITER VARCHAR(10)
	);
	
	INSERT INTO REST_BOARD VALUES(1,'제목1','내용1','KIM');
	INSERT INTO REST_BOARD VALUES(2,'제목2','내용2','KIM');
	INSERT INTO REST_BOARD VALUES(3,'제목3','내용3','KIM');
	COMMIT;
	
	SELECT * FROM REST_BOARD;
	
	SELECT * FROM REST_BOARD
	WHERE BOARD_NUM = 3;
	
	
	#상품정보 테이블
CREATE TABLE REST_ITEM(
	ITEM_CODE INT PRIMARY KEY AUTO_INCREMENT,
	ITEM_NAME VARCHAR(20) NOT NULL,
	ITEM_PRICE INT,
	ITEM_COLOR VARCHAR(10)
);

INSERT INTO REST_ITEM (ITEM_NAME,ITEM_PRICE,ITEM_COLOR)
VALUES('청바지',30000,'파란색');

SELECT * FROM REST_ITEM;
ROLLBACK;