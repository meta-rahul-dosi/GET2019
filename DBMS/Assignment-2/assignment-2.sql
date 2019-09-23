select p.product_id, p.product_name, c.category_name, p.price, p.date_added
from products p natural join products_categories_mapping pcm natural join categories c
where p.quantity > 0
order by date_added desc;



select product_id, product_name
from products
where product_id not in (select product_id from images);




select c1.category_id, c1.category_name, ifnull(parent_category_name,'top category') as parent_category_name
from categories c1
order by parent_category_name;



select c.category_id, c.category_name
from categories c
where c.category_id not in (select distinct parent_category_id from categories where parent_category_id is not null);




select distinct p.product_name, p.price, c.category_name, c.parent_category_name
from products p natural join products_categories_mapping pcm natural join categories c
where c.category_name = 'grains' OR c.parent_category_name = 'grains';





select distinct product_name 
from products
where quantity < 50;











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

