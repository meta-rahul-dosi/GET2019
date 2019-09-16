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


SELECT find_no_of_orders(9,2019);


