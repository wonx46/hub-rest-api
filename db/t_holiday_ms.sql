-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.37-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             10.1.0.5464
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for spice_db
CREATE DATABASE IF NOT EXISTS `spice_db` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `spice_db`;

-- Dumping structure for table spice_db.t_holiday_ms
DROP TABLE IF EXISTS `t_holiday_ms`;
CREATE TABLE IF NOT EXISTS `t_holiday_ms` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `holiday_date` date NOT NULL,
  `description` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Dumping data for table spice_db.t_holiday_ms: ~5 rows (approximately)
/*!40000 ALTER TABLE `t_holiday_ms` DISABLE KEYS */;
INSERT INTO `t_holiday_ms` (`id`, `holiday_date`, `description`) VALUES
	(1, '2019-05-30', 'Ascension Day of Jesus Christ'),
	(2, '2019-06-01', 'Pancasila Day'),
	(3, '2019-05-19', 'Waisak Day'),
	(4, '2019-08-17', 'Indonesian Independence Day'),
	(5, '2019-06-07', 'Joint Holiday After Idul Fitri');
/*!40000 ALTER TABLE `t_holiday_ms` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
