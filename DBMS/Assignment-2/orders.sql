create table orders(orderID int primary key,productID int,userID int,status varchar(10),
date datetime, shipping_address varchar(50), amount int);

describe orders;

drop table orders;


