CREATE TABLE IF NOT EXISTS instructor (
    id SERIAL,
    instr_name CHARACTER VARYING(100) NOT NULL,
    CONSTRAINT instructor_pk PRIMARY KEY (id)
);

INSERT INTO instructor(instr_name)VALUES ('Roitman');
INSERT INTO instructor(instr_name)VALUES ('Mr. Kapiza');
INSERT INTO instructor(instr_name)VALUES ('An. Yakov');


CREATE TABLE IF NOT EXISTS students (
    id SERIAL,
    instructor_id int default NULL,
    student_name CHARACTER VARYING(100) NOT NULL,
    CONSTRAINT students_pk PRIMARY KEY (id)
) ;
ALTER TABLE students ADD CONSTRAINT students_fk_01 FOREIGN KEY (instructor_id) REFERENCES instructor (id);

INSERT INTO students(instructor_id, student_name) VALUES(1, 'Smith');
INSERT INTO students(instructor_id, student_name) VALUES(1, 'Jhon');
INSERT INTO students(instructor_id, student_name) VALUES(2, 'Ivan');


SELECT i.instr_name, count(*)
  FROM instructor i, students s
  WHERE i.id = s.instructor_id
  GROUP BY i.instr_name
UNION ALL
SELECT ins.instr_name, 0
  FROM instructor ins
  WHERE ins.id not in (SELECT st.instructor_id FROM students st);

