create schema testdb;
create table testdb.vehicle
(
   id integer not null,
   vehicle_type varchar(50) not null,
   manufacturer varchar(50) not null,
   pickup_time time not null,
   drop_time time not null,
   vaccent int not null,
   driver_id integer,
   primary key(id)
);

create table testdb.vehicle_capacity
(
   id integer not null,
   vehicle_type varchar(50) not null,
   capacity int,
   primary key(id)
);