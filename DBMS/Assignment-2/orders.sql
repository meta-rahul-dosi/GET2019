create table orders
( 
  order_id int primary key,
  product_id int, foreign key(product_id) references products(product_id),
  status varchar(10), 
  date date,
  shipping_address varchar(50), 
  amount int(8)
);

describe orders;

insert into orders values (212, 1243, 'shipped', '2019-01-23' ,'vaishali nagar', 2345);

select * from orders;

delete from orders;

drop table orders;


