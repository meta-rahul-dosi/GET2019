SELECT u.user_id, u.user_name, u.contact, count(c.user_id) as "number_of_order" 
FROM users as u natural join orders as o 
WHERE c.timestamp >(now() - INTERVAL 30 DAY)
GROUP BY u.user_id;




SELECT u.user_id, u.user_name, u.contact, sum(amount)
FROM users u inner join orders o on u.user_id = o.user_id
     inner join bill b on bill.order_no = o.order_no 
WHERE u.userRoleId=1 AND u.userId = c.userId AND c.timestamp >(now() - INTERVAL 30 DAY)
GROUP BY user_id
ORDER BY amt DESC
LIMIT 10;




select o.product_id 
from orders as o inner join bill as b
where o.status = 'cancelled'
order by b.order_date desc
limit 10;

