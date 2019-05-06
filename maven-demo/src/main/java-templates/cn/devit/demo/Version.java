package cn.devit.demo;

import java.io.IOException;
import java.util.Properties;
/**
 * 程序在编译后自动生成版本号和build number。
 * @author lxb
 */
public final class Version {

    /**
     * 参见文档：http://maven.apache.org/pom.html#Maven_Coordinates
     * 
     * @return groupId:artifactId:version
     */
    public static String getMavenCoordinates() {
        return "${project.groupId}:${project.artifactId}:${project.version}";
    }

    /**
     * buildTag必须从build工具中传入，比如 mvn package -DbuildTag=jenkins-1
     * @return buildTag 
     */
    public static String getBuildTag() {
        return "${buildTag}";
    }

}
