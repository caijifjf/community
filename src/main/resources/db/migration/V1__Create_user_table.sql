create table USER
(
    ID           INT auto_increment,
    NAME         VARCHAR(50),
    ACCOUNT_ID   VARCHAR(100),
    GMT_CREATE   BIGINT,
    GMT_MODIFIED BIGINT,
    TOKEN        CHAR(50),
    constraint USER_PK
        primary key (ID)
);

