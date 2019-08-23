create table users
(
    user_id int primary key not null unique,
    user_name varchar(20),
    order_id int,
    type varchar(10),
    contact varchar(10),
    address varchar(200)
);

describe users;

select * from users;

drop table users;

