with score_sum as (
select emp_no, sum(score) total_score
from hr_grade
group by emp_no
)

select s.total_score score, e.EMP_NO, e.EMP_NAME, e.POSITION, e.EMAIL
from hr_employees e join score_sum s on e.emp_no = s.emp_no
order by s.total_score desc
limit 1