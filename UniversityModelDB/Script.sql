-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema universitymodel
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema universitymodel
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `universitymodel` DEFAULT CHARACTER SET latin1 ;
USE `universitymodel` ;

-- -----------------------------------------------------
-- Table `universitymodel`.`department`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universitymodel`.`department` (
  `DEPARTMENT_ID` INT(11) NOT NULL,
  `DEPARTMENT_NAME` VARCHAR(20) NOT NULL,
  `DEPARTMENT_HEAD` VARCHAR(20) NOT NULL,
  `DEPARTMENT_LOCATION` VARCHAR(20) NOT NULL,
  `DEPARTMENT_CONTACT` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`DEPARTMENT_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `universitymodel`.`course_details`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universitymodel`.`course_details` (
  `COURSE_ID` INT(11) NOT NULL AUTO_INCREMENT,
  `COURSE_NAME` VARCHAR(90) NULL DEFAULT NULL,
  `COURSE_DESCRIPTION` VARCHAR(90) NULL DEFAULT NULL,
  `DEPARTMENT_ID` INT(11) NOT NULL,
  PRIMARY KEY (`COURSE_ID`),
  INDEX `fk_depname` (`DEPARTMENT_ID` ASC),
  CONSTRAINT `fk_depname`
    FOREIGN KEY (`DEPARTMENT_ID`)
    REFERENCES `universitymodel`.`department` (`DEPARTMENT_ID`))
ENGINE = InnoDB
AUTO_INCREMENT = 16
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `universitymodel`.`department_details`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universitymodel`.`department_details` (
  `DEPARTMENT_ID` INT(11) NOT NULL,
  `DEPARTMENT_NAME` VARCHAR(20) NOT NULL,
  `DEPARTMENT_HEAD` VARCHAR(20) NOT NULL,
  `DEPARTMENT_LOCATION` VARCHAR(20) NOT NULL,
  `DEPARTMENT_CONTACT` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`DEPARTMENT_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `universitymodel`.`faculty`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universitymodel`.`faculty` (
  `FACULTY_ID` INT(11) NOT NULL AUTO_INCREMENT,
  `FACULTY_NAME` VARCHAR(20) NOT NULL,
  `FACULTY_GENDER` VARCHAR(20) NOT NULL,
  `FACULTY_SPECIALIZATION` VARCHAR(20) NOT NULL,
  `FACULTY_CONTACT` VARCHAR(20) NOT NULL,
  `DEPARTMENT_ID` INT(11) NOT NULL,
  `DEPARTMENT_NAME` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`FACULTY_ID`),
  INDEX `fk2_depname` (`DEPARTMENT_ID` ASC),
  INDEX `FacultyIndexing` (`FACULTY_ID` ASC),
  CONSTRAINT `fk2_depname`
    FOREIGN KEY (`DEPARTMENT_ID`)
    REFERENCES `universitymodel`.`department` (`DEPARTMENT_ID`))
