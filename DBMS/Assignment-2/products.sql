create table products
(
    product_id int primary key unique not null,
    product_name varchar(100),
    price int(8),
    quantity int(5),
    category_id int, foreign key(category_id) references categories(category_id)
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

