with parent_child as(
    select p.id as parent_id, c.id as child_id
    from ecoli_data p left join ecoli_data c on p.id = c.parent_id
)

select parent_id id, count(child_id) as child_count
from parent_child
group by parent_id
order by parent_id