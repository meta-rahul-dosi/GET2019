create table categories
(
    category_id int,
    category_no int primary key not null unique,
    category_name varchar(30),
    product_id int, foreign key(product_id) references products(product_id),
    parent_id int,
    parent_name varchar(30)
);

describe categories;

select * from categories;

drop table categories;

