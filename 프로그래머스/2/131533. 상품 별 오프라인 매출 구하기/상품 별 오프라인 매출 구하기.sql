with total_price as(
    select product_code, p.price*s.sales_amount sales
    from product p join offline_sale s on p.product_id = s.product_id
)

select p.product_code, sum(sales) sales
from product p join total_price t on p.product_code = t.product_code
group by p.product_code
order by sales desc, product_code