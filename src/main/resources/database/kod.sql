create table Person /* Люди */
(
  id          BIGINT auto_increment
    primary key,
  first_name  nvarchar(20) not null,
  last_name   nvarchar(20) not null,
  father_name nvarchar(20) null,
  birth_date  date         null,
  sex         tinyint(1)   null
);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Олег', 'Віолла', 'Теодорович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Сергій', 'Віолла', 'Теодорович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Данил', 'Віолла', 'Теодорович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Георг', 'Віолла', 'Теодорович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Лола', 'Віолла', 'Теодорівна', '1999-11-09', 0);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Сніжанна', 'Віолла', 'Теодорович', '1999-11-09', 0);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Андрій', 'Віолла', 'Теодорівна', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Св`ятослав', 'Віолла', 'Теодорович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Онуфрій', 'Віолла', 'Теодорович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Ігор', 'Віолла', 'Теодорович', '1999-11-09', 1);

INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Олег', 'Шуфренко', 'Теодорович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Сергій', 'Шуфренко', 'Теодорович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Данил', 'Шуфренко', 'Теодорович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Георг', 'Шуфренко', 'Теодорович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Лола', 'Шуфренко', 'Теодорівна', '1999-11-09', 0);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Сніжанна', 'Шуфренко', 'Теодорович', '1999-11-09', 0);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Андрій', 'Шуфренко', 'Теодорівна', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Св`ятослав', 'Шуфренко', 'Теодорович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Онуфрій', 'Шуфренко', 'Теодорович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Ігор', 'Шуфренко', 'Теодорович', '1999-11-09', 1);

INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Олег', 'Віолла', 'Арсенович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Сергій', 'Віолла', 'Арсенович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Данил', 'Віолла', 'Арсенович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Георг', 'Віолла', 'Арсенович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Лола', 'Віолла', 'Арсенівна', '1999-11-09', 0);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Сніжанна', 'Віолла', 'Арсенович', '1999-11-09', 0);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Андрій', 'Віолла', 'Арсенівна', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Св`ятослав', 'Віолла', 'Арсенович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Онуфрій', 'Віолла', 'Арсенович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Ігор', 'Віолла', 'Арсенович', '1999-11-09', 1);

INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Олег', 'Шуфренко', 'Арсенович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Сергій', 'Шуфренко', 'Арсенович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Данил', 'Шуфренко', 'Арсенович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Георг', 'Шуфренко', 'Арсенович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Лола', 'Шуфренко', 'Арсенівна', '1999-11-09', 0);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Сніжанна', 'Шуфренко', 'Арсенович', '1999-11-09', 0);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Андрій', 'Шуфренко', 'Арсенівна', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Св`ятослав', 'Шуфренко', 'Арсенович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Онуфрій', 'Шуфренко', 'Арсенович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Ігор', 'Шуфренко', 'Арсенович', '1999-11-09', 1);

INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Андрій', 'Патроленко', 'Арсенівна', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Св`ятослав', 'Зуфий', 'Арсенович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Онуфрій', 'Попад', 'Арсенович', '1999-11-09', 1);
INSERT INTO `person` (`first_name`, `last_name`, `father_name`, `birth_date`, `sex`)
VALUES ('Ігор', 'Царь', 'Арсенович', '1999-11-09', 1);

create table General /* Генерали */
(
  id                                       BIGINT auto_increment
    primary key,
  person_id                                BIGINT  not null,
  `graduation_date_of_the_General_Academy` date null, /* Дата закінчення генеральської академії */
  `date_of_the_generals_title`            date not null, /* Дата присвоєння генеральського звання */
  constraint General_Person_id_fk
    foreign key (person_id) references Person (id)
);

INSERT INTO `general` (`person_id`, `graduation_date_of_the_General_Academy`, `date_of_the_generals_title`)
VALUES (1, '2017-11-01', '2018-11-01');
INSERT INTO `general` (`person_id`, `graduation_date_of_the_General_Academy`, `date_of_the_generals_title`)
VALUES (2, '2017-11-01', '2018-11-01');
INSERT INTO `general` (`person_id`, `graduation_date_of_the_General_Academy`, `date_of_the_generals_title`)
VALUES (3, '2017-11-01', '2018-11-01');
INSERT INTO `general` (`person_id`, `graduation_date_of_the_General_Academy`, `date_of_the_generals_title`)
VALUES (4, '2017-11-01', '2018-11-01');


