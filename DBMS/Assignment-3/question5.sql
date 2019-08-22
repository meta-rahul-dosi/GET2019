-- creating view 

create view Store_View
as
select p.product_id, p.product_name, p.price, u.user_name, u.user_id, b.order_date, o.status
from products as p inner join orders as o on p.product_id = o.product_id
inner join bill as b on o.order_id = b.order_id
inner join users as u on u.user_id = o.user_id
where datediff( now(), b.order_date) < 60
order by b.order_date desc;



-- display the Products(Items) which are in ‘shipped’ state.


select * from Store_View;

select distinct product_id, product_name
from store_view
where status='shipped';



-- display the top 5 most selling products

select product_id, product_name, count(product_id) as no_of_sale
from store_view
group by product_id
order by no_of_sale desc 
limit 5;


drop view Store_View