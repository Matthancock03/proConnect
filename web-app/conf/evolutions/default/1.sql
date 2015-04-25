# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table forum (
  forum_id                  varchar(255) not null,
  owner_id                  varchar(255),
  topic_header              varchar(255),
  body                      varchar(255),
  constraint pk_forum primary key (forum_id))
;

create table user (
  id                        bigint not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  user_name                 varchar(255),
  email                     varchar(255),
  current_employer          varchar(255),
  recent_school             varchar(255),
  location                  varchar(255),
  about_me                  varchar(255),
  profile_picture           blob,
  login_provider            varchar(255),
  secret                    varchar(255),
  avatar_url                varchar(255),
  auth_method               varchar(255),
  experience                varchar(255),
  education                 varchar(255),
  projects                  varchar(255),
  constraint pk_user primary key (id))
;

create sequence forum_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists forum;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists forum_seq;

drop sequence if exists user_seq;

