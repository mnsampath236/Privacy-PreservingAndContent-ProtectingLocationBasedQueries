-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.72-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema ppacplbs
--

CREATE DATABASE IF NOT EXISTS ppacplbs;
USE ppacplbs;

--
-- Definition of table `history`
--

DROP TABLE IF EXISTS `history`;
CREATE TABLE `history` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` varchar(45) NOT NULL,
  `search_key` text NOT NULL,
  `date` datetime NOT NULL,
  PRIMARY KEY (`id`,`user_id`),
  KEY `user_search_id` (`user_id`),
  CONSTRAINT `user_search_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `history`
--

/*!40000 ALTER TABLE `history` DISABLE KEYS */;
INSERT INTO `history` (`id`,`user_id`,`search_key`,`date`) VALUES 
 (27,'asdf@gmail.com','nerella , kamalapur','2018-02-26 23:10:35'),
 (28,'asdf@gmail.com','nerella , kamalapur','2018-02-26 23:11:17'),
 (29,'asdf@gmail.com',' , ','2018-02-26 23:11:43'),
 (30,'asdf@gmail.com',' , ','2018-02-26 23:12:58'),
 (31,'asdf@gmail.com','newyork , ','2018-02-26 23:13:27'),
 (32,'xyz@gmail.com','Ls+wqNdo6NDX2Us0lsrWDb6E3+AAobmNmgE6BEB2Gvc=','2018-03-03 11:19:56'),
 (33,'xyz@gmail.com','QcNGy67wI/UOneEEHw3aKNGZTcFcxS2AGJ+5qgOZsTQ=','2018-03-03 11:39:02'),
 (34,'xyz@gmail.com','I+ixhLwKDEtFssYwPUBgGHoVf0gUY8Lf/LF0PUOuDiI=','2018-03-03 11:41:15'),
 (35,'xyz@gmail.com','h6ffGtZ6IF+Ve+6dEFm4K0i7Vh3Go4wAPV4itMLOxF8=','2018-03-03 11:43:16');
/*!40000 ALTER TABLE `history` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` varchar(50) NOT NULL,
  `firstname` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `mobile` decimal(15,0) NOT NULL,
  `emailid` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`userid`,`firstname`,`lastname`,`mobile`,`emailid`,`password`,`active`) VALUES 
 ('admin@email.com','admin','admin','1234567890','admin@email.com','admin',1),
 ('asdf@gmail.com','sasdfdfasd','asdfasdf','9876543210','asdf@gmail.com','password',1),
 ('vaishnavi@gmail.com','Vaishnavi','Ganjan','7894561230','vaishnavi@gmail.com','password',1),
 ('xyz@gmail.com','asd','asdfasd','1243341234','xyz@gmail.com','password',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