create table Colonel /* Полковники */
(
  id                                       BIGINT auto_increment
    primary key,
  person_id                                BIGINT  not null,
  `graduation_date_of_the_Colonel_Academy` date null, /* Дата закінчення Полковницької академії */
  `date_of_the_Colonels_title`            date not null, /* Дата присвоєння Полковницького звання */
  constraint Colonel_Person_id_fk
    foreign key (person_id) references Person (id)
);
INSERT INTO `colonel` (`person_id`, `graduation_date_of_the_Colonel_Academy`, `date_of_the_Colonels_title`)
VALUES (5, '2017-11-09', '2018-11-09');
INSERT INTO `colonel` (`person_id`, `graduation_date_of_the_Colonel_Academy`, `date_of_the_Colonels_title`)
VALUES (6, '2017-11-09', '2018-11-09');
INSERT INTO `colonel` (`person_id`, `graduation_date_of_the_Colonel_Academy`, `date_of_the_Colonels_title`)
VALUES (7, '2017-11-09', '2018-11-09');
INSERT INTO `colonel` (`person_id`, `graduation_date_of_the_Colonel_Academy`, `date_of_the_Colonels_title`)
VALUES (8, '2017-11-09', '2018-11-09');

create table PettyOfficerColonel /* Підполковники */
(
  id                                                  BIGINT auto_increment
    primary key,
  person_id                                           BIGINT  not null,
  `graduation_date_of_the_lieutenant_colonel_Academy` date null, /* Дата закінчення Підполковницької академії */
  `date_of_the_lieutenant_colonels_title`            date not null, /* Дата присвоєння Підполковницького звання */
  constraint PettyOfficerColonel_Person_id_fk
    foreign key (person_id) references Person (id)
);
INSERT INTO `pettyofficercolonel` (`person_id`, `graduation_date_of_the_lieutenant_colonel_Academy`,
                                   `date_of_the_lieutenant_colonels_title`)
VALUES (9, '2017-11-02', '2018-11-02');
INSERT INTO `pettyofficercolonel` (`person_id`, `graduation_date_of_the_lieutenant_colonel_Academy`,
                                   `date_of_the_lieutenant_colonels_title`)
VALUES (10, '2017-11-02', '2018-11-02');
INSERT INTO `pettyofficercolonel` (`person_id`, `graduation_date_of_the_lieutenant_colonel_Academy`,
                                   `date_of_the_lieutenant_colonels_title`)
VALUES (11, '2017-11-02', '2018-11-02');
INSERT INTO `pettyofficercolonel` (`person_id`, `graduation_date_of_the_lieutenant_colonel_Academy`,
                                   `date_of_the_lieutenant_colonels_title`)
VALUES (12, '2017-11-02', '2018-11-02');

create table Major /* Майори */
(
  id                                     BIGINT auto_increment
    primary key,
  person_id                              BIGINT  not null,
  `graduation_date_of_the_Major_Academy` date null, /* Дата закінчення Майорської академії */
  `date_of_the_Majors_title`            date not null, /* Дата присвоєння Майорського звання */
  constraint Major_Person_id_fk
    foreign key (person_id) references Person (id)
);
INSERT INTO `major` (`person_id`, `graduation_date_of_the_Major_Academy`, `date_of_the_Majors_title`)
VALUES (13, '2017-11-18', '2018-11-15');
INSERT INTO `major` (`person_id`, `graduation_date_of_the_Major_Academy`, `date_of_the_Majors_title`)
VALUES (14, '2017-11-18', '2018-11-15');
INSERT INTO `major` (`person_id`, `graduation_date_of_the_Major_Academy`, `date_of_the_Majors_title`)
VALUES (15, '2017-11-18', '2018-11-15');
INSERT INTO `major` (`person_id`, `graduation_date_of_the_Major_Academy`, `date_of_the_Majors_title`)
VALUES (16, '2017-11-18', '2018-11-15');

create table Captain /* Капітани */
(
  id                                       BIGINT auto_increment
    primary key,
  person_id                                BIGINT  not null,
  `graduation_date_of_the_Captain_Academy` date null, /* Дата закінчення Капітанської академії */
  `date_of_the_Captains_title`            date not null, /* Дата присвоєння Капітанського звання */
  constraint Captain_Person_id_fk
    foreign key (person_id) references Person (id)
);
INSERT INTO `captain` (`person_id`, `graduation_date_of_the_Captain_Academy`, `date_of_the_Captains_title`)
VALUES (17, '2017-11-05', '2018-11-06');
INSERT INTO `captain` (`person_id`, `graduation_date_of_the_Captain_Academy`, `date_of_the_Captains_title`)
VALUES (18, '2017-11-05', '2018-11-06');
INSERT INTO `captain` (`person_id`, `graduation_date_of_the_Captain_Academy`, `date_of_the_Captains_title`)
VALUES (19, '2017-11-05', '2018-11-06');
INSERT INTO `captain` (`person_id`, `graduation_date_of_the_Captain_Academy`, `date_of_the_Captains_title`)
VALUES (20, '2017-11-05', '2018-11-06');

