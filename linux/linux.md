**1. Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными заполнив файл (Лошадьми, верблюдами и ослы), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).**

```
cat > 'Домашние животные'
Собаки
Кошки
Хомяки

cat > 'Вьючные животные'
Лошади
Верблюды
Ослы

cat 'Домашние животные' 'Вьючные животные' > Животные
cat Животные
mv Животные 'Друзья человека'

```
**2. Создать директорию, переместить файл туда.**

```
mkdir Питомник
mv 'Друзья человека' Питомник
```

**3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.**

```
sudo apt-get update
sudo apt-get install mysql-server
sudo apt-get install msql-workbench-community
```

**4. Установить и удалить deb-пакет с помощью dpkg.**

```
sudo dpkg -i google-chrome-stable_current_amd64.deb
sudo apt install -f
apt list | grep google
sudo dpkg -r google-chrome-stable
```

**5. Выложить историю команд в терминале ubuntu**

history

![Скриншот с историей команд](/linux/Linux1.jpg)

**6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние животные и вьючные животные, в составы которых в случае домашних животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные войдут: Лошади, верблюды и ослы).**

![Диаграмма БД](/DB_diagram.drawio.png)

**7. В подключенном MySQL репозитории создать базу данных “Друзья
человека”**
```
mysql -u root -p

CREATE database human_friends;
```

**8. Создать таблицы с иерархией из диаграммы в БД**
```
USE human_friends;

DROP TABLE IF EXISTS animal_class;
CREATE TABLE animal_class
(
	id_class INT AUTO_INCREMENT PRIMARY KEY,
	type VARCHAR(45)
);

INSERT INTO animal_class (id_class, type)
VALUES (1, 'pack'),
(2, 'home');

DROP TABLE IF EXISTS horses;
CREATE TABLE horses
(
	id_horses INT AUTO_INCREMENT PRIMARY KEY,
    id_class INT,
    name VARCHAR(45) NOT NULL,
    birthday DATE NOT NULL,
    command VARCHAR(45),
    FOREIGN KEY (id_class) REFERENCES animal_class(id_class) ON UPDATE CASCADE ON DELETE CASCADE
);

DROP TABLE IF EXISTS camels;
CREATE TABLE camels
(
	id_camels INT AUTO_INCREMENT PRIMARY KEY,
    id_class INT,
    name VARCHAR(45) NOT NULL,
    birthday DATE NOT NULL,
    command VARCHAR(45),
    FOREIGN KEY (id_class) REFERENCES animal_class(id_class) ON UPDATE CASCADE ON DELETE CASCADE
);

DROP TABLE IF EXISTS donkeys;
CREATE TABLE donkeys
(
	id_donkeys INT AUTO_INCREMENT PRIMARY KEY,
    id_class INT,
    name VARCHAR(45) NOT NULL,
    birthday DATE NOT NULL,
    command VARCHAR(45),
    FOREIGN KEY (id_class) REFERENCES animal_class(id_class) ON UPDATE CASCADE ON DELETE CASCADE
);

DROP TABLE IF EXISTS cats;
CREATE TABLE cats
(
	id_cats INT AUTO_INCREMENT PRIMARY KEY,
    id_class INT,
    name VARCHAR(45) NOT NULL,
    birthday DATE NOT NULL,
    command VARCHAR(45),
    FOREIGN KEY (id_class) REFERENCES animal_class(id_class) ON UPDATE CASCADE ON DELETE CASCADE
);

DROP TABLE IF EXISTS dogs;
CREATE TABLE dogs
(
	id_dogs INT AUTO_INCREMENT PRIMARY KEY,
    id_class INT,
    name VARCHAR(45) NOT NULL,
    birthday DATE NOT NULL,
    command VARCHAR(45),
    FOREIGN KEY (id_class) REFERENCES animal_class(id_class) ON UPDATE CASCADE ON DELETE CASCADE
);

DROP TABLE IF EXISTS hamsters;
CREATE TABLE hamsters
(
	id_hamsters INT AUTO_INCREMENT PRIMARY KEY,
    id_class INT,
    name VARCHAR(45) NOT NULL,
    birthday DATE NOT NULL,
    command VARCHAR(45),
    FOREIGN KEY (id_class) REFERENCES animal_class(id_class) ON UPDATE CASCADE ON DELETE CASCADE
);

```

**9. Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения**

```
```

**10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.**

```
DELETE FROM animals WHERE id_kind=5;
SELECT * FROM animals WHERE id_kind=4 OR id_kind=6;
```
**11. Создать новую таблицу “молодые животные” в которую попадут все
животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице**

**12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
прошлую принадлежность к старым таблицам.**