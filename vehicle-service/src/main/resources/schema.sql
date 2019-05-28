create schema vehicledb;
create table vehicledb.vehicle
(
   id integer not null,
   vehicle_number char(12) not null,
   vehicle_type varchar(50) not null,
   manufacturer varchar(50) not null,
   pickup_time time not null,
   drop_time time not null,
   vacancy int not null,
   driverid integer,
   primary key(id)
);

create table vehicledb.vehicle_capacity
(
   id integer not null,
   vehicle_type varchar(50) not null,
   capacity int not null,
   primary key(id)
);