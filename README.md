README - Microservicio en Java 17 con Gradle
Este README proporciona información básica sobre cómo configurar, construir y ejecutar un microservicio desarrollado en Java 17 utilizando Gradle como herramienta de construcción. Asegúrese de tener instalado Java 17 y Gradle en su sistema antes de comenzar.

Descripción
Este microservicio es una aplicación de ejemplo que utiliza Java 17 y Gradle para mostrar cómo crear un servicio web simple. El servicio web expone un punto de acceso HTTP que responde con un mensaje de saludo.

Requisitos previos
Asegúrese de tener lo siguiente instalado en su sistema:

Java 17: Puede descargar Java 17 desde el sitio web oficial de Oracle o utilizar una distribución OpenJDK.

Gradle: Puede instalar Gradle siguiendo las instrucciones en gradle.org.

Configuración
Clone este repositorio en su máquina local:

bash
Copy code
git clone https://github.com/LeoR22/Microservice.git
Navegue al directorio del proyecto:

bash
Copy code
cd nombre-del-repositorio
Construcción
Para construir el microservicio, ejecute el siguiente comando en la raíz del proyecto:

bash
Copy code
gradle build
Esto compilará el código fuente, gestionará las dependencias y generará un archivo JAR ejecutable en la carpeta build/libs.

Ejecución
Para ejecutar el microservicio, utilice el siguiente comando:

El microservicio estará disponible en http://localhost:8080/api/products para métodos POST y GET.
