FROM mysql:8.0

ENV MYSQL_ROOT_PASSWORD=password \
    MYSQL_TCP_PORT=3307

COPY ["./Set-up Scripts/*", "/docker-entrypoint-initdb.d/"]

RUN --mount=type=bind,source=bind_mount_location,target=/var/lib/mysql,readwrite

EXPOSE 3307

