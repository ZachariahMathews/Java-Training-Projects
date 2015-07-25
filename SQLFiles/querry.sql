create table USER(userid nvarchar(20),password nvarchar(20));
insert into USER values('zach','pass');
select * from USER;
create table TASK(taskid int NOT NULL AUTO_INCREMENT,userid nvarchar(20),category nvarchar(10),
task nvarchar(100),taskdate date,tasktime time,priority int, taskgroup int, PRIMARY KEY (taskid));
	select * from TASK;
insert into TASK(userid,category,task,taskdate,tasktime,priority,taskgroup) values(100,'a','b','2015-06-25','9:30',5,0);