select order_id, date, amount
from orders
limit 50;



select order_id
from orders
order by amount desc
limit 10;



SELECT * 
FROM orders
WHERE date < NOW() - INTERVAL 10 DAY 
      AND (SELECT count(*) FROM orders WHERE shopperorderId = orders.order_id AND status <> "shipped") > 0;
      
      
      