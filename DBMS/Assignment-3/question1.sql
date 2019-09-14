-- applying constraint in products table

alter table products
modify product_name varchar(100) not null,
modify price float not null;

-- applying constraint in users table

alter table users
modify user_name varchar(100) not null,
modify contact varchar(10) not null;

-- applying constraint in category table

alter table categories
modify category_name varchar(100) not null;

-- applying constraint in image table

alter table images
modify image_id int auto_increment;

-- applying constraint in orders table

alter table ordes_products_mapping
modify quantity int not null,
add check (status in ( 'shipped', 'cancelled', 'returned' ));