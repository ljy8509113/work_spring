DROP TABLE if exists user;

create table user(
	id int,
	username varchar(20),
	password varchar(20),
	age int
);

insert into user(id, username, password, age) values (1, 'USER-1', 'PASSWORD-1', 30);
insert into user(id, username, password, age) values (2, 'USER-2', 'PASSWORD-2', 25);
insert into user(id, username, password, age) values (3, 'USER-3', 'PASSWORD-3', 10);
insert into user(id, username, password, age) values (4, 'USER-4', 'PASSWORD-4', 25);
insert into user(id, username, password, age) values (5, 'USER-5', 'PASSWORD-5', 40);

select * from user;