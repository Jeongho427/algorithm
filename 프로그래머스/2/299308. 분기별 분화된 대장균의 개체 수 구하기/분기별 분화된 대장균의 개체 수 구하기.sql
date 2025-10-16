with ecoli_quarter as(select id, case when month(DIFFERENTIATION_DATE) >= 1 and month(DIFFERENTIATION_DATE) <= 3 then '1Q'
                    when month(DIFFERENTIATION_DATE) >= 4 and month(DIFFERENTIATION_DATE) <= 6 then '2Q'
                    when month(DIFFERENTIATION_DATE) >= 7 and month(DIFFERENTIATION_DATE) <= 9 then '3Q'
                    else '4Q' 
                    end quarter
        from ecoli_data
)

select q.quarter, count(q.quarter) ecoli_count
from ecoli_data e join ecoli_quarter q on e.id = q.id
group by q.quarter
order by q.quarter