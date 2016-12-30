CREATE DATABASE  IF NOT EXISTS `universitymodel` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `universitymodel`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: universitymodel
-- ------------------------------------------------------
-- Server version	5.7.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `STUDENT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `STUDENT_FIRST_NAME` varchar(20) NOT NULL,
  `STUDENT_LAST_NAME` varchar(20) NOT NULL,
  `STUDENT_PHONE` varchar(20) NOT NULL,
  `STUDENT_ADDRESS` varchar(100) DEFAULT NULL,
  `STUDENT_CITY` varchar(20) DEFAULT NULL,
  `STUDENT_STATE` varchar(20) DEFAULT NULL,
  `STUDENT_POSTAL_CODE` varchar(25) NOT NULL,
  `STUDENT_COUNTRY` varchar(20) DEFAULT NULL,
  `STUDENT_DOB` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`STUDENT_ID`),
  KEY `StudentIndex` (`STUDENT_ID`),
  KEY `StudentIndexing` (`STUDENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'George','Green','(781) 765-5241','Culzi Way','Miznool','ME','53069','USA','05-07-1995'),(2,'Frederick','Ballard','(476) 535-8519','Eggew Park','Oradowa','IN','69611','FRANCE','07-11-1986'),(3,'Steve','Burke','(436) 972-3625','Bonow Path','Libgissu','MT','22736','CANADA','8/24/1997'),(4,'Cody','Ellis','(629) 584-4907','Buka Grove','Kondohwob','AK','99310','INDIA','12/25/1986'),(5,'Christopher','Fleming','(220) 777-3237','Cugtuk Street','Rehpemi','WI','87247','CHINA','2/18/1990'),(6,'Billy','Carson','(585) 589-6941','Dopuj Glen','Toutkos','FL','53872','INDIA','8/13/1955'),(7,'Sara','Clayton','(489) 842-5833','Tapiz Pass','Gatavar','WV','54617','CHINA','1/15/1970'),(8,'Lester','Ramsey','(425) 899-6694','Perif Turnpike','Wowufi','TX','77003','INDIA','10/22/1951'),(9,'Augusta','Schultz','(449) 207-1967','Pehcup Avenue','Vokguci','NJ','16891','CHINA','6/18/1974'),(10,'Claudia','Vega','(568) 202-5071','Aroco Circle','Fujedife','TX','59680','INDIA','5/23/1958'),(11,'Walter','Barker','(333) 788-1246','Uduna Ridge','Utagatudi','NE','14264','CHINA','1/27/1991'),(12,'Jose','Potter','(459) 681-9698','Mivo View','Tuhakitew','WY','45518','INDIA','6/30/1991'),(13,'Louis','Cohen','(874) 225-6196','Wocka Highway','Navujja','WV','55598','CHINA','4/21/1960'),(14,'David','McKenzie','(624) 507-9610','Usoruc Drive','Biujete','CA','77481','INDIA','12-01-1998'),(15,'Justin','Doyle','(734) 701-6348','Osica Key','Rislohi','SD','70110','CHINA','07-12-1954'),(16,'Adam','Schwartz','(856) 767-5060','Waplun Street','Basbizoc','MT','97950','INDIA','9/22/1965'),(17,'Francis','Hampton','(376) 979-9381','Igoga Glen','Uwugef','CA','10735','CHINA','01-12-1991'),(18,'Louise','Harper','(651) 220-8782','Jolkit Center','Cifcownu','AL','75983','INDIA','3/31/1975'),(19,'Phoebe','Hamilton','(333) 279-5396','Cemcaw Center','Iwolisot','PA','15224','CHINA','12/14/1969'),(20,'Blake','King','(807) 589-4214','Ribev Square','Uguvomba','MT','77667','INDIA','1/19/1967'),(21,'Betty','Fuller','(886) 592-6737','Waresi Place','Vatariv','MN','63211','CHINA','8/26/1968'),(22,'Stella','Hale','(620) 276-4548','Kuem Manor','Vevecnac','WA','79039','INDIA','12-06-1964'),(23,'Claudia','Carpenter','(945) 669-9152','Vuzpob Loop','Udetunape','NH','76570','CHINA','3/14/1984'),(24,'Fred','Woods','(844) 733-1437','Adzew Glen','Lihzamvi','SD','81432','INDIA','9/14/1984'),(25,'Victoria','Simmons','(828) 592-1863','Unneh Key','Bowkire','ID','20553','CHINA','03-11-1993'),(26,'Kyle','Chandler','(814) 468-8444','Jibwu Junction','Paldudo','WI','2859','INDIA','6/24/1962'),(27,'Harold','Rice','(810) 312-2438','Mupu Park','Gopbunec','NY','11382','CHINA','9/18/1992'),(28,'Viola','Hampton','(231) 885-6410','Kahgeh Place','Igelavjoj','AR','85109','INDIA','10-03-1960'),(29,'Marion','Cox','(276) 274-3379','Zapos Highway','Gesiwucu','LA','90490','CHINA','06-04-1955'),(30,'Lloyd','Roberts','(573) 556-8889','Sevuko Loop','Bitpijbef','NE','15970','INDIA','11-08-1988'),(31,'George','James','(328) 624-5180','Kulri Key','Ucoandu','VA','32762','CHINA','09-10-1991'),(32,'Michael','Poole','(337) 535-3900','Udeh Point','Dimaczij','KY','87177','INDIA','2/19/1982'),(33,'Craig','Soto','(520) 797-4612','Bezhaz Circle','Degune','MN','97752','CHINA','01-10-1994'),(34,'Don','Mills','(277) 859-4001','Zatore Center','Doguheb','NJ','94829','INDIA','5/30/1995'),(35,'Pauline','Gordon','(961) 295-5649','Ikoka Ridge','Ewziahe','UT','45265','CHINA','1/14/1989'),(36,'Katherine','Montgomery','(377) 315-3396','Wovi View','Nogukis','KS','23800','INDIA','09-04-1982'),(37,'Troy','Burns','(465) 958-8512','Viluz Terrace','Evedinor','NH','28187','CHINA','7/24/1983'),(38,'Jeanette','Young','(750) 560-6266','Folap View','Ribitale','MO','11429','INDIA','12/24/1965'),(39,'Harold','Willis','(605) 250-5463','Haguge Pike','Daduspa','NC','63257','CHINA','03-12-1985'),(40,'Genevieve','Salazar','(584) 857-2642','Aruji Pike','Refuvmu','TX','17634','INDIA','5/28/1967'),(41,'Ann','Walton','(874) 425-1681','Mibef Drive','Otopoza','NV','55045','CHINA','07-06-1961'),(42,'Leroy','Perez','(384) 458-7427','Vonec Square','Banulu','CT','15773','INDIA','10-09-1952'),(43,'Harriet','Coleman','(312) 424-4367','Uvge Drive','Hazebup','CO','38723','CHINA','6/26/1973'),(44,'Leonard','Hansen','(734) 614-1088','Meju Extension','Finlolte','NJ','23075','INDIA','08-09-1965'),(45,'Ernest','Goodwin','(389) 717-7693','Bokpe Place','Umouviab','RI','93811','CHINA','07-11-1981'),(46,'Garrett','Stephens','(553) 876-4532','Cuclu View','Lasewu','IN','12061','INDIA','1/24/1981'),(47,'Etta','Edwards','(382) 798-1300','Bogilo Place','Tovwapo','WA','62969','CHINA','02-01-1976'),(48,'Matilda','Silva','(823) 707-5366','Cibep Loop','Okefiwu','DE','50601','INDIA','07-02-1980'),(49,'Hilda','Munoz','(744) 937-8606','Hidewu Manor','Viktafi','UT','67395','CHINA','4/20/1979'),(50,'Helena','Simpson','(822) 633-3757','Kitip Mill','Tuepalo','MA','52483','INDIA','03-12-1992'),(51,'Mildred','Arnold','(447) 724-1410','Ijgu Junction','Ihsabvo','PA','42277','CHINA','4/23/1988'),(52,'Edna','Ryan','(904) 753-5527','Lezal Trail','Kasodahip','OH','45171','INDIA','04-02-1956'),(53,'Virgie','Fox','(680) 721-2425','Powsa Drive','Wuikewav','MN','27617','CHINA','6/29/1958'),(54,'Isaac','Riley','(812) 622-1188','Pufni Road','Etolepdak','MI','22114','INDIA','6/13/1956'),(55,'Stella','Colon','(432) 851-7320','Hodi Extension','Jocrenef','MI','72663','CHINA','02-09-1965'),(56,'Chase','Brock','(503) 954-8072','Cafil Square','Itazucat','HI','43419','INDIA','10-12-1975'),(57,'Delia','Reynolds','(489) 621-7214','Uzvi Place','Zejunu','KS','63906','CHINA','8/30/1954'),(58,'Don','Salazar','(680) 219-4654','Dihoti Road','Usiggu','HI','51267','USA','4/21/1977'),(59,'Mable','Colon','(682) 868-9107','Fiho Extension','Lumikaz','MT','76041','USA','11/19/1955'),(60,'Alta','Walton','(558) 917-6945','Fahu Square','Ridsoba','NV','98562','USA','11/16/1963'),(61,'Bertie','Hart','(748) 507-8358','Episor Highway','Titlasig','MN','43368','USA','6/25/1972'),(62,'Rose','Benson','(863) 411-7816','Rekro Square','Dejifaw','SC','14179','USA','08-08-1955'),(64,'Dollie','Miller','(582) 823-9401','Ategap Junction','Duzvuboj','ID','75701','USA','04-08-1957'),(65,'Harriet','Cohen','(558) 540-5622','Kakis Manor','Fujofun','CA','23249','USA','5/17/1957'),(66,'Juan','Padilla','(709) 298-6956','Mome Point','Vuzeze','IN','63759','USA','11-07-1986'),(67,'Bertha','Dawson','(741) 793-3863','Udozo River','Hacihovuj','CA','18221','USA','6/27/1987'),(68,'Frank','Rodgers','(552) 724-1598','Ahuew Parkway','Veuzofov','FL','54127','USA','3/25/1960'),(69,'Bernard','Allen','(339) 957-5313','Tuje Street','Bagolo','MS','98188','USA','9/18/1993'),(70,'Corey','Sanchez','(735) 419-3346','Zodaf Circle','Begadfo','IN','78342','USA','09-04-1951'),(71,'Marguerite','Howard','(243) 582-9073','Gaase Street','Cudgijor','MI','44697','USA','09-09-1986'),(72,'Viola','Gibbs','(301) 688-3785','Zipu Turnpike','Ezeadupu','TN','7930','USA','6/30/1951'),(73,'Madge','Cohen','(543) 414-4675','Ihkas River','Dafbevub','TN','52474','USA','06-09-1957'),(74,'Chester','Aguilar','(750) 927-6783','Tamu Boulevard','Bipunbos','NV','64763','USA','08-08-1971'),(75,'Mina','Barrett','(482) 579-7724','Bilat Pike','Taipaw','TX','78906','USA','4/26/1984'),(76,'Todd','Welch','(859) 224-1760','Cujew Parkway','Vumtocop','CA','81986','USA','10/13/1994'),(77,'Vernon','Mason','(868) 503-9339','Octe Key','Bojafbis','VT','28952','USA','02-05-1967'),(78,'Minnie','Lyons','(531) 616-1035','Wila Loop','Rizcinuw','IA','79384','USA','5/16/1954'),(79,'Rosetta','Fletcher','(841) 858-5620','Huboh Loop','Biuflal','MT','84466','USA','10-12-1963'),(80,'Cynthia','Abbott','(689) 489-7844','Rahci Street','Lichenawo','AR','63781','USA','09-08-1971'),(81,'Dylan','Harrington','(838) 516-5382','Orvi Loop','Pesirenok','IN','11371','USA','11/19/1992'),(82,'Irene','Vasquez','(874) 721-8858','Vuhe Ridge','Dijholju','WY','54188','USA','01-03-1953'),(83,'Hannah','Moore','(286) 782-7404','Rekpa Junction','Witkufku','MA','41698','USA','09-08-1981'),(84,'Cory','Gomez','(229) 683-1618','Nagmup Circle','Sabiduba','LA','89985','USA','05-12-1956'),(85,'Frances','Singleton','(466) 816-6802','Anje Plaza','Tigkukuz','AZ','1551','USA','3/18/1985'),(86,'Harry','Barber','(368) 333-7560','Leibi Ridge','Guoluzet','CA','21340','USA','11/21/1996'),(87,'Beatrice','Gross','(732) 248-1762','Kevo Loop','Tustako','MA','35001','INDIA','09-09-1966'),(88,'Derrick','Vasquez','(315) 458-8303','Nasjed Key','Ujucudu','AR','77377','INDIA','03-08-1983'),(89,'Dominic','Maldonado','(229) 704-1745','Rumos Manor','Uhkeem','SC','38812','INDIA','8/22/1961'),(90,'Bradley','Hart','(764) 310-3768','Cungol Way','Ozmesi','MS','76258','INDIA','04-12-1960'),(91,'Zachary','Thornton','(944) 427-4757','Ramme Parkway','Ijfeknug','VT','84139','INDIA','02-10-1993'),(92,'Rosalie','Franklin','(921) 804-6025','Buaw Circle','Jujobe','MN','49548','INDIA','10/30/1977'),(93,'Landon','Haynes','(833) 204-9429','Loeki River','Luzzefo','VT','11817','INDIA','01-11-1966'),(94,'Gertrude','McKinney','(220) 332-2265','Ofohor View','Ovhejap','NE','83544','INDIA','11-03-1973'),(95,'Randall','Sullivan','(985) 736-8042','Wipfaj View','Talevtuv','MN','72952','INDIA','10-08-1994'),(96,'Cora','Moody','(679) 650-1833','Diehi Heights','Rukufew','DC','16394','INDIA','01-10-1958'),(97,'Logan','West','(583) 610-1117','Bujuli Boulevard','Girelcim','NM','48817','INDIA','01-05-1968'),(98,'Claudia','Warren','(660) 724-9935','Apibah Path','Zuzsusga','MD','72007','INDIA','12/26/1969'),(99,'Landon','Patton','(331) 447-7536','Pure Square','Kesarjah','IL','82600','INDIA','01-07-1961'),(100,'Nora','Carlson','(685) 416-2392','Huboc Manor','Nuemlaz','KS','14964','INDIA','07-02-1968'),(101,'Fitz','Maruice','567893','22 Bolyston hill','Boston','MA','0211S','US','1993-05-25'),(102,'Shawn','Scott','(529) 253-6985','Ficzed Manor','Puapetu','NC','79432','USA','5/21/1984');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_student_backup
 
 after insert
 on 	
