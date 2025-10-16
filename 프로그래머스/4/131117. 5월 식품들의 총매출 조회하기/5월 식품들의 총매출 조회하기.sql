select p.product_id, p.product_name, sum(p.price*o.amount) total_sales
from food_product p join food_order o on p.product_id = o.product_id
where date_format(o.produce_date,'%Y-%m') = '2022-05'
group by product_id
order by total_sales desc, p.product_id