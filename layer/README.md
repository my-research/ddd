# layer 분리하기

### 목차

- 연구 주제
- 실수/착각 했던 것
- 느낀점

# 연구 주제

- layer 를 분리한다
  - domain
  - infrastructure
    - jpa-persistence
    - jdbc-persistence
  - application
  - web
  
- order domain 을 두가지 방법으로 저장한다
  - jpa 
  - jdbc

# 실수/착각 했던 것

- layer 간 의존 관계를 잘못 알았다
  - 처음엔 application 이 infrastructure 를 알게 했다
    - `application -> infrastructure -> domain`
    - 이렇게 되면 application 이 infra 구현체와 직접 연관이 생겨버림
    - 그럼 infra 를 jpa 로 구현했냐, jdbc 로 구현했냐에 따라 의존이 달라짐
  - 하지만 application 과 infrastructure 가 domain 을 알게 해야 한다
    - `application -> domain <- infrastructure`

# 느낀점

- 분리하다 보니 왜 layer 를 분리하지? 라는 생각이 든다
  - 분리해야 하는 명확한 이유가 무엇일까?
- 트레이드 오프가 분명해 보인다
  - pros
    - domain 을 보호할 수 있다
    - domain 에 집중할 수 있다
  - cons
    - 복잡하다
- layer 간 데이터 변환이 너무 번거롭다
  - layer 간의 dto 가 많아지는 듯한 느낌?