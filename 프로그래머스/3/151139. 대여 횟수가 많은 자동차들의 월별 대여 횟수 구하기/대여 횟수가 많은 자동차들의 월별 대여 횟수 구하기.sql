with filtered as 
(select car_id, start_date
      from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
      where date_format(start_date, '%Y-%m') >= '2022-08' and date_format(start_date, '%Y-%m') <= '2022-10'),
counting as (select car_id 
             from filtered 
             group by car_id 
             having count(*) >= 5)

select month(start_date) month, f.car_id, count(*) records
from filtered f join counting c on f.car_id = c.car_id
group by month(f.start_date), f.car_id
order by month, f.car_id desc