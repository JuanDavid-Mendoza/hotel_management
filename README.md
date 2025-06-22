# Hotel Gestion Backend

Este proyecto es un backend desarrollado con **Spring Boot** y **PostgreSQL** para la gestión de hoteles, habitaciones, tipos de habitación y otros módulos relacionados.

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

```properties ejemplo
spring.application.name=hotel_db
spring.datasource.url=jdbc:postgresql://localhost:5432/hotel_db
spring.datasource.username=postgres
spring.datasource.password=1234
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### Crear la base de datos

Desde PostgreSQL:

```sql
https://drive.google.com/drive/folders/1GVphPYNwsU6a_Q-AyY-XJU-U0zXUyUk0
```

### Ejecutar el backend

```bash
mvn spring-boot:run
```

La API quedará disponible en `http://localhost:8080`

---

## Endpoints disponibles

###  Hotel

| Método | URL           | Descripción               | 
| ------ | ------------- | ------------------------- | 
| POST   | `/hotel`      | Crear nuevo hotel         | 
| PUT    | `/hotel`      | Actualizar hotel          | 
| GET    | `/hotel`      | Obtener todos los hoteles | 
| GET    | `/hotel/{id}` | Obtener hotel por ID      | 
| DELETE | `/hotel/{id}` | Eliminar hotel por ID     |

###  TipoHabitacion

| Método | URL                    | Descripción                    |
| ------ | ---------------------- | ------------------------------ |
| POST   | `/tipoHabitacion`      | Crear nuevo tipo de habitación |
| PUT    | `/tipoHabitacion`      | Actualizar tipo de habitación  |
| GET    | `/tipoHabitacion`      | Obtener todos los tipos        |
| GET    | `/tipoHabitacion/{id}` | Obtener tipo por ID            |
| DELETE | `/tipoHabitacion/{id}` | Eliminar tipo por ID           |

###  Habitacion

| Método | URL                | Descripción                    |
| ------ | ------------------ | ------------------------------ |
| POST   | `/habitacion`      | Crear nueva habitación         |
| PUT    | `/habitacion`      | Actualizar habitación          |
| GET    | `/habitacion`      | Obtener todas las habitaciones |
| GET    | `/habitacion/{id}` | Obtener habitación por ID      |
| DELETE | `/habitacion/{id}` | Eliminar habitación por ID     |

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

### Actualizar hotel

```json
{
    "id": 2,
    "nombre": "Hotel 1",
    "ciudad": "Bogotá",
    "telefono": "1234567890",
    "correo": "hotel1@gmail.com",
    "direccion": "Calle 1A #1B-1"
}
```

---

Para probar la API puedes usar [Postman](https://www.postman.com/) importando una colección tipo `exportaciones.postman_collection.json`.

---

Cualquier duda o mejora puedes continuar expandiendo los módulos de Empleado, Cliente, Administrador, etc.
