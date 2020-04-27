select w1.id
     , wp1.age
     , t.min_coins
     , w1.power
  from wands w1
     , wands_property wp1
, (select min(w.coins_needed) min_coins
      , w.power
      , wp.age
  from wands w
     , wands_property wp
 where w.code = wp.code
   and wp.is_evil = 0
group by w.power, wp.age) t
where w1.coins_needed = t.min_coins
  and w1.power = t.power
  and w1.code = wp1.code
  and wp1.age = t.age
order by w1.power desc, wp1.age desc;