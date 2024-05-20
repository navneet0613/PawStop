-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2024 at 01:22 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pawstop`
--

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `ID` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `species` varchar(255) DEFAULT NULL,
  `breed` varchar(255) DEFAULT NULL,
  `dob` varchar(255) DEFAULT NULL,
  `purposeofvisit` varchar(255) DEFAULT NULL,
  `symptom` varchar(255) DEFAULT NULL,
  `dateofapp` varchar(255) DEFAULT NULL,
  `oname` varchar(255) DEFAULT NULL,
  `phoneno` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`ID`, `name`, `gender`, `species`, `breed`, `dob`, `purposeofvisit`, `symptom`, `dateofapp`, `oname`, `phoneno`, `email`, `address`) VALUES
(1, 'jj', 'fffff', 'tttttt', 'rrrrrrr', 'Fri Apr 19 00:00:00 IST 2024', 'ttttttt', 'tttttttttttttt', 'Thu Apr 04 23:10:49 IST 2024', 'tttttttt', 'tttttttt', 'tttttttttttt', 'ttttttt'),
(2, 'Name', 'Gender', 'Species', 'Breed', 'Wed Apr 24 23:30:19 IST 2024', 'Purpose of visit', 'Symptoms ', 'Tue Apr 09 23:30:21 IST 2024', 'eee', 'eeeeee', 'eeeeeeeeee', 'eeeee'),
(3, 'rfwfref', 'FE', 'gewrf', 'FGRGERGH', 'Thu Apr 11 07:33:47 IST 2024', 'THGERTH', 'THTSRGH', 'Wed Apr 10 07:33:50 IST 2024', 'gjndyhjy', 'thtrfhn', 'thjrt', 'htrth');

-- --------------------------------------------------------

--
-- Table structure for table `petdetails`
--

CREATE TABLE `petdetails` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `species` varchar(350) DEFAULT NULL,
  `breed` varchar(255) DEFAULT NULL,
  `dob` varchar(255) DEFAULT NULL,
  `premed` varchar(255) DEFAULT NULL,
  `symp` varchar(255) DEFAULT NULL,
  `oname` varchar(255) DEFAULT NULL,
  `phoneno` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `petdetails`
--

INSERT INTO `petdetails` (`id`, `name`, `gender`, `species`, `breed`, `dob`, `premed`, `symp`, `oname`, `phoneno`, `email`, `address`) VALUES
(1, 'Jane', 'Female', 'Dog ', 'Golden Retriever', 'Mon Apr 05 16:23:32 IST 2021', 'None', 'Rashes', 'Michael', '7847332756', 'michael@gmail.com', '34 A, New Town');

-- --------------------------------------------------------

--
-- Table structure for table `prescription`
--

CREATE TABLE `prescription` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `disease` varchar(255) DEFAULT NULL,
  `prescription` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `prescription`
--

INSERT INTO `prescription` (`id`, `name`, `disease`, `prescription`) VALUES
(1, 'jj', 'jTextField1', 'ff'),
(2, 'rgaerg', 'regr', 'rgaerbtr');

-- --------------------------------------------------------

--
-- Table structure for table `user_details`
--

CREATE TABLE `user_details` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `userid` varchar(255) DEFAULT NULL,
  `phoneno` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user_details`
--

INSERT INTO `user_details` (`id`, `name`, `userid`, `phoneno`, `password`, `role`) VALUES
(2, 'unknown', 'thanks', '987654321', '4321', 'User'),
(3, 'navv', 'abc', '587475294', '1123', 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appointment`
--
ALTER TABLE `appointment`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `petdetails`
--
ALTER TABLE `petdetails`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `prescription`
--
ALTER TABLE `prescription`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user_details`
--
ALTER TABLE `user_details`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `appointment`
--
ALTER TABLE `appointment`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `petdetails`
--
ALTER TABLE `petdetails`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `prescription`
--
ALTER TABLE `prescription`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `user_details`
--
ALTER TABLE `user_details`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
