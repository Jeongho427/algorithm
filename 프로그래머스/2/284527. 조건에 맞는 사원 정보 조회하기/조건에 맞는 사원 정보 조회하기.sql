-- 1) 사번별 2022년 총점 집계
WITH score_sum AS (
  SELECT 
    g.emp_no,
    SUM(g.score) AS score
  FROM hr_grade AS g
  WHERE g.year = 2022
  GROUP BY g.emp_no
)
-- 2) 최댓값과 같은 사람들만 조회
SELECT 
  ss.score AS SCORE,
  e.emp_no AS EMP_NO,
  e.emp_name AS EMP_NAME,
  e.position AS POSITION,
  e.email AS EMAIL
FROM score_sum ss
JOIN hr_employees e ON e.emp_no = ss.emp_no
WHERE ss.score = (SELECT MAX(score) FROM score_sum)
ORDER BY ss.score DESC, e.emp_no;