-- applying constraint in products table

alter table products
modify product_name varchar(100) not null,
modify price float not null;

-- applying constraint in users table

alter table users
modify user_name varchar(100) not null,
modify password varchar(100) not null,
add check (gender in( 'male', 'female'));

-- applying constraint in category table

alter table category
modify category_name varchar(100) not null;

-- applying constraint in image table

alter table images
modify image_id varchar(100) not null;

-- applying constraint in orders table

alter table orders
modify quantity int not null,
add check (status in ( 'shipped', 'cancelled', 'returned' ));