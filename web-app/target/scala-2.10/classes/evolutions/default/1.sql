# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table connection (
  connect_id                bigint not null,
  user_id                   bigint,
  connection_id             bigint,
  constraint pk_connection primary key (connect_id))
;

create table forum (
  forum_id                  bigint not null,
  sub_id                    varchar(255),
  owner_id                  varchar(255),
  topic_header              varchar(255),
  body                      text,
  image_url                 text,
  cretimestamp              timestamp,
  constraint pk_forum primary key (forum_id))
;

create table job (
  job_id                    bigint not null,
  poster_id                 bigint,
  post_title                varchar(255),
  job_title                 varchar(255),
  job_description           varchar(255),
  company_name              varchar(255),
  is_read                   boolean,
  tstamp                    timestamp,
  constraint pk_job primary key (job_id))
;

create table message (
  message_id                bigint not null,
  sender_id                 bigint,
  sender_name               varchar(255),
  recipient_id              bigint,
  message_title             varchar(255),
  message_body              text,
  is_read                   boolean,
  tstamp                    timestamp not null,
  constraint pk_message primary key (message_id))
;

create table user_model (
  id                        bigint not null,
  user_name                 varchar(255),
  email                     varchar(255),
  current_employer          varchar(255),
  recent_school             varchar(255),
  location                  varchar(255),
  headline                  varchar(255),
  about_me                  text,
  password                  varchar(255),
  profile_picture           bytea,
  login_provider            varchar(255),
  credit_card               varchar(255),
  experience                text,
  education                 text,
  projects                  text,
  is_premium                boolean,
  version                   timestamp not null,
  constraint uq_user_model_email unique (email),
  constraint pk_user_model primary key (id))
;

create sequence connection_seq;

create sequence forum_seq;

create sequence job_seq;

create sequence message_seq;

create sequence user_model_seq;




# --- !Downs

drop table if exists connection cascade;

drop table if exists forum cascade;

drop table if exists job cascade;

drop table if exists message cascade;

drop table if exists user_model cascade;

drop sequence if exists connection_seq;

drop sequence if exists forum_seq;

drop sequence if exists job_seq;

drop sequence if exists message_seq;

drop sequence if exists user_model_seq;

