-- 뷰고리즘 카테고리 DTO
CREATE TABLE viewgorithm_Category(
	viewgorithm_Category_pk integer primary key auto_increment,
	name VARCHAR(50),
	cateogry_name VARCHAR(50)
);

DROP TABLE viewgorithm_Category;


-- 뷰고리즘 DTO

CREATE TABLE viewgorithm(
	viewgorithm_pk integer primary key auto_increment,
	viewgorithm_Category_pk integer,
	c_code TEXT,
	c_sharp_code TEXT,
	python_code TEXT,
	java_code TEXT
);

DROP TABLE viewgorithm;

-- 뷰고리즘 태그 배지 DTO
CREATE TABLE viewgorithm_tag_badge(
	viewgorith_tag_badge_pk integer primary key auto_increment,
	viewgorithm_pk integer,
	viewgorithm_Category_pk integer,
	name VARCHAR(50)
);
DROP TABLE viewgorithm_tag_badge;



-- 뷰고리즘 댓글 DTO
CREATE TABLE viewgorithm_comment(
	viewgorithm_comment_pk integer primary key auto_increment,
	viewgorithm_pk integer,
	user_pk integer,
	viewgorithm_Category_pk integer,
	content VARCHAR(300),
	created_at DATETIME default now()
);

DROP TABLE viewgorithm_comment;


-- 회원 DTO

CREATE TABLE `user`(
	user_pk integer primary key auto_increment,
	id VARCHAR(50),
	password VARCHAR(50),
	name VARCHAR(30),
	nickname VARCHAR(50),
	gender VARCHAR(1),
	birth DATETIME,
	phone VARCHAR(30),
	email VARCHAR(50),
	created_at DATETIME default now()
);


-- 건의 게시판 DTO

CREATE TABLE suggestion_article(
	suggestion_article_pk integer primary key auto_increment,
	user_pk integer,
	title VARCHAR(100),
	content TEXT,
	created_at DATETIME default now()
);
DROP TABLE suggestion_article;


-- 건의 게시판 댓글 DTO

CREATE TABLE suggestion_article_comment(
	suggestion_article_comment_pk integer primary key auto_increment,
	suggestion_article_pk integer,
	user_pk integer,
	content VARCHAR(1000),
	created_at DATETIME default now()
)

DROP TABLE suggestion_article_comment;


