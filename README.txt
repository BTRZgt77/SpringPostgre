Hay que crear un proyecto, en Spring Initizlizr (Mave y seleccionando Spring Boot Dev tools, lombok, Spring web y postgreSql) con estas dependecias generamos un zip y se abre en Visual Studio Code.
Se empieza con Model,  cuenta con el mapeo de nuestras clases, donde se ven las columnas que tiene la tabla y las relaciones que tiene.
se hace un repositorio y se incluye los metodos para que se comuniquen con la base de datos
SE crea Service que ayuda con las operaciones del repositorio
Se crea un Controller respondera las peticiones que le envie el usuario
Cuando activamos la Api que no lo he podido hacer porque me he dejado algo por hacer,
se va a google y metemos la ruta:
    localhost:8080/api/customers
    localhost:8080/api/employee
    localhost:8080/api/invoice
    Entonces nos devuelve los datos que coge de la base de datos