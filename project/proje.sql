-- phpMyAdmin SQL Dump
-- version 4.6.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 27, 2018 at 03:44 PM
-- Server version: 5.7.13-log
-- PHP Version: 5.6.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `proje`
--

-- --------------------------------------------------------

--
-- Table structure for table `haraket_tipleri`
--

CREATE TABLE `haraket_tipleri` (
  `tipno` int(11) NOT NULL,
  `tip` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `haraket_tipleri`
--

INSERT INTO `haraket_tipleri` (`tipno`, `tip`) VALUES
(1, 'Gidiş'),
(2, 'Dönüş');

-- --------------------------------------------------------

--
-- Table structure for table `havalimanlari`
--

CREATE TABLE `havalimanlari` (
  `hava_alani_id` int(11) NOT NULL,
  `hava_alani` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `havalimanlari`
--

INSERT INTO `havalimanlari` (`hava_alani_id`, `hava_alani`) VALUES
(1, 'Denizli,Türkiye-Çardak Havalimanı'),
(2, 'İstanbul,Türkiye-Atatürk Havalimanı'),
(3, 'Ankara,Türkiye-Esenboğa Havalimanı'),
(4, 'İzmir,Türkiye-Adnan Menderes Havalimanı'),
(5, 'Londra,İngiltere-Stansted'),
(6, 'ccc'),
(7, 'asa'),
(8, 'fdfdf');

-- --------------------------------------------------------

--
-- Table structure for table `koltuklar`
--

CREATE TABLE `koltuklar` (
  `koltuk_no` int(11) NOT NULL,
  `seferno` int(11) NOT NULL,
  `fiyat` varchar(100) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `koltuklar`
--

INSERT INTO `koltuklar` (`koltuk_no`, `seferno`, `fiyat`) VALUES
(1, 1, '80tl'),
(2, 2, '100tl'),
(3, 7, '100');

-- --------------------------------------------------------

--
-- Table structure for table `rezervasyonlar`
--

CREATE TABLE `rezervasyonlar` (
  `r_no` int(11) NOT NULL,
  `sefer_no` int(11) NOT NULL,
  `koltuk_no` int(11) NOT NULL,
  `nereden` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `nereye` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `tarih` varchar(250) COLLATE utf8_turkish_ci NOT NULL,
  `kacta` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `uye` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `rezervasyonlar`
--

INSERT INTO `rezervasyonlar` (`r_no`, `sefer_no`, `koltuk_no`, `nereden`, `nereye`, `tarih`, `kacta`, `uye`) VALUES
(1, 1, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'İstanbul,Türkiye-Atatürk Havalimanı', 'Mon May 21 00:00:00 EET 2018', '10.45', 'nugras'),
(2, 1, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'İstanbul,Türkiye-Atatürk Havalimanı', 'Mon May 21 00:00:00 EET 2018', '10.45', 'nugras'),
(3, 1, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'İstanbul,Türkiye-Atatürk Havalimanı', 'Sun May 20 00:00:00 EET 2018', '10.45', 'nugras'),
(4, 1, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'İstanbul,Türkiye-Atatürk Havalimanı', 'Sun May 20 00:00:00 EET 2018', '10.45', 'nugras'),
(5, 1, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'İstanbul,Türkiye-Atatürk Havalimanı', 'Sun May 20 00:00:00 EET 2018', '10.45', 'nugras'),
(6, 1, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'İstanbul,Türkiye-Atatürk Havalimanı', 'Thu May 24 00:00:00 EET 2018', '10.45', 'nugras'),
(7, 1, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'İstanbul,Türkiye-Atatürk Havalimanı', 'Thu May 24 00:00:00 EET 2018', '10.45', 'nugras'),
(8, 1, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'İstanbul,Türkiye-Atatürk Havalimanı', 'Thu May 24 00:00:00 EET 2018', '10.45', 'nugras'),
(9, 1, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'İstanbul,Türkiye-Atatürk Havalimanı', 'Sun May 20 00:00:00 EET 2018', '10.45', 'sugras'),
(10, 1, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'İstanbul,Türkiye-Atatürk Havalimanı', 'Sun May 20 00:00:00 EET 2018', '10.45', 'sugras'),
(11, 1, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'İstanbul,Türkiye-Atatürk Havalimanı', 'Sun May 20 00:00:00 EET 2018', '10.45', 'sugras'),
(12, 1, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'İstanbul,Türkiye-Atatürk Havalimanı', 'Sun May 20 00:00:00 EET 2018', '10.45', 'sugras'),
(13, 1, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'İstanbul,Türkiye-Atatürk Havalimanı', 'Sun May 20 00:00:00 EET 2018', '10.45', 'sugras'),
(14, 1, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'İstanbul,Türkiye-Atatürk Havalimanı', 'Sun May 20 00:00:00 EET 2018', '10.45', 'sugras'),
(15, 7, 3, 'Denizli,Türkiye-Çardak Havalimanı', 'İstanbul,Türkiye-Atatürk Havalimanı', 'Thu May 31 00:00:00 EET 2018', '11.30', 'sugras'),
(16, 1, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'İstanbul,Türkiye-Atatürk Havalimanı', 'Sun May 20 00:00:00 EET 2018', '10.45', 'sugras');

-- --------------------------------------------------------

--
-- Table structure for table `seferler`
--

CREATE TABLE `seferler` (
  `seferno` int(11) NOT NULL,
  `tipno` int(11) NOT NULL,
  `nereden` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `nereye` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `nezaman` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `kacta` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `seferler`
--

INSERT INTO `seferler` (`seferno`, `tipno`, `nereden`, `nereye`, `nezaman`, `kacta`) VALUES
(1, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'İstanbul,Türkiye-Atatürk Havalimanı', '2018-05-20', '10.45'),
(2, 2, 'İstanbul,Türkiye-Atatürk Havalimanı', 'Denizli,Türkiye-Çardak Havalimanı', '21.05.2018', '12.00'),
(3, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'Ankara,Türkiye-Esenboğa Havalimanı', 'Thu May 10 00:00:00 EET 2018', '12.00'),
(4, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'Ankara,Türkiye-Esenboğa Havalimanı', 'Thu May 10 00:00:00 EET 2018', '12.00'),
(5, 2, 'Denizli,Türkiye-Çardak Havalimanı', 'Londra,İngiltere-Stansted', 'Fri May 11 00:00:00 EET 2018', '11.00'),
(6, 2, 'Denizli,Türkiye-Çardak Havalimanı', 'Ankara,Türkiye-Esenboğa Havalimanı', 'Thu May 10 00:00:00 EET 2018', '11.00'),
(7, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'İstanbul,Türkiye-Atatürk Havalimanı', '2018-05-31', '11.30'),
(8, 2, 'Denizli,Türkiye-Çardak Havalimanı', 'Ankara,Türkiye-Esenboğa Havalimanı', '2018-05-30', '22.00'),
(9, 1, 'Denizli,Türkiye-Çardak Havalimanı', 'Ankara,Türkiye-Esenboğa Havalimanı', '2018-05-31', '22.00');

-- --------------------------------------------------------

--
-- Table structure for table `uyeler`
--

CREATE TABLE `uyeler` (
  `uye_id` int(11) NOT NULL,
  `uye_adi` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `uye_soyadi` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `dogum_tarihi` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `ev_adresi` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `is_adresi` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `mail` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `sifre` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `uyeler`
--

INSERT INTO `uyeler` (`uye_id`, `uye_adi`, `uye_soyadi`, `dogum_tarihi`, `ev_adresi`, `is_adresi`, `mail`, `sifre`) VALUES
(1, 'dfdf', '', '', '', '', '', ''),
(2, 'fdf', 'dfd', 'dfd', 'ddfd', 'dfdf', 'sugras', '123'),
(3, 'sdsd', '', '', '', '', '', ''),
(5, 'nurgul', 'ugras', 'dfdf', 'dfdf', 'dfd', 'dfd', 'dfdf');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `haraket_tipleri`
--
ALTER TABLE `haraket_tipleri`
  ADD PRIMARY KEY (`tipno`);

--
-- Indexes for table `havalimanlari`
--
ALTER TABLE `havalimanlari`
  ADD PRIMARY KEY (`hava_alani_id`);

--
-- Indexes for table `koltuklar`
--
ALTER TABLE `koltuklar`
  ADD PRIMARY KEY (`koltuk_no`);

--
-- Indexes for table `rezervasyonlar`
--
ALTER TABLE `rezervasyonlar`
  ADD PRIMARY KEY (`r_no`);

--
-- Indexes for table `seferler`
--
ALTER TABLE `seferler`
  ADD PRIMARY KEY (`seferno`);

--
-- Indexes for table `uyeler`
--
ALTER TABLE `uyeler`
  ADD PRIMARY KEY (`uye_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `haraket_tipleri`
--
ALTER TABLE `haraket_tipleri`
  MODIFY `tipno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `havalimanlari`
--
ALTER TABLE `havalimanlari`
  MODIFY `hava_alani_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `koltuklar`
--
ALTER TABLE `koltuklar`
  MODIFY `koltuk_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `rezervasyonlar`
--
ALTER TABLE `rezervasyonlar`
  MODIFY `r_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `seferler`
--
ALTER TABLE `seferler`
  MODIFY `seferno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `uyeler`
--
ALTER TABLE `uyeler`
  MODIFY `uye_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
