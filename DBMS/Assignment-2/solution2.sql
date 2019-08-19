select product_id, product_name, price, category_name 
from ( (products inner join subcategories on products.product_id = subcategories.product_id)
inner join categories on subcategories.category_id = categories.category_id) 
where quantity > 0
order by date desc;




select product_name
from products
where image_id = null;





select product_id, product_name, category_name as top_category
from ((products join categories on products.product_id = categories.product_id) 
      join parent_categories on categories.parent_category_id = parent_categories.parent_category_id)
where parent_category_id = null
order by parent_category_name;





select category_id, category_name
from categories as c
where c.id not in (select distinct parent_id from categories);





select product_name, price 
from products natural join categories
where category_name = "mobile";





select product_name 
from products
where quantity < 50;



