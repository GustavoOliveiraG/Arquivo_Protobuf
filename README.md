# **Serializar e Desserializar arquivo PROTO**

**Dependências**:

```
<dependency>
    <groupId>com.google.protobuf</groupId>
    <artifactId>protobuf-java</artifactId>
    <version>3.19.3</version>
</dependency>
```

 

**Plugins**:

```
<plugins>
    <plugin>
        <groupId>com.github.os72</groupId>
        <artifactId>protoc-jar-maven-plugin</artifactId>
        <version>3.11.4</version>
        <executions>
            <execution>
                <id>protoc.main</id>
                <phase>generate-sources</phase>
                <goals>
                    <goal>run</goal>
                </goals>
                <configuration>
                    <includeStdTypes>true</includeStdTypes>
                    <includeDirectories>
                        <include>src/main/proto</include>
                    </includeDirectories>
                    <inputDirectories>
                        <include>src/main/proto</include>
                    </inputDirectories>
                </configuration>
            </execution>
        </executions>
    </plugin>
</plugins>
```



**Comandos**:

```
 **clean protoc-jar:run
 
 **mvn clean install
```

