# MyBatis DB연결 세팅

### 설정방법
- MyBatisConfig 파일 필요
- resources/mapper/*.xml 파일 필요
- Users 엔티티 필요
- UsersDao 인터페이스 생성 필요

### 테이블 생성
```sql
create user 'final'@'%' identified by 'green1234';
CREATE database final;
GRANT ALL PRIVILEGES ON *.* TO 'final'@'%';
CREATE database finaldb;
GRANT ALL PRIVILEGES ON finaldb.* TO 'final'@'%';

use final;
use finaldb;

DROP USER 'final'@'%';
drop database final;

DROP table stadium;
DROP table team;
DROP table player;
DROP table expulsion;

##야구장
CREATE TABLE stadium(
	id int auto_increment primary key,
    stadiumName varchar(100) unique,
    openDate timestamp
);

SELECT *
FROM stadium;

DROP table stadium;

##팀
CREATE TABLE team(
	id int auto_increment primary key,
    stadiumId int,
    teamName varchar(100) unique,
    createDate timestamp
);

SELECT *
FROM team;

DROP table team;

##선수
CREATE TABLE player(
	id int auto_increment primary key,
    teamId int,
    position varchar(100),
    playerName varchar(100) unique,
    createDate timestamp
);

SELECT *
FROM player;

DROP table player;

#퇴출
CREATE TABLE expulsion(
	id int auto_increment primary key,
	 teamName varchar(100),
	 position varchar(100),
    playerName varchar(100),
    reason varchar(100) unique,
    expDate timestamp
);

SELECT *
FROM expulsion;
```

### 더미데이터 추가
```sql
INSERT into stadium(stadiumName,openDate)
VALUES("잠실야구장",now());
INSERT into stadium(stadiumName,openDate)
VALUES("사직야구장",now());
INSERT into stadium(stadiumName,openDate)
VALUES("학교운동장",NOW());

SELECT *
FROM stadium;


INSERT into team(stadiumId,teamName,createDate)
VALUES("1","홍팀",now());
INSERT into team(stadiumId,teamName,createDate)
VALUES("2","청팀",now());
INSERT into team(stadiumId,teamName,createDate)
VALUES("3","백팀",NOW());

SELECT *
FROM team;

INSERT into player(teamId,position,playerName,createDate)
VALUES(1,"타자","문태일",now());
INSERT into player(teamId,position,playerName,createDate)
VALUES(1,"투수","서쟈니",now());
INSERT into player(teamId,position,playerName,createDate)
VALUES(1,"외야수","이태용",NOW());

INSERT into player(teamId,position,playerName,createDate)
VALUES(2,"타자","나유타",now());
INSERT into player(teamId,position,playerName,createDate)
VALUES(2,"투수","김도영",now());
INSERT into player(teamId,position,playerName,createDate)
VALUES(2,"내야수","정재현",now());

INSERT into player(teamId,position,playerName,createDate)
VALUES(3,"타자","김정우",now());
INSERT into player(teamId,position,playerName,createDate)
VALUES(3,"투수","이마크",now());
INSERT into player(teamId,position,playerName,createDate)
VALUES(3,"내야수","이해찬",NOW());

SELECT *
FROM player;

commit;
```