DROP DATABASE IF EXISTS fog;
CREATE DATABASE fog;

SET GLOBAL time_zone = "+2:00";

DROP USER IF EXISTS 'fog'@'localhost';
CREATE USER 'fog'@'localhost' IDENTIFIED BY 'fog';
grant all privileges on fog.* to 'fog'@'localhost';
use fog;