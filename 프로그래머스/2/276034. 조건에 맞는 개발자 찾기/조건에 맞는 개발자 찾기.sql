select distinct(id), email, first_name, last_name
from skillcodes s join developers d on (d.skill_code & s.code) = s.code
where s.name in ('Python', 'C#')
order by id