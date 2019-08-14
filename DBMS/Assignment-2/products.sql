create table products
(
    product_id int primary key,
    product_name varchar(20),
    price int(5),
    quantity int(3)
);

describe products;

insert into products values(1243, 'skybag', 1216, 22);

select * from products;

drop table products;

