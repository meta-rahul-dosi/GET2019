create table users
(
    user_id int primary key auto_increment,
    user_name varchar(20),
    password varchar(20)
);

insert into users

select * from users;

drop table users;