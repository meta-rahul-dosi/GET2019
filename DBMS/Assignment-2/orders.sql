create table orders
( 
  order_id int,
  user_id int, foreign key (user_id) references users(user_id),
  product_id int, foreign key(product_id) references products(product_id),
  status varchar(10)
);

describe orders;

insert into orders values (212, 1243, 'shipped' ,'vaishali nagar');

select * from orders;

delete from orders;

drop table orders;


