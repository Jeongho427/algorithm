with filtered as(
    select writer_id, sum(price) price_sum
    from used_goods_board
    where status = 'DONE'
    group by writer_id
    having sum(price) >= 700000
)

select u.user_id, u.nickname, f.price_sum total_sales
from used_goods_user u join filtered f on u.user_id = f.writer_id
order by total_sales