select round(t.long_w, 4) from station t,
(select max(lat_n) max_lan from station where lat_n < 137.2345) lan
where t.lat_n = lan.max_lan;