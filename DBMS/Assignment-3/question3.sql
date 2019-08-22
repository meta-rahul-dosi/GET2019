SELECT u.user_id, u.user_name, u.contact, count(c.user_id) as "number_of_order" 
FROM users as u natural join orders as c 
WHERE u.userRoleId=1 AND u.userId = c.userId AND c.timestamp >(now() - INTERVAL 30 DAY)
GROUP BY user_id;




SELECT u.userId, u.userName, u.emailId, u.mobileNumber, sum(c.totalamount) as amt FROM user as u natural join shopperorder as c
WHERE u.userRoleId=1 AND u.userId = c.userId AND c.timestamp >(now() - INTERVAL 30 DAY)
GROUP BY userId
ORDER BY amt DESC
LIMIT 10;




select o.product_id 
from orders as o inner join bill as b
where o.status = 'cancelled'
order by b.order_date desc
limit 10;

