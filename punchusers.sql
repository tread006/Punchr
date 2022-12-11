-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 11, 2022 at 10:00 PM
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
-- Database: `punchusers`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `punchcode` varchar(6) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `birthdate` date DEFAULT NULL,
  `punchcount` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`punchcode`, `firstname`, `lastname`, `username`, `password`, `birthdate`, `punchcount`) VALUES
('GBIIKj', 'Zach', 'Attack', 'Zach', 'smoke', '1984-12-11', 16),
('uVlzx0', 'Marizza', 'Pizza', 'Marizza', 'pizza', '2022-12-07', 0),
('y4z0m7', 'r', 'r', 'r', 'r', '2022-12-02', 0);

-- --------------------------------------------------------

--
-- Table structure for table `rewards`
--

CREATE TABLE `rewards` (
  `punchcode` varchar(6) NOT NULL COMMENT 'foreign_key',
  `rewardcode` varchar(8) NOT NULL,
  `description` varchar(40) NOT NULL,
  `available` int(1) NOT NULL COMMENT 'bool',
  `show_code` int(1) NOT NULL COMMENT 'bool',
  `used` int(1) NOT NULL COMMENT 'bool',
  `punchesrequired` int(2) NOT NULL COMMENT 'count',
  `unlimited` int(1) NOT NULL COMMENT 'bool'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `rewards`
--

INSERT INTO `rewards` (`punchcode`, `rewardcode`, `description`, `available`, `show_code`, `used`, `punchesrequired`, `unlimited`) VALUES
('GBIIKj', 'a5gQupee', '$5 reward #1', 1, 1, 1, 10, 0),
('GBIIKj', 'aqWBaWEl', '$10 reward #2', 0, 0, 0, 30, 0),
('GBIIKj', 'ATPfjm4S', 'Welcome reward 25% off total bill', 1, 1, 1, 0, 0),
('GBIIKj', 'ETsRDwGi', '$5 reward #3', 0, 0, 0, 20, 0),
('GBIIKj', 'JxkeCuXv', 'Coffee - deduct (1) from total bill', 1, 1, 0, 5, 1),
('GBIIKj', 'KyjTmdjp', '$10 reward #1', 0, 0, 0, 25, 0),
('GBIIKj', 'M2CJhGGA', '(1) Free bumper sticker or magnet', 0, 0, 0, 35, 0),
('GBIIKj', 'uo3ZeJz2', 'Birthday reward 25% off total bill', 1, 1, 0, 0, 0),
('GBIIKj', 'UYVUFmA7', '(1) Free hat or shirt', 0, 0, 0, 40, 0),
('GBIIKj', 'vzvlSkvw', '$5 reward #2', 1, 1, 1, 15, 0),
('y4z0m7', '6o2cmu7r', 'Welcome reward 25% off total bill', 1, 1, 0, 0, 0),
('y4z0m7', 'cyqhcnvc', 'Coffee - deduct (1) from total bill', 0, 0, 0, 5, 1),
('y4z0m7', 'd8kdooam', '$5 reward #2', 0, 0, 0, 15, 0),
('y4z0m7', 'eevy1j1o', 'Birthday reward 25% off total bill', 0, 0, 0, 0, 0),
('y4z0m7', 'euic69df', '$10 reward #1', 0, 0, 0, 25, 0),
('y4z0m7', 'fzyy3p7h', '$10 reward #2', 0, 0, 0, 30, 0),
('y4z0m7', 'i7cjw6i6', '$5 reward #1', 0, 0, 0, 10, 0),
('y4z0m7', 'qabiadhe', '(1) Free hat or shirt', 0, 0, 0, 40, 0),
('y4z0m7', 'qk538mgv', '(1) Free bumper sticker or magnet', 0, 0, 0, 35, 0),
('y4z0m7', 'xxc0fbh0', '$5 reward #3', 0, 0, 0, 20, 0);

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `staffid` int(6) NOT NULL,
  `firstname` varchar(30) NOT NULL,
  `lastname` varchar(30) NOT NULL,
  `username` varchar(12) NOT NULL,
  `password` varchar(20) NOT NULL,
  `birthdate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`staffid`, `firstname`, `lastname`, `username`, `password`, `birthdate`) VALUES
(1, '?', '?', '?', '?', NULL),
(2, 'tes', 't', 't', 't', '2022-12-01'),
(3, 'Victoria', 'Sillars', 'vicksalami', 'salami', '2022-12-22');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`punchcode`),
  ADD UNIQUE KEY `punchcode` (`punchcode`);

--
-- Indexes for table `rewards`
--
ALTER TABLE `rewards`
  ADD PRIMARY KEY (`punchcode`,`rewardcode`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`staffid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `staffid` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `rewards`
--
ALTER TABLE `rewards`
  ADD CONSTRAINT `punchcode` FOREIGN KEY (`punchcode`) REFERENCES `accounts` (`punchcode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
