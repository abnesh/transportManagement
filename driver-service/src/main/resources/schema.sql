create schema testdb;
create table testdb.driver
(
   id integer not null,
   name varchar(100) not null,
   pan char(10) not null,
   aadhaar char(19) not null,
   contact bigint not null,
   vehicleid char(12),
   primary key(id)
);