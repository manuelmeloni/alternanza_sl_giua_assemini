-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 12, 2018 at 12:25 PM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 5.6.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aziendaospedaliera`
--

-- --------------------------------------------------------

--
-- Table structure for table `dipendenti`
--

CREATE TABLE `dipendenti` (
  `ID_DIPENDENTE` int(11) NOT NULL,
  `DATA_NASCITA` date NOT NULL,
  `NOME` varchar(32) NOT NULL,
  `COGNOME` varchar(32) NOT NULL,
  `CODICE_FISCALE` varchar(16) NOT NULL,
  `MAIL` varchar(64) NOT NULL,
  `DATA_ASSUNZIONE` date NOT NULL,
  `DATA_LICENZIAMENTO` date DEFAULT NULL,
  `CATEGORIA` int(11) NOT NULL,
  `USERNAME` varchar(16) NOT NULL,
  `PASSWORD` varchar(16) NOT NULL,
  `reparti_ID_REPARTO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dipendenti`
--

INSERT INTO `dipendenti` (`ID_DIPENDENTE`, `DATA_NASCITA`, `NOME`, `COGNOME`, `CODICE_FISCALE`, `MAIL`, `DATA_ASSUNZIONE`, `DATA_LICENZIAMENTO`, `CATEGORIA`, `USERNAME`, `PASSWORD`, `reparti_ID_REPARTO`) VALUES
(1, '1975-03-28', 'Antonio', 'Rossi', 'RSSNTN75C28B354S', 'rossi.antonio@gmail.com', '2000-06-16', NULL, 0, 'admin.rossi', '1234', 1),
(2, '1984-03-28', 'Mario', 'Conti', 'CNTMRA85T03B354S', 'conti.mario@gmail.com', '2005-06-16', NULL, 1, 'mario.conto', '1234', 1),
(3, '1982-03-28', 'Carlo', 'Conti', 'CNTMRA85T03B354S', 'conti.carlo@gmail.com', '2005-06-16', NULL, 2, 'carlo.conti', '1234', 2),
(7, '1984-03-28', 'Lovico', 'Cristian', 'CNTMRA85T03B354T', 'lovico.cristian@gmail.com', '2006-06-16', NULL, 2, 'lovico.cristian', '1234', 2);

-- --------------------------------------------------------

--
-- Table structure for table `dipendenti_has_specializzazioni`
--

CREATE TABLE `dipendenti_has_specializzazioni` (
  `dipendenti_ID_DIPENDENTE` int(11) NOT NULL,
  `specializzazioni_ID_SPECIALIZZAZIONE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `news`
--

