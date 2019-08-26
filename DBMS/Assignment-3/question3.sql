SELECT u.user_id, u.user_name, u.contact, count(u.user_id) as "number_of_order" 
FROM users as u natural join orders as o 
WHERE timestamp >(now() - INTERVAL 30 DAY)
GROUP BY u.user_id;



select o.product_id 
from orders as o inner join bill as b
where o.status = 'cancelled'
order by b.order_date desc
limit 10;

