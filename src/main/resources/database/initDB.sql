create table Person /* Люди */
(
  id int auto_increment
    primary key,
  first_name nvarchar(20) not null,
  last_name nvarchar(20) not null,
  father_name nvarchar(20) null,
  birth_date date null,
  sex tinyint(1) null
);
create table General /* Генерали */
(
  id int auto_increment
    primary key,
  person_id int not null,
  `graduation_date_of_the_General_Academy` date null, /* Дата закінчення генеральської академії */
  `date_of_the_general's_title` date not null, /* Дата присвоєння генеральського звання */
  constraint General_Person_id_fk
    foreign key (person_id) references Person (id)
);
create table Colonel /* Полковники */
(
  id int auto_increment
    primary key,
  person_id int not null,
  `graduation_date_of_the_Colonel_Academy` date null, /* Дата закінчення Полковницької академії */
  `date_of_the_Colonel's_title` date not null, /* Дата присвоєння Полковницького звання */
  constraint Colonel_Person_id_fk
    foreign key (person_id) references Person (id)
);
create table PettyOfficerColonel /* Підполковники */
(
  id int auto_increment
    primary key,
  person_id int not null,
  `graduation_date_of_the_lieutenant_colonel_Academy` date null, /* Дата закінчення Підполковницької академії */
  `date_of_the_lieutenant_colonel's_title` date not null, /* Дата присвоєння Підполковницького звання */
  constraint PettyOfficerColonel_Person_id_fk
    foreign key (person_id) references Person (id)
);
create table Major /* Майори */
(
  id int auto_increment
    primary key,
  person_id int not null,
  `graduation_date_of_the_Major_Academy` date null, /* Дата закінчення Майорської академії */
  `date_of_the_Major's_title` date not null, /* Дата присвоєння Майорського звання */
  constraint Major_Person_id_fk
    foreign key (person_id) references Person (id)
);
create table Captain /* Капітани */
(
  id int auto_increment
    primary key,
  person_id int not null,
  `graduation_date_of_the_Captain_Academy` date null, /* Дата закінчення Капітанської академії */
  `date_of_the_Captain's_title` date not null, /* Дата присвоєння Капітанського звання */
  constraint Captain_Person_id_fk
    foreign key (person_id) references Person (id)
);
create table Lieutenant /* Лейтенанти */
(
  id int auto_increment
    primary key,
  person_id int not null,
  `graduation_date_of_the_Lieutenant_Academy` date null, /* Дата закінчення Лейтенантської академії */
  `date_of_the_Lieutenant's_title` date not null, /* Дата присвоєння Лейтенантського звання */
  constraint Lieutenant_Person_id_fk
    foreign key (person_id) references Person (id)
);
create table PettyOfficer /* Старшини */
(
  id int auto_increment
    primary key,
  person_id int not null,
  `the_date_of_the_assignment_of_the_rank_of_senior_officer` date not null, /* Дата присвоєння старшинського звання */
  constraint PettyOfficer_Person_id_fk
    foreign key (person_id) references Person (id)
);
create table Sergeant /* Сержанти */
(
  id int auto_increment
    primary key,
  person_id int not null,
  `date_of_assignment_of_a_sergeant_rank` date not null, /* Дата присвоєння сержантського звання */
  constraint Sergeant_Person_id_fk
    foreign key (person_id) references Person (id)
);
create table Ensign /* Прапорщик */
(
  id int auto_increment
    primary key,
  person_id int not null,
  `date_of_assignment_of_a_Ensign_rank` date not null, /* Дата присвоєння прапорського звання */
  constraint Ensign_Person_id_fk
    foreign key (person_id) references Person (id)
);
create table Yefreytor /* Єфрейтори */
(
  id int auto_increment
    primary key,
  person_id int not null,
  `date_of_assignment_of_a_Yefreytor_rank` date not null, /* Дата присвоєння Єфрейторського звання */
  constraint Yefreytor_Person_id_fk
    foreign key (person_id) references Person (id)
);
create table Ordinary /* Рядовийі */
(
  id int auto_increment
    primary key,
  person_id int not null,
  `date_of_assignment_of_a_Ordinary_rank` date not null, /* Дата присвоєння Рядового звання */
  constraint Ordinary_Person_id_fk
    foreign key (person_id) references Person (id)
);
create table MilitarySpecialty /* Військові спеціальності */
(
  id int auto_increment
    primary key,
  name nvarchar(100) not null,
  person_id int not null,
  constraint MilitarySpecialty_Person_id_fk
    foreign key (person_id) references Person (id)
);
create table Armament /* Озброєння */
(
  id   int auto_increment
    primary key,
  name varchar(30) charset utf8 null,
  constraint Armament_name_uindex
    unique (name)
);
create table Army /* Армії */
(
  id   int auto_increment
    primary key,
  name nvarchar(20) null
);
create table Division /* Дивізії */
(
  id      int auto_increment
    primary key,
  name    nvarchar(20) null,
  army_id int         null,
  constraint Division_Army_id_fk
    foreign key (army_id) references Army (id)
);
create table Brigade /* Бригади */
(
  id      int auto_increment
    primary key,
  name    nvarchar(20) null,
  army_id int         null,
  constraint Brigade_Army_id_fk
    foreign key (army_id) references Army (id)
);
create table Location /* Місця дислокації */
(
  id       int auto_increment
    primary key,
  country  nvarchar(20) null,
  district nvarchar(20) null,
  region   nvarchar(20) null,
  street   nvarchar(20) null,
  number   nvarchar(10) null
);
create table MilitaryBase /* Військові частини */
(
  id          int auto_increment
    primary key,
  name        nvarchar(20) null,
  location_id int         not null,
  division_id int         null,
  brigade_id  int         null,
  constraint MilitaryBase_Brigade_id_fk
    foreign key (brigade_id) references Brigade (id),
  constraint MilitaryBase_Division_id_fk
    foreign key (division_id) references Division (id),
  constraint MilitaryBase_Location_id_fk
    foreign key (location_id) references Location (id)
);
create table Rota /* Рота */
(
  id int auto_increment
    primary key,
  name  nvarchar(30) null,
  militaryBase_id int         null,
  constraint Rota_MilitaryBase_id_fk
    foreign key (militaryBase_id) references MilitaryBase (id)
);
create table Platoon /* Взвод */
(
  id int auto_increment
    primary key,
  name nvarchar(30) null,
  rota_id int null,
  constraint Platoon_Rota_id_fk
    foreign key (rota_id) references Rota (id)
);
create table Department /* Відділення */
(
  id int auto_increment
    primary key,
  name nvarchar(30) null,
  person_id int null,
  platoon_id int null,
  constraint Department_Person_id_fk
    foreign key (person_id) references Person (id),
  constraint Department_Platoon_id_fk
    foreign key (platoon_id) references Platoon (id)
);
create table CompositionOfficers /* Офіцерський склад */
(
  id int auto_increment
    primary key,
  person_id int not null,
  department_сommander_id int null,
  platoon_сommander_id int null,
  rota_сommander_id int null,
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
create table RankAndFile /* Рядовий і сержантський склад */
(
  id int auto_increment
    primary key,
  person_id int not null,
  department_сommander_id int null,
  platoon_сommander_id int null,
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
create table Combat_and_transport_vehicles /* Бойова та транспортна техніка */
(
  id int auto_increment
    primary key,
  name nvarchar(30) null,
  militaryBase_id int         null,
  constraint Combat_and_transport_vehicles_MilitaryBase_id_fk
    foreign key (militaryBase_id) references MilitaryBase (id)
);
create table Building /* Споруди */
(
  id int auto_increment
    primary key,
  name  varchar(50) charset utf8 null,
  militaryBase_id int         null,
  number int null, /* Кількість одиниць */
  constraint Building_MilitaryBase_id_fk
    foreign key (militaryBase_id) references MilitaryBase (id)
);
create table BalisticMissile /* Балістичні ракети */
(
  id          int auto_increment
    primary key,
  name        varchar(40) charset utf8 null,
  number      int         null,
  armament_id int         null,
  constraint BalisticMissile_Armament_id_fk
    foreign key (armament_id) references Armament (id)
);
create table BMP /* БМП */
(
  id int auto_increment
    primary key,
  name    varchar(30) charset utf8 null,
  number      int         null,
  armament_id int         null,
  combat_and_transport_vehilcles_id int         null,
  constraint BMP_Armament_id_fk
    foreign key (armament_id) references Armament (id),
  constraint BMP_Combat_and_transport_vehicles_id_fk
    foreign key (combat_and_transport_vehilcles_id) references Combat_and_transport_vehicles (id)
);
create table Tractor /* Тяшачі */
(
  id int auto_increment
    primary key,
  name varchar(30) charset utf8 null,
  number      int         null,
  armament_id int         null,
  combat_and_transport_vehicles_id int null,
  constraint Tractor_Armament_id_fk
    foreign key (armament_id) references Armament (id),
  constraint Tractor_Combat_and_transport_vehicles_id_fk
    foreign key (combat_and_transport_vehicles_id) references Combat_and_transport_vehicles (id)
);
create table AutoTransport /* Автотранспорт */
(
  id int auto_increment
    primary key,
  name varchar(30) charset utf8 null,
  combat_and_transport_vehicles_id int null,
  number      int         null,
  armament_id int null,
  constraint AutoTransport_Armament_id_fk
    foreign key (armament_id) references Armament (id),
  constraint AutoTransport_Combat_and_transport_vehicles_id_fk
    foreign key (combat_and_transport_vehicles_id) references Combat_and_transport_vehicles (id)
);
create table Carbine /* Карабіни */
(
  id int auto_increment
    primary key,
  name varchar(30) charset utf8 null,
  number      int         null,
  armament_id int null,
  constraint Carbine_Armament_id_fk
    foreign key (armament_id) references Armament (id)
);
create table AutomaticWeapon /* Автоматична зброя */
(
  id int auto_increment
    primary key,
  name varchar(30) charset utf8 null,
  armament_id int null,
  number      int         null,
  constraint AutomaticWeapon_Armament_id_fk
    foreign key (armament_id) references Armament (id)
);
create table Artillery /* Артилерія */
(
  id int auto_increment
    primary key,
  name varchar(30) charset utf8 null,
  number      int         null,
  armament_id int null,
  constraint Artillery_Armament_id_fk
    foreign key (armament_id) references Armament (id)
);
create table RocketWeapons /* Ракетне озброєння */
(
  id int auto_increment
    primary key,
  name varchar(30) charset utf8 null,
  number      int         null,
  armament_id int null,
  constraint RocketWeapons_Armament_id_fk
    foreign key (armament_id) references Armament (id)
);