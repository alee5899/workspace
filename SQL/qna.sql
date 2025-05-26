CREATE TABLE board_farmers (
    BOARD_NUM INT PRIMARY KEY AUTO_INCREMENT,
    TITLE VARCHAR(50),
    WRITER VARCHAR(20),
    CONTENT VARCHAR(100),
    VIEWS INT DEFAULT 0,
    DATE DATETIME DEFAULT SYSDATE()
);

INSERT INTO board_farmers(BOARD_NUM,TITLE,WRITER,CONTENT,VIEWS,DATE)		
VALUES	
(1,'프로젝트','제작','내용1',5,NOW()),
(2,'아로젝트','파괴','내용2',2,NOW()),
(3,'제이로젝트','창조','내용3',4,NOW());

SELECT * FROM board_farmers;
COMMIT;

CREATE TABLE REPLY_FARMERS (
    REPLY_NUM INT PRIMARY KEY AUTO_INCREMENT,
    CONTENT VARCHAR(100) NOT NULL,
    WRITER VARCHAR(30) NOT NULL,
    DATE DATETIME DEFAULT SYSDATE(),
    BOARD_NUM INT NOT NULL  REFERENCES board_farmers(BOARD_NUM)
);

INSERT INTO REPLY_FARMERS (CONTENT, WRITER, BOARD_NUM) VALUES 
('감사요.', '농부1', 1),
('꿀팁.', '농부2', 2),
('개추요', '농부3', 1);

SELECT * FROM reply_farmers;
COMMIT;
ROLLBACK;



CREATE TABLE QNA_BOARD (
    QNA_NUM INT PRIMARY KEY AUTO_INCREMENT,
    STATUS VARCHAR(10), #진행상태 여부
    TITLE VARCHAR(50),
    WRITER VARCHAR(20),
    CONTENT VARCHAR(100),
    DATE DATETIME DEFAULT CURRENT_TIMESTAMP
);

COMMIT;

INSERT INTO QNA_BOARD (STATUS, TITLE, WRITER, CONTENT, DATE)
VALUES 
    ('답변중','jdk 버젼 호환 문의','김자바','표준프레임워크 버전 : 4.1.0을 사용할려고 합니다.', NOW()),
    ('답변완료','오프라인 환경에서 버전업 문의','김자바','전자정부프레임 워크의 버전도 업그레이드 하려 합니다.', NOW()),
    ('답변중','실행, 개발, 운영에 따른 버전?','김자바','매뉴얼 같은걸 보다보니 전자정부프레임워크의 버전...', NOW());


CREATE TABLE QNA_REPLY (
    REPLY_NUM INT PRIMARY KEY AUTO_INCREMENT,
    CONTENT VARCHAR(100) NOT NULL,
    WRITER VARCHAR(30) NOT NULL,
    DATE DATETIME DEFAULT SYSDATE(),
    QNA_NUM INT NOT NULL  REFERENCES board_farmers(BOARD_NUM)
);

INSERT INTO QNA_REPLY(CONTENT,WRITER,DATE,QNA_NUM)
VALUES(
			'Session 방식 접근제어 권한설정 - SESSION 접근제어 설정 항목을 참조하여 구성 후 재확인하여 보시기 바랍니다.',
			'표준프레임워크 센터	',NOW(),1),
			('해당 사항에 관련하여서는 관련 실행환경 라이브러리가 재배포되었으므로기존 라이브러리 삭제후 재다운로드 부탁드립니다',
			'표준프레임워크 센터	',NOW(),2),
			('가급적 jdk 1.8 버전의 사용을 권장드립니다','표준프레임워크 센터	',NOW(),3);
SELECT * FROM qna_reply;
SELECT * FROM QNA_BOARD;


