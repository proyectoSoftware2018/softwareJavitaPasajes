create table turista(
tipo int(1),
nombre varchar(200),
apellido varchar(200),
edad int(11),
dni varchar(8),
telefono varchar(9),
email varchar(200),
lugar varchar(200),
valor varchar(100),
bus varchar(50),
asiento varchar(50)
);


delimiter$$
create procedure insertarturista(
IN tipo int(1),
IN nombre varchar(200),
IN apellido varchar(200),
IN edad int(11),
IN dni varchar(8),
IN telefono varchar(9),
IN email varchar(200),
IN lugar varchar(200),
IN valor varchar(100),
IN bus varchar(50),
IN asiento varchar(50)
)
begin
INSERT into turista values(
tipo,nombre,apellido,edad,dni,telefono,email,lugar,valor,bus,asiento
);
end$$

delimiter$$
create procedure listaturistas()
begin
select * from turista;
end$$

