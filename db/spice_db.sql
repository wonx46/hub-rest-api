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
DROP DATABASE IF EXISTS `spice_db`;
CREATE DATABASE IF NOT EXISTS `spice_db` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `spice_db`;

-- Dumping structure for table spice_db.t_company_ms
DROP TABLE IF EXISTS `t_company_ms`;
CREATE TABLE IF NOT EXISTS `t_company_ms` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `company_name` varchar(50) NOT NULL,
  `description_1` longtext NOT NULL,
  `description_2` longtext NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table spice_db.t_company_ms: ~1 rows (approximately)
/*!40000 ALTER TABLE `t_company_ms` DISABLE KEYS */;
INSERT INTO `t_company_ms` (`id`, `company_name`, `description_1`, `description_2`) VALUES
	(1, 'phincon', 'For over 20 years, as a group of companies, Phintraco has been supporting and providing its customers with world-class leading edge solutions. Deliver solutions and services that help customers accelerate their business growth. We believe that this will create significant new value, to our customers and PhinCon as well.', 'Phintraco Consulting (PhinCon), a member of Phintraco Group, is an Information Technology (IT) consulting and services company.Established in 2008, we are focusing on providing customers with all spectrums of Customer Relationship Management (CRM) solutions and Middleware solutions.');
/*!40000 ALTER TABLE `t_company_ms` ENABLE KEYS */;

-- Dumping structure for table spice_db.t_rule_ms
DROP TABLE IF EXISTS `t_rule_ms`;
CREATE TABLE IF NOT EXISTS `t_rule_ms` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `rule_name` varchar(50) NOT NULL,
  `description_1` text NOT NULL,
  `description_2` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Dumping data for table spice_db.t_rule_ms: ~2 rows (approximately)
/*!40000 ALTER TABLE `t_rule_ms` DISABLE KEYS */;
INSERT INTO `t_rule_ms` (`id`, `rule_name`, `description_1`, `description_2`) VALUES
	(1, 'company_rule', 'https://www.tutorialspoint.com/java/java_tutorial.pdf', ''),
	(2, 'claim_medical_rule', 'https://www.tutorialspoint.com/java/java_tutorial.pdf', '');
/*!40000 ALTER TABLE `t_rule_ms` ENABLE KEYS */;

-- Dumping structure for table spice_db.t_user_ms
DROP TABLE IF EXISTS `t_user_ms`;
CREATE TABLE IF NOT EXISTS `t_user_ms` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) NOT NULL,
  `password` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table spice_db.t_user_ms: ~1 rows (approximately)
/*!40000 ALTER TABLE `t_user_ms` DISABLE KEYS */;
INSERT INTO `t_user_ms` (`id`, `user_name`, `password`) VALUES
	(1, 'adepay06', '5f4dcc3b5aa765d61d8327deb882cf99');
/*!40000 ALTER TABLE `t_user_ms` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
