## Initial Settings (Spring Boot)

```java
// default
$ Artifact: 프로젝트명
$ Type: Gradle
$ Language: Java
$ Packaging: Jar
$ Java Version: 8
$ SDK: 1.8 Oracle OpenJDK version 1.8.0_202

// build.gradle - dependencies
$ Spring Web
$ MySQL Driver
$ H2 Database
$ Spring Data JPA
$ Lombok

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    implementation 'org.springframework.boot:spring-boot-starter-web'
    compileOnly 'org.projectlombok:lombok'
    runtimeOnly 'com.h2database:h2'
    runtimeOnly 'com.mysql:mysql-connector-j'
    annotationProcessor 'org.projectlombok:lombok'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}
```
