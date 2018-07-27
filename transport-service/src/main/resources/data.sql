insert into transportdb.route values(111,'Ecospace','ITPL');
insert into transportdb.route values(222,'Whitefield','SilkBoard');
insert into transportdb.route values(333,'EGL','Electronic City');
insert into transportdb.route values(444,'Domulur','Kormangala');
insert into transportdb.route values(555,'Indiranagar','Benarghatta');


insert into transportdb.stop values(12121,'EcoSpace','Beside BANG 4');
insert into transportdb.stop values(12345,'ITPL','ITPL Back Gate');
insert into transportdb.stop values(54321,'Whitefield','Beside Forum Mall');
insert into transportdb.stop values(98765,'Kormangala','Beside Forum Mall PVR');
insert into transportdb.stop values(45332,'IndiraNagar','Near Lella Palace');
insert into transportdb.stop values(44562,'Electronic city','Near Infosys front gate');


insert into transportdb.route_map values(1,111,12121,'KA03-MA-6754','17:30:00','17:35:00');
insert into transportdb.route_map values(2,111,12345,'KA03-MA-6754','17:35:00','18:30:00');
insert into transportdb.route_map values(3,111,54321,'KA03-MA-6754','18:32:00','18:45:00');
insert into transportdb.route_map values(4,111,98765,'KA03-MA-6754','18:45:00','19:35:00');
insert into transportdb.route_map values(5,111,44562,'KA03-MA-6754','19:35:00','20:00:00');
insert into transportdb.route_map values(6,111,45332,'KA03-MA-6754','20:00:00','21:00:00');
