create table board02(
	no int primary key,
	title varchar(30),
	content varchar(255),
	writer varchar(30),
	regdate date
);

insert into board02 (no, title, content, writer, regdate) values (1, 'title-1', 'cont - 1', 'wr-1', CURDATE());
insert into board02 (no, title, content, writer, regdate) values (2, 'title-2', 'cont - 2', 'wr-2', CURDATE());

#최신 글 가져오기
select no from board02 order by no desc limit 1;
select * from board02