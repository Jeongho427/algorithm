select floor(price/10000)*10000 price_group, count(*) products
from product
group by floor(price/10000)*10000
order by price_group