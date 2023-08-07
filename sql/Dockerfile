# Определение базового образа
FROM flyway/flyway:latest

# Переход в рабочий каталог
WORKDIR /flyway

# Копирование файлов миграции SQL в контейнер
COPY . sql/

# Запуск команды миграции
CMD ["migrate"]