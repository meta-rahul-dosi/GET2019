select distinct products.product_id, product_name, price, category_name 
from products inner join categories on products.product_id = categories.product_id
where quantity > 0;



select product_name
from products
where image_id is null;



select category_id, category_name, if(parent_id is null, "top_category", parent_id) as parent_id
from categories
order by parent_id asc;



select category_id, category_name
from categories
where parent_id not in (select category_id from categories);



select product_name, price 
from products natural join categories
where category_name = "mobile";





select distinct product_name 
from products
where quantity < 50;



