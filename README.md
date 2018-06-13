## 项目说明
本项目另有Oracle和MySQL两个分支，演示如何利用`同一个db.changelog.xml`变更文件初始化Oracle和MySQL数据库。使用时请切换到Oracle或者MySQL分支并修改application.yml中数据库配置。
> 为了兼容Oracle11g不支持自增主键，从而需要单独创建序列，具体写法请参考db.changelog.xml和实体类TableLock

## 演示场景说明
### 1. Oracle
在dlsys表空间下创建a_1表（表示系统配置表），在dlmis表空间创建a_2表（表示业务表）
### 2. MySQL
在默认表空间下创建a_1表（表示系统配置表）和a_2表（表示业务表）
