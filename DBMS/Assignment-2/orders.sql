 create table orders
( 
  order_id int,
  order_no int primary key not null unique,
  product_id int, foreign key(product_id) references products(product_id),
  quantity int(7),
  status varchar(15)
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


