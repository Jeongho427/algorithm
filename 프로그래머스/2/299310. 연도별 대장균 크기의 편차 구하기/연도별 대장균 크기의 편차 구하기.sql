with max_ecoli_data as (
  select year(differentiation_date) as year, 
    max(size_of_colony) as max_size
  from ecoli_data
  group by year(differentiation_date)
)
select m.year, m.max_size - size_of_colony year_dev, e.id
from ecoli_data e join max_ecoli_data m
    on year(e.differentiation_date) = m.year
order by year, year_dev