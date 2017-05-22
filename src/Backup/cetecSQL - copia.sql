CREATE DATABASE  IF NOT EXISTS `cetec` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `cetec`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: cetec
-- ------------------------------------------------------
-- Server version	5.7.17-log

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
-- Table structure for table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alumno` (
  `No_Control` varchar(10) NOT NULL,
  `CURP` varchar(18) NOT NULL,
  `No_Tutor` varchar(10) NOT NULL,
  `Estado` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`No_Control`),
  KEY `CURP` (`CURP`),
  KEY `No_Tutor` (`No_Tutor`),
  CONSTRAINT `alumno_ibfk_1` FOREIGN KEY (`CURP`) REFERENCES `persona` (`CURP`),
  CONSTRAINT `alumno_ibfk_2` FOREIGN KEY (`No_Tutor`) REFERENCES `tutor` (`No_Tutor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno`
--

LOCK TABLES `alumno` WRITE;
/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `avance`
--

DROP TABLE IF EXISTS `avance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `avance` (
  `No_Avance` varchar(10) NOT NULL,
  `Dia_Avance` tinyint(2) unsigned zerofill NOT NULL,
  `Mes_Avance` tinyint(2) unsigned zerofill NOT NULL,
  `Año_Avance` smallint(4) unsigned zerofill NOT NULL,
  `Modulo_Avance` varchar(25) DEFAULT NULL,
  `No_profesor` varchar(10) NOT NULL,
  `No_Horario` varchar(10) NOT NULL,
  `Cantidad_Alumnos` tinyint(3) unsigned zerofill NOT NULL,
  PRIMARY KEY (`No_Avance`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `avance`
--

LOCK TABLES `avance` WRITE;
/*!40000 ALTER TABLE `avance` DISABLE KEYS */;
/*!40000 ALTER TABLE `avance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horario`
--

DROP TABLE IF EXISTS `horario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `horario` (
  `No_Horario` varchar(10) NOT NULL,
  `Hora_Entrada` varchar(5) NOT NULL,
  `Hora_Salida` varchar(5) NOT NULL,
  `No_Profesor` varchar(10) NOT NULL,
  `Numero_Alumnos` tinyint(3) unsigned zerofill NOT NULL,
  `Numero_Maximo_Alumno` tinyint(3) unsigned zerofill NOT NULL,
  PRIMARY KEY (`No_Horario`),
  KEY `No_Profesor` (`No_Profesor`),
  CONSTRAINT `horario_ibfk_1` FOREIGN KEY (`No_Profesor`) REFERENCES `profesor` (`No_Profesor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horario`
--

LOCK TABLES `horario` WRITE;
/*!40000 ALTER TABLE `horario` DISABLE KEYS */;
/*!40000 ALTER TABLE `horario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persona` (
  `CURP` varchar(18) NOT NULL,
  `Primer_Nom` varchar(30) NOT NULL,
  `Segun_Nom` varchar(30) DEFAULT NULL,
  `Apellido_P` varchar(50) NOT NULL,
  `Apellido_M` varchar(50) DEFAULT NULL,
  `Dia_Nac` tinyint(2) unsigned zerofill NOT NULL,
  `Mes_Nac` tinyint(2) unsigned zerofill NOT NULL,
  `Año_Nac` smallint(4) unsigned zerofill NOT NULL,
  PRIMARY KEY (`CURP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesor`
--

DROP TABLE IF EXISTS `profesor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profesor` (
  `No_Profesor` varchar(10) NOT NULL,
  `CURP` varchar(18) NOT NULL,
  `Grado_Estudios` varchar(25) NOT NULL,
  `Salario` smallint(5) unsigned zerofill NOT NULL,
  `Estado` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`No_Profesor`),
  KEY `CURP` (`CURP`),
  CONSTRAINT `profesor_ibfk_1` FOREIGN KEY (`CURP`) REFERENCES `persona` (`CURP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesor`
--

LOCK TABLES `profesor` WRITE;
/*!40000 ALTER TABLE `profesor` DISABLE KEYS */;
/*!40000 ALTER TABLE `profesor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reporte`
--

DROP TABLE IF EXISTS `reporte`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reporte` (
  `Numero_Reporte` varchar(10) NOT NULL,
  `Dia_Reporte` tinyint(2) unsigned zerofill NOT NULL,
  `Mes_Reporte` tinyint(2) unsigned zerofill NOT NULL,
  `Año_Reporte` smallint(4) unsigned zerofill NOT NULL,
  `No_Profesor` varchar(10) NOT NULL,
  `Actividad` varchar(25) NOT NULL,
  PRIMARY KEY (`Numero_Reporte`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reporte`
--

LOCK TABLES `reporte` WRITE;
/*!40000 ALTER TABLE `reporte` DISABLE KEYS */;
/*!40000 ALTER TABLE `reporte` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tutor`
--

DROP TABLE IF EXISTS `tutor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tutor` (
  `No_Tutor` varchar(10) NOT NULL,
  `CURP` varchar(18) NOT NULL,
  `Telefono` varchar(10) NOT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Parentesco` varchar(25) NOT NULL,
  `Ocupacion` varchar(25) NOT NULL,
  `Estado` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`No_Tutor`),
  KEY `CURP` (`CURP`),
  CONSTRAINT `tutor_ibfk_1` FOREIGN KEY (`CURP`) REFERENCES `persona` (`CURP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tutor`
--

LOCK TABLES `tutor` WRITE;
/*!40000 ALTER TABLE `tutor` DISABLE KEYS */;
/*!40000 ALTER TABLE `tutor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'cetec'
--

--
-- Dumping routines for database 'cetec'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-21 13:12:02
