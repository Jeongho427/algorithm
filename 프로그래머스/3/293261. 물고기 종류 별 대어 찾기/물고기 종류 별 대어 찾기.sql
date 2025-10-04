with max_fish as(
select fish_type, max(length) max_length
from fish_info
group by fish_type
) 

select f.id, n.fish_name, f.length
from max_fish m join fish_name_info n 
    on m.fish_type = n.fish_type
    join fish_info f
    on f.fish_type = m.fish_type
    and f.length = m.max_length
order by f.id