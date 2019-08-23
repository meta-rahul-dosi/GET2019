 create table orders
( 
  order_id int,
  order_no int primary key not null unique,
  product_id int, foreign key(product_id) references products(product_id),
  quantity int(7),
  status varchar(15)
);

describe orders;

select * from orders;

delete from orders;

drop table orders;


