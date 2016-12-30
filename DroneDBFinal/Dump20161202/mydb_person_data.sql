-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
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
-- Table structure for table `person_data`
--

DROP TABLE IF EXISTS `person_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `person_data` (
  `Person_ID` int(35) NOT NULL AUTO_INCREMENT,
  `Name` varchar(35) DEFAULT NULL,
  `Username` varchar(45) DEFAULT NULL,
  `Password` varchar(250) DEFAULT NULL,
  `Email_Id` varchar(45) DEFAULT NULL,
  `SSN` int(45) DEFAULT NULL,
  `Photo_ID` int(45) NOT NULL AUTO_INCREMENT,
  `Role` varchar(45) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  PRIMARY KEY (`Person_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person_data`
--

LOCK TABLES `person_data` WRITE;
/*!40000 ALTER TABLE `person_data` DISABLE KEYS */;
INSERT INTO `person_data` VALUES (1,'Etta Romero','buz@heji.net','E20$c#Nz','buz@heji.net',3456780,1,'admin',22),(2,'Manuel Schmidt','orvijhul@fabe.com','6&)$2bO$','orvijhul@fabe.com',3456781,2,'patient',34),(3,'Lucas Sanchez','ejo@su.edu','5(1*l9p0','ejo@su.edu',3456782,3,'patient',33),(4,'Cora Robinson','palos@fokho.net','[OqLeniJ','palos@fokho.net',3456783,4,'patient',45),(5,'Roy Buchanan','renbuva@bamup.edu','M8loYgFW','renbuva@bamup.edu',3456784,5,'patient',34),(6,'Sylvia Stokes','ne@anudeke.gov','941hjg3#','ne@anudeke.gov',3456785,6,'patient',32),(7,'Francis Patrick','akewamzo@moplewos.com','Rl#vvVUP','akewamzo@moplewos.com',3456786,7,'patient',56),(8,'Donald Lopez','wowec@afomarol.net','J2V(YOAR','wowec@afomarol.net',3456787,8,'patient',54),(9,'Bill Reese','rifzu@re.net','NEnwN9MS','rifzu@re.net',3456788,9,'patient',61),(10,'Aaron Baldwin','emunevul@goemo.org','VdOeUUjO','emunevul@goemo.org',3456789,10,'patient',54),(11,'Victor Stokes','ca@gusnialo.gov','pDrv&f1b','ca@gusnialo.gov',3456790,11,'patient',55),(12,'Adeline Knight','ci@ebokokef.gov','YD&v879a','ci@ebokokef.gov',3456791,12,'patient',22),(13,'Elnora Pearson','no@abuhipti.net','(1uC(i&F','no@abuhipti.net',3456792,13,'patient',35),(14,'Bradley McLaughlin','sadac@gudawbew.com','q*!IHbVV','sadac@gudawbew.com',3456793,14,'patient',67),(15,'Belle Alexander','safeti@abe.net','3h&oYMR6','safeti@abe.net',3456794,15,'patient',56),(16,'Sam','sam@arpanet.net','sam@92','sam@arpanet.net',3456795,16,'patient',25),(17,'rick','rick@arpanet.net','rick@92','rick@arpanet.net',3456796,17,'patient',26),(18,'Donald ','donald@arpanet.net','donald@92','donald@arpanet.net',3456797,18,'patient',27),(19,'John','john@arpanet.net','john@92','john@arpanet.net',3456798,19,'patient',28),(20,'Kerry','kerry@arpanet.net','kerry@92','kerry@arpanet.net',3456799,20,'patient',34),(21,'Marco','marco@arpanet.net','marco@92','marco@arpanet.net',3456800,21,'patient',65),(22,'Bobby','bobby@arpanet.net','bobby@92','bobby@arpanet.net',3456801,22,'patient',76),(23,'Paul','paul@arpanet.net','paul@92','paul@arpanet.net',3456802,23,'patient',45),(24,'Arnold','arnold@arpanet.net','arnold@92','arnold@arpanet.net',3456803,24,'patient',23),(25,'Ted','ted@arpanet.net','ted@92','ted@arpanet.net',3456804,25,'patient',45),(26,'Lindsey','lindsey@arpanet.net','lindsey@92','lindsey@arpanet.net',3456805,26,'patient',56),(27,'Shally','shally@arpanet.net','shally@92','shally@arpanet.net',3456806,27,'patient',67),(28,'sarthak','sarthak@arpanet.net','sarthak@92','sarthak@arpanet.net',3456807,28,'patient',34),(29,'rajat','rajat@arpanet.net','rajat@92','rajat@arpanet.net',3456808,29,'patient',52),(30,'arun','arun@arpanet.net','arun@92','arun@arpanet.net',3456809,30,'patient',38),(31,'peters','peters@arpanet.net','peters@92','peters@arpanet.net',3456810,31,'patient',67);
/*!40000 ALTER TABLE `person_data` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-02 19:45:41
