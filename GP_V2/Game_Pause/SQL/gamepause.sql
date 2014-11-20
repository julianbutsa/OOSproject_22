drop database if exists gamepause;
create database gamepause;
use gamepause;


drop table if exists account;
create table account(
accountid	int primary key auto_increment,
firstname	varchar(255),
lastname	varchar(255),
phonenumber	int
);


drop table if exists billinginfo;
create table billinginfo(
accountid		int,
state			varchar(40),
zip				int,
street			varchar(255),
apptnum			int,
country			varchar(255),
foreign key  (accountid) references account(accountid)
);

drop table if exists shippinginfo;
create table shippinginfo(
accountid		int ,
state			varchar(40),
zip				int,
street			varchar(255),
apptnum			int,
country			varchar(255),
foreign key (accountid) references account(accountid)
);

drop table if exists item;
create table item(
itemid			int primary key auto_increment,
itemname		varchar(255),
price			double,
stock			int,
platform		varchar(40),
manufacturer 	varchar(255)
);


drop table if exists game;
create table game(
itemid		int,
releasedate	date,
genre		varchar(50),
foreign key (itemid) references item(itemid)
);

drop table if exists hardware;
create table hardware(
itemid		int ,
itemtype	varchar(40),
foreign key (itemid) references item(itemid)
);

drop table if exists orders;
create table orders(
orderid		int primary key auto_increment,
timeoforder	timestamp,
completed 	boolean
);

drop table if exists ordermap;
create table ordermap(
orderid 	int,
accountid	int,
itemid		int,
quantity	int,
foreign key (orderid) references orders(orderid),
foreign key (accountid) references account(accountid),
foreign key (itemid) references item(itemid)
);

drop table if exists comment;
create table comment(
commentid		int primary key auto_increment,
comment			varchar(1024),
dateposted		timestamp
);

drop table if exists commentmap;
create table commentmap(
commentid		int,
accountid		int,
itemid			int,
foreign key (commentid) references comment(commentid),
foreign key (accountid) references item(itemid),
foreign key (itemid) references account(accountid)
);