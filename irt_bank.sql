-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 06, 2023 at 06:05 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `irt_bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `singupsimpleaccounts`
--

CREATE TABLE `singupsimpleaccounts` (
  `Account_Number` varchar(50) NOT NULL,
  `First_Name` varchar(50) NOT NULL,
  `Last_Name` varchar(50) NOT NULL,
  `Phone_Number` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Account_Type` varchar(50) NOT NULL,
  `Country` varchar(50) NOT NULL,
  `Cuty` varchar(50) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `CNIC` varchar(50) NOT NULL,
  `Occupation` varchar(50) NOT NULL,
  `D_O_B` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Recovery_Password` varchar(50) NOT NULL,
  `Amount` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `singupsimpleaccounts`
--

INSERT INTO `singupsimpleaccounts` (`Account_Number`, `First_Name`, `Last_Name`, `Phone_Number`, `Email`, `Account_Type`, `Country`, `Cuty`, `Address`, `CNIC`, `Occupation`, `D_O_B`, `Password`, `Recovery_Password`, `Amount`) VALUES
('0001', 'Abdul', 'Rafay', '03370353823', 'sp21bsse0004@maju.edu.pk', 'Salary', 'Pakistan', 'Karachi', 'R-2011/4 sector 16 A kbr bufferzone , karahi', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('12345', 'Abdul', 'Rafuu', '03345625', 'rafay@998', 'Simple', 'Pak', 'Karachi', 'raffatsts', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('12345', 'TALHA', 'NISAR', '30212121', 'HHUGUGU', 'SIMPLE', 'PAK', 'KARACHI', 'AERSDGDFHFHHJHKHK', '', '', '', '', '', ''),
('032145', 'null', 'faata', 'number', 'email', 'actype', 'cntryu', 'cc', 'adesss', '', '', '', '', '', ''),
('032145', 'eeee', 'faata', 'number', 'email', 'actype', 'cntryu', 'cc', 'adesss', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', '', '', 'YmhqrszDnpmPuDf0', ''),
('', '', '', '', '', '', '', '', '', '', '', '', '', 'i2H64raNBBtU1VzI', ''),
('', '', '', '', '', '', '', '', '', '', '', '', '', '7dYcooddNPdPYpaG', ''),
('', '', '', '', '', '', '', '', '', '', '', '', '', 'XhuSPfkUoQhRBS8L', ''),
('', '', '', '', '', '', '', '', '', '', '', '', '', 'KKO3MrCAVK35rw6g', ''),
('', '', '', '', '', '', '', '', '', '', '', '', '', 'w35Ndi731kMFdr4M', ''),
('1234', 'aaa', 'aa', '12456', 'fdfdfd', 'hhhghg', 'hhhggh', 'hghgh', 'ygygy', 'uuyuyuy', 'iioioi', 'popopo', 'popopo', 'oioioi', '250000'),
('', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('123456', 'Rafay', 'Sheikh', '036458', 'sass', 's_acoount', 'aaa', 'aaa', 'aaaa', '4545445', 's', 'null', 'rafay', 'shjdhjdhhd', '2500'),
('123456', 'abc', 'xyz', '12345', 'iauiau@', 'sav_acooun', 'counr', 'aaaa', 'hhshss', '77373', 's', 'null', 'rafay', 'HuuS2vK8063c0VqJ', '2500'),
('2222', 'aa', 'aa', '222', 'sss', 'sav_acoount', 'dddd', 'ddddd', 'sss', '222', 's', 'null', 'saaa', 'QJDaOAeSu0W5z21o', '33232'),
('222', 'aa', 'aa', '333', '333', 'b_acoount', 'sss', 'sss', 'aaa', '333', 'b', 'null', 'aaa', 'bhEyqOhsYe9XDSiC', '3333');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