create table Lieutenant /* Лейтенанти */
(
  id                                          BIGINT auto_increment
    primary key,
  person_id                                   BIGINT  not null,
  `graduation_date_of_the_Lieutenant_Academy` date null, /* Дата закінчення Лейтенантської академії */
  `date_of_the_Lieutenants_title`            date not null, /* Дата присвоєння Лейтенантського звання */
  constraint Lieutenant_Person_id_fk
    foreign key (person_id) references Person (id)
);
INSERT INTO `lieutenant` (`person_id`, `graduation_date_of_the_Lieutenant_Academy`, `date_of_the_Lieutenants_title`)
VALUES (21, '2017-11-19', '2018-11-19');
INSERT INTO `lieutenant` (`person_id`, `graduation_date_of_the_Lieutenant_Academy`, `date_of_the_Lieutenants_title`)
VALUES (22, '2017-11-19', '2018-11-19');
INSERT INTO `lieutenant` (`person_id`, `graduation_date_of_the_Lieutenant_Academy`, `date_of_the_Lieutenants_title`)
VALUES (23, '2017-11-19', '2018-11-19');
INSERT INTO `lieutenant` (`person_id`, `graduation_date_of_the_Lieutenant_Academy`, `date_of_the_Lieutenants_title`)
VALUES (24, '2017-11-19', '2018-11-19');

create table PettyOfficer /* Старшини */
(
  id                                                         BIGINT auto_increment
    primary key,
  person_id                                                  BIGINT  not null,
  `the_date_of_the_assignment_of_the_rank_of_senior_officer` date not null, /* Дата присвоєння старшинського звання */
  constraint PettyOfficer_Person_id_fk
    foreign key (person_id) references Person (id)
);
INSERT INTO `pettyofficer` (`person_id`, `the_date_of_the_assignment_of_the_rank_of_senior_officer`)
VALUES (25, '2018-11-17');
INSERT INTO `pettyofficer` (`person_id`, `the_date_of_the_assignment_of_the_rank_of_senior_officer`)
VALUES (26, '2018-11-17');
INSERT INTO `pettyofficer` (`person_id`, `the_date_of_the_assignment_of_the_rank_of_senior_officer`)
VALUES (27, '2018-11-17');
INSERT INTO `pettyofficer` (`person_id`, `the_date_of_the_assignment_of_the_rank_of_senior_officer`)
VALUES (28, '2018-11-17');

create table Sergeant /* Сержанти */
(
  id                                      BIGINT auto_increment
    primary key,
  person_id                               BIGINT  not null,
  `date_of_assignment_of_a_sergeant_rank` date not null, /* Дата присвоєння сержантського звання */
  constraint Sergeant_Person_id_fk
    foreign key (person_id) references Person (id)
);
INSERT INTO `sergeant` (`person_id`, `date_of_assignment_of_a_sergeant_rank`)
VALUES (29, '2018-11-08');
INSERT INTO `sergeant` (`person_id`, `date_of_assignment_of_a_sergeant_rank`)
VALUES (30, '2018-11-08');
INSERT INTO `sergeant` (`person_id`, `date_of_assignment_of_a_sergeant_rank`)
VALUES (31, '2018-11-08');
INSERT INTO `sergeant` (`person_id`, `date_of_assignment_of_a_sergeant_rank`)
VALUES (32, '2018-11-08');

create table Ensign /* Прапорщик */
(
  id                                    BIGINT auto_increment
    primary key,
  person_id                             BIGINT  not null,
  `date_of_assignment_of_a_Ensign_rank` date not null, /* Дата присвоєння прапорського звання */
  constraint Ensign_Person_id_fk
    foreign key (person_id) references Person (id)
);
INSERT INTO `ensign` (`person_id`, `date_of_assignment_of_a_Ensign_rank`)
VALUES (33, '2016-11-12');
INSERT INTO `ensign` (`person_id`, `date_of_assignment_of_a_Ensign_rank`)
VALUES (34, '2016-11-12');
INSERT INTO `ensign` (`person_id`, `date_of_assignment_of_a_Ensign_rank`)
VALUES (35, '2016-11-12');
INSERT INTO `ensign` (`person_id`, `date_of_assignment_of_a_Ensign_rank`)
VALUES (36, '2016-11-12');

create table Yefreytor /* Єфрейтори */
(
  id                                       BIGINT auto_increment
    primary key,
  person_id                                BIGINT  not null,
  `date_of_assignment_of_a_Yefreytor_rank` date not null, /* Дата присвоєння Єфрейторського звання */
  constraint Yefreytor_Person_id_fk
    foreign key (person_id) references Person (id)
);
INSERT INTO `yefreytor` (`person_id`, `date_of_assignment_of_a_Yefreytor_rank`)
VALUES (37, '2017-11-12');
INSERT INTO `yefreytor` (`person_id`, `date_of_assignment_of_a_Yefreytor_rank`)
VALUES (38, '2017-11-12');
INSERT INTO `yefreytor` (`person_id`, `date_of_assignment_of_a_Yefreytor_rank`)
VALUES (39, '2017-11-12');
INSERT INTO `yefreytor` (`person_id`, `date_of_assignment_of_a_Yefreytor_rank`)
VALUES (40, '2017-11-12');

