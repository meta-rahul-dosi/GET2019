create table categories
(
    category_id int,
    category_no int primary key not null unique,
    category_name varchar(30),
    product_id int, foreign key(product_id) references products(product_id),
    parent_id int
);

describe categories;

insert into categories
values 
(50, "mobiles", null, 102),
(51, "bag", null, 101),
(52, "skybag", 51, 101),
(53, "chocalates", null, 103);

select * from categories;

drop table categories;