CREATE TABLE `news` (
  `id` int(11) NOT NULL,
  `titolo` varchar(100) NOT NULL,
  `sottotitolo` varchar(200) DEFAULT NULL,
  `testo` varchar(1000) NOT NULL,
  `abilitato` tinyint(4) NOT NULL DEFAULT '1',
  `tipo` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `news`
--

INSERT INTO `news` (`id`, `titolo`, `sottotitolo`, `testo`, `abilitato`, `tipo`) VALUES
(1, 'prova1', 'sottprova1', 'ciaociaociaociaociaociaociao', 1, 'p'),
(2, 'prova2', 'sottprova2', 'ciaociaociaociaociaociaociao', 1, 's');

-- --------------------------------------------------------

--
-- Table structure for table `prelievi`
--

CREATE TABLE `prelievi` (
  `ID_PRELIEVO` int(11) NOT NULL,
  `DATA_ORA_PRELIEVO` datetime NOT NULL,
  `DATA_ORA_FINE` datetime DEFAULT NULL,
  `CODICE_VISITA` varchar(45) DEFAULT NULL,
  `utenti_ID-UTENTE` int(11) NOT NULL,
  `referto` varchar(200) DEFAULT NULL,
  `dipendenti_ID_DIPENDENTE` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `reparti`
--

CREATE TABLE `reparti` (
  `ID_REPARTO` int(11) NOT NULL,
  `NOME` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reparti`
--

INSERT INTO `reparti` (`ID_REPARTO`, `NOME`) VALUES
(1, 'amministrazione'),
(2, 'prontoSoccorso');

-- --------------------------------------------------------

--
-- Table structure for table `ricoveri`
--

CREATE TABLE `ricoveri` (
  `ID_RICOVERO` int(11) NOT NULL,
  `DIAGNOSI` text NOT NULL,
  `TERAPIA` text,
  `DATA_ORA_RICOVERO` datetime NOT NULL,
  `DATA_ORA_DIMISSIONE` datetime DEFAULT NULL,
  `utenti_ID_UTENTE` int(11) NOT NULL,
  `CODICE_COLORE` int(11) DEFAULT NULL,
  `dipendenti_ID_DIPENDENTE` int(11) DEFAULT NULL,
  `CODICE_RICOVERO` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ricoveri`
--

INSERT INTO `ricoveri` (`ID_RICOVERO`, `DIAGNOSI`, `TERAPIA`, `DATA_ORA_RICOVERO`, `DATA_ORA_DIMISSIONE`, `utenti_ID_UTENTE`, `CODICE_COLORE`, `dipendenti_ID_DIPENDENTE`, `CODICE_RICOVERO`) VALUES
(1, 'Sei stato diagnosticato', 'Guarda il corso sulla sicurezza', '2018-04-12 07:00:00', NULL, 1, 1, 2, '00'),
(3, 'Sei stato diagnosticato', 'Guarda il corso sulla sicurezza', '2018-04-12 07:00:00', NULL, 3, 0, 2, '01'),
(4, 'Sei stato diagnosticato', 'Guarda il corso sulla sicurezza', '2018-04-12 07:00:00', NULL, 4, 2, 2, '02'),
(5, 'Sei stato diagnosticato', 'Guarda il corso sulla sicurezza', '2018-04-12 07:00:00', NULL, 5, 3, 2, '03');

-- --------------------------------------------------------

--
-- Table structure for table `specializzazioni`
--

CREATE TABLE `specializzazioni` (
  `ID_SPECIALIZZAZIONE` int(11) NOT NULL,
  `NOME` varchar(32) NOT NULL,
  `DATA_CONSEGUIMENTO` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `utenti`
--

CREATE TABLE `utenti` (
  `ID-UTENTE` int(11) NOT NULL,
  `DATA_NASCITA` date NOT NULL,
  `NOME` varchar(32) NOT NULL,
  `COGNOME` varchar(32) NOT NULL,
  `CODICE_FISCALE` varchar(16) NOT NULL,
  `reparti_ID_REPARTO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `utenti`
--

INSERT INTO `utenti` (`ID-UTENTE`, `DATA_NASCITA`, `NOME`, `COGNOME`, `CODICE_FISCALE`, `reparti_ID_REPARTO`) VALUES
(1, '2000-04-10', 'Antonio', 'Siddi', '1234567891234567', 1),
(3, '2000-04-10', 'Carlo', 'Siddi', '1234567891234568', 1),
(4, '2000-04-10', 'Carlo', 'Siddi', '1234567891234569', 1),
(5, '2000-04-10', 'Carlo', 'Siddi', '1234567891234561', 1),
(6, '2000-04-10', 'Carlo', 'Siddi', '1234567891234562', 1),
(8, '2000-04-10', 'Alessandro', 'Rovazzi', '1234567891234563', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dipendenti`
--
ALTER TABLE `dipendenti`
  ADD PRIMARY KEY (`ID_DIPENDENTE`,`reparti_ID_REPARTO`),
  ADD UNIQUE KEY `USERNAME` (`USERNAME`),
  ADD KEY `fk_dipendenti_reparti1_idx` (`reparti_ID_REPARTO`);

--
-- Indexes for table `dipendenti_has_specializzazioni`
--
ALTER TABLE `dipendenti_has_specializzazioni`
  ADD PRIMARY KEY (`dipendenti_ID_DIPENDENTE`,`specializzazioni_ID_SPECIALIZZAZIONE`),
  ADD KEY `fk_dipendenti_has_specializzazioni_specializzazioni1_idx` (`specializzazioni_ID_SPECIALIZZAZIONE`),
  ADD KEY `fk_dipendenti_has_specializzazioni_dipendenti1_idx` (`dipendenti_ID_DIPENDENTE`);

--
-- Indexes for table `news`
--
ALTER TABLE `news`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `prelievi`
--
ALTER TABLE `prelievi`
  ADD PRIMARY KEY (`ID_PRELIEVO`,`utenti_ID-UTENTE`),
  ADD UNIQUE KEY `CODICE_VISITA_UNIQUE` (`CODICE_VISITA`),
  ADD KEY `fk_prelievi_utenti1_idx` (`utenti_ID-UTENTE`),
  ADD KEY `fk_prelievi_dipendenti1_idx` (`dipendenti_ID_DIPENDENTE`);

--
-- Indexes for table `reparti`
--
ALTER TABLE `reparti`
  ADD PRIMARY KEY (`ID_REPARTO`);

--
-- Indexes for table `ricoveri`
--
ALTER TABLE `ricoveri`
  ADD PRIMARY KEY (`ID_RICOVERO`,`utenti_ID_UTENTE`),
  ADD UNIQUE KEY `CODICE_RICOVERO_UNIQUE` (`CODICE_RICOVERO`),
  ADD KEY `fk_ricoveri_utenti1_idx` (`utenti_ID_UTENTE`),
  ADD KEY `fk_ricoveri_dipendenti1_idx` (`dipendenti_ID_DIPENDENTE`);

--
-- Indexes for table `specializzazioni`
--
ALTER TABLE `specializzazioni`
  ADD PRIMARY KEY (`ID_SPECIALIZZAZIONE`);

--
-- Indexes for table `utenti`
--
ALTER TABLE `utenti`
  ADD PRIMARY KEY (`ID-UTENTE`),
  ADD UNIQUE KEY `CODICE_FISCALE_UNIQUE` (`CODICE_FISCALE`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dipendenti`
--
ALTER TABLE `dipendenti`
  MODIFY `ID_DIPENDENTE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `prelievi`
--
ALTER TABLE `prelievi`
  MODIFY `ID_PRELIEVO` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `reparti`
--
ALTER TABLE `reparti`
  MODIFY `ID_REPARTO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `ricoveri`
--
ALTER TABLE `ricoveri`
  MODIFY `ID_RICOVERO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `specializzazioni`
--
ALTER TABLE `specializzazioni`
  MODIFY `ID_SPECIALIZZAZIONE` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `utenti`
--
ALTER TABLE `utenti`
  MODIFY `ID-UTENTE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `dipendenti`
--
ALTER TABLE `dipendenti`
  ADD CONSTRAINT `fk_dipendenti_reparti1` FOREIGN KEY (`reparti_ID_REPARTO`) REFERENCES `reparti` (`ID_REPARTO`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `dipendenti_has_specializzazioni`
--
ALTER TABLE `dipendenti_has_specializzazioni`
  ADD CONSTRAINT `fk_dipendenti_has_specializzazioni_dipendenti1` FOREIGN KEY (`dipendenti_ID_DIPENDENTE`) REFERENCES `dipendenti` (`ID_DIPENDENTE`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_dipendenti_has_specializzazioni_specializzazioni1` FOREIGN KEY (`specializzazioni_ID_SPECIALIZZAZIONE`) REFERENCES `specializzazioni` (`ID_SPECIALIZZAZIONE`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `prelievi`
--
ALTER TABLE `prelievi`
  ADD CONSTRAINT `fk_prelievi_dipendenti1` FOREIGN KEY (`dipendenti_ID_DIPENDENTE`) REFERENCES `dipendenti` (`ID_DIPENDENTE`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_prelievi_utenti1` FOREIGN KEY (`utenti_ID-UTENTE`) REFERENCES `utenti` (`ID-UTENTE`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `ricoveri`
--
ALTER TABLE `ricoveri`
  ADD CONSTRAINT `fk_ricoveri_dipendenti1` FOREIGN KEY (`dipendenti_ID_DIPENDENTE`) REFERENCES `dipendenti` (`ID_DIPENDENTE`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_ricoveri_utenti1` FOREIGN KEY (`utenti_ID_UTENTE`) REFERENCES `utenti` (`ID-UTENTE`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
