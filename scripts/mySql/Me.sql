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

declare 
cursor v_coder_cursor is  
select last_name, hire_date from coders;
begin
for v_cur in v_coder_cursor loop 
dbms_output.put_line( 
'[' || v_cur.last_name || ', ' || v_cur.hire_date || ']');
end loop; end;
/


declare
cursor v_coder_cursor is
select last_name, first_name, phone_number from phone_view;
begin
for v_cur in v_coder_cursor loop
dbms_output.put_line( 
'[' || v_cur.last_name || ', ' || v_cur.first_name || ',' || v_cur.phone_number || ']');
end loop;
end;
/



declare
cursor v_number_cursor is
select first_name, last_name, phone_number
from phone_view
where regexp_like(first_name, '[A].') or regexp_like(last_name, '[A].')
order by 1;
begin
for v_cur in v_number_cursor loop
dbms_output.put_line( 
'[' || v_cur.last_name || ', ' || v_cur.first_name || ', ' || v_cur.phone_number || ']');
end loop;
end;
/

set serveroutput on
create or replace procedure get_coder_salary(
p_coder_id in coders.coder_id%type,
p_salary out coders.salary%type)
is begin
select salary
into p_salary
from coders 
where coder_id = p_coder_id;
end get_coder_salary;
/ 

declare 
v_id coders.coder_id%type := 105; 
v_salary coders.salary%type;
begin 
get_coder_salary(v_id, v_salary);
dbms_output.put_line('Salary is ' || v_salary);
exception  
when others then
dbms_output.put_line('Can''t get salary for ' || v_id);
end;
/
set serveroutput on
create or replace procedure increase_coder_salary (
    p_coder_id in coders.coder_id%type,
    p_increase_salary in coders.salary%type,
    p_result_salary out coders.salary%type ) is
    v_salary coders.salary%type;
begin
    select salary 
    into v_salary
    from coders
    where coder_id = p_coder_id;
    p_result_salary := v_salary + p_increase_salary ;

    update coders 
    set salary = salary + p_increase_salary 
    where coder_id = p_coder_id;
    
end increase_coder_salary;
/

declare
    v_id coders.coder_id%type := 105;
    v_increase coders.salary%type := 100;
    v_result coders.salary%type;
begin 
   increase_coder_salary(v_id ,v_increase, v_result);
   dbms_output.put_line('Result is ' || v_result); 
end;
/
 create or replace function increase_salary(
 p_coder_id in coders.coder_id%type,
 p_increase_salary in coders.salary%type)
 return number as
 v_salary coders.salary%type;

 begin
 select salary
 into v_salary 
 from coders
 where coder_id = p_coder_id;
 return v_salary + p_increase_salary;
 end increase_salary;
 /
delete from coders where coder_id = 201; 



alter table coders add constraint coders_pk primary key(coder_id) ;
 create table coder_salaries (
 coder_id number(6, 0) 
 references coders(coder_id),
 old_salary number(8, 2),
 new_salary number(8, 2)
 );
 

 create or replace trigger salary_update
 before update of salary on coders
 for each row
 begin  
 insert into coder_salaries values
 ( :old.coder_id, :old.salary, :new.salary);
 end salary_update;
 /

update coders
set salary = salary * 1.3
where coder_id > 103;



create or replace procedure tomorrow
is
begin
dbms_output.put_line(sysdate + 1); 
end tomorrow;
/



begin
tomorrow(); 
end;
/


create or replace procedure tomorrow(
p_name in varchar2)is
begin

dbms_output.put_line(sysdate + 1 || ' ' || p_name); 
end;
/

declare
v_name varchar2(120) := 'Ciao Antonino questa è la data di domani';
begin
tomorrow(v_name); 
end;
/

create or replace procedure get_coders(
    p_coder_id in coders.coder_id%type,
    p_first_name out coders.first_name%type,
    p_last_name out coders.last_name%type) is
begin
select first_name,last_name
into p_first_name, p_last_name 
from coders
where p_coder_id = coder_id;
end get_coders;
/






commit;
