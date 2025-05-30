# 공지사항  게시글
CREATE TABLE board_FARMERS (
    BOARD_NUM INT PRIMARY KEY AUTO_INCREMENT,
    TITLE VARCHAR(50),
    USER_EMAIL VARCHAR(50) NOT NULL,
    CONTENT VARCHAR(100),
    VIEWS INT DEFAULT 0,
    DATE DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (USER_EMAIL) REFERENCES USER(USER_EMAIL) ON DELETE CASCADE
);


#공지사항 댓글
CREATE TABLE REPLY_FARMERS (
    REPLY_NUM INT PRIMARY KEY AUTO_INCREMENT,
    CONTENT VARCHAR(100) NOT NULL,
    DATE DATETIME DEFAULT CURRENT_TIMESTAMP,
    BOARD_NUM INT NOT NULL,
    USER_EMAIL VARCHAR(50) NOT NULL,
    FOREIGN KEY (USER_EMAIL) REFERENCES USER(USER_EMAIL) ON DELETE CASCADE,
    FOREIGN KEY (BOARD_NUM) REFERENCES board_FARMERS(BOARD_NUM) ON DELETE CASCADE
);