select *
from orders
limit 50;




select *
from bill b natural join orders o
order by amount desc
limit 10;




select o.order_id, o.order_date
from orders o natural join ordes_products_mapping opm
where datediff(current_timestamp(), o.order_date) > 10
and opm.status != 'shipped';



select u.user_name, u.user_id
from users u natural join orders o
where datediff(current_timestamp(),o.order_date)>3;





select u.user_name, u.user_id
from users u natural join orders o
where datediff(current_timestamp(),o.order_date)<15;



select *
from orders o natural join ordes_products_mapping opm          
where order_id=1001 AND status = 'shipped';




select order_id, order_date
from orders o natural join bill b
where amount between 200 and 2000;