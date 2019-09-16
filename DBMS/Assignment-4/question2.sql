-- Create a Stored procedure to retrieve average sales of each product in a month. 
-- Month and year will be input parameter to function.

DELIMITER //

create procedure avg_sales(month int, year int)
begin
select opm.product_id, count(opm.product_id), sum(p.price)
from ordes_products_mapping opm natural join orders o inner join products p on p.product_id = opm.product_id 
where EXTRACT(MONTH FROM(o.order_date)) = month AND EXTRACT(YEAR FROM (o.order_date)) = year
group by opm.product_id;
end;

// DELIMITER


call avg_sales(09, 2019);

drop procedure avg_sales;





DELIMITER //

CREATE PROCEDURE orderDetails(start Date, finish Date)
BEGIN
 DECLARE startDate DATE;
    IF (start > finish ) THEN
        SELECT DATE_SUB(finish,INTERVAL DAYOFMONTH(finish)-1 DAY) INTO startDate;
    ELSE
        SELECT start INTO startDate;
    END IF;
 SELECT o.order_id, opm.status, o.order_date
 FROM orders as o inner join ordes_products_mapping as opm
 ON o.order_id = opm.order_id
 WHERE DATE(o.order_date) BETWEEN startDate AND finish;
END;

// DELIMITER 


drop procedure orderDetails;

CALL orderDetails( '2019-08-01', '2019-09-16' );


