
drop table if exists pet cascade;
drop table if exists gender cascade;
drop table if exists foster_info cascade;
drop table if exists own_r cascade;
drop table if exists animal_type cascade;
drop table if exists breed cascade;



create table if not exists breed (
	breed_id serial primary key unique not null,
	breed_name varchar(45) not null
);

create table if not exists animal_type (
	type_id serial primary key unique not null,
	type_name varchar(45) not null
);

create table if not exists own_r (
	owner_id serial primary key unique not null,
	usrnm varchar(30) not null,
	owner1_first_name varchar(45) not null,
	owner1_last_name varchar(45) not null,
	owner2_first_name varchar(45),
	owner2_last_name varchar(45),
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

create table if not exists foster_info (
	foster_id serial primary key unique not null,
	usrnm varchar(30) not null,
	foster1_first_name varchar(45) not null,
	foster1_last_name varchar(45) not null,
	foster2_first_name varchar(45),
	foster2_last_name varchar(45),
	street1 varchar(50) not null,
	street2 varchar(50),
	city varchar(50) not null,
	state varchar(50) not null,
	zip integer not null,
	phone1 varchar(50) not null,
	phone2 varchar(50),
	fax varchar(50),
	email1 varchar(50) not null,
	email2 varchar(50)
);

create table if not exists gender (
	gender_id serial primary key unique not null,
	gender_name varchar(15) not null -- male/female
);



create table if not exists pet (
	pet_id serial primary key unique not null,
	pet_name varchar(50),
	type_id integer references animal_type,
	breed_id integer references breed,
	age_months integer,
	age_years integer,
	gender_id integer references gender,
	adopted bool,
	owner_id integer references own_r,
	fostered bool,
	foster_id integer references foster_info
);






