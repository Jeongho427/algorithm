select animal_id, name
from animal_outs
where animal_id not in (select i.animal_id
                        from animal_ins i 
                        join animal_outs o 
                        on i.animal_id = o.animal_id)
order by animal_id