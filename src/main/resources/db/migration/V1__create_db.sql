create table Archive
(
    id          serial primary key not null,
    datIssuance DATE            not null,
    fond        varchar(200)       not null,
    description varchar(200)       not null,
    affairs     varchar(200)       not null,
    whomIssued  varchar(200)       not null,
    returnDate  DATE
)