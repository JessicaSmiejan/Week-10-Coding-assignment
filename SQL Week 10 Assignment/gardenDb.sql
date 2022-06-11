Create database if not  exists garden;

use garden;

drop table if exists plants;
drop table if exists  zone;

Create table  zone (
	id int (10) not  null  auto_increment,
    USDAZone Set ( "1",  "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13") not null,
    primary key  (id)
);

Create table plant (
 id int (10) not null auto_increment,
 botanicalName varchar (50) not null,
 commonName varchar (50), 
 plantFamily varchar (50),
 zone_id int (10) not null,
  primary key (id),
  foreign key (zone_id) references zone (id)
  
);