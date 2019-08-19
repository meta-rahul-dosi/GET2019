create table users
(
    user_id int primary key,
    user_name varchar(20),
    type varchar(10),
    contact varchar(10),
    addresses varchar(100),
    email varchar(25),
    product_id int, foreign key(product_id) references products(product_id)
);

describe users;

insert into users
values 
(1,"ram","shopper","9828778687","ayodhya","ram@gmail.com",1243),
(2,"anirudh","admin","7728019977","vaikuntha","anirudh@gmail.com",1243),
(3,"vaman","shopper","7728019457","mathura","vaman@gmail.com",654),
(4,"hanuman","shopper","8728019977","ayodhya","hanuman@gmail.com",1852);

select * from users;

drop table users;

