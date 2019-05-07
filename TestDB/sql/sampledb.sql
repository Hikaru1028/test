drop database if exists sampledb5;
create database sampledb5;
use sampledb5;

create table sample_table5(
user_id int,
user_name varchar(50),
user_age int,
user_mail varchar(50)
);

insert into sample_table5 values(1,"Yamada","21","xxx@yahoo.co.jp");
insert into sample_table5 values(2,"Sato","39","yyy@google.com");
insert into sample_table5 values(3,"Hanako","44","zzz@yahoo.co.jp");
