create table products
(
    product_id int,
    product_name varchar(20),
    price int(5),
    quantity int(3),
    image_id int
);

describe products;

insert into products 
values
(101, 'skybag', 1210, 12, 1111),
(101, 'skybag', 1210, 12, 1112),
(102, 'j7-duo', 12000, 2, null),
(103, 'chocobox', 230, 22,11132);

select * from products;

delete from products;

drop table products;

