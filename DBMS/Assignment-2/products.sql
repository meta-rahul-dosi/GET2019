create table products
(
    product_id int primary key,
    product_name varchar(20),
    price int(5),
    quantity int(3),
    image_id int
);

describe products;

insert into products 
values
(1243, 'skybag', 1210, 22,12),
(1852, 'j7-duo', 12000, 12,43),
(654, 'chocobox', 230, 2,8);

select * from products;

drop table products;

