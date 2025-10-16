with frontend_dev_code as(
    select sum(code) code
    from skillcodes
    where category = 'Front End'
),
csharp_dev_code as(
    select code
    from skillcodes
    where name = 'C#'
),
python_dev_code as(
    select code
    from skillcodes
    where name = 'Python'
)

select case 
        when (skill_code & f.code) <> 0 and (skill_code & p.code) = p.code then 'A'
        when (skill_code & c.code) = c.code then 'B'
        when (skill_code & f.code) <> 0 then 'C'
        end grade, 
        d.id, d.email
from developers d join frontend_dev_code f join csharp_dev_code c join python_dev_code p
having grade is not null
order by grade, d.id