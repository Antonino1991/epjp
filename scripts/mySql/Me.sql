create table items (  
item_id integer primary key,
status char,    name varchar2(20),
coder_id integer);


create table coders
as
select employee_id as coder_id, first_name, last_name, hire_date, salary
from hr.employees
where department_id = 60;


select * from coders;

alter table items 
add constraint items_status_ck 
check(status in ('A', 'B', 'X')); 

insert into items
values K ;

drop table trainees;
drop table courses;
drop sequence trainee_seq;
drop sequence courses_seq;


create sequence trainee_seq start with 1000;
create sequence courses_seq start with 100;



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

create or replace view phone_view as
select first_name, last_name, phone_number
from hr.employees
where employee_id not in (select manager_id from hr.employees where manager_id != employee_id) 
with read only;

select*
from phone_view;

drop view phone_view;



drop sequence coder_seq;

create sequence coder_seq start with 201 ;

insert into coders(coder_id,first_name,last_name,hire_date,salary)
values(coder_seq.nextval,'Maria','Rossi',sysdate,5000);
insert into coders(coder_id,first_name,last_name,hire_date,salary)
values(coder_seq.nextval,'Franco','Bianchi',sysdate,4500);

update coders 
set first_name = 'Mariangela' 
where coder_id=201;

update coders 
set salary = salary + 500 
where salary < 6000;

delete from coders 
where first_name= 'Franco' and last_name='Bianchi';

commit;

set serveroutput on
begin 
dbms_output.put_line('Hello PL/SQL');
end;
/

declare    v_width integer; 
v_height integer := 6;
v_area integer := 7; 
begin   
v_width := v_area / v_height; 
dbms_output.put_line(
'v_width = ' || v_width);
end; 
/

declare 
v_a integer := -1; 
begin    
if v_a > 0 
then       
dbms_output.put_line('v_a is positive');
elsif v_a = 0 then        
dbms_output.put_line('v_a is zero');
else 
dbms_output.put_line('v_a is negative');
end if;
end;
/