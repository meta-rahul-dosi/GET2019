create table products
(
    product_id int primary key unique not null,
    product_name varchar(100),
    price int(8),
    quantity int(5), CHECK(quantity > 0),
    category_id int, foreign key(category_id) references categories(category_id)
);

describe products;

select * from products;

delete from products;

drop table products;

