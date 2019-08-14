create table users
(
    user_id int primary key,
    user_name varchar(20),
    product_id int, foreign key(product_id) references products(product_id),
    type varchar(10),
    contact int(10),
    addresses varchar(100),
    email varchar(20)
);

describe users;

drop table users;

