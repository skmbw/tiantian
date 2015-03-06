/*
Navicat MySQL Data Transfer

Source Server         : mysql-localhsot
Source Server Version : 50619
Source Host           : localhost:3306
Source Database       : xunxun

Target Server Type    : MYSQL
Target Server Version : 50619
File Encoding         : 65001

Date: 2015-03-06 17:36:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `authorities`
-- ----------------------------
DROP TABLE IF EXISTS `authorities`;
CREATE TABLE `authorities` (
  `auth_id` int(30) NOT NULL AUTO_INCREMENT,
  `auth_name` varchar(100) NOT NULL COMMENT '权限名',
  `auth_desc` varchar(150) DEFAULT NULL COMMENT '权限中文名',
  `enabled` int(10) DEFAULT NULL COMMENT '是否禁用',
  `user_id` bigint(15) DEFAULT NULL COMMENT '用户',
  `module_id` varchar(45) DEFAULT NULL,
  `action` varchar(150) DEFAULT NULL COMMENT '动作url',
  `urls` varchar(600) DEFAULT NULL COMMENT '该权限下的所有的url',
  `orders` int(10) DEFAULT NULL,
  PRIMARY KEY (`auth_id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of authorities
-- ----------------------------
INSERT INTO `authorities` VALUES ('1', 'ADD_RESOURCES', '添加资源', '0', '123', '127', '/resources/add?init=true', '/resources/add?init=true,/resources/add,', null);
INSERT INTO `authorities` VALUES ('2', 'ADD_ROLES', '添加角色', '0', '123', '127', '/users/roles-input.htm', '/users/roles-input.htm,', null);
INSERT INTO `authorities` VALUES ('3', 'DOCUMENT_QUERY', '保存用户', '0', '123', '127', '/users/empUser-register.htm', '/users/empUser-register.htm', null);
INSERT INTO `authorities` VALUES ('4', 'DOCUMENT_INPUT', '添加权限', '0', '123', '127', '/users/authorities-input.htm', '/users/authorities-input.htm,', null);
INSERT INTO `authorities` VALUES ('5', 'RESOURCE_ADMIN', '资源管理', '1', '123', '127', '/resources/initial', '/resources/add?init=true,/resources/initial,/resources/add,', null);
INSERT INTO `authorities` VALUES ('6', 'ADD_USER', '添加用户', '0', '123', '127', '/users/empUser-input.htm', '/users/empUser-input.htm', null);
INSERT INTO `authorities` VALUES ('7', 'USER_ADMIN', '用户管理', '1', '123', '127', '/users/empUser-initial.htm', '/users/empUser-register.htm,/users/empUser-input.htm?init=true,/users/empUser-initial.htm,/users/empUser-roles.htm?init=true,', null);
INSERT INTO `authorities` VALUES ('8', 'AUTH_ADMIN', '权限管理', '1', '123', '127', '/users/authorities-initial.htm', '/users/authorities-input.htm,/users/authorities-initial.htm,', null);
INSERT INTO `authorities` VALUES ('9', 'ROLES_ADMIN', '角色管理', '1', '123', '127', '/users/roles-initial.htm', '/users/roles-input.htm,/users/roles-initial.htm,', null);
INSERT INTO `authorities` VALUES ('10', 'AUTH_ACCOUNT', '会计科目', '1', '123', '124', '/account/subject-initial.htm', '/account/subject-initial.htm,/account/subject-input.htm?init=true,/account/subject-importExcel.htm?init=true,', null);
INSERT INTO `authorities` VALUES ('11', 'CERT_ADMIN', '凭证管理', '1', '123', '124', '/account/certificate-input.htm?init=true', '/account/certificate-input.htm?init=true,/account/certificate-initial.htm,', null);
INSERT INTO `authorities` VALUES ('12', 'ACCOUNT_SUMMARY', '凭证汇总表', '1', '123', '128', '/table/accountsummary-initial.htm', '/table/accountsummary-initial.htm,', null);
INSERT INTO `authorities` VALUES ('13', 'ACCOUNT_BALANCE', '科目余额表', '1', '123', '128', '/table/accountbalance-initial.htm', '/table/accountbalance-initial.htm,', null);
INSERT INTO `authorities` VALUES ('14', 'DETAIL_ACCOUNT', '明细账', '1', '123', '128', '/table/detailaccount-initial.htm', '/table/detailaccount-initial.htm,', null);
INSERT INTO `authorities` VALUES ('15', 'LEDGER', '总账', '1', '123', '128', '/table/ledger-initial.htm', '/table/ledger-initial.htm,', null);
INSERT INTO `authorities` VALUES ('16', 'DAILY_ACCOUNT', '日记账', '1', '123', '128', '/table/dailyaccount-initial.htm', '/table/dailyaccount-initial.htm,', null);
INSERT INTO `authorities` VALUES ('17', 'SYSTEM_PARAM', '参数设置', '1', '123', '129', '/setting/systemparam-initial.htm', '/setting/systemparam-initial.htm,', null);
INSERT INTO `authorities` VALUES ('18', 'ASSETS_LIAB', '资产负债表', '1', '123', '126', '/report/assetsliabilities-initial.htm', '/report/assetsliabilities-initial.htm,', null);
INSERT INTO `authorities` VALUES ('19', 'PROFIT', '利润表', '1', '123', '126', '/report/profit-initial.htm', '/report/profit-initial.htm,', null);
INSERT INTO `authorities` VALUES ('20', 'ASSETS_TYPE', '资产分类', '1', '123', '125', '/assets/assetstype-initial.htm', '/assets/assetstype-initial.htm,', null);
INSERT INTO `authorities` VALUES ('21', 'CODE_RULE', '编码规则', '1', '123', '129', '/setting/coderule-initial.htm', '/setting/coderule-initial.htm,', null);
INSERT INTO `authorities` VALUES ('22', 'TRIAL_BALANCE', '试算平衡表', '1', '123', '128', '/table/trialbalance-initial.htm', '/table/trialbalance-initial.htm,', null);
INSERT INTO `authorities` VALUES ('23', 'CASH_FLOW', '现金流量表', '1', '123', '126', '/report/cashflow-initial.htm', '/report/cashflow-initial.htm,', null);
INSERT INTO `authorities` VALUES ('24', 'ASSETS_MANAGE', '资产管理', '1', '123', '125', '/assets/assetsmanage-initial.htm', '/assets/assetsmanage-initial.htm,', null);
INSERT INTO `authorities` VALUES ('28', 'AUTH_MENU', '菜单管理', '1', null, '127', '/menu/list.htm', '/menu/add.htm?init=true,/menu/delete.htm,/menu/list.htm,', null);

-- ----------------------------
-- Table structure for `auth_resource`
-- ----------------------------
DROP TABLE IF EXISTS `auth_resource`;
CREATE TABLE `auth_resource` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `auth_id` int(30) NOT NULL,
  `resource_id` int(30) NOT NULL,
  `resource_name` varchar(100) DEFAULT NULL COMMENT '资源名',
  `resource_type` varchar(50) DEFAULT NULL COMMENT '资源类型',
  `resource_url` varchar(200) DEFAULT NULL COMMENT '资源url',
  `enable` tinyint(1) DEFAULT NULL COMMENT '1表示启用，0表示禁用',
  `defaults` int(10) DEFAULT NULL COMMENT '是否是某一权限默认的url',
  PRIMARY KEY (`id`),
  KEY `FK_auth_resource_1` (`auth_id`),
  CONSTRAINT `FK_auth_resource_1` FOREIGN KEY (`auth_id`) REFERENCES `authorities` (`auth_id`)
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=utf8 COMMENT='权限资源关联';

-- ----------------------------
-- Records of auth_resource
-- ----------------------------
INSERT INTO `auth_resource` VALUES ('2', '3', '0', '添加角色', 'action', '/users/roles-input.htm', '1', '2');
INSERT INTO `auth_resource` VALUES ('40', '2', '3', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('41', '1', '1', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('42', '4', '4', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('46', '5', '6', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('47', '5', '1', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('49', '8', '4', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('50', '8', '18', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('54', '18', '24', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('55', '11', '27', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('56', '11', '28', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('57', '10', '22', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('58', '10', '20', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('59', '10', '21', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('60', '13', '29', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('61', '23', '26', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('62', '19', '25', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('63', '16', '33', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('64', '14', '31', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('65', '15', '32', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('66', '22', '30', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('67', '12', '23', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('70', '9', '3', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('71', '9', '19', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('72', '24', '35', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('73', '20', '34', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('74', '21', '36', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('75', '17', '37', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('76', '7', '2', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('77', '7', '5', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('78', '7', '42', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('79', '7', '7', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('80', '28', '15', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('81', '28', '16', null, null, null, null, null);
INSERT INTO `auth_resource` VALUES ('82', '28', '17', null, null, null, null, null);

-- ----------------------------
-- Table structure for `emp_user`
-- ----------------------------
DROP TABLE IF EXISTS `emp_user`;
CREATE TABLE `emp_user` (
  `user_id` int(16) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL COMMENT '用户名',
  `email` varchar(150) DEFAULT NULL,
  `pass` varchar(50) NOT NULL COMMENT '密码',
  `dept_id` varchar(45) DEFAULT NULL,
  `dept_name` varchar(100) DEFAULT NULL,
  `manager_id` int(16) DEFAULT NULL,
  `manager_name` varchar(50) DEFAULT NULL,
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `enable` int(2) DEFAULT NULL COMMENT '是否禁用',
  `user_account` varchar(100) NOT NULL COMMENT '登录账号',
  `tenant_identifier` varchar(50) DEFAULT NULL COMMENT '租户id',
  PRIMARY KEY (`user_id`) USING BTREE,
  UNIQUE KEY `INDEX_ACCOUNT` (`user_account`)
) ENGINE=InnoDB AUTO_INCREMENT=166 DEFAULT CHARSET=utf8 COMMENT='用户';

-- ----------------------------
-- Records of emp_user
-- ----------------------------
INSERT INTO `emp_user` VALUES ('123', '尹雷', 'tongku2008@126.com', '0ef11ac5a9fcfb24e42f9b689443582d319efd8a', 'hz', '研发', null, null, '2014-03-20 17:26:12', '1', 'yinlei_nb', 'biziliDataSource');
INSERT INTO `emp_user` VALUES ('124', '中天', '123@123.com', '12345', 'sk', null, null, null, '2011-09-19 00:00:00', null, '1', '');
INSERT INTO `emp_user` VALUES ('126', 'zhong', 'yin@123.com', '123456', 'sk', null, null, null, '2011-09-20 00:00:00', null, '3', '');
INSERT INTO `emp_user` VALUES ('127', 'tian', 'lei@123.com', '294729a8de487d464938ae2a4f53e98e622f7185', 'sk', 'BIZILI', null, null, '2012-09-08 17:08:54', '1', '4', 'BiziliDS');
INSERT INTO `emp_user` VALUES ('128', '尹大雷', 'dalei@123.com', '85c1c8ae52f82bae06ca9d52ed4ef07467cd5328', 'mbw', '11', null, null, '2014-03-26 16:18:48', '1', '5', null);
INSERT INTO `emp_user` VALUES ('130', '小雷', 'xiao@123.com', 'e0c84e432d412229608b00efa213ab8684038c01', 'sk', '软件开发', null, null, '2012-09-07 20:21:23', '1', 'aa7', 'BiziliDS');
INSERT INTO `emp_user` VALUES ('143', '毕子利', 'tong@126.com', '2bf283f23dd627d405e876ea0a63d9d689b8e179', 'hz', '测试window.showModalDialog', null, null, '2012-06-21 22:45:15', '1', 'bizili', '');
INSERT INTO `emp_user` VALUES ('146', '少龙', 'shaolong@126.com', '83a5ed676e108fa082275dc030fa9deba1a0b5fd', 'hz', '少龙', null, null, '2012-06-21 23:22:44', '1', 'shaolong', '');
INSERT INTO `emp_user` VALUES ('147', '少龙2', 'shaolong2@126.com', '3d7de7fe865787f5ecb489310c3ba46816d9fcf8', 'hz', '少龙2', null, null, '2012-06-21 23:29:58', '1', 'shaolong2', '');
INSERT INTO `emp_user` VALUES ('148', '少龙3', 'shaolong3@126.com', 'fa976173a94da5def402b7d17d0c5917de5832b1', 'hz', '少龙的账号', null, null, '2012-06-24 14:08:49', '1', 'shaolong3', '');
INSERT INTO `emp_user` VALUES ('160', '斯蒂芬', '123@123.com', 'cfa720f7540bcb643112bbeecba7646e251f1847', '34', '软件开发', null, null, '2012-09-08 17:05:27', '1', 'a2', 'BiziliDS');
INSERT INTO `emp_user` VALUES ('161', '我家尹雷', 'tongku2007@126.com', 'c050c176005f72154a5aa10265da5bfaf6481362', '1211', '技术支持', null, null, '2014-03-13 16:25:18', '1', 'wojiaoyinlei', 'bizili');
INSERT INTO `emp_user` VALUES ('162', '尹雷测试1', 'yinleitest1@126.com', 'dee93a4d192e5c50d8098e6cceea713cdece21ee', '1201', '技术部', null, null, '2014-03-19 17:38:33', '1', 'yinleitest1', 'bizili');
INSERT INTO `emp_user` VALUES ('164', '尹雷测试2', 'yinleitest2@126.com', 'd8309ffda2144737c439781d531e209f5f811ede', '1202', '技术支持', null, null, '2014-03-20 17:26:56', '1', 'yinleitest2', 'bizili');
INSERT INTO `emp_user` VALUES ('165', '尹雷测试3', 'yinleitest3@126.com', '63973dd1537ef6056587217b3f73971346b00962', '1202', '技术支持', null, null, '2014-03-21 17:54:02', '1', 'yinleitest3', null);

-- ----------------------------
-- Table structure for `module_menu`
-- ----------------------------
DROP TABLE IF EXISTS `module_menu`;
CREATE TABLE `module_menu` (
  `module_id` varchar(45) NOT NULL,
  `module_name` varchar(150) DEFAULT NULL COMMENT '模块名',
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `enable` tinyint(2) DEFAULT '1' COMMENT '是否激活',
  `orders` int(10) DEFAULT NULL COMMENT '显示顺序',
  PRIMARY KEY (`module_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of module_menu
-- ----------------------------
INSERT INTO `module_menu` VALUES ('124', '总账', '2012-07-20 20:40:57', '1', '1');
INSERT INTO `module_menu` VALUES ('125', '固定资产', '2012-07-20 20:41:28', '1', '4');
INSERT INTO `module_menu` VALUES ('126', '财务报表', '2012-07-20 20:41:19', '1', '3');
INSERT INTO `module_menu` VALUES ('127', '权限管理', '2012-07-20 20:41:32', '1', '5');
INSERT INTO `module_menu` VALUES ('128', '帐表', '2012-07-20 20:41:15', '1', '2');
INSERT INTO `module_menu` VALUES ('129', '系统设置', '2012-07-20 20:41:38', '1', '6');

-- ----------------------------
-- Table structure for `resources`
-- ----------------------------
DROP TABLE IF EXISTS `resources`;
CREATE TABLE `resources` (
  `resource_id` int(30) NOT NULL AUTO_INCREMENT,
  `resource_name` varchar(100) NOT NULL COMMENT '资源名称',
  `resource_type` varchar(50) NOT NULL COMMENT '资源类型url,method',
  `resource_url` varchar(200) DEFAULT NULL COMMENT '资源链接',
  `resource_desc` varchar(150) DEFAULT NULL COMMENT '资源描述',
  `defaults` tinyint(1) DEFAULT '0' COMMENT '权限的默认资源url',
  `enabled` int(10) DEFAULT NULL COMMENT '是否禁用',
  `orders` int(10) DEFAULT NULL COMMENT '排序',
  `show_in_menu` tinyint(1) DEFAULT '0' COMMENT '是否在菜单中',
  `module_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`resource_id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8 COMMENT='权限资源';

-- ----------------------------
-- Records of resources
-- ----------------------------
INSERT INTO `resources` VALUES ('1', '添加资源', 'action', '/resources/add?init=true', '添加资源', '1', '1', null, '0', '127');
INSERT INTO `resources` VALUES ('2', '保存用户', 'action', '/users/empUser-register.htm', '保存用户', '1', '1', '2', '0', '127');
INSERT INTO `resources` VALUES ('3', '增加角色', 'action', '/users/roles-input.htm?init=true', '增加角色', '1', '1', null, '0', '127');
INSERT INTO `resources` VALUES ('4', '添加权限', 'action', '/users/authorities-input.htm?init=true', '添加权限', '1', '1', null, '0', '127');
INSERT INTO `resources` VALUES ('5', '添加用户', 'action', '/users/empUser-input.htm?init=true', '添加用户', '1', '1', null, '0', '127');
INSERT INTO `resources` VALUES ('6', '查询资源', 'action', '/resources/initial', '查询资源', '1', '1', null, '0', '127');
INSERT INTO `resources` VALUES ('7', '查询用户', 'action', '/users/empUser-initial.htm', '查询用户', '1', '1', '7', '0', '127');
INSERT INTO `resources` VALUES ('15', '菜单列表', 'action', '/menu/list.htm', '菜单列表', '1', '1', null, '1', '127');
INSERT INTO `resources` VALUES ('16', '菜单新增', 'action', '/menu/add.htm?init=true', '菜单新增', '0', '1', null, '0', '127');
INSERT INTO `resources` VALUES ('17', '删除菜单', 'action', '/menu/delete.htm', '删除菜单', '0', '1', null, '0', '127');
INSERT INTO `resources` VALUES ('18', '权限列表', 'action', '/users/authorities-initial.htm', '权限列表', '1', '1', null, '1', '127');
INSERT INTO `resources` VALUES ('19', '角色列表', 'action', '/users/roles-initial.htm', '角色列表', '1', '1', null, '1', '127');
INSERT INTO `resources` VALUES ('20', '会计科目', 'action', '/account/subject-initial.htm', '会计科目', '1', '1', null, '1', '124');
INSERT INTO `resources` VALUES ('21', '新增会计科目', 'action', '/account/subject-input.htm?init=true', '新增会计科目', '0', '1', null, '0', '124');
INSERT INTO `resources` VALUES ('22', '导入会计科目', 'action', '/account/subject-importExcel.htm?init=true', '导入会计科目', '0', '1', null, '0', '124');
INSERT INTO `resources` VALUES ('23', '凭证汇总表', 'action', '/table/accountsummary-initial.htm', '凭证汇总表', '1', '1', null, '1', '128');
INSERT INTO `resources` VALUES ('24', '资产负债表', 'action', '/report/assetsliabilities-initial.htm', '资产负债表', '1', '1', null, '1', '126');
INSERT INTO `resources` VALUES ('25', '利润表', 'action', '/report/profit-initial.htm', '利润表', '1', '1', null, '1', '126');
INSERT INTO `resources` VALUES ('26', '现金流量表', 'action', '/report/cashflow-initial.htm', '现金流量表', '1', '1', null, '1', '126');
INSERT INTO `resources` VALUES ('27', '录入凭证', 'action', '/account/certificate-input.htm?init=true', '录入凭证', '1', '1', null, '1', '124');
INSERT INTO `resources` VALUES ('28', '查询凭证', 'action', '/account/certificate-initial.htm', '查询凭证', '1', '1', null, '1', '124');
INSERT INTO `resources` VALUES ('29', '科目余额表', 'action', '/table/accountbalance-initial.htm', '科目余额表', '1', '1', null, '1', '128');
INSERT INTO `resources` VALUES ('30', '试算平衡表', 'action', '/table/trialbalance-initial.htm', '试算平衡表', '1', '1', null, '1', '128');
INSERT INTO `resources` VALUES ('31', '明细账', 'action', '/table/detailaccount-initial.htm', '明细账', '1', '1', null, '1', '128');
INSERT INTO `resources` VALUES ('32', '总账', 'action', '/table/ledger-initial.htm', '总账', '1', '1', null, '1', '128');
INSERT INTO `resources` VALUES ('33', '日记账', 'action', '/table/dailyaccount-initial.htm', '日记账', '1', '1', null, '1', '128');
INSERT INTO `resources` VALUES ('34', '资产分类', 'action', '/assets/assetstype-initial.htm', '资产分类', '1', '1', null, '1', '125');
INSERT INTO `resources` VALUES ('35', '资产管理', 'action', '/assets/assetsmanage-initial.htm', '资产管理', '1', '1', null, '1', '125');
INSERT INTO `resources` VALUES ('36', '编码规则', 'action', '/setting/coderule-initial.htm', '编码规则', '1', '1', null, '1', '129');
INSERT INTO `resources` VALUES ('37', '参数设置', 'action', '/setting/systemparam-initial.htm', '参数设置', '1', '1', null, '1', '129');
INSERT INTO `resources` VALUES ('42', '我的角色', 'action', '/users/empUser-roles.htm?init=true', '我的角色', '0', '1', null, '0', '127');
INSERT INTO `resources` VALUES ('43', '测试的', 'action', '/test', '测试的', '0', '1', null, '0', '1');
INSERT INTO `resources` VALUES ('44', '测试2', 'action', '、user', '点点滴滴', '0', '1', null, '0', '1');

-- ----------------------------
-- Table structure for `roles`
-- ----------------------------
DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles` (
  `role_id` int(30) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(100) NOT NULL,
  `role_desc` varchar(150) DEFAULT NULL,
  `enabled` int(10) DEFAULT NULL COMMENT '是否禁用',
  `priority` int(10) NOT NULL COMMENT '超级权限',
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of roles
-- ----------------------------
INSERT INTO `roles` VALUES ('1', 'ROLE_ADMIN', '管理员', '1', '1', null);
INSERT INTO `roles` VALUES ('2', 'ROLE_USER', '用户', '1', '1', '2012-06-24 19:34:02');
INSERT INTO `roles` VALUES ('3', 'ROLE_ACCOUNTING', '会计', '1', '1', '2012-06-24 19:34:06');
INSERT INTO `roles` VALUES ('4', 'ROLE_ACCOUNT_MGR', '会计主管', '1', '1', '2012-06-24 19:34:10');
INSERT INTO `roles` VALUES ('5', 'ROLE_SECTION', '课长', '1', '1', '2012-06-24 19:34:13');
INSERT INTO `roles` VALUES ('6', 'ROLE_MANAGER', '经理', '1', '1', '2012-06-24 19:34:16');
INSERT INTO `roles` VALUES ('8', 'SKMBW', 'SUPER_ADMIN', '1', '1', '2012-06-24 19:34:19');
INSERT INTO `roles` VALUES ('10', 'ROLE_B', '毕子利', '1', '1', '2012-09-08 17:25:43');
INSERT INTO `roles` VALUES ('11', 'test1', 'test', '1', '1', '2014-03-20 09:38:44');
INSERT INTO `roles` VALUES ('16', 'ROLE_test1', '测试角色1', '1', '1', null);
INSERT INTO `roles` VALUES ('18', 'ROLE_USER', '用户', '1', '1', null);
INSERT INTO `roles` VALUES ('19', 'ROLE_test2', '测试角色2', '0', '1', null);

-- ----------------------------
-- Table structure for `role_auth`
-- ----------------------------
DROP TABLE IF EXISTS `role_auth`;
CREATE TABLE `role_auth` (
  `auth_id` int(30) NOT NULL,
  `role_id` int(30) NOT NULL,
  `auth_name` varchar(100) DEFAULT NULL,
  `auth_desc` varchar(150) DEFAULT NULL,
  `flag` int(10) DEFAULT NULL,
  `description` char(100) DEFAULT NULL,
  `id` int(30) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY ` index_role_id` (`role_id`) USING BTREE,
  KEY `Index_3` (`auth_id`),
  CONSTRAINT `FK_role_auth_1` FOREIGN KEY (`role_id`) REFERENCES `roles` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COMMENT='角色权限关联';

-- ----------------------------
-- Records of role_auth
-- ----------------------------
INSERT INTO `role_auth` VALUES ('1', '3', 'ACCOUNT', '会计', null, null, '2');
INSERT INTO `role_auth` VALUES ('3', '4', '查询会计凭证', '查询会计凭证', null, null, '4');
INSERT INTO `role_auth` VALUES ('3', '6', 'MANAGER', '经理', null, null, '5');
INSERT INTO `role_auth` VALUES ('4', '6', 'DOCUMENT_INPUT', '录入会计凭证', null, null, '6');
INSERT INTO `role_auth` VALUES ('5', '4', 'QUERY_REPORT', '查询报表', null, null, '7');
INSERT INTO `role_auth` VALUES ('2', '16', null, null, null, null, '14');
INSERT INTO `role_auth` VALUES ('3', '16', null, null, null, null, '15');
INSERT INTO `role_auth` VALUES ('4', '16', null, null, null, null, '16');
INSERT INTO `role_auth` VALUES ('1', '18', null, null, null, null, '19');
INSERT INTO `role_auth` VALUES ('2', '18', null, null, null, null, '20');
INSERT INTO `role_auth` VALUES ('2', '19', null, null, null, null, '21');
INSERT INTO `role_auth` VALUES ('3', '19', null, null, null, null, '22');
INSERT INTO `role_auth` VALUES ('22', '1', null, null, null, null, '23');
INSERT INTO `role_auth` VALUES ('28', '1', null, null, null, null, '24');
INSERT INTO `role_auth` VALUES ('10', '1', null, null, null, null, '25');
INSERT INTO `role_auth` VALUES ('2', '1', null, null, null, null, '26');
INSERT INTO `role_auth` VALUES ('18', '1', null, null, null, null, '27');
INSERT INTO `role_auth` VALUES ('26', '1', null, null, null, null, '28');
INSERT INTO `role_auth` VALUES ('13', '1', null, null, null, null, '29');
INSERT INTO `role_auth` VALUES ('24', '1', null, null, null, null, '30');
INSERT INTO `role_auth` VALUES ('21', '1', null, null, null, null, '31');
INSERT INTO `role_auth` VALUES ('7', '1', null, null, null, null, '32');
INSERT INTO `role_auth` VALUES ('5', '1', null, null, null, null, '33');
INSERT INTO `role_auth` VALUES ('16', '1', null, null, null, null, '34');
INSERT INTO `role_auth` VALUES ('11', '1', null, null, null, null, '35');
INSERT INTO `role_auth` VALUES ('20', '1', null, null, null, null, '36');
INSERT INTO `role_auth` VALUES ('4', '1', null, null, null, null, '37');
INSERT INTO `role_auth` VALUES ('8', '1', null, null, null, null, '38');
INSERT INTO `role_auth` VALUES ('23', '1', null, null, null, null, '39');
INSERT INTO `role_auth` VALUES ('15', '1', null, null, null, null, '40');
INSERT INTO `role_auth` VALUES ('3', '1', null, null, null, null, '41');
INSERT INTO `role_auth` VALUES ('9', '1', null, null, null, null, '42');
INSERT INTO `role_auth` VALUES ('14', '1', null, null, null, null, '43');
INSERT INTO `role_auth` VALUES ('1', '1', null, null, null, null, '44');
INSERT INTO `role_auth` VALUES ('19', '1', null, null, null, null, '45');
INSERT INTO `role_auth` VALUES ('17', '1', null, null, null, null, '46');
INSERT INTO `role_auth` VALUES ('6', '1', null, null, null, null, '47');
INSERT INTO `role_auth` VALUES ('12', '1', null, null, null, null, '48');

-- ----------------------------
-- Table structure for `sequences`
-- ----------------------------
DROP TABLE IF EXISTS `sequences`;
CREATE TABLE `sequences` (
  `seq_name` varchar(50) NOT NULL DEFAULT '',
  `seq_value` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`seq_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sequences
-- ----------------------------
INSERT INTO `sequences` VALUES ('ADDR_SEQ', '6');
INSERT INTO `sequences` VALUES ('USER_SEQ', '9');

-- ----------------------------
-- Table structure for `system_keywords`
-- ----------------------------
DROP TABLE IF EXISTS `system_keywords`;
CREATE TABLE `system_keywords` (
  `ID` int(30) NOT NULL AUTO_INCREMENT,
  `KNAME` char(50) DEFAULT NULL,
  `KVALUE` char(100) DEFAULT NULL,
  `KDESC` char(50) DEFAULT NULL,
  `KDVALUE` char(100) DEFAULT NULL,
  `REMARK` char(50) DEFAULT NULL,
  `DESCRIPTION` char(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `INDEX_SYSTEM_KEYWORDS` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统设定';

-- ----------------------------
-- Records of system_keywords
-- ----------------------------

-- ----------------------------
-- Table structure for `user_role`
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `user_id` int(30) NOT NULL,
  `role_name` varchar(100) DEFAULT NULL,
  `flag` int(10) DEFAULT NULL,
  `role_desc` varchar(150) DEFAULT NULL,
  `role_id` int(30) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `fk_emp_user` (`user_id`),
  KEY `Index_3` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8 COMMENT='用户角色关联表';

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('6', '146', null, null, null, '2');
INSERT INTO `user_role` VALUES ('7', '147', null, null, null, '1');
INSERT INTO `user_role` VALUES ('8', '147', null, null, null, '2');
INSERT INTO `user_role` VALUES ('9', '148', null, null, null, '8');
INSERT INTO `user_role` VALUES ('10', '149', null, null, null, '1');
INSERT INTO `user_role` VALUES ('11', '150', null, null, null, '1');
INSERT INTO `user_role` VALUES ('12', '151', null, null, null, '1');
INSERT INTO `user_role` VALUES ('13', '152', null, null, null, '1');
INSERT INTO `user_role` VALUES ('25', '130', null, null, null, '1');
INSERT INTO `user_role` VALUES ('26', '130', null, null, null, '2');
INSERT INTO `user_role` VALUES ('31', '160', null, null, null, '2');
INSERT INTO `user_role` VALUES ('32', '160', null, null, null, '1');
INSERT INTO `user_role` VALUES ('33', '127', null, null, null, '2');
INSERT INTO `user_role` VALUES ('34', '127', null, null, null, '1');
INSERT INTO `user_role` VALUES ('36', '161', null, null, null, '1');
INSERT INTO `user_role` VALUES ('37', '162', null, null, null, '2');
INSERT INTO `user_role` VALUES ('38', '162', null, null, null, '1');
INSERT INTO `user_role` VALUES ('41', '123', null, null, null, '2');
INSERT INTO `user_role` VALUES ('42', '123', null, null, null, '3');
INSERT INTO `user_role` VALUES ('43', '123', null, null, null, '1');
INSERT INTO `user_role` VALUES ('44', '164', null, null, null, '6');
INSERT INTO `user_role` VALUES ('45', '164', null, null, null, '5');
INSERT INTO `user_role` VALUES ('46', '164', null, null, null, '1');
INSERT INTO `user_role` VALUES ('47', '164', null, null, null, '8');
INSERT INTO `user_role` VALUES ('48', '165', null, null, null, '1');
INSERT INTO `user_role` VALUES ('49', '165', null, null, null, '2');
