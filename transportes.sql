-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-10-2024 a las 06:08:27
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `transportes`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrator`
--

CREATE TABLE `administrator` (
  `idAdministrator` int(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `administrator`
--

INSERT INTO `administrator` (`idAdministrator`, `email`, `password`) VALUES
(1, 'marcoarias765@gmail.com', '123456789'),
(2, 'antonio@gmail.com', '123456789'),
(3, 'ejemplo123@gmail.com', '123456'),
(4, '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `driver`
--

CREATE TABLE `driver` (
  `idDriver` int(11) NOT NULL,
  `nameDriver` varchar(100) DEFAULT NULL,
  `licenseName` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `driver`
--

INSERT INTO `driver` (`idDriver`, `nameDriver`, `licenseName`) VALUES
(1, 'Juan Pérez', 'ABC12345'),
(2, 'María López', 'DEF67890'),
(3, 'Carlos Martínez', 'GHI54321'),
(4, 'Ana García', 'JKL98765'),
(5, 'Luis Fernández', 'MNO11223');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `failurereport`
--

CREATE TABLE `failurereport` (
  `idFailureReport` int(11) NOT NULL,
  `idDriver` int(11) DEFAULT NULL,
  `descriptionReport` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `failurereport`
--

INSERT INTO `failurereport` (`idFailureReport`, `idDriver`, `descriptionReport`) VALUES
(1, 1, 'Problema con la presión de los neumáticos.'),
(2, 2, 'Desgaste irregular de los neumáticos delanteros.'),
(3, 3, 'El motor no arranca. Problema mecánico identificado.'),
(4, 4, 'Ruido metálico en el motor. Requiere revisión mecánica.'),
(5, 5, 'Fallo en el sistema de luces. Mantenimiento eléctrico necesario.'),
(6, 1, 'El alternador no carga la batería. Problema eléctrico.'),
(7, 2, 'Soldadura defectuosa en el chasis. Necesita reparación.'),
(8, 3, 'Grieta en la estructura de la carrocería. Requiere soldadura.'),
(9, 4, 'El sistema de lavado no funciona correctamente.'),
(10, 5, 'Restos de suciedad en el interior del vehículo después del lavado.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `job`
--

CREATE TABLE `job` (
  `idJob` int(11) NOT NULL,
  `idMaintenance` int(11) NOT NULL,
  `idMechanic` int(11) NOT NULL,
  `idSparePart` int(11) NOT NULL,
  `startMaintenance` date NOT NULL,
  `endMaintenance` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `job`
--

INSERT INTO `job` (`idJob`, `idMaintenance`, `idMechanic`, `idSparePart`, `startMaintenance`, `endMaintenance`) VALUES
(1, 1, 3, 1, '2024-10-01', '2024-10-02'),
(2, 2, 2, 3, '2024-10-03', '2024-10-04');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `logistics`
--

CREATE TABLE `logistics` (
  `idLogistics` int(11) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `logistics`
--

INSERT INTO `logistics` (`idLogistics`, `email`, `password`) VALUES
(1, 'logistica123@gmail.com', '123456'),
(2, 'logi@gmail.com', '123'),
(3, 'logistica2@gmail.com', '123456');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `maintenance`
--

CREATE TABLE `maintenance` (
  `idMaintenance` int(11) NOT NULL,
  `idVehicle` int(11) DEFAULT NULL,
  `idAdministrator` int(11) DEFAULT NULL,
  `idTypeMaintenance` int(11) DEFAULT NULL,
  `idFailureReport` int(11) DEFAULT NULL,
  `dateMaintenance` date DEFAULT NULL,
  `descriptions` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `maintenance`
--

INSERT INTO `maintenance` (`idMaintenance`, `idVehicle`, `idAdministrator`, `idTypeMaintenance`, `idFailureReport`, `dateMaintenance`, `descriptions`) VALUES
(1, 1, 1, 1, 1, '2024-06-20', 'Revisión y reemplazo de neumáticos, ajuste de presión y alineación.'),
(2, 2, 1, 2, 2, '2024-06-21', 'Inspección y reparación de componentes del motor y sistemas mecánicos.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mechanic`
--

