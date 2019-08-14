select product_id, product_name, price, category_name 
from ( (products inner join subcategories on products.product_id = subcategories.product_id)
inner join categories on subcategories.category_id = categories.category_id) 
where quantity > 0
order by date desc;


select product_name
from products
where image_id = null;


select category_id, category_name, parent_category_name
from categories full join parent_categories on categories.category_id = parent_categories.parent_category_id
if(parent_category_id == null, "top category")
order by parent_category_name asc;

select product_name 
from products
where quantity < 50



