#SQL代码来源【https://blog.csdn.net/xp541130126/article/details/70163081】
/*drop database if exists db_blog;
create database db_blog;
use db_blog;
create table t_blogger(
	id int(11) not null auto_increment Comment '博主id',
    username varchar(50) not null comment '博主姓名',
    password varchar(100) not null comment '博主密码',
    profile text comment '博主信息',
    nickname varchar(50) default null comment '博主昵称',
    sign varchar(100) default null comment '博主签名',
    imagename varchar(100) default null comment '博主头像路径',
    primary key (id)
) engine=Innodb auto_increment=2 default charset=utf8;*/

