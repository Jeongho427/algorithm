with max_favorites as(
    select food_type, max(favorites) max_value
    from rest_info
    group by food_type
)

select r.food_type, r.rest_id, r.rest_name, r.favorites
from rest_info r join max_favorites m on r.food_type = m.food_type and r.favorites = m.max_value
order by r.food_type desc