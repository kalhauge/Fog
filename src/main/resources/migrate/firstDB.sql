DROP TABLE IF EXISTS kunde;
CREATE TABLE kunde (
    id int AUTO_INCREMENT NOT NULL,
    name VARCHAR(255) NOT NULL,
    addresse VARCHAR(255) NOT NULL,
    tlfNummer int NOT NULL,
    email VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB;


BEGIN;
INSERT INTO `kunde` VALUES
(1, 'Gustav', 'derHjemme', '12345678', 'gustav@gustav.dk');
COMMIT;

DROP TABLE IF EXISTS sælger;
CREATE TABLE sælger (
    id int AUTO_INCREMENT NOT NULL,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB;

BEGIN;
INSERT INTO `sælger` VALUES
(1, 'Gustav');
COMMIT;

DROP TABLE IF EXISTS materialer;
CREATE TABLE materialer (
    id int AUTO_INCREMENT NOT NULL,
    name VARCHAR(255) NOT NULL,
    enhed VARCHAR(255) NOT NULL,
    længde int NOT NULL,
    pris int NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB;

BEGIN;
INSERT INTO `materialer` VALUES
(1, 'spær', 'vedIkke', '600', '200');
COMMIT;

DROP TABLE IF EXISTS carport;
CREATE TABLE carport (
    id int AUTO_INCREMENT NOT NULL,
    bredde int NOT NULL,
    længde int NOT NULL,
    rejsning boolean NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB;

BEGIN;
INSERT INTO carport VALUES
(1, 6000, 8000, true);
COMMIT;

DROP TABLE IF EXISTS skur;
CREATE TABLE skur (
    id int AUTO_INCREMENT NOT NULL,
    bredde int NOT NULL,
    længde int NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB;


DROP TABLE IF EXISTS ordre;
CREATE TABLE ordre (
    id int AUTO_INCREMENT NOT NULL,
    tilbudsDato timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    ordreDato timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    leveringsDato VARCHAR(255),
    kundeID int NOT NULL,
    sælgerID int NOT NULL,
    skurId int NOT NULL,
    carportId int NOT NULL,
    pris int NOT NULL,
    status int NOT NULL,
    PRIMARY KEY (id),
    KEY kunde (kundeID),
    KEY sælger (sælgerID),
    KEY skur (skurId),
    KEY carport (carportId),
    CONSTRAINT kunde FOREIGN KEY (kundeID) REFERENCES kunde(id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT sælger FOREIGN KEY (sælgerID) REFERENCES sælger(id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT skur FOREIGN KEY (skurId) REFERENCES skur(id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT carport FOREIGN KEY (carportId) REFERENCES carport(id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB;

DROP TABLE IF EXISTS stykliste;
CREATE TABLE stykliste (
    id int AUTO_INCREMENT NOT NULL,
    ordreID int NOT NULL,
    materialeID int NOT NULL,
    antal int NOT NULL,
    PRIMARY KEY (id),
    KEY materiale (materialeID),
    KEY ordre (ordreID),
    CONSTRAINT materiale FOREIGN KEY (materialeId) REFERENCES materialer(id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT ordre FOREIGN KEY (ordreID) REFERENCES ordre(id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for properties
-- ----------------------------
DROP TABLE IF EXISTS `properties`;
CREATE TABLE `properties` (
    name varchar(255) NOT NULL,
    value varchar(255) NOT NULL,
    PRIMARY KEY (name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of properties
-- ----------------------------
BEGIN;
INSERT INTO `properties` VALUES ('version', '1');
COMMIT;


