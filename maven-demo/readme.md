# Use Maven to Build jar


## How to change compiler


    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-compiler-plugin</artifactId>
      <version>3.8.1</version>
      <configuration>
        <compilerId>eclipse</compilerId>
      </configuration>
        <dependencies>
          <dependency>
            <groupId>org.codehaus.plexus</groupId>
            <artifactId>plexus-compiler-eclipse</artifactId>
            <version>2.8.3</version>
          </dependency>
      </dependencies>
    </plugin>