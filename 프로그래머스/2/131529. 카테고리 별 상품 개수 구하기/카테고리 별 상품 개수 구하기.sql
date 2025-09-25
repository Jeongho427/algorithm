-- 코드를 입력하세요
SELECT SUBSTRING(PRODUCT_CODE, 1, 2) category, count(*) products
from product
group by category
order by category