create table Ordinary /* Рядовийі */
(
  id                                      BIGINT auto_increment
    primary key,
  person_id                               BIGINT  not null,
  `date_of_assignment_of_a_Ordinary_rank` date not null, /* Дата присвоєння Рядового звання */
  constraint Ordinary_Person_id_fk
    foreign key (person_id) references Person (id)
);
INSERT INTO `ordinary` (`person_id`, `date_of_assignment_of_a_Ordinary_rank`)
VALUES (41, '2018-11-23');
INSERT INTO `ordinary` (`person_id`, `date_of_assignment_of_a_Ordinary_rank`)
VALUES (42, '2018-11-23');
INSERT INTO `ordinary` (`person_id`, `date_of_assignment_of_a_Ordinary_rank`)
VALUES (43, '2018-11-23');
INSERT INTO `ordinary` (`person_id`, `date_of_assignment_of_a_Ordinary_rank`)
VALUES (44, '2018-11-23');

create table MilitarySpecialty /* Військові спеціальності */
(
  id        BIGINT auto_increment
    primary key,
  name      nvarchar(100) not null,
  person_id BIGINT           not null,
  constraint MilitarySpecialty_Person_id_fk
    foreign key (person_id) references Person (id)
);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Молодший медичний персонал', 1);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Cнайпер', 2);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Військова розвідка', 3);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Розвідка частин спеціального призначення', 7);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Інженерно саперна', 4);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Мостоукдажчик', 5);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Хлібовипікання', 6);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Військове харчування', 8);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Інженер', 9);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Штурмовик', 10);

INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Молодший медичний персонал', 11);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Cнайпер', 12);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Військова розвідка', 13);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Розвідка частин спеціального призначення', 17);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Інженерно саперна', 14);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Мостоукдажчик', 15);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Хлібовипікання', 16);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Військове харчування', 18);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Інженер', 19);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Штурмовик', 20);

INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Молодший медичний персонал', 21);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Cнайпер', 22);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Військова розвідка', 23);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Розвідка частин спеціального призначення', 27);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Інженерно саперна', 24);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Мостоукдажчик', 25);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Хлібовипікання', 26);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Військове харчування', 28);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Інженер', 29);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Штурмовик', 30);

INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Молодший медичний персонал', 31);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Cнайпер', 32);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Військова розвідка', 33);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Розвідка частин спеціального призначення', 37);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Інженерно саперна', 34);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Мостоукдажчик', 35);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Хлібовипікання', 36);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Військове харчування', 38);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Інженер', 39);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Штурмовик', 40);

INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Хлібовипікання', 41);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Військове харчування', 42);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Інженер', 43);
INSERT INTO `militaryspecialty` (`name`, `person_id`)
VALUES ('Штурмовик', 44);

create table Armament /* Озброєння */
(
  id   BIGINT auto_increment
    primary key,
  name varchar(30) charset utf8 null,
  constraint Armament_name_uindex
    unique (name)
);
INSERT INTO `armament` (`name`)
VALUES ('Балістичні ракети');
INSERT INTO `armament` (`name`)
VALUES ('Карбіни');
INSERT INTO `armament` (`name`)
VALUES ('Автоматична зброя');
INSERT INTO `armament` (`name`)
VALUES ('Артилерія');
INSERT INTO `armament` (`name`)
VALUES ('Ракетне озброєння');

create table BalisticMissile /* Балістичні ракети */
(
  id          BIGINT auto_increment
    primary key,
  name        varchar(40) charset utf8 null,
  number      BIGINT                      null,
  armament_id BIGINT                      null,
  constraint BalisticMissile_Armament_id_fk
    foreign key (armament_id) references Armament (id)
);
INSERT INTO `balisticmissile` (`name`, `number`, `armament_id`)
VALUES ('8К11', 83, 1);
INSERT INTO `balisticmissile` (`name`, `number`, `armament_id`)
VALUES ('8К99', 44, 1);
INSERT INTO `balisticmissile` (`name`, `number`, `armament_id`)
VALUES ('Грім (ОТРК)', 28, 1);
INSERT INTO `balisticmissile` (`name`, `number`, `armament_id`)
VALUES ('Р-36орб', 38, 1);
INSERT INTO `balisticmissile` (`name`, `number`, `armament_id`)
VALUES ('РД-869', 48, 1);

create table Carbine /* Карабіни */
(
  id          BIGINT auto_increment
    primary key,
  name        varchar(30) charset utf8 null,
  number      BIGINT                      null,
  armament_id BIGINT                      null,
  constraint Carbine_Armament_id_fk
    foreign key (armament_id) references Armament (id)
);
INSERT INTO `carbine` (`name`, `armament_id`, `number`)
VALUES ('Mauser 98K', 2, 102);
INSERT INTO `carbine` (`name`, `armament_id`, `number`)
VALUES ('СКС', 2, 122);
INSERT INTO `carbine` (`name`, `armament_id`, `number`)
VALUES ('M4', 2, 55);
INSERT INTO `carbine` (`name`, `armament_id`, `number`)
VALUES ('АКС-74У', 2, 222);

