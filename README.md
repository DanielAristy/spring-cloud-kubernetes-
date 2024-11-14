# Se utliza  Podman para crear un contenedor de MySQL

podman run -e 'MYSQL_ROOT_PASSWORD=root' \
-e 'MYSQL_USER=admin' \
-e 'MYSQL_PASSWORD=admin' \
-e 'MYSQL_DATABASE=msvc-usuario' \
-p 3306:3306 \
--name mi_mysql \
-d mysql:8