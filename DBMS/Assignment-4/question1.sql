DELIMITER //

CREATE function find_no_of_orders(month int, year int)
RETURNS INT DETERMINISTIC
begin
DECLARE count_of_orders INT;
SELECT COUNT(order_id) INTO count_of_orders
FROM bill
WHERE EXTRACT( MONTH FROM ( bill.order_date ) ) = mon
AND EXTRACT( YEAR FROM ( bill.order_date ) ) = yr;
RETURN count_of_orders;
end

//DELIMITER




DELIMITER //

CREATE FUNCTION maxOrderMonth(yr INT)
RETURNS INT DETERMINISTIC
BEGIN
 DECLARE resulted_month INT;
 SELECT MAX( order_count ) INTO resulted_month 
 FROM(  SELECT COUNT( order_id ) AS Order_count 
        FROM bill 
        WHERE EXTRACT( YEAR FROM (bill.order_date ) ) = yr
        GROUP BY EXTRACT( MONTH FROM (bill.order_date ) ) ) AS T;
 RETURN resulted_month;
END

// DELIMITER 

SELECT maxOrderMonth( 2019 );
