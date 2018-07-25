create schema testdb;
create table testdb.employee
(
   id integer not null,
   name varchar(100) not null,
   email varchar(100) not null,
   enterpriseid varchar(100) not null,
   gender char(1) not null,
   contact bigint,
   primary key(id)
);
