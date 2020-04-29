select s.name
  from students s
     , packages p
     , (select st.id, pa.salary
          from students st
             , friends f
             , packages pa
        where st.id = f.id
          and f.friend_id = pa.id) t
 where s.id = p.id
   and s.id = t.id
   and p.salary < t.salary
order by t.salary;