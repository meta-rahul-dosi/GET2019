select *
from bill b inner join orders o on o.order_no = b.order_no
order by order_date desc
limit 3;



select *
from bill
order by amount desc
limit 10;



select *
from bill b inner join orders o on b.order_no = o.order_no
where datediff(now(), b.order_date) > 10 and o.status != 'shipped'

    

select u.user_id, u.user_name
from users u inner join orders o on u.order_id = o.order_id inner join bill b on b.order_no = o.order_no
where extract(days from order_date);


select *
from orders
where status = 'shipped' and order_id = '1001';



select order_no, order_date, amount
from bill
where amount between 100 and 500;



