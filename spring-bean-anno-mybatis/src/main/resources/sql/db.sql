create database spring_db;
use spring_db;
create table account(
                        id int primary key auto_increment,
                        name varchar(20),
                        money double
);
insert into account values(null,'jack',1000),(null,'rose',1000);