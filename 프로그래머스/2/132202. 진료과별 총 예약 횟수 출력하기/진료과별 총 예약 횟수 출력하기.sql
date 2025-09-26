select mcdp_cd '진료과코드', count(*) '5월예약건수'
from appointment
where year(apnt_ymd) = 2022 and month(APNT_YMD) = 5
group by mcdp_cd
order by count(*), mcdp_cd