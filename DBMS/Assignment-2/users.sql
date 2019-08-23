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

insert into users
values 
(1,"ram","shopper","9828778687","ayodhya",101),
(2,"anirudh","admin","7728019977","vaikuntha",101),
(3,"vaman","shopper","7728019457","mathura",102),
(4,"hanuman","shopper","8728019977","ayodhya",103);

select * from users;

drop table users;

