    
ALTER TABLE products ADD INDEX productNameIndex(product_name);
ALTER TABLE products ADD INDEX productPriceIndex(price);
SHOW INDEX FROM products;

ALTER TABLE categories ADD INDEX categoryNameIndex(category_name);
SHOW INDEX FROM categories;

ALTER TABLE orders ADD INDEX orderDateIndex(order_date);
SHOW INDEX FROM orders;

