/*
Navicat MySQL Data Transfer

Source Server         : mysql-localhsot
Source Server Version : 50619
Source Host           : localhost:3306
Source Database       : tiantian

Target Server Type    : MYSQL
Target Server Version : 50619
File Encoding         : 65001

Date: 2015-03-06 17:36:56
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
  `state` int(10) DEFAULT NULL COMMENT '账户状态',
  `freeze` double(18,2) NOT NULL DEFAULT '0.00' COMMENT '冻结金额',
  `score` double(18,2) DEFAULT NULL,
  `pay_password` varchar(30) DEFAULT NULL COMMENT '支付密码',
  `enable_date` datetime DEFAULT NULL COMMENT '账户启用时间',
  PRIMARY KEY (`id`),
  KEY `normal_idx_user_account` (`user_account`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------

-- ----------------------------
-- Table structure for `address`
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `address_id` varchar(30) NOT NULL COMMENT '地址表主键',
  `user_id` varchar(30) NOT NULL COMMENT '用户id',
  `user_account` varchar(100) NOT NULL COMMENT '用户账户',
  `province` varchar(50) DEFAULT NULL COMMENT '省',
  `city` varchar(50) DEFAULT NULL COMMENT '城市',
  `district` varchar(50) DEFAULT NULL COMMENT '区',
  `street` varchar(200) DEFAULT NULL COMMENT '街道',
  `zipcode` varchar(50) DEFAULT NULL COMMENT '邮编',
  `address` varchar(500) DEFAULT NULL COMMENT '配送详细地址',
  `enabled` int(10) DEFAULT NULL COMMENT '当前使用',
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='地址信息表';

-- ----------------------------
-- Records of address
-- ----------------------------

-- ----------------------------
-- Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `category_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '分类ID主键',
  `category_name` varchar(100) NOT NULL COMMENT '分类名',
  `parent_id` int(10) DEFAULT NULL COMMENT '父类ID',
  `parent_name` varchar(100) DEFAULT NULL COMMENT '父类名',
  `category_type` int(10) DEFAULT NULL COMMENT '所属类型',
  `state` int(10) DEFAULT NULL COMMENT '是否可用',
  PRIMARY KEY (`category_id`),
  UNIQUE KEY `category_id_index` (`category_id`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物品分类表';

-- ----------------------------
-- Records of category
-- ----------------------------

-- ----------------------------
-- Table structure for `delivery`
-- ----------------------------
DROP TABLE IF EXISTS `delivery`;
CREATE TABLE `delivery` (
  `delivery_id` varchar(30) NOT NULL COMMENT '配送主键',
  `user_id` varchar(30) NOT NULL COMMENT '用户id',
  `user_account` varchar(100) NOT NULL COMMENT '用户账户',
  `province` varchar(50) DEFAULT NULL COMMENT '省',
  `city` varchar(50) DEFAULT NULL COMMENT '城市',
  `district` varchar(50) DEFAULT NULL COMMENT '区',
  `street` varchar(200) DEFAULT NULL COMMENT '街道',
  `zipcode` varchar(50) DEFAULT NULL COMMENT '邮编',
  `address` varchar(500) DEFAULT NULL COMMENT '配送详细地址',
  `pay_type` varchar(100) DEFAULT NULL COMMENT '支付方式',
  `delivery_date` datetime DEFAULT NULL COMMENT '配送时间',
  `delivery_employee` varchar(100) DEFAULT NULL COMMENT '配送人员',
  `employee_mobile` varchar(30) DEFAULT NULL COMMENT '配送人员电话',
  PRIMARY KEY (`delivery_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='配送信息表';

-- ----------------------------
-- Records of delivery
-- ----------------------------

-- ----------------------------
-- Table structure for `item`
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `item_id` varchar(30) NOT NULL COMMENT '物品ID',
  `item_name` varchar(250) NOT NULL COMMENT '物品名',
  `item_price` double(18,2) NOT NULL COMMENT '原价',
  `discount_price` double(18,2) DEFAULT NULL COMMENT '打折后价格',
  `discount` double(10,1) DEFAULT NULL COMMENT '折扣',
  `category_id` int(10) DEFAULT NULL COMMENT '分类',
  `category_name` varchar(250) DEFAULT NULL COMMENT '分类名',
  `promotion` varchar(250) DEFAULT NULL COMMENT '促销语',
  `brand` varchar(250) DEFAULT NULL COMMENT '品牌',
  `state` int(10) DEFAULT NULL COMMENT '是否在售',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `shelves_date` datetime DEFAULT NULL COMMENT '上架时间',
  `create_user` varchar(30) DEFAULT NULL COMMENT '创建人',
  `item_desc` varchar(250) DEFAULT NULL COMMENT '商品备注',
  `update_date` datetime DEFAULT NULL COMMENT '更新日期',
  `item_number` int(10) DEFAULT NULL COMMENT '商品数量',
  `image_url` varchar(250) DEFAULT NULL COMMENT '商品图片路径',
  `target_url` varchar(250) DEFAULT NULL COMMENT '商品详细页地址',
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='销售物品';

-- ----------------------------
-- Records of item
-- ----------------------------

-- ----------------------------
-- Table structure for `keywords`
-- ----------------------------
DROP TABLE IF EXISTS `keywords`;
CREATE TABLE `keywords` (
  `id` bigint(30) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `kname` varchar(100) NOT NULL COMMENT 'key名',
  `kvalue` varchar(100) NOT NULL COMMENT 'key值',
  `kdesc` varchar(200) DEFAULT NULL COMMENT 'key描述',
  `kdvalue` varchar(200) DEFAULT NULL COMMENT 'key描述值',
  `remark` char(50) DEFAULT NULL COMMENT '注释',
  PRIMARY KEY (`id`),
  KEY `INDEX_SYSTEM_KEYWORDS` (`kname`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统设定';

-- ----------------------------
-- Records of keywords
-- ----------------------------

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `order_id` varchar(30) NOT NULL COMMENT '订单号',
  `user_id` int(10) NOT NULL COMMENT '用户ID',
  `contract_id` bigint(20) unsigned DEFAULT NULL COMMENT '合同号',
  `remark` varchar(100) DEFAULT NULL COMMENT '订单备注',
  `state` int(10) NOT NULL COMMENT '订单状态',
  `order_sum` double(18,2) NOT NULL COMMENT '订单金额',
  `create_date` datetime DEFAULT NULL COMMENT '订单创建日期',
  `update_date` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`order_id`),
  KEY `user_id_index` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单';

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for `order_detail`
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail` (
  `order_detail_id` varchar(30) NOT NULL COMMENT '订单明细ID',
  `order_id` varchar(30) NOT NULL COMMENT '订单ID',
  `user_id` varchar(30) NOT NULL COMMENT '用户ID',
  `item_id` varchar(30) NOT NULL COMMENT '商品ID',
  `item_name` varchar(250) NOT NULL COMMENT '商品名',
  `item_price` double(18,2) NOT NULL COMMENT '商品价格',
  `remark` varchar(200) DEFAULT NULL COMMENT '订但明细备注',
  `state` int(10) NOT NULL COMMENT '订单明细状态',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `update_date` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`order_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单明细';

-- ----------------------------
-- Records of order_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `shopping_cart`
-- ----------------------------
DROP TABLE IF EXISTS `shopping_cart`;
CREATE TABLE `shopping_cart` (
  `item_id` varchar(30) NOT NULL COMMENT '商品id',
  `item_name` varchar(300) NOT NULL COMMENT '商品名称',
  `item_color` varchar(50) DEFAULT NULL COMMENT '商品颜色',
  `item_size` varchar(50) DEFAULT NULL COMMENT '商品尺码',
  `item_desc` varchar(100) DEFAULT NULL COMMENT '商品描述',
  `image_url` varchar(500) NOT NULL COMMENT '商品图片url',
  `quantity` int(10) NOT NULL COMMENT '数量',
  `unit_price` double(18,2) NOT NULL COMMENT '单价',
  `total` double(18,2) NOT NULL COMMENT '总价',
  `ref_no` varchar(50) NOT NULL COMMENT '商品编号',
  `add_date` datetime DEFAULT NULL COMMENT '添加日期',
  `user_id` varchar(50) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shopping_cart
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
