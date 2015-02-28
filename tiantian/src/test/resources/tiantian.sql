/*
Navicat MySQL Data Transfer

Source Server         : mysql-localhsot
Source Server Version : 50619
Source Host           : localhost:3306
Source Database       : tiantian

Target Server Type    : MYSQL
Target Server Version : 50619
File Encoding         : 65001

Date: 2015-02-28 17:31:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` varchar(30) NOT NULL COMMENT '主键',
  `user_account` varchar(100) NOT NULL COMMENT '用户账号',
  `balance` double(18,2) NOT NULL DEFAULT '0.00' COMMENT '账户余额',
  `spend` double(18,2) NOT NULL DEFAULT '0.00' COMMENT '消费金额',
  PRIMARY KEY (`id`),
  KEY `normal_idx_user_account` (`user_account`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(50) NOT NULL COMMENT '主键',
  `user_name` varchar(100) NOT NULL COMMENT '用户名',
  `user_account` varchar(100) NOT NULL COMMENT '用户账户',
  `telephone` varchar(50) DEFAULT NULL COMMENT '固定电话',
  `mobile_phone` varchar(50) DEFAULT NULL COMMENT '手机',
  `company` varchar(200) DEFAULT NULL COMMENT '公司',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `create_date` datetime DEFAULT NULL COMMENT '创建日期',
  `state` tinyint(1) DEFAULT NULL COMMENT '是否可用',
  `email` varchar(150) DEFAULT NULL COMMENT '邮件',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_idx_user_account` (`user_account`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('54f1854def4afe9110e88585', '尹雷', 'yinlei', null, null, null, 'cf6ada0c35dfe09edba4df80ac4cafe393a2d6d2', '2015-02-28 17:07:25', null, 'yinlei@126.com');
