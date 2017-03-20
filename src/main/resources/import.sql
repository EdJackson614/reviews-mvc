// initialize review
INSERT INTO Category(title) VALUES('Dessert')
INSERT INTO Category(title) VALUES('Seafood')
INSERT INTO Category(title) VALUES('MacnCheese')	
INSERT INTO Review(content,image,title,category_id) VALUES('Easy','images/CremeBrulee.jpg','Creme Brulee',1)
INSERT INTO Review(content,image,title,category_id) VALUES('Difficult','images/ApplePie.jpg','ApplePie',2)
INSERT INTO Review(content,image,title,category_id) VALUES('Medium','images/SeaBass.jpg','SeaBass',3)

-- //or INSERT INTO Reviews(getId, getTitle, getCategory) VALUES('', '','')

-- // initialize orders

-- INSERT INTO Customer_Order(order_number, customer_id) VALUES('foo', 42)
-- INSERT INTO Customer_Order(order_number, customer_id) VALUES('bar', 42)