# 演示不同的打包工具功能

## 目录


1. ANT
2. MAVEN
3. GRADLE
4. Builder

## 功能展现

演示分为4个功能，并使用统一的命令（MVN风格）：

0. clean 清理，
1. compile，编译，依赖管理
2. test，执行单元测试 
3. package，打包
4. deploy: 发布包到远端库

此外，考虑到在实际应用中的不同场景：

1. 多模块编译，一个proj有多个子模块编译
2. 条件发布，生成不同的分发包，包中的配置文件不同
3. 嵌入版本识别，自动将源码版本ID加入到发布包中### 扩展


### ant-demo

http://ant.apache.org/

    ant compile 编译代码
    ant test 执行测试
    ant package 编译，测试，打包，输出tools.jar
    
条件打包

可以改打包中的配置文件

    ant package -debug -Dprofile=production 
    
### ivy-demo

http://ant.apache.org/ivy/

示ant和ivy依赖管理工具协作，用法和ant-demo是一样的，区别在于使用ivy来管理依赖，而不提交jar在源码中。

### maven-demo

http://maven.apache.org/

演示maven声明依赖，条件打包

    mvn compile
    mvn test
    mvn package

使用生产配置来打包：

    mvn package -P prod

### maven-groovy

 如何在maven中编译groovy和java
 
### template

 提供两个配置模板
 
- settings.xml 配置阿里云镜像
- pom.xml 配置servlet2.5时代的包依赖，用于旧工程的迁移

