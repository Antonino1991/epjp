drop table trainees;
drop table courses;
drop sequence trainee_seq;
drop sequence courses_seq;
drop sequence coder_seq;

create sequence trainee_seq start with 1000;
create sequence courses_seq start with 100;
create sequence coder_seq start with 201 ;


create table courses (
    course_id integer
    constraint course_pk primary key ,    
    name_course varchar2(20));
    
create table trainees (
    trainee_id integer
        constraint trainee_pk primary key,
    name_surname varchar2(20),
    course_id integer
        constraint trainees_course_id_fk references courses(course_id)on delete set null);
        
        insert into courses(course_id,name_course)
        values (courses_seq.nextval, 'java');
        insert into courses(course_id,name_course)
        values (courses_seq.nextval, 'sql');
        insert into courses(course_id,name_course)
        values (courses_seq.nextval, 'html');
        
        
        insert into trainees(trainee_id, name_surname, course_id)
        values (trainee_seq.nextval,'Antonino_Scarfone',(select course_id from courses where name_course = 'java'));
        insert into trainees(trainee_id, name_surname, course_id)
        values (trainee_seq.nextval,'Marco_Blanco',(select course_id from courses where name_course = 'sql'));
        insert into trainees(trainee_id, name_surname, course_id)
        values (trainee_seq.nextval,'Luciana_Uggetti',(select course_id from courses where name_course = 'html'));
        insert into trainees(trainee_id, name_surname, course_id)
        values (trainee_seq.nextval,'Chiara_Saporito',(select course_id from courses where name_course = 'java'));
        insert into trainees(trainee_id, name_surname, course_id)
        values (trainee_seq.nextval,'Edoardo_Errani',(select course_id from courses where name_course = 'html'));
        insert into trainees(trainee_id, name_surname, course_id)
        values (trainee_seq.nextval,'Ilaria_Maggiolini',(select course_id from courses where name_course = 'sql'));
        insert into trainees(trainee_id, name_surname, course_id)
        values (trainee_seq.nextval,'Zha_Nao',(select course_id from courses where name_course = 'java'));
        insert into trainees(trainee_id, name_surname, course_id)
        values (trainee_seq.nextval,'Giovanni_Maggi',(select course_id from courses where name_course = 'sql'));
        insert into trainees(trainee_id, name_surname, course_id)
        values (trainee_seq.nextval,'Alessandro_Armato',(select course_id from courses where name_course = 'java'));
        insert into trainees(trainee_id, name_surname, course_id)
        values (trainee_seq.nextval,'Pablo_Cile',(select course_id from courses where name_course = 'html'));
        insert into trainees(trainee_id, name_surname, course_id)
        values (trainee_seq.nextval,'Sergio_Germany',(select course_id from courses where name_course = 'sql'));
    
    select * from trainees;
    commit;
    
insert into coders(coder_id,first_name,last_name,hire_date,salary)
values(coder_seq.nextval,'Maria','Rossi',sysdate,5000);
insert into coders(coder_id,first_name,last_name,hire_date,salary)
values(coder_seq.nextval,'Franco','Bianchi',sysdate,4500);
