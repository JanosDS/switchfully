create table ATTRACTION_OVERVIEW
(
    id                integer unique not null,
    score             integer,
    description       text,
    price             float,
    visitors_per_year integer,
    primary key (id)
);

create sequence attraction_overview_seq start with 1 increment by 1;

alter table attraction
    add fk_attraction_overview integer;
alter table attraction
    add foreign key (fk_attraction_overview) references attraction_overview (id);

