Requisitos Funcionales:
1.	Servicios de Gestión de Inmuebles:
o	Crear un nuevo inmueble.
o	Actualizar la información de un inmueble existente.
o	Eliminar un inmueble.
o	Obtener detalles de un inmueble por su número de referencia.
o	Listar inmuebles disponibles para venta o alquiler.
o	Asignar una ubicación de llaves a un inmueble.
o	Registrar una visita a un inmueble.
2.	Servicios de Gestión de Oficinas:
o	Crear una nueva oficina.
o	Actualizar la información de una oficina existente.
o	Eliminar una oficina.
o	Obtener detalles de una oficina por su ubicación.
3.	Servicios de Gestión de Zonas de la Ciudad:
o	Crear una nueva zona de la ciudad.
o	Actualizar la información de una zona existente.
o	Eliminar una zona de la ciudad.
o	Obtener detalles de una zona de la ciudad.
4.	Servicios de Gestión de Clientes:
o	Crear un nuevo cliente.
o	Actualizar la información de un cliente existente.
o	Eliminar un cliente.
o	Obtener detalles de un cliente por su identificación.
o	Listar clientes que han realizado visitas.
Tecnologías Utilizadas:
•	Spring Boot para el desarrollo del API RESTful.
•	Spring Data JPA para el acceso a la base de datos.
•	Base de datos relacional H2 (opcinal por ejemplo, MySQL, PostgreSQL) para almacenar los datos.
•	Datos de pruebas. Debe tener un archivo import.sql con los scripts para crear datos iniciales de pruebas
•	Usar DTO. En la capa externa (controllers) no se debe exponer las clases entities, por lo tanto, se debe usar DTO, además de ser un buena práctica se soluciona el problema de loop de serializable y no es necesario de resolverlo con @JsonIgnoreProperties
Entregables:
•	Código fuente del API desarrollado en Spring Boot. Scripts de base datos.