create table AutomxaticWeapon /* Автоматична зброя */
(
  id          BIGINT auto_increment
    primary key,
  name        varchar(30) charset utf8 null,
  armament_id BIGINT                      null,
  number      BIGINT                      null,
  constraint AutomaticWeapon_Armament_id_fk
    foreign key (armament_id) references Armament (id)
);
INSERT INTO `automxaticweapon` (`name`, `armament_id`, `number`)
VALUES ('AK 47', 3, 102);
INSERT INTO `automxaticweapon` (`name`, `armament_id`, `number`)
VALUES ('AK 74', 3, 122);
INSERT INTO `automxaticweapon` (`name`, `armament_id`, `number`)
VALUES ('M4A1', 3, 55);
INSERT INTO `automxaticweapon` (`name`, `armament_id`, `number`)
VALUES ('ПК', 3, 222);

create table Artillery /* Артилерія */
(
  id          BIGINT auto_increment
    primary key,
  name        varchar(30) charset utf8 null,
  number      BIGINT                      null,
  armament_id BIGINT                      null,
  constraint Artillery_Armament_id_fk
    foreign key (armament_id) references Armament (id)
);
INSERT INTO `artillery` (`name`, `number`, `armament_id`)
VALUES ('Міномети', 30, 4);
INSERT INTO `artillery` (`name`, `number`, `armament_id`)
VALUES ('Безвідкотна гарма́та', 40, 4);

create table RocketWeapons /* Ракетне озброєння */
(
  id          BIGINT auto_increment
    primary key,
  name        varchar(30) charset utf8 null,
  number      BIGINT                      null,
  armament_id BIGINT                      null,
  constraint RocketWeapons_Armament_id_fk
    foreign key (armament_id) references Armament (id)
);
INSERT INTO `rocketweapons` (`name`, `number`, `armament_id`)
VALUES ('БРОТК «Сапсан»', 203, 5);
INSERT INTO `rocketweapons` (`name`, `number`, `armament_id`)
VALUES ('ОТРК «Грім-2»', 203, 5);
INSERT INTO `rocketweapons` (`name`, `number`, `armament_id`)
VALUES ('РК «Вільха»', 203, 5);
INSERT INTO `rocketweapons` (`name`, `number`, `armament_id`)
VALUES ('КР «Нептун»', 203, 5);

create table Army /* Армії */
(
  id   BIGINT auto_increment
    primary key,
  name nvarchar(20) null
);
INSERT INTO `army` (`name`)
VALUES ('Тильна');
INSERT INTO `army` (`name`)
VALUES ('ПідзаТильна');

create table Division /* Дивізії */
(
  id      BIGINT auto_increment
    primary key,
  name    nvarchar(20) null,
  army_id BIGINT          null,
  constraint Division_Army_id_fk
    foreign key (army_id) references Army (id)
);
INSERT INTO `division` (`name`, `army_id`)
VALUES ('Дивізіон', 1);
INSERT INTO `division` (`name`, `army_id`)
VALUES ('Дивіжин', 2);

create table Brigade /* Бригади */
(
  id      BIGINT auto_increment
    primary key,
  name    nvarchar(20) null,
  army_id BIGINT          null,
  constraint Brigade_Army_id_fk
    foreign key (army_id) references Army (id)
);
INSERT INTO `brigade` (`name`, `army_id`)
VALUES ('БриГадство', 1);

create table Location /* Місця дислокації */
(
  id       BIGINT auto_increment
    primary key,
  country  nvarchar(20) null,
  district nvarchar(20) null,
  region   nvarchar(20) null,
  street   nvarchar(20) null,
  number   nvarchar(10) null
);
INSERT INTO `location` (`country`, `district`, `region`, `street`, `number`)
VALUES ('Україна', 'Чернівецька', 'Кіцманський', 'Прютюнькевича', '6А');
INSERT INTO `location` (`country`, `district`, `region`, `street`, `number`)
VALUES ('Україна', 'Черкаська', 'Придорожний', 'Допосить', '6И');
INSERT INTO `location` (`country`, `district`, `region`, `street`, `number`)
VALUES ('Україна', 'Чернівецька', 'Мікро', 'Проспект', '8');
INSERT INTO `location` (`country`, `district`, `region`, `street`, `number`)
VALUES ('Україна', 'Чернівецька', 'Кіцманський', 'Головна', '32');
INSERT INTO `location` (`country`, `district`, `region`, `street`, `number`)
VALUES ('Україна', 'Івано - Франківська', 'Снятинський', 'Головна', '10Р');
INSERT INTO `location` (`country`, `district`, `region`, `street`, `number`)
VALUES ('Україна', 'Львівська', 'Львів', 'Лесі Українки', '1');

