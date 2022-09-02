-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.24-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para reto5
CREATE DATABASE IF NOT EXISTS `reto5` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `reto5`;

-- Volcando estructura para tabla reto5.libro
CREATE TABLE IF NOT EXISTS `libro` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `autor` varchar(50) NOT NULL,
  `id_materiales` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_materiales` (`id_materiales`),
  CONSTRAINT `libro_ibfk_1` FOREIGN KEY (`id_materiales`) REFERENCES `materiales` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla reto5.libro: ~2 rows (aproximadamente)
INSERT INTO `libro` (`id`, `autor`, `id_materiales`) VALUES
	(1, 'Andrea Gutierrez', 1),
	(2, 'ANTOINE DE SAINT-EXUPERY', 3);

-- Volcando estructura para tabla reto5.materiales
CREATE TABLE IF NOT EXISTS `materiales` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `estado` tinyint(1) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `tematica` varchar(50) NOT NULL,
  `año_publicacion` int(11) NOT NULL,
  `editorial` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla reto5.materiales: ~3 rows (aproximadamente)
INSERT INTO `materiales` (`id`, `estado`, `codigo`, `titulo`, `tematica`, `año_publicacion`, `editorial`) VALUES
	(1, 0, 'y67', 'Desayunando en Jupiter', 'Narrativa, Romance', 2016, 'Plataforma Digital'),
	(2, 0, '6g5', 'Desastres Naturales', 'Noticia, Informacion', 2022, 'El Clarin'),
	(3, 0, 'y78', 'El Principito', 'Novela Corta', 1943, 'Reynal & Hitchcock ');

-- Volcando estructura para tabla reto5.revista
CREATE TABLE IF NOT EXISTS `revista` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `numero` int(11) NOT NULL,
  `volumen` int(11) NOT NULL,
  `id_materiales` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_materiales` (`id_materiales`),
  CONSTRAINT `revista_ibfk_1` FOREIGN KEY (`id_materiales`) REFERENCES `materiales` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla reto5.revista: ~1 rows (aproximadamente)
INSERT INTO `revista` (`id`, `numero`, `volumen`, `id_materiales`) VALUES
	(1, 7, 45, 2);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
