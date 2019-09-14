select  p.product_name 
from products_categories_mapping pcm natural join products p
group by pcm.product_id
having count(pcm.product_id) > 1;




(SELECT "0-100" AS "RANGE", count(*)AS COUNT  FROM products WHERE price  BETWEEN 0 and 100) 
Union
(SELECT "101-500", count(*)  FROM products WHERE price  BETWEEN 100 and 500)
Union
(SELECT "Above 500", count(*)  FROM products WHERE price  > 500);



select c.category_name, count(c.category_id) as noOfProducts
from categories c natural join products_categories_mapping pcm
group by c.category_name;


