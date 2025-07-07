-- 아이디, 이름, 보호 시작일
-- 이름이 같은 동물일 시 보호를 나중에 시작한 동물을 보여줘야한다.
SELECT animal_id, name, datetime
from animal_ins
order by name asc ,datetime desc;