student
 for each row
 insert into student_backup(STUDENT_ID, STUDENT_FIRST_NAME, STUDENT_LAST_NAME, STUDENT_PHONE, STUDENT_ADDRESS,
 STUDENT_CITY,STUDENT_STATE, STUDENT_POSTAL_CODE, STUDENT_COUNTRY, STUDENT_DOB)
 values
 (new.STUDENT_ID, new.STUDENT_FIRST_NAME, new.STUDENT_LAST_NAME, new.STUDENT_PHONE, new.STUDENT_ADDRESS,
 new.STUDENT_CITY,new.STUDENT_STATE, new.STUDENT_POSTAL_CODE, new.STUDENT_COUNTRY, new.STUDENT_DOB) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger trigger_update_history
 
 after update 
on student
 for each row
 insert into student_backup(STUDENT_ID, STUDENT_FIRST_NAME, STUDENT_LAST_NAME, STUDENT_PHONE, STUDENT_ADDRESS,
 STUDENT_CITY,STUDENT_STATE, STUDENT_POSTAL_CODE, STUDENT_COUNTRY, STUDENT_DOB)
values
 (new.STUDENT_ID, new.STUDENT_FIRST_NAME, new.STUDENT_LAST_NAME, new.STUDENT_PHONE, new.STUDENT_ADDRESS,
 new.STUDENT_CITY,new.STUDENT_STATE, new.STUDENT_POSTAL_CODE, new.STUDENT_COUNTRY, new.STUDENT_DOB) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-12 23:35:49
