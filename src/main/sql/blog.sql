drop database if exists blog;
create database blog;
use blog;
drop table if exists blog_user;
create table blog_user(
	userId int(11) not null auto_increment comment '用户ID',
    userName varchar(50) not null comment '用户名称',
    password varchar(100) not null comment '用户密码',
    nickName varchar(50) default null comment '用户昵称',
    question varchar(100) default null comment '密保问题',
    answer varchar(50) default null comment '密码答案',
    primary key(userId)
)engine = InnoDB auto_increment=2 default charset=utf8;

drop table if exists blog_personalSetting;
create table blog_personalSetting(
	personalSettingId int(11) not null auto_increment  comment '个性设置ID',
    userId int(11) comment '用户ID',
    logTitle varchar(50) comment '博客标签',
    dioGraph varchar(100) comment '个性签名',
    primary key(personalSettingId),
    foreign key(userId) references blog_user (userId)
) engine = InnoDB auto_increment=2 default charset=utf8;

drop table if exists blog_article;
create table blog_article(
	articleId int(11) not null auto_increment comment '文章ID',
    userId int(11) comment '用户ID',
    title varchar(50) comment '文章标题',
    content text comment '文章内容',
    date varchar(50) comment '发表时间',
    hasRead int(11) comment '阅读数量',
    primary key(articleId),
    foreign key (userId) references blog_user(userId)
) engine=Innodb auto_increment=2 default charset=utf8;

drop table if exists blog_review;
create table blog_review(
	reviewId int(11) not null auto_increment comment '评论ID',
    articleId int(11) comment '文章ID',
    userId int(11) comment '用户ID',
    content text comment '评论内容',
    primary key(reviewId),
    foreign key(articleId) references blog_article(articleId),
    foreign key(userId) references blog_user(userId)
)engine=Innodb auto_increment=2 default charset=utf8;

drop table if exists blog_clicked;
create table blog_clicked(
	clickId int(11) not null auto_increment comment '点击ID',
    articleId int(11) comment '文章ID',
    ip text comment '点击着IP地址',
    date varchar(50) comment '点击时间',
    primary key(clickID),
    foreign key (articleId) references blog_article(articleId)
) engine=Innodb auto_increment=2 default charset=utf8;



