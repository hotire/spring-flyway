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


### SQL Naming 

- Prefix
  - V, U, R 중 하나를 선택
  - V(Version) : 버전 마이그레이션
  - U(Undo) : 실행 취소
  - R(Repeatable) : 반복 가능한 마이그레이션
    - 버전에 상관없이 매번 실행되는 스크립트로 버전 명시가 필요 없다.
    - 예시로 테스트를 위해 매번 더미데이터를 넣을 때 사용한다.
- Separator : 구분자로 _ 가 2개인 것을 주의해야 한다.
- Description : 실질적 파일 명으로 밑줄이나 공백으로 단어를 구분한다.
- Suffix : 접미사로 보통 .sql을 사용한다.