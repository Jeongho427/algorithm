-- FISH_NAME_INFO에서 물고기의 종류 별 물고기의 이름과 잡은 수를 출력하는 SQL문을 작성해주세요.

select count(n.fish_type) fish_count, n.fish_name
from fish_info f join fish_name_info n on f.fish_type = n.fish_type
group by n.fish_type, n.fish_name
order by count(n.fish_type) desc