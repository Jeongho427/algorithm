with fish_avg_length as(
    select fish_type, 
        avg(case 
                when length <= 10 then 10 
                else length
            end) avg_length
    from fish_info
    group by fish_type
)

select count(*) fish_count, max(i.length) max_length, i.fish_type
from fish_info i join fish_avg_length al on i.fish_type = al.fish_type
where al.avg_length >= 33
group by fish_type
order by i.fish_type