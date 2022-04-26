
drop table if exists pet cascade;
drop table if exists gender cascade;
drop table if exists use_r cascade;
drop table if exists typ cascade;
drop table if exists breed cascade;



create table if not exists breed (
	breed_id serial primary key unique not null,
	breed_name varchar(45) not null
);

create table if not exists typ (
	type_id serial primary key unique not null,
	type_name varchar(45) not null
);

create table if not exists use_r (
	user_id serial primary key unique not null,
	username varchar(30) not null unique,
	psswrd varchar(10) not null,
	pet_owner bool,
	foster_parent bool,
	pet_volunteer bool,
	user1_first_name varchar(45) not null,
	user1_last_name varchar(45) not null,
	user2_first_name varchar(45),
	user2_last_name varchar(45),
	street1 varchar(50) not null,
	street2 varchar(50),
	city varchar(50) not null,
	state varchar(50) not null,
	zip integer not null,
	phone1 varchar(50) not null,
	phone2 varchar(50),
	fax varchar(50),
	email1 varchar(50) not null,
	email2 varchar(50),
	website varchar(100)
);

create table if not exists gender (
	gender_id serial primary key unique not null,
	gender_name varchar(15) not null -- male/female
);

create table if not exists pet (
	pet_id serial primary key unique not null,
	pet_name varchar(50),
	type_id integer references typ,
	breed_id integer references breed,
	age_months integer,
	age_years integer,
	gender_id integer references gender,
	adopted bool,
	fostered bool,
	user_id integer references use_r
);







