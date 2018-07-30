insert into transportdb.route values(1001,'Ecospace','ITPL');
insert into transportdb.route values(1002,'Whitefield','SilkBoard');
insert into transportdb.route values(1003,'EGL','Electronic City');
insert into transportdb.route values(1004,'Domulur','Kormangala');
insert into transportdb.route values(1005,'Indiranagar','Benarghatta');


insert into transportdb.stop values(10001,'EcoSpace','Beside BANG 4');
insert into transportdb.stop values(10002,'ITPL','ITPL Back Gate');
insert into transportdb.stop values(10003,'Whitefield','Beside Forum Mall');
insert into transportdb.stop values(10004,'Kormangala','Beside Forum Mall PVR');
insert into transportdb.stop values(10005,'IndiraNagar','Near Lella Palace');
insert into transportdb.stop values(10006,'Electronic city','Near Infosys front gate');


insert into transportdb.route_map values(1,1001,10002,'KA03-MA-6754','17:30:00','17:35:00');
insert into transportdb.route_map values(2,1001,10003,'KA03-MA-6754','17:35:00','18:30:00');
insert into transportdb.route_map values(3,1001,10004,'KA03-MA-6754','18:32:00','18:45:00');
insert into transportdb.route_map values(4,1001,10005,'KA03-MA-6754','18:45:00','19:35:00');
insert into transportdb.route_map values(5,1001,10006,'KA03-MA-6754','19:35:00','20:00:00');
insert into transportdb.route_map values(6,1001,10007,'KA03-MA-6754','20:00:00','21:00:00');
