create table buzz
(
   id integer auto_increment not null,
   event DATE(255) not null,
   frequency integer not null,
   modeOfNotification varchar(30) not null,
   email varchar(30) not null,
   primary key(id)
);