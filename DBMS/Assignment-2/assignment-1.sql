show tables;

create table products
(
    product_id int primary key,
    product_name varchar(100),
    price int(8), CHECK(price > 0),
    quantity int(5), CHECK(quantity > 0)
);

drop table products;

