create table bill
(
    bill_id int primary key,
    order_id int, foreign key (order_id) references orders(order_id),
    date date,
    shipping_address int,
    amount int
);