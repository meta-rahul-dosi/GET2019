create table categories
(
    category_id int,
    category_no int primary key not null unique,
    category_name varchar(30),
    parent_id int
);

describe categories;

select * from categories;

drop table categories;

select category_name
from categories
where parent_id = null;

