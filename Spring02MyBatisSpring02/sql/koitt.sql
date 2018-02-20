create table owner(
	owner_name varchar(30) primary key
);

create table pet(
	pet_id int not null primary key auto_increment,
	pet_name varchar(30),
	owner_name varchar(30),
	price int,
	birth_date date,
	foreign key(owner_name) references owner(owner_name)
);

INSERT INTO owner VALUES('LEE');
INSERT INTO owner VALUES('HONG');
INSERT INTO owner VALUES('PARK');
INSERT INTO owner VALUES('CHOI');
INSERT INTO owner VALUES('AHN');

INSERT INTO pet(pet_name, owner_name, price, birth_date) VALUES('HEPPY', 'LEE', 1000, STR_TO_DATE('2018-02-10', '%Y-%m-%d'));
INSERT INTO pet(pet_name, owner_name, price, birth_date) VALUES('JJONG', 'HONG', 2000, STR_TO_DATE('2018-02-10', '%Y-%m-%d'));
INSERT INTO pet(pet_name, owner_name, price, birth_date) VALUES('NABI', 'PARK', 1300, STR_TO_DATE('2018-02-12', '%Y-%m-%d'));
INSERT INTO pet(pet_name, owner_name, price, birth_date) VALUES('MERRY', 'CHOI', 2300, STR_TO_DATE('2018-02-12', '%Y-%m-%d'));
INSERT INTO pet(pet_name, owner_name, price, birth_date) VALUES('BAMBINO', 'AHN', 1000, STR_TO_DATE('2018-02-13', '%Y-%m-%d'));
INSERT INTO pet(pet_name, owner_name, price, birth_date) VALUES('노랭이', 'LEE', 500, STR_TO_DATE('2018-02-11', '%Y-%m-%d'));

select * from pet;
select * from owner;