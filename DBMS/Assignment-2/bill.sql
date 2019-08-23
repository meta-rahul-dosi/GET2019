create table bill
(
    bill_id int,
    bill_no int primary key not null unique,
    order_no int, foreign key(order_no) references orders(order_no),
    order_date datetime,
    shipping_address varchar(100),
    amount int
);

describe bill;

select * from bill;

drop table bill;


