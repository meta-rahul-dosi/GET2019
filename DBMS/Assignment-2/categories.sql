create table categories
(
    category_name varchar(20),
    category_id int primary key,
    product_id int, foreign key(product_id) references products(product_id),
    parent_category_id int, foreign key(parent_category_id) references parent_categories(parent_category_id)
);

describe categories;

drop table categories;

