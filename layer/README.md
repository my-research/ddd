# layer 분리하기

<img width="843" alt="image" src="https://user-images.githubusercontent.com/48385288/184578296-6b22cfe3-19b3-47ee-8c8e-56d8622f9bfe.png">

### DIP 를 이용하여 domain 과 persistence entity 를 분리한다

### 목차

- 연구 주제
- 실수/착각 했던 것
- 느낀점

# 연구 주제

- DIP 를 이용하여 domain 과 persistence entity 를 분리한다
  - domain
  - infrastructure
    - jpa-persistence
    - jdbc-persistence
  - application
  - web
- order domain 을 두가지 방법으로 저장한다
  - jpa 
  - jdbc

# 느낀점

- 분리하다 보니 왜 layer 를 분리하지? 라는 생각이 든다
  - 분리해야 하는 명확한 이유가 무엇일까?
- 트레이드 오프가 분명해 보인다
  - **pros**
    - domain 을 보호할 수 있다
    - domain 에 집중할 수 있다
  - **cons**
    - 복잡하다
      - domainEvent 도 구현해야 한다
    - domain 과 entity 간의 변경에 대해서 문제가 드러나지 않는다
      - domain 에 필드가 추가되면 entity 에서는 모름
      - 휴먼에러가 발생할 가능성이 많다
    - layer 간 데이터 변환이 너무 번거롭다
      - layer 간의 dto 가 많아지는 듯한 느낌?
    - 성능 이슈가 존재한다
      - lazy loading 은 어떻게 해결하지?
