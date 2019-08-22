create table bill
(
    order_id int,
    order_date datetime,
    shipping_address varchar(100),
    amount int
);

describe bill;

insert into bill values
(1001, '2019-12-10 12:23:23','pratap nagar', 14420),
(1002, '2019-11-21 02:12:12', 'vaishali nagar', 690),
(1002, '2019-11-21 17:11:10', 'vaishali nagar', 460);

select * from bill;

drop table bill;


