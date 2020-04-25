select round(long_w, 4) from station t,
(select min(lat_n) min_lat from station where lat_n > 38.7780) lat
where t.lat_n = lat.min_lat;