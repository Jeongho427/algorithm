-- 이 서비스에서는 공간을 둘 이상 등록한 사람을 "헤비 유저"라고 부릅니다. 헤비 유저가 등록한 공간의 정보를 아이디 순으로 조회하는 SQL문

with heavy_user as(
    select host_id, count(*) count
    from places
    group by host_id
)

select p.id, p.name, p.host_id
from places p join heavy_user h on p.host_id = h.host_id
where h.count >= 2
order by id