create table MilitaryBase /* Військові частини */
(
  id          BIGINT auto_increment
    primary key,
  name        nvarchar(20) null,
  location_id BIGINT          not null,
  division_id BIGINT          null,
  brigade_id  BIGINT          null,
  constraint MilitaryBase_Brigade_id_fk
    foreign key (brigade_id) references Brigade (id),
  constraint MilitaryBase_Division_id_fk
    foreign key (division_id) references Division (id),
  constraint MilitaryBase_Location_id_fk
    foreign key (location_id) references Location (id)
);
INSERT INTO `militarybase` (`name`, `location_id`, `division_id`, `brigade_id`)
VALUES ('Перша', 1, 1, NULL);
INSERT INTO `militarybase` (`name`, `location_id`, `division_id`, `brigade_id`)
VALUES ('Друга', 2, 2, NULL);
INSERT INTO `militarybase` (`name`, `location_id`, `division_id`, `brigade_id`)
VALUES ('Яблуко', 3, NULL, 1);

create table Rota /* Рота */
(
  id              BIGINT auto_increment
    primary key,
  name            nvarchar(30) null,
  militaryBase_id BIGINT          null,
  constraint Rota_MilitaryBase_id_fk
    foreign key (militaryBase_id) references MilitaryBase (id)
);
INSERT INTO `rota` (`name`, `militaryBase_id`)
VALUES ('9', 1);
INSERT INTO `rota` (`name`, `militaryBase_id`)
VALUES ('8', 2);
INSERT INTO `rota` (`name`, `militaryBase_id`)
VALUES ('7', 3);
INSERT INTO `rota` (`name`, `militaryBase_id`)
VALUES ('6', 1);
INSERT INTO `rota` (`name`, `militaryBase_id`)
VALUES ('5', 2);
INSERT INTO `rota` (`name`, `militaryBase_id`)
VALUES ('4', 3);

create table Platoon /* Взвод */
(
  id      BIGINT auto_increment
    primary key,
  name    nvarchar(30) null,
  rota_id BIGINT          null,
  constraint Platoon_Rota_id_fk
    foreign key (rota_id) references Rota (id)
);
INSERT INTO `platoon` (`name`, `rota_id`)
VALUES ('Взвод 1', 1);
INSERT INTO `platoon` (`name`, `rota_id`)
VALUES ('Взвод 2', 2);
INSERT INTO `platoon` (`name`, `rota_id`)
VALUES ('Взвод 3', 3);
INSERT INTO `platoon` (`name`, `rota_id`)
VALUES ('Взвод 4', 4);
INSERT INTO `platoon` (`name`, `rota_id`)
VALUES ('Взвод 5', 5);
INSERT INTO `platoon` (`name`, `rota_id`)
VALUES ('Взвод 6', 6);

create table Department /* Відділення */
(
  id         BIGINT auto_increment
    primary key,
  name       nvarchar(30) null,
  person_id  BIGINT          null,
  platoon_id BIGINT          null,
  constraint Department_Person_id_fk
    foreign key (person_id) references Person (id),
  constraint Department_Platoon_id_fk
    foreign key (platoon_id) references Platoon (id)
);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 1', 1, 1);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 2', 2, 1);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 3', 3, 2);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 4', 4, 2);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 5', 5, 3);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 6', 6, 3);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 7', 7, 4);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 8', 8, 4);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 9', 9, 5);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 10', 10, 5);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 11', 11, 6);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 12', 12, 6);

INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 1', 13, 1);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 2', 14, 1);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 3', 15, 2);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 4', 16, 2);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 5', 17, 3);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 6', 18, 3);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 7', 19, 4);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 8', 20, 4);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 9', 21, 5);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 10', 22, 5);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 11', 23, 6);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 12', 24, 6);

INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 1', 25, 1);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 2', 26, 1);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 3', 27, 2);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 4', 28, 2);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 5', 29, 3);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 6', 30, 3);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 7', 31, 4);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 8', 32, 4);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 9', 33, 5);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 10', 34, 5);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 11', 35, 6);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 12', 36, 6);

INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 1', 37, 1);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 2', 38, 1);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 3', 39, 2);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 4', 40, 2);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 5', 41, 3);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 6', 42, 3);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 7', 43, 4);
INSERT INTO `department` (`name`, `person_id`, `platoon_id`)
VALUES ('Відділення 8', 44, 4);

create table CompositionOfficers /* Офіцерський склад */
(
  id                      BIGINT auto_increment
    primary key,
  person_id               BIGINT not null,
  department_сommander_id BIGINT null,
  platoon_сommander_id    BIGINT null,
  rota_сommander_id       BIGINT null,
  constraint CompositionOfficers_Department_id_fk
    unique (department_сommander_id),
  constraint CompositionOfficers_Person_id_fk
    unique (person_id),
  constraint CompositionOfficers_Platoon_id_fk
    unique (platoon_сommander_id),
  constraint CompositionOfficers_Rota_id_fk
    unique (rota_сommander_id),
  constraint CompositionOfficers_Department_id_fk
    foreign key (department_сommander_id) references Department (id),
  constraint CompositionOfficers_Person_id_fk
    foreign key (person_id) references Person (id),
  constraint CompositionOfficers_Platoon_id_fk
    foreign key (platoon_сommander_id) references Platoon (id),
  constraint CompositionOfficers_Rota_id_fk
    foreign key (rota_сommander_id) references Rota (id)
);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (1, NULL, NULL, 1);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (2, NULL, NULL, 2);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (3, NULL, NULL, 3);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (4, NULL, NULL, 4);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (5, NULL, NULL, 5);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (6, NULL, NULL, 6);

INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (7, NULL, 1, NULL);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (8, NULL, 2, NULL);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (9, NULL, 3, NULL);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (10, NULL, 4, NULL);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (11, NULL, 5, NULL);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (12, NULL, 6, NULL);

INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (13, 1, NULL, NULL);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (14, 2, NULL, NULL);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (15, 3, NULL, NULL);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (16, 4, NULL, NULL);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (17, 5, NULL, NULL);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (18, 6, NULL, NULL);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (19, 7, NULL, NULL);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (20, 8, NULL, NULL);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (21, 9, NULL, NULL);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (22, 10, NULL, NULL);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (23, 11, NULL, NULL);
INSERT INTO `compositionofficers` (`person_id`, `department_сommander_id`, `platoon_сommander_id`, `rota_сommander_id`)
VALUES (24, 12, NULL, NULL);


create table RankAndFile /* Рядовий і сержантський склад */
(
  id                      BIGINT auto_increment
    primary key,
  person_id               BIGINT not null,
  department_сommander_id BIGINT null,
  platoon_сommander_id    BIGINT null,
  constraint RankAndFile_Department_id_fk
    unique (department_сommander_id),
  constraint RankAndFile_Person_id_fk
    unique (person_id),
  constraint RankAndFile_Platoon_id_fk
    unique (platoon_сommander_id),
  constraint RankAndFile_Department_id_fk
    foreign key (department_сommander_id) references Department (id),
  constraint RankAndFile_Person_id_fk
    foreign key (person_id) references Person (id),
  constraint RankAndFile_Platoon_id_fk
    foreign key (platoon_сommander_id) references Platoon (id)
);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (25, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (26, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (27, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (28, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (29, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (30, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (31, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (32, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (33, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (34, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (35, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (36, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (37, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (38, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (39, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (40, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (41, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (42, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (43, NULL, NULL);
INSERT INTO `rankandfile` (`person_id`, `department_сommander_id`, `platoon_сommander_id`)
VALUES (44, NULL, NULL);

create table Combat_and_transport_vehicles /* Бойова та транспортна техніка */
(
  id              BIGINT auto_increment
    primary key,
  name            nvarchar(30) null,
  militaryBase_id BIGINT          null,
  constraint Combat_and_transport_vehicles_MilitaryBase_id_fk
    foreign key (militaryBase_id) references MilitaryBase (id)
);
INSERT INTO `combat_and_transport_vehicles` (`name`, `militaryBase_id`)
VALUES ('БМП', 1);
INSERT INTO `combat_and_transport_vehicles` (`name`, `militaryBase_id`)
VALUES ('БМП', 2);
INSERT INTO `combat_and_transport_vehicles` (`name`, `militaryBase_id`)
VALUES ('БМП', 3);
INSERT INTO `combat_and_transport_vehicles` (`name`, `militaryBase_id`)
VALUES ('Тягачі', 1);
INSERT INTO `combat_and_transport_vehicles` (`name`, `militaryBase_id`)
VALUES ('Тягачі', 2);
INSERT INTO `combat_and_transport_vehicles` (`name`, `militaryBase_id`)
VALUES ('Тягачі', 3);
INSERT INTO `combat_and_transport_vehicles` (`name`, `militaryBase_id`)
VALUES ('Автотранспорт', 1);
INSERT INTO `combat_and_transport_vehicles` (`name`, `militaryBase_id`)
VALUES ('Автотранспорт', 2);
INSERT INTO `combat_and_transport_vehicles` (`name`, `militaryBase_id`)
VALUES ('Автотранспорт', 3);

create table BMP /* БМП */
(
  id                                BIGINT auto_increment
    primary key,
  name                              varchar(30) charset utf8 null,
  number                            BIGINT                      null,
  armament_id                       BIGINT                      null,
  combat_and_transport_vehilcles_id BIGINT                      null,
  constraint BMP_Armament_id_fk
    foreign key (armament_id) references Armament (id),
  constraint BMP_Combat_and_transport_vehicles_id_fk
    foreign key (combat_and_transport_vehilcles_id) references Combat_and_transport_vehicles (id)
);
INSERT INTO `bmp` (`name`, `number`, `armament_id`, `combat_and_transport_vehilcles_id`)
VALUES ('БМП-1', 300, 4, 1);
INSERT INTO `bmp` (`name`, `number`, `armament_id`, `combat_and_transport_vehilcles_id`)
VALUES ('БМП-1', 200, 4, 2);
INSERT INTO `bmp` (`name`, `number`, `armament_id`, `combat_and_transport_vehilcles_id`)
VALUES ('БМП-1', 100, 4, 3);
INSERT INTO `bmp` (`name`, `number`, `armament_id`, `combat_and_transport_vehilcles_id`)
VALUES ('БМП-2', 300, 4, 1);
INSERT INTO `bmp` (`name`, `number`, `armament_id`, `combat_and_transport_vehilcles_id`)
VALUES ('БМП-2', 200, 4, 2);
INSERT INTO `bmp` (`name`, `number`, `armament_id`, `combat_and_transport_vehilcles_id`)
VALUES ('БМП-2', 100, 4, 3);

create table Tractor /* Тягачі */
(
  id                               BIGINT auto_increment
    primary key,
  name                             varchar(30) charset utf8 null,
  number                           BIGINT                      null,
  armament_id                      BIGINT                      null,
  combat_and_transport_vehicles_id BIGINT                      null,
  constraint Tractor_Armament_id_fk
    foreign key (armament_id) references Armament (id),
  constraint Tractor_Combat_and_transport_vehicles_id_fk
    foreign key (combat_and_transport_vehicles_id) references Combat_and_transport_vehicles (id)
);
INSERT INTO `tractor` (`name`, `number`, `armament_id`, `combat_and_transport_vehicles_id`)
VALUES ('Kenworth T600', 50, NULL, 4);
INSERT INTO `tractor` (`name`, `number`, `armament_id`, `combat_and_transport_vehicles_id`)
VALUES ('Kenworth T600', 40, NULL, 5);
INSERT INTO `tractor` (`name`, `number`, `armament_id`, `combat_and_transport_vehicles_id`)
VALUES ('Kenworth T600', 60, NULL, 6);

create table AutoTransport /* Автотранспорт */
(
  id                               BIGINT auto_increment
    primary key,
  name                             varchar(30) charset utf8 null,
  combat_and_transport_vehicles_id BIGINT                      null,
  number                           BIGINT                      null,
  armament_id                      BIGINT                      null,
  constraint AutoTransport_Armament_id_fk
    foreign key (armament_id) references Armament (id),
  constraint AutoTransport_Combat_and_transport_vehicles_id_fk
    foreign key (combat_and_transport_vehicles_id) references Combat_and_transport_vehicles (id)
);
INSERT INTO `autotransport` (`name`, `combat_and_transport_vehicles_id`, `number`, `armament_id`)
VALUES ('Жигулі', 7, 100, 3);
INSERT INTO `autotransport` (`name`, `combat_and_transport_vehicles_id`, `number`, `armament_id`)
VALUES ('Жигулі', 8, 100, 3);
INSERT INTO `autotransport` (`name`, `combat_and_transport_vehicles_id`, `number`, `armament_id`)
VALUES ('Жигулі', 9, 100, 3);
INSERT INTO `autotransport` (`name`, `combat_and_transport_vehicles_id`, `number`, `armament_id`)
VALUES ('Бусік', 7, 10, 3);
INSERT INTO `autotransport` (`name`, `combat_and_transport_vehicles_id`, `number`, `armament_id`)
VALUES ('Бусік', 8, 10, 3);

create table Building /* Споруди */
(
  id              BIGINT auto_increment
    primary key,
  name            varchar(50) charset utf8 null,
  militaryBase_id BIGINT                      null,
  number          BIGINT                      null, /* Кількість одиниць */
  constraint Building_MilitaryBase_id_fk
    foreign key (militaryBase_id) references MilitaryBase (id)
);
INSERT INTO `building` (`name`, `militaryBase_id`, `number`)
VALUES ('Медпункт', 1, 3);
INSERT INTO `building` (`name`, `militaryBase_id`, `number`)
VALUES ('Медпункт', 2, 3);
INSERT INTO `building` (`name`, `militaryBase_id`, `number`)
VALUES ('Медпункт', 3, 3);
INSERT INTO `building` (`name`, `militaryBase_id`, `number`)
VALUES ('Казарма', 1, 3);
INSERT INTO `building` (`name`, `militaryBase_id`, `number`)
VALUES ('Казарма', 2, 3);
INSERT INTO `building` (`name`, `militaryBase_id`, `number`)
VALUES ('Казарма', 3, 3);
INSERT INTO `building` (`name`, `militaryBase_id`, `number`)
VALUES ('Столова', 1, 1);
INSERT INTO `building` (`name`, `militaryBase_id`, `number`)
VALUES ('Столова', 2, 1);
INSERT INTO `building` (`name`, `militaryBase_id`, `number`)
VALUES ('Столова', 3, 1);
INSERT INTO `building` (`name`, `militaryBase_id`, `number`)
VALUES ('Штаб', 1, 1);
INSERT INTO `building` (`name`, `militaryBase_id`, `number`)
VALUES ('Штаб', 2, 2);
INSERT INTO `building` (`name`, `militaryBase_id`, `number`)
VALUES ('Штаб', 3, 3);
