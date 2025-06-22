# Hotel Gestion Backend

Este proyecto es un backend desarrollado con **Spring Boot** y **PostgreSQL** para la gestión de hoteles, habitaciones, tipos de habitación, empleados, clientes, reservas y otros módulos relacionados.

## Tecnologías

* Java 21
* Spring Boot 3.5.2
* PostgreSQL
* Maven

---

## Ejecución del proyecto

### Requisitos

* Java 21
* PostgreSQL en funcionamiento
* Maven

### Configuración

La configuración de la base de datos está en `src/main/resources/application.properties`:

```properties
spring.application.name=hotel_db
spring.datasource.url=jdbc:postgresql://localhost:5432/hotel_db
spring.datasource.username=postgres
spring.datasource.password=1234
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### Ejecutar el backend

```bash
mvn spring-boot:run
```

La API quedará disponible en `http://localhost:8080`

---

## Endpoints disponibles

### Hotel

| Método | URL           | Descripción               | 
| ------ | ------------- | ------------------------- | 
| POST   | `/hotel`      | Crear nuevo hotel         | 
| PUT    | `/hotel`      | Actualizar hotel          | 
| GET    | `/hotel`      | Obtener todos los hoteles | 
| GET    | `/hotel/{id}` | Obtener hotel por ID      | 
| DELETE | `/hotel/{id}` | Eliminar hotel por ID     |

### TipoHabitacion

| Método | URL                    | Descripción                    |
| ------ | ---------------------- | ------------------------------ |
| POST   | `/tipoHabitacion`      | Crear nuevo tipo de habitación |
| PUT    | `/tipoHabitacion`      | Actualizar tipo de habitación  |
| GET    | `/tipoHabitacion`      | Obtener todos los tipos        |
| GET    | `/tipoHabitacion/{id}` | Obtener tipo por ID            |
| DELETE | `/tipoHabitacion/{id}` | Eliminar tipo por ID           |

### Habitacion

| Método | URL                | Descripción                    |
| ------ | ------------------ | ------------------------------ |
| POST   | `/habitacion`      | Crear nueva habitación         |
| PUT    | `/habitacion`      | Actualizar habitación          |
| GET    | `/habitacion`      | Obtener todas las habitaciones |
| GET    | `/habitacion/{id}` | Obtener habitación por ID      |
| DELETE | `/habitacion/{id}` | Eliminar habitación por ID     |

### Empleado

| Método | URL                | Descripción                    |
| ------ | ------------------ | ------------------------------ |
| POST   | `/empleado`        | Crear nuevo empleado           |
| PUT    | `/empleado`        | Actualizar empleado            |
| GET    | `/empleado`        | Obtener todos los empleados    |
| GET    | `/empleado/{id}`   | Obtener empleado por ID        |
| DELETE | `/empleado/{id}`   | Eliminar empleado por ID       |

### Cliente

| Método | URL                | Descripción                    |
| ------ | ------------------ | ------------------------------ |
| POST   | `/cliente`         | Crear nuevo cliente            |
| PUT    | `/cliente`         | Actualizar cliente             |
| GET    | `/cliente`         | Obtener todos los clientes     |
| GET    | `/cliente/{id}`    | Obtener cliente por ID         |
| DELETE | `/cliente/{id}`    | Eliminar cliente por ID        |

### Administrador General

| Método | URL                         | Descripción                          |
| ------ | --------------------------- | ------------------------------------ |
| POST   | `/administradorGeneral`     | Crear nuevo administrador general    |
| PUT    | `/administradorGeneral`     | Actualizar administrador general     |
| GET    | `/administradorGeneral`     | Obtener todos los administradores    |
| GET    | `/administradorGeneral/{id}`| Obtener administrador por ID         |
| DELETE | `/administradorGeneral/{id}`| Eliminar administrador por ID        |

### Administrador

| Método | URL                    | Descripción                    |
| ------ | ---------------------- | ------------------------------ |
| POST   | `/administrador`       | Crear nuevo administrador      |
| PUT    | `/administrador`       | Actualizar administrador       |
| GET    | `/administrador`       | Obtener todos los administradores |
| GET    | `/administrador/{id}`  | Obtener administrador por ID   |
| DELETE | `/administrador/{id}`  | Eliminar administrador por ID  |

### Reserva

| Método | URL                | Descripción                    |
| ------ | ------------------ | ------------------------------ |
| POST   | `/reserva`         | Crear nueva reserva            |
| PUT    | `/reserva`         | Actualizar reserva             |
| GET    | `/reserva`         | Obtener todas las reservas     |
| GET    | `/reserva/{id}`    | Obtener reserva por ID         |
| DELETE | `/reserva/{id}`    | Eliminar reserva por ID        |

### Pago

| Método | URL                | Descripción                    |
| ------ | ------------------ | ------------------------------ |
| POST   | `/pago`            | Crear nuevo pago               |
| PUT    | `/pago`            | Actualizar pago                |
| GET    | `/pago`            | Obtener todos los pagos        |
| GET    | `/pago/{id}`       | Obtener pago por ID            |
| DELETE | `/pago/{id}`       | Eliminar pago por ID           |

### Factura

| Método | URL                | Descripción                    |
| ------ | ------------------ | ------------------------------ |
| POST   | `/factura`         | Crear nueva factura            |
| PUT    | `/factura`         | Actualizar factura             |
| GET    | `/factura`         | Obtener todas las facturas     |
| GET    | `/factura/{id}`    | Obtener factura por ID         |
| DELETE | `/factura/{id}`    | Eliminar factura por ID        |

### Usuario

| Método | URL                | Descripción                    |
| ------ | ------------------ | ------------------------------ |
| POST   | `/usuario`         | Crear nuevo usuario            |
| PUT    | `/usuario`         | Actualizar usuario             |
| GET    | `/usuario`         | Obtener todos los usuarios     |
| GET    | `/usuario/{id}`    | Obtener usuario por ID         |
| DELETE | `/usuario/{id}`    | Eliminar usuario por ID        |

---

## Ejemplo de uso (JSON)

### Crear hotel

```json
{
    "nombre": "Hotel 2",
    "ciudad": "Bogotá",
    "telefono": "1234566240",
    "correo": "hotel2@gmail.com",
    "direccion": "Calle 2A #2B-2"
}
```

### Crear empleado

```json
{
    "nombre": "Juan Pérez",
    "cargo": "Recepcionista",
    "telefono": "5551234567",
    "correo": "juan@hotel.com"
}
```

### Crear reserva

```json
{
    "clienteId": 1,
    "habitacionId": 3,
    "fechaInicio": "2023-12-01",
    "fechaFin": "2023-12-05",
    "estado": "Confirmada"
}
```

---

Para probar la aplicacion puedes usar el archivo Exportaciones.postman_collection en resources

---


