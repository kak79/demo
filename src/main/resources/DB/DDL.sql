
drop table if exists pet cascade;
drop table if exists gender cascade;
drop table if exists all_logins cascade;
drop table if exists volunteer cascade;
drop table if exists foster cascade;
drop table if exists own_r cascade;
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

create table if not exists own_r (
	owner_id serial primary key unique not null,
	login_id integer ,
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

create table if not exists foster (
	foster_id serial primary key unique not null,
	login_id integer ,
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

create table if not exists volunteer (
	volunteer_id serial primary key unique not null,
	login_id integer ,
	first_name varchar(45) not null,
	last_name varchar(45) not null,
	phone varchar(50) not null,
	email varchar(50) not null
);

create table if not exists all_logins (
	login_id serial primary key unique not null,
	volunteer_id integer references volunteer,
	foster_id integer references foster,
	owner_id integer references own_r,
	usrnm varchar(30) unique not null,
	psswrd varchar(15) not null
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
	owner_id integer references own_r,
	fostered bool,
	foster_id integer references foster
);






alter table own_r  
add constraint login_id
foreign key (login_id)
references all_logins (login_id);

alter table foster  
add constraint login_id
foreign key (login_id)
references all_logins (login_id);

alter table volunteer 
add constraint login_id
foreign key (login_id)
references all_logins (login_id);
