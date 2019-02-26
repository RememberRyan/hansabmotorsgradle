create table cars (
    id INT AUTO_INCREMENT,
    make VARCHAR(255) NOT NULL,
    model VARCHAR(255) NOT NULL,
    year DATETIME DEFAULT now() NOT NULL,
    numberplate VARCHAR(10) NOT NULL,
    currency varchar(3) DEFAULT 'EUR',
    value decimal(15,2) DEFAULT '0.00',
    condition varchar(4) DEFAULT 'USED',
    location varchar (255),
    mileage decimal (4),
    fueltype varchar(10) DEFAULT 'PETROL',
    gearbox varchar(10) DEFAULT 'AUTO',
    horsepower decimal (4),
    description TEXT,
    PRIMARY KEY (id)
);