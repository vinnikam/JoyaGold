create table TIPO_PRODUCTOS
(
    TPR_CODIGO NUMBER       not null
        constraint PK_TIPO_PRODUCTOS
            primary key,
    TPR_NOMBRE VARCHAR2(50) not null
)
;
create table MATERIALES
(
    MAT_CODIGO NUMBER        not null
        constraint PK_MATERIALES
            primary key,
    MAT_NOMBRE VARCHAR2(100) not null
)
;
create table PRODUCTOS
(
    PRO_CODIGO          NUMBER        not null
        constraint PK_PRODUCTOS
            primary key,
    PRO_NOMBRE          VARCHAR2(100) not null,
    PRO_PRECIO          NUMBER        not null,
    PRO_APLICADESCUENTO NUMBER(1),
    PRO_VALORDESCUENTO  NUMBER(3, 2),
    TPR_CODIGO          NUMBER
        constraint FK_PRODUCTOS_TIPO
            references TIPO_PRODUCTOS,
    MAT_CODIGO          NUMBER
        constraint FK_PRODUCTOS_MATERIALES
            references MATERIALES
)
;
create sequence SEQ_MATERIALES ;
create sequence SEQ_PRODUCTOS;
create sequence SEQ_TIPO_PRODUCTOS;

insert into tipo_productos values (SEQ_TIPO_PRODUCTOS.NEXTVAL, 'anillo');
insert into tipo_productos values (SEQ_TIPO_PRODUCTOS.NEXTVAL, 'cadena');
insert into tipo_productos values (SEQ_TIPO_PRODUCTOS.NEXTVAL, 'reloj');
insert into materiales values (SEQ_MATERIALES.NEXTVAL, 'oro');
insert into materiales values (SEQ_MATERIALES.NEXTVAL, 'plata');
