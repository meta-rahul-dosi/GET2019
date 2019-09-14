SELECT u.user_id, u.user_name, u.contact, count(u.order_id) as "number_of_orders" 
FROM users as u natural join orders as o 
WHERE datediff(current_timestamp(),o.order_date)>10
GROUP BY u.user_id;




select u.user_name, b.amount
from users u natural join orders o natural join bill b
where type='shopper'
order by amount desc
limit 1;





select p.product_name, count(p.product_id) as 'total sold'
from ordes_products_mapping opm inner join products p on p.product_id=opm.product_id 
inner join orders o on o.order_id = opm.order_id
where  datediff(current_timestamp(),o.order_date)<60
group by p.product_id
order by 'total sold'
limit 2;






select *
from products_categories_mapping pcm inner join categories c on c.category_id = pcm.category_id
inner join products p on p.product_id  = pcm.product_id
where c.category_name = 'dairy milk';





select p.product_name, count(p.product_id) as 'no of times cancelled'
from products p inner join ordes_products_mapping opm on p.product_id=opm.product_id
where opm.status = 'cancelled'
group by p.product_name
order by count(p.product_id) desc

