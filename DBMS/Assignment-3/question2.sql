select  p.product_id, p.product_name, c.category_name 
from products as p inner join categories as c on p.product_id = c.product_id
group by c.product_id
having count(c.product_id) > 1;




(SELECT "0-100" AS "RANGE", count(*)AS COUNT  FROM products WHERE price  BETWEEN 0 and 100) 
Union
(SELECT "101-500", count(*)  FROM products WHERE price  BETWEEN 100 and 500)
Union
(SELECT "Above 500", count(*)  FROM products WHERE price  > 500);



select c.category_name, count(category_id) as noOfProducts
from categories as c
group by c.category_name;