CREATE TABLE `mechanic` (
  `idMechanic` int(11) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mechanic`
--

INSERT INTO `mechanic` (`idMechanic`, `email`, `password`) VALUES
(1, 'mecanico1@gmail.com', '123456'),
(2, 'mecanico2@gmail.com', '123456'),
(3, 'mecanico3@gmail.com', '123456');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sparepart`
--

CREATE TABLE `sparepart` (
  `idSparePart` int(11) NOT NULL,
  `idLogistics` int(11) DEFAULT NULL,
  `arrivalDate` date DEFAULT NULL,
  `sparePart` varchar(100) DEFAULT NULL,
  `quantity` int(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `sparepart`
--

INSERT INTO `sparepart` (`idSparePart`, `idLogistics`, `arrivalDate`, `sparePart`, `quantity`) VALUES
(1, 1, '2024-10-01', 'Alternator', 5),
(2, 2, '2024-10-02', 'Brake Pad', 10),
(3, 3, '2024-10-03', 'Oil Filter', 20),
(4, 1, '2024-10-04', 'Spark Plug', 15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `typemaintenance`
--

CREATE TABLE `typemaintenance` (
  `idTypeMaintenance` int(11) NOT NULL,
  `nameType` varchar(100) DEFAULT NULL,
  `description` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `typemaintenance`
--

INSERT INTO `typemaintenance` (`idTypeMaintenance`, `nameType`, `description`) VALUES
(1, 'Mantenimiento de Neumáticos', 'Revisión y reemplazo de neumáticos, ajuste de presión y alineación.'),
(2, 'Mantenimiento Mecánico', 'Inspección y reparación de componentes del motor y sistemas mecánicos.'),
(3, 'Mantenimiento Eléctrico', 'Revisión y reparación del sistema eléctrico, incluyendo luces, batería y alternador.'),
(4, 'Mantenimiento de Soldadura', 'Reparación de soldaduras en el chasis y carrocería del vehículo.'),
(5, 'Lavado', 'Limpieza exterior e interior del vehículo, incluyendo lavado de carrocería y aspirado.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehicle`
--

CREATE TABLE `vehicle` (
  `idVehicle` int(11) NOT NULL,
  `brand` varchar(100) DEFAULT NULL,
  `plate` varchar(50) DEFAULT NULL,
  `model` varchar(100) DEFAULT NULL,
  `yearManufacture` date DEFAULT NULL,
  `mileage` int(11) DEFAULT NULL,
  `maintenancePlan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vehicle`
--

INSERT INTO `vehicle` (`idVehicle`, `brand`, `plate`, `model`, `yearManufacture`, `mileage`, `maintenancePlan`) VALUES
(1, 'Toyota', 'ABC123', 'Corolla', '2018-01-01', 50000, 'Mantenimiento Preventivo'),
(2, 'Honda', 'DEF456', 'Civic', '2019-02-15', 60000, 'Mantenimiento Correctivo'),
(3, 'Ford', 'GHI789', 'Fiesta', '2017-05-20', 45000, 'Mantenimiento Preventivo'),
(4, 'Chevrolet', 'JKL012', 'Spark', '2016-10-10', 70000, 'Mantenimiento Correctivo'),
(5, 'Nissan', 'MNO345', 'Sentra', '2020-03-25', 30000, 'Mantenimiento Preventivo'),
(6, 'Hyundai', 'PQR678', 'Accent', '2015-07-12', 80000, 'Mantenimiento Correctivo'),
(7, 'Volkswagen', 'STU901', 'Golf', '2018-11-30', 55000, 'Mantenimiento Preventivo'),
(8, 'Kia', 'VWX234', 'Rio', '2019-09-08', 40000, 'Mantenimiento Correctivo'),
(9, 'BMW', 'YZA567', 'Series 3', '2021-04-05', 20000, 'Mantenimiento Preventivo'),
(10, 'Mercedes-Benz', 'BCD890', 'CLA', '2017-12-15', 65000, 'Mantenimiento Correctivo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrator`
--
ALTER TABLE `administrator`
  ADD PRIMARY KEY (`idAdministrator`);

--
-- Indices de la tabla `driver`
--
ALTER TABLE `driver`
  ADD PRIMARY KEY (`idDriver`);

--
-- Indices de la tabla `failurereport`
--
ALTER TABLE `failurereport`
  ADD PRIMARY KEY (`idFailureReport`),
  ADD KEY `idDriver_fk` (`idDriver`);

--
-- Indices de la tabla `job`
--
ALTER TABLE `job`
  ADD PRIMARY KEY (`idJob`),
  ADD KEY `idMechanic_fk` (`idMechanic`),
  ADD KEY `idMaintenance_fk` (`idMaintenance`),
  ADD KEY `idSparePart_fk` (`idSparePart`);

--
-- Indices de la tabla `logistics`
--
ALTER TABLE `logistics`
  ADD PRIMARY KEY (`idLogistics`);

--
-- Indices de la tabla `maintenance`
--
ALTER TABLE `maintenance`
  ADD PRIMARY KEY (`idMaintenance`),
  ADD KEY `idVehicle_fk` (`idVehicle`),
  ADD KEY `idAdministrator_fk` (`idAdministrator`),
  ADD KEY `idFailureReport_fk` (`idFailureReport`),
  ADD KEY `idTypeMaintenance_fk` (`idTypeMaintenance`);

--
-- Indices de la tabla `mechanic`
--
ALTER TABLE `mechanic`
  ADD PRIMARY KEY (`idMechanic`);

--
-- Indices de la tabla `sparepart`
--
ALTER TABLE `sparepart`
  ADD PRIMARY KEY (`idSparePart`),
  ADD KEY `idLogistica` (`idLogistics`) USING BTREE;

--
-- Indices de la tabla `typemaintenance`
--
ALTER TABLE `typemaintenance`
  ADD PRIMARY KEY (`idTypeMaintenance`);

--
-- Indices de la tabla `vehicle`
--
ALTER TABLE `vehicle`
  ADD PRIMARY KEY (`idVehicle`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `administrator`
--
ALTER TABLE `administrator`
  MODIFY `idAdministrator` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `driver`
--
ALTER TABLE `driver`
  MODIFY `idDriver` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `failurereport`
--
ALTER TABLE `failurereport`
  MODIFY `idFailureReport` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `job`
--
ALTER TABLE `job`
  MODIFY `idJob` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `logistics`
--
ALTER TABLE `logistics`
  MODIFY `idLogistics` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `maintenance`
--
ALTER TABLE `maintenance`
  MODIFY `idMaintenance` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `mechanic`
--
ALTER TABLE `mechanic`
  MODIFY `idMechanic` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `sparepart`
--
ALTER TABLE `sparepart`
  MODIFY `idSparePart` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `typemaintenance`
--
ALTER TABLE `typemaintenance`
  MODIFY `idTypeMaintenance` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `vehicle`
--
ALTER TABLE `vehicle`
  MODIFY `idVehicle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `failurereport`
--
ALTER TABLE `failurereport`
  ADD CONSTRAINT `idDriver_fk` FOREIGN KEY (`idDriver`) REFERENCES `driver` (`idDriver`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `job`
--
ALTER TABLE `job`
  ADD CONSTRAINT `idMaintenance_fk` FOREIGN KEY (`idMaintenance`) REFERENCES `maintenance` (`idMaintenance`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idMechanic_fk` FOREIGN KEY (`idMechanic`) REFERENCES `mechanic` (`idMechanic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idSparePart_fk` FOREIGN KEY (`idSparePart`) REFERENCES `sparepart` (`idSparePart`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `maintenance`
--
ALTER TABLE `maintenance`
  ADD CONSTRAINT `idAdministrator_fk` FOREIGN KEY (`idAdministrator`) REFERENCES `administrator` (`idAdministrator`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idFailureReport_fk` FOREIGN KEY (`idFailureReport`) REFERENCES `failurereport` (`idFailureReport`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idTypeMaintenance_fk` FOREIGN KEY (`idTypeMaintenance`) REFERENCES `typemaintenance` (`idTypeMaintenance`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idVehicle_fk` FOREIGN KEY (`idVehicle`) REFERENCES `vehicle` (`idVehicle`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `sparepart`
--
ALTER TABLE `sparepart`
  ADD CONSTRAINT `logistics` FOREIGN KEY (`idLogistics`) REFERENCES `logistics` (`idLogistics`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
