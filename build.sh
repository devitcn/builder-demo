#!/bin/bash


case $1 in
copy)
    for folder in {ant-demo,gradle-demo,ivy-demo}
    do
      cp -r maven-demo/src/main/java $folder/src/main/
      cp -r maven-demo/src/test/java $folder/src/test/
      cp LICENSE $folder/src/test/
    done
    ;;
*)
    set -e
    mvn clean compile -f maven-demo
    mvn clean compile -f maven-war
    ant clean compile -f ant-demo/build.xml
    ant clean compile -f ivy-demo/build.xml
    gradle clean build -b gradle-demo/build.gradle
esac
