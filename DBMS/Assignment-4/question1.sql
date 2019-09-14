DELIMITER //

CREATE function find_no_of_orders(month int, year int)
RETURNS INT DETERMINISTIC
begin
DECLARE count_of_orders INT;
SELECT COUNT(order_id) INTO count_of_orders
FROM orders o
WHERE EXTRACT( MONTH FROM ( o.order_date ) ) = month
AND EXTRACT( YEAR FROM ( o.order_date ) ) = year;
RETURN count_of_orders;
end

//DELIMITER

drop function find_no_of_orders;


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

//DELIMITER 

drop function maxOrderMonth;



select max(orders_per_month)
from (select count(order_id) as orders_per_month 
from orders
where EXTRACT( YEAR FROM (orders.order_date ) ) = 2019
group by EXTRACT(MONTH from (orders.order_date))) as t;



SELECT find_no_of_orders(9,2019);

SELECT maxOrderMonth(2019);
