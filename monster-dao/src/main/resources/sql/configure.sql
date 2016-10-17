--drop table if exists trade_configure_enum;

/*==============================================================*/
/* Table: trade_configure_enum     枚举类主表                             */
/*==============================================================*/
CREATE TABLE `trade_configure_enum` (
  `enum_id` varchar(64) NOT NULL,
  `code` varchar(64) DEFAULT NULL,
  `description` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`enum_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: trade_configure_enum_item     枚举类子表                  */
/*==============================================================*/
CREATE TABLE `trade_configure_enum_item` (
  `item_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `enum_id` varchar(64) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `value` varchar(64) DEFAULT NULL,
  `description` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`item_id`),
  KEY `enumidFk` (`enum_id`),
  CONSTRAINT `enumidFk` FOREIGN KEY (`enum_id`) REFERENCES `trade_configure_enum` (`enum_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
