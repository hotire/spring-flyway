# spring-flyway
study 

### Getting Started 

- https://www.baeldung.com/database-migrations-with-flyway
- https://github.com/eugenp/tutorials/tree/master/persistence-modules/flyway

### Configuration File

별도의 .conf 파일에 플러그인 구성할 수 있다.

~~~yml
flyway.user=databaseUser
flyway.password=databasePassword
flyway.schemas=schemaName
...
~~~

기본 구성 파일 이름은 flyway.conf이며 기본적으로 다음 위치에서 구성 파일을 로드합니다.

- installDir/conf/flyway.conf
- userhome/flyway.conf
- workingDir/flyway.conf
