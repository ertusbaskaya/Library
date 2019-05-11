-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 05 May 2019, 22:58:27
-- Sunucu sürümü: 10.1.38-MariaDB
-- PHP Sürümü: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `library`
--

DELIMITER $$
--
-- Yordamlar
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcBookAdd` (IN `btype` VARCHAR(255), IN `bname` VARCHAR(255), IN `bcommentary` VARCHAR(255), IN `wname` VARCHAR(255), IN `bpublisher` VARCHAR(255), IN `blang` VARCHAR(255), IN `snumber` VARCHAR(255))  BEGIN
INSERT INTO books VALUES(NULL, btype, bname, bcommentary, wname, bpublisher, blang, snumber);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcBookDelete` (IN `id` VARCHAR(255))  BEGIN
delete from books where bid = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcBookEdit` (IN `id` VARCHAR(255), IN `type` VARCHAR(255), IN `name` VARCHAR(255), IN `commentary` VARCHAR(255), IN `bwname` VARCHAR(255), IN `publisher` VARCHAR(255), IN `lang` VARCHAR(255), IN `number` VARCHAR(255))  BEGIN
UPDATE books SET btype = type, bname = name, bcommentary = commentary, wname = bwname, bpublisher = publisher, blang = lang, snumber = number WHERE bid = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcBookGet` (IN `id` VARCHAR(255))  BEGIN
SELECT * FROM books, category WHERE bid = id and books.btype = category.cid;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcBookList` ()  BEGIN
SELECT * FROM books  as b , category as c WHERE b.btype = c.cid;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcBookSearch` (IN `id` VARCHAR(45))  BEGIN
select * from books where btype = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCategoryAdd` (IN `cname` VARCHAR(255), IN `csnumber` VARCHAR(255), IN `csadress` VARCHAR(255))  BEGIN
INSERT INTO category VALUES(NULL, cname, csnumber, csadress);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCategoryDelete` (IN `id` VARCHAR(255))  BEGIN
delete from category where cid = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCategoryEdit` (IN `id` VARCHAR(255), IN `name` VARCHAR(255), IN `snumber` VARCHAR(255), IN `sadress` VARCHAR(255))  BEGIN
UPDATE category SET cname = name, csnumber = snumber, csadress = sadress WHERE cid=id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCategoryGet` (IN `id` VARCHAR(255))  BEGIN
SELECT * FROM category WHERE cid = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCategoryList` ()  BEGIN
SELECT * FROM category;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcPasswordEdit` (IN `password` VARCHAR(10))  BEGIN

UPDATE usersign SET upassword=password WHERE uid=1;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcSign` ()  BEGIN

select * from usersign;

END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `books`
--

CREATE TABLE `books` (
  `bid` int(11) NOT NULL,
  `btype` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `bname` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `bcommentary` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `wname` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `bpublisher` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `blang` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `snumber` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `books`
--

INSERT INTO `books` (`bid`, `btype`, `bname`, `bcommentary`, `wname`, `bpublisher`, `blang`, `snumber`) VALUES
(1, '2', 'Suç ve Ceza', '', 'Dostoyevski', 'Can Yayınları', 'Türkçe', '1'),
(4, '1', 'Kızıl Nehirler', '', 'Jean-Cristophe Grange', 'Doğan Yayınları', 'Türkçe', '2'),
(5, '9', 'Araba Sevdası', '', 'Recaizade Mahmut Ekrem', 'Doğan Yayınları', 'Türkçe', '3'),
(6, '1', 'Dedemin Bakkalı', '', 'Meryem Taşçı', 'İş Bankası Yayınları', 'Türkçe', '4');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `category`
--

CREATE TABLE `category` (
  `cid` int(11) NOT NULL,
  `cname` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `csnumber` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `csadress` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `category`
--

INSERT INTO `category` (`cid`, `cname`, `csnumber`, `csadress`) VALUES
(1, 'Polisiye', '001', 'Birinci Koridor-A'),
(2, 'Dünya Klasikler', '002', 'Birinci Koridor-B'),
(6, 'Kişisel Gelişim', '003', 'Birinci Koridor-C'),
(7, 'Çocuk Kitapları', '004', 'Birinci Koridor-D'),
(8, 'Psikoloji', '005', 'Birinci Koridor-E'),
(9, 'Türk Klasikleri', '006', 'Birinci Koridor-F'),
(10, 'Hikaye', '007', 'İkinci Koridor-A');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `usersign`
--

CREATE TABLE `usersign` (
  `uid` int(11) NOT NULL,
  `uname` varchar(10) COLLATE utf8_turkish_ci NOT NULL,
  `upassword` varchar(10) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `usersign`
--

INSERT INTO `usersign` (`uid`, `uname`, `upassword`) VALUES
(1, 'admin', 'a');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`bid`);

--
-- Tablo için indeksler `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`cid`);

--
-- Tablo için indeksler `usersign`
--
ALTER TABLE `usersign`
  ADD PRIMARY KEY (`uid`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `books`
--
ALTER TABLE `books`
  MODIFY `bid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Tablo için AUTO_INCREMENT değeri `category`
--
ALTER TABLE `category`
  MODIFY `cid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Tablo için AUTO_INCREMENT değeri `usersign`
--
ALTER TABLE `usersign`
  MODIFY `uid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
