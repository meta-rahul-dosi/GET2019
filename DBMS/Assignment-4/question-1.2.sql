DELIMITER //

CREATE FUNCTION maxOrderMonth(year INT)
RETURNS INT DETERMINISTIC
BEGIN
 DECLARE result_month INT;
 SELECT MAX(orders_per_month) INTO result_month 
 FROM(  SELECT COUNT( order_id ) AS orders_per_month 
        FROM orders o 
        WHERE EXTRACT( YEAR FROM (o.order_date ) ) = year
        GROUP BY EXTRACT( MONTH FROM (o.order_date))) as t;
RETURN result_month;
END

// DELIMITER



drop function maxOrderMonth;
 

SELECT maxOrderMonth(2019);






select max(orders_per_month)
from (select count(order_id) as orders_per_month 
from orders
where EXTRACT( YEAR FROM (orders.order_date ) ) = 2019
group by EXTRACT(MONTH from (orders.order_date))) as t;



