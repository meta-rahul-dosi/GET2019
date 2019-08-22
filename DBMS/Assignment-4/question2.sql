-- Create a Stored procedure to retrieve average sales of each product in a month. 
-- Month and year will be input parameter to function.

DELIMITER //

CREATE PROCEDURE avg_sales(month int, year int)
BEGIN
SELECT o.product_id, COUNT(product_id), COUNT(o.price)
FROM orders as o INNER JOIN bill as b ON orders.order_id = b.order_id
WHERE (EXTRACT(MONTH FROM(b.order_date)) = month) AND (EXTRACT(YEAR FROM(b.order_date)) = year)
GROUP BY o.product_id;
END;

// DELIMITER




DELIMITER //

CREATE PROCEDURE orderDetails(start Date, finish Date)
BEGIN
 DECLARE startDate DATE;
    IF (start > finish ) THEN
        SELECT DATE_SUB(finish,INTERVAL DAYOFMONTH(finish)-1 DAY) INTO startDate;
    ELSE
        SELECT start INTO startDate;
    END IF;
 SELECT p.product_id, p.product_name, o.order_id, o.status, b.order_date
 FROM orders as o INNER JOIN bill as b
 ON o.order_id = b.order_id
 INNER JOIN products as p ON p.product_id = o.product_id
 WHERE DATE(b.order_date) BETWEEN startDate AND finish;
END;

// DELIMITER 

CALL orderDetails( '2019-08-01', '2019-08-14' );
