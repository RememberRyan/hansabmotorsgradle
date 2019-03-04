-- At terminal
-- mysql ‐uroot ‐pA33s{2t@
-- create database hansabmotors;
-- use hansabmotors;

create table user (
    userId INT AUTO_INCREMENT,
    name VARCHAR(32) NOT NULL,
    lastName VARCHAR(32) NOT NULL,
    email VARCHAR (40) NOT NULL ,
    phone VARCHAR (40),
    PRIMARY KEY (id)
);

create table car (
  carId INT AUTO_INCREMENT,
  make VARCHAR(32) NOT NULL,
  model VARCHAR(32) NOT NULL,
  carYear DATE,
  numberplate VARCHAR(20) NOT NULL,
  value DECIMAL (15,2) DEFAULT '0.00',
  condition VARCHAR(8) DEFAULT 'New',
  location VARCHAR(255) NOT NULL,
  mileage INT(10),
  fuelType VARCHAR(10) DEFAULT 'Petrol',
  gearbox VARCHAR(32) NOT NULL,
  horsepower VARCHAR(10),
  description TEXT,
  PRIMARY KEY (id)
);

