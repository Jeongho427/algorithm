select INGREDIENT_TYPE, sum(total_order) TOTAL_ORDER
from first_half f join icecream_info i on f.flavor = i.flavor
group by ingredient_type