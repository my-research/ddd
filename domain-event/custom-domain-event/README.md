# Domain Event

- Event
  - 시스템 내부에서 과거에 발생한 어떠한 사건
  - 그러므로 이벤트는 과거 시제를 사용함
- Domain Event
  - 특정 도메인에서 어떠한 사건에 의해서 발생된 이벤트
  - 도메인 이벤트는 IoC Container 또는 다른 메서드를 기반으로 메모리 내 중재자로 구현될 수 있는 도메인 이벤트 디스패처에 푸시되는 메시지
- 이벤트가 발행되고 끝이 아님
  - 이벤트가 발생되면 이벤트에 관심있어하는 누군가가 해당 이벤트를 핸들링함
  - Event Handler 가 해당 이벤트에 대해서 반응함
- 
# 동기

- 도메인의 특정 행위에 대해서 발생해야 하는 부가 사항들이 transactional script 방식으로 구성된다면 어떤 문맥에 강하게 결합될 수 있다.
  - 예를 들어서 멤버십 해지 이벤트가 존재한다
    - 해지 -> 결제 취소 -> 환불
  - 해당 플로우가 member 도메인에 위치할 것이다.
  - 이것보다 해지에 따른 이벤트에 관심있어라 하는 각각의 도메인에서 해당 이벤트를 바라보고 있으면 느슨하게 유지될 수 있다.

# 장점

- 불필요한 의존이 사라질 수 있음
- 다른 로직이 섞이는 것을 방지할 수 있음
  - 도메인 로직에서 이벤트만 발행하고 각각 이벤트를 listening 한다면 새로운 기능이 추가되더라도 도메인 로직에 영향이 없이 기능 확장이 가능함
  - 결국 OCP 를 만족하는 설계가 가능함

# 목적

- 목적 1. trigger
  - domain 의 상태가 바뀌었으니 다른 후처리를 위해서 일으키는 목적
  - 일종의 post processor
- 목적 2. synchronize
  - 서로 다른 시스템 간의 데이터를 동기화 하는 목적