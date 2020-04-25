select case when g.grade < 8 then 'NULL' else st.name end stname, g.grade, st.marks
  from students st
     , grades g
 where st.marks between g.min_mark and g.max_mark
order by g.grade desc, stname, marks;