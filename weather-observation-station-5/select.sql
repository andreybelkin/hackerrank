select min(city), length(min(city))
  from station
 where length(city) = (select min(length(city)) from station);

select min(city), length(min(city))
  from station
 where length(city) = (select max(length(city)) from station);