ENGINE = InnoDB
AUTO_INCREMENT = 727
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `universitymodel`.`faculty_backup`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universitymodel`.`faculty_backup` (
  `FACULTY_ID` INT(11) NOT NULL,
  `FACULTY_NAME` VARCHAR(20) NOT NULL,
  `FACULTY_GENDER` VARCHAR(20) NOT NULL,
  `FACULTY_SPECIALIZATION` VARCHAR(20) NOT NULL,
  `FACULTY_CONTACT` VARCHAR(20) NOT NULL,
  `DEPARTMENT_ID` INT(11) NOT NULL,
  PRIMARY KEY (`FACULTY_ID`),
  INDEX `fk5_depname` (`DEPARTMENT_ID` ASC),
  CONSTRAINT `fk5_depname`
    FOREIGN KEY (`DEPARTMENT_ID`)
    REFERENCES `universitymodel`.`department` (`DEPARTMENT_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `universitymodel`.`student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universitymodel`.`student` (
  `STUDENT_ID` INT(11) NOT NULL AUTO_INCREMENT,
  `STUDENT_FIRST_NAME` VARCHAR(20) NOT NULL,
  `STUDENT_LAST_NAME` VARCHAR(20) NOT NULL,
  `STUDENT_PHONE` VARCHAR(20) NOT NULL,
  `STUDENT_ADDRESS` VARCHAR(100) NULL DEFAULT NULL,
  `STUDENT_CITY` VARCHAR(20) NULL DEFAULT NULL,
  `STUDENT_STATE` VARCHAR(20) NULL DEFAULT NULL,
  `STUDENT_POSTAL_CODE` VARCHAR(25) NOT NULL,
  `STUDENT_COUNTRY` VARCHAR(20) NULL DEFAULT NULL,
  `STUDENT_DOB` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`STUDENT_ID`),
  INDEX `StudentIndex` (`STUDENT_ID` ASC),
  INDEX `StudentIndexing` (`STUDENT_ID` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 102
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `universitymodel`.`student_accounts`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universitymodel`.`student_accounts` (
  `INVOICE_ID` INT(11) NOT NULL AUTO_INCREMENT,
  `STUDENT_ID` INT(11) NOT NULL,
  `COURSE_ID` INT(11) NOT NULL,
  `AMOUNT_PAID` VARCHAR(20) NOT NULL,
  `DATE_PAID` DATETIME NOT NULL,
  PRIMARY KEY (`INVOICE_ID`),
  INDEX `FOREIGN_KEY_STUDENT` (`STUDENT_ID` ASC),
  INDEX `FOREIGN_KEY_COURSE` (`COURSE_ID` ASC),
  CONSTRAINT `FOREIGN_KEY_COURSE`
    FOREIGN KEY (`COURSE_ID`)
    REFERENCES `universitymodel`.`course_details` (`COURSE_ID`),
  CONSTRAINT `FOREIGN_KEY_STUDENT`
    FOREIGN KEY (`STUDENT_ID`)
    REFERENCES `universitymodel`.`student` (`STUDENT_ID`))
ENGINE = InnoDB
AUTO_INCREMENT = 5020
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `universitymodel`.`student_backup`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universitymodel`.`student_backup` (
  `STUDENT_ID` INT(11) NOT NULL,
  `STUDENT_FIRST_NAME` VARCHAR(20) NOT NULL,
  `STUDENT_LAST_NAME` VARCHAR(20) NOT NULL,
  `STUDENT_PHONE` VARCHAR(20) NOT NULL,
  `STUDENT_ADDRESS` VARCHAR(100) NULL DEFAULT NULL,
  `STUDENT_CITY` VARCHAR(20) NULL DEFAULT NULL,
  `STUDENT_STATE` VARCHAR(20) NULL DEFAULT NULL,
  `STUDENT_POSTAL_CODE` VARCHAR(25) NOT NULL,
  `STUDENT_COUNTRY` VARCHAR(20) NULL DEFAULT NULL,
  `STUDENT_DOB` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`STUDENT_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

USE `universitymodel` ;

-- -----------------------------------------------------
-- Placeholder table for view `universitymodel`.`studentdetails`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universitymodel`.`studentdetails` (`STUDENT_ID` INT, `STUDENT_FIRST_NAME` INT, `STUDENT_DOB` INT);

-- -----------------------------------------------------
-- Placeholder table for view `universitymodel`.`studentdetails2`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universitymodel`.`studentdetails2` (`STUDENT_ID` INT, `STUDENT_FIRST_NAME` INT, `STUDENT_DOB` INT);

-- -----------------------------------------------------
-- Placeholder table for view `universitymodel`.`studentpayment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universitymodel`.`studentpayment` (`STUDENT_ID` INT, `STUDENT_FIRST_NAME` INT, `STUDENT_PHONE` INT, `STUDENT_ADDRESS` INT);

-- -----------------------------------------------------
-- procedure Amount
-- -----------------------------------------------------

DELIMITER $$
USE `universitymodel`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `Amount`(IN STUDENT_ID_2 int)
BEGIN

select STUDENT_ID, COURSE_ID,AMOUNT_PAID,DATE_PAID 
from
student_accounts where
STUDENT_ID in
 (SELECT STUDENT_ID from student_accounts where STUDENT_ID=STUDENT_ID_2);


END$$

DELIMITER ;

-- -----------------------------------------------------
-- procedure Location
-- -----------------------------------------------------

DELIMITER $$
USE `universitymodel`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `Location`(IN STUDENT_POSTAL_CODE2 varchar(100))
BEGIN

SELECT * FROM student where STUDENT_POSTAL_CODE = STUDENT_POSTAL_CODE2 ;

END$$

DELIMITER ;

-- -----------------------------------------------------
-- View `universitymodel`.`studentdetails`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `universitymodel`.`studentdetails`;
USE `universitymodel`;
CREATE  OR REPLACE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `universitymodel`.`studentdetails` AS select `universitymodel`.`student`.`STUDENT_ID` AS `STUDENT_ID`,`universitymodel`.`student`.`STUDENT_FIRST_NAME` AS `STUDENT_FIRST_NAME`,`universitymodel`.`student`.`STUDENT_DOB` AS `STUDENT_DOB` from `universitymodel`.`student` group by `universitymodel`.`student`.`STUDENT_ID`,`universitymodel`.`student`.`STUDENT_FIRST_NAME`,`universitymodel`.`student`.`STUDENT_DOB`;

-- -----------------------------------------------------
-- View `universitymodel`.`studentdetails2`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `universitymodel`.`studentdetails2`;
USE `universitymodel`;
CREATE  OR REPLACE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `universitymodel`.`studentdetails2` AS select `studentdetails`.`STUDENT_ID` AS `STUDENT_ID`,`studentdetails`.`STUDENT_FIRST_NAME` AS `STUDENT_FIRST_NAME`,`studentdetails`.`STUDENT_DOB` AS `STUDENT_DOB` from `universitymodel`.`studentdetails` where (`studentdetails`.`STUDENT_FIRST_NAME` like 'j%');

-- -----------------------------------------------------
-- View `universitymodel`.`studentpayment`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `universitymodel`.`studentpayment`;
USE `universitymodel`;
CREATE  OR REPLACE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `universitymodel`.`studentpayment` AS select `universitymodel`.`student`.`STUDENT_ID` AS `STUDENT_ID`,`universitymodel`.`student`.`STUDENT_FIRST_NAME` AS `STUDENT_FIRST_NAME`,`universitymodel`.`student`.`STUDENT_PHONE` AS `STUDENT_PHONE`,`universitymodel`.`student`.`STUDENT_ADDRESS` AS `STUDENT_ADDRESS` from `universitymodel`.`student` where `universitymodel`.`student`.`STUDENT_ID` in (select `universitymodel`.`student_accounts`.`STUDENT_ID` from `universitymodel`.`student_accounts` where (`universitymodel`.`student_accounts`.`AMOUNT_PAID` > 3500));
USE `universitymodel`;

DELIMITER $$
USE `universitymodel`$$
CREATE
DEFINER=`root`@`localhost`
TRIGGER `universitymodel`.`faculty_backup`
AFTER DELETE ON `universitymodel`.`faculty`
FOR EACH ROW
insert into faculty_backup
(FACULTY_ID,FACULTY_NAME,FACULTY_GENDER,FACULTY_SPECIALIZATION,FACULTY_CONTACT,DEPARTMENT_id) 
values
(old.FACULTY_ID,old.FACULTY_NAME,old.FACULTY_GENDER,old.FACULTY_SPECIALIZATION,old.FACULTY_CONTACT,old.DEPARTMENT_id)$$

USE `universitymodel`$$
CREATE
DEFINER=`root`@`localhost`
TRIGGER `universitymodel`.`trigger_student_backup`
AFTER INSERT ON `universitymodel`.`student`
FOR EACH ROW
insert into student_backup(STUDENT_ID, STUDENT_FIRST_NAME, STUDENT_LAST_NAME, STUDENT_PHONE, STUDENT_ADDRESS,
 STUDENT_CITY,STUDENT_STATE, STUDENT_POSTAL_CODE, STUDENT_COUNTRY, STUDENT_DOB)
 values
 (new.STUDENT_ID, new.STUDENT_FIRST_NAME, new.STUDENT_LAST_NAME, new.STUDENT_PHONE, new.STUDENT_ADDRESS,
 new.STUDENT_CITY,new.STUDENT_STATE, new.STUDENT_POSTAL_CODE, new.STUDENT_COUNTRY, new.STUDENT_DOB)$$

USE `universitymodel`$$
CREATE
DEFINER=`root`@`localhost`
TRIGGER `universitymodel`.`trigger_update_history`
AFTER UPDATE ON `universitymodel`.`student`
FOR EACH ROW
insert into student_backup(STUDENT_ID, STUDENT_FIRST_NAME, STUDENT_LAST_NAME, STUDENT_PHONE, STUDENT_ADDRESS,
 STUDENT_CITY,STUDENT_STATE, STUDENT_POSTAL_CODE, STUDENT_COUNTRY, STUDENT_DOB)
values
 (new.STUDENT_ID, new.STUDENT_FIRST_NAME, new.STUDENT_LAST_NAME, new.STUDENT_PHONE, new.STUDENT_ADDRESS,
 new.STUDENT_CITY,new.STUDENT_STATE, new.STUDENT_POSTAL_CODE, new.STUDENT_COUNTRY, new.STUDENT_DOB)$$


DELIMITER ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
