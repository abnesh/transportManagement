create schema transportdb;

create table transportdb.route
(
   id integer not null,
   start varchar(100) not null,
   destination varchar(100) not null,
   primary key(id)
);

create table transportdb.stop
(
	id integer not null,
	name varchar(100) not null,
	landmark varchar(250) not null,
	primary key(id) 
);

create table transportdb.route_map
(
	id integer not null,
	routeid integer not null,
	stopid integer not null,
	vehicleid varchar(12) not null,
	arrival time not null,
	departure time not null,
	primary key(id)
);