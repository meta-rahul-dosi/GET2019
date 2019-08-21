create table categories
(
    category_id int primary key not null,
    category_name varchar(20),
    parent_id int,
    product_id int
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

