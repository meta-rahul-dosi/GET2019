create table users
(
    user_id int primary key,
    user_name varchar(20),
    type varchar(10),
    contact varchar(10),
    addresses varchar(100),
    product_id int
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

