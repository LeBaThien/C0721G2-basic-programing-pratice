use quan_ly_ban_hang;
insert into customer (customer_id, customer_name, customer_age)
values (1,'Minh Quan', 10),
(2, 'Ngoc Anh',20),
(3, 'Hong Ha', 50);


insert into product_order (order_id, customer_id, order_date,order_total_price)
values (1,1,'2006-03-21',null),
(2,2,'2006-03-23',null),
(3,1,'2006-03-16',null);


insert into product ( product_id, product_name, product_price)
values (1,'May Giat',3),
(2,'Tu Lanh',5),
(3,'Dieu Hoa',7),
(4,'Quat',1),
(5,'Bep Dien',2);

insert into order_details (order_id, product_id, order_quantity)
values (1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. 
-- Giá bán của từng loại được tính = odQTY*pPrice)

select product_order.order_id, product_order.order_date, product_order.order_total_price
from product_order;

select customer.customer_id, customer.customer_name, product_order.order_id, product.product_name
from customer join product_order
on customer.customer_id = product_order.customer_id
join order_details
on product_order.order_id = order_details.order_id
join product
on order_details.product_id = product.product_id;

select customer.customer_id, customer.customer_name, product_order.order_id
from customer left join product_order
 on product_order.customer_id = customer.customer_id
where product_order.order_id is null;

select product_order.order_id, product_order.order_date,sum( order_details.order_quantity * product.product_price)
as total_product_price
from product join order_details
on product.product_id = order_details.product_id
join product_order
on product_order.order_id = order_details.order_id
group by(product_order.order_id);
