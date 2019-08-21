create table orders
( 
  order_id int,
  user_id int,
  product_id int,
  status varchar(10),
  quantity int,
  price int
);

describe orders;

insert into orders values 
(1001, 1, 101, 'shipped', 2, 1210),
(1001, 1, 102, 'cancelled', 1, 12000),
(1002, 2, 103, 'shipped', 3, 230),
(1003, 3, 103, 'returned', 2, 230);

select * from orders;

delete from orders;

drop table orders;


