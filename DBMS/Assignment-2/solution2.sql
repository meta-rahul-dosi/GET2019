select p.product_id, p.product_name, p.price, c.category_name 
from products p inner join categories c on p.product_id = c.product_id
where quantity > 0;


select product_id from products;


select p.product_id, p.product_name
from products p
where p.product_id not in(select product_id from images);



select category_id, category_name, if(parent_name is null, "top_category", parent_name) as parent_name
from categories
order by parent_name asc;



select category_id, category_name
from categories
where category_id not in (select distinct parent_id from categories);




select product_name, price 
from products p inner join categories c on p.product_id = c.product_id 
where category_name = 'bags';



select distinct product_name 
from products
where quantity < 50;


select * from images;
delete from images 
where product_id = 105;
