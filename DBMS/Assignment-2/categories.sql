create table categories
(
    category_id int primary key not null,
    category_name varchar(20),
    product_id int, foreign key(product_id) references products(product_id),
    parent_id int
);


describe categories;

insert into users
values 
(50, "mobiles", 1852),
(51, "bag", 1243);

drop table categories;

