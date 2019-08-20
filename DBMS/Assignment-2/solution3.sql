select order_id, date, amount
from bill
limit 50;



select *
from bill
order by amount desc
limit 10;



SELECT * 
FROM orders
WHERE date < NOW() - INTERVAL 10 DAY 
      AND (SELECT count(*) FROM orders WHERE bill.order_id = orders.order_id AND status <> "shipped") > 0;
      
      

select * 
from orders join products
where amount between 10 and 50;
