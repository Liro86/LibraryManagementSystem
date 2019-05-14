-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Erstellungszeit: 14. Mai 2019 um 16:14
-- Server-Version: 5.7.24
-- PHP-Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `library`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `addbook`
--

DROP TABLE IF EXISTS `addbook`;
CREATE TABLE IF NOT EXISTS `addbook` (
  `bid` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `b_code` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `category` varchar(25) NOT NULL,
  `book_type` varchar(25) NOT NULL,
  `publisher` varchar(25) NOT NULL,
  `price` double NOT NULL,
  `mark` int(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `addbook`
--

INSERT INTO `addbook` (`bid`, `name`, `b_code`, `date`, `category`, `book_type`, `publisher`, `price`, `mark`) VALUES
('BI1001', 'fdsf', '222222', 'Aug 3, 2019', 'History', 'Borrow', 'sdfsdf', 12000, 0),
('BI1002', 'sssssssss', 'sssss', '08.02.2008', 'Technology', 'Borrow', 'ssssssssssss', 15000, 0),
('BI1003', 'dddddddd', 'dddddddddd', 'Sep 7, 2018', 'Language', 'Borrow', 'ddddddddd', 20000, 0);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `addmember`
--

DROP TABLE IF EXISTS `addmember`;
CREATE TABLE IF NOT EXISTS `addmember` (
  `mid` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `birthday` varchar(15) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `address` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` int(20) NOT NULL,
  `type` varchar(15) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `addmember`
--

INSERT INTO `addmember` (`mid`, `name`, `lastname`, `birthday`, `gender`, `address`, `email`, `phone`, `type`) VALUES
('MI1000', 'peter', 'tester', '05.02.1958', 'Male', 'teststrasse2', 'tester@gmeil.com', 9988, 'Standard'),
('MI1001', 'yyyy', 'xxxxx', '02.02.2019', 'Female', 'gg', 'ff@gg.ch', 998877, 'Student'),
('MI1002', 'dd', 'dd', '01.02.2019', 'Male', 'dd', 'dd', 44, 'Standard');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `booklend`
--

DROP TABLE IF EXISTS `booklend`;
CREATE TABLE IF NOT EXISTS `booklend` (
  `record_no` varchar(25) NOT NULL,
  `mid` varchar(25) NOT NULL,
  `bid` varchar(25) NOT NULL,
  `i_date` varchar(20) NOT NULL,
  `r_date` varchar(20) NOT NULL,
  `mark` int(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `booklend`
--

INSERT INTO `booklend` (`record_no`, `mid`, `bid`, `i_date`, `r_date`, `mark`) VALUES
('RN1000', 'mi1000', 'bi1001', '2018-09-06', '2018-09-16', 1),
('RN1001', 'MI1000', 'BI1001', '2018-09-06', '2018-09-16', 1),
('RN1002', 'mi1000', 'bi1002', '2018-09-08', '2018-09-18', 1),
('RN1003', 'mi1000', 'bi1003', '2018-09-08', '2018-09-01', 1),
('RN1004', 'mi1001', 'bi1002', '2018-09-09', '2018-09-19', 1),
('RN1005', 'mi1002', 'bi1003', '2018-09-12', '2018-09-22', 1),
('RN1006', 'mi1000', 'bi1002', '2018-09-12', '2018-09-22', 1),
('RN1007', 'me', 'ff', '2019-02-12', '2019-02-22', 1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `bookreturn`
--

DROP TABLE IF EXISTS `bookreturn`;
CREATE TABLE IF NOT EXISTS `bookreturn` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `bid` varchar(25) NOT NULL,
  `mid` varchar(20) NOT NULL,
  `late_days` varchar(10) NOT NULL,
  `fine` varchar(25) NOT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `bookreturn`
--

INSERT INTO `bookreturn` (`tid`, `bid`, `mid`, `late_days`, `fine`) VALUES
(1, 'bi1003', 'mi1000', '7', '70'),
(2, 'bi1003', 'mi1000', '7', '70'),
(3, 'bi1002', 'mi1000', '0', '0'),
(4, 'bi1003', 'mi1000', '11', '110'),
(5, 'bi1001', 'mi1000', '0', '0'),
(6, 'bi1002', 'mi1000', '0', '0'),
(7, '', '', '', ''),
(8, '', '', '', 'gg'),
(9, '', '', '', 'gg'),
(10, 'ff', 'me', '0', '0');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
