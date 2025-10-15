with filtered as(
    select b.book_id, b.category, s.sales
    from book b join book_sales s on b.book_id = s.book_id
    where date_format(s.sales_date,'%Y-%m') = '2022-01'
)

select category, sum(sales) total_sales
from filtered
group by category
order by category