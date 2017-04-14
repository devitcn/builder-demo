项目代号，项目名称
======

描述

## 目录

* src/main/java 项目生产代码
* src/main/resources 配置文件
* src/test/java 测试、演示、调试代码，不上生产
* src/test/resources 测试用配置文件
* target 编译工作目录，不提交到版本库
* lib/ 依赖包
* lib/compile 编译依赖
* lib/provided 中间件依赖，由线上环境提供，不必打包，打包反而会出错
* lib/test 测试依赖


## 其他的内容