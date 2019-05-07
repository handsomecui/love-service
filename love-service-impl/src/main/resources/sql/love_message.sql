create database love;
use love;
CREATE TABLE `love_message` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `ip` varchar(50) DEFAULT NULL COMMENT 'ip',
  `content` varchar(200) DEFAULT NULL COMMENT '留言内容',
  `area` varchar(50) DEFAULT NULL COMMENT '区域',
  `create_time` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
