### 해당 repository 에서 등장하는 코드는 [https://wonit.tistory.com 의 domain-driven-design 카테고리](https://wonit.tistory.com/category/🔬아키텍처/-%20Domain-Driven-Design) 에서 다듬어진 글로 확인할 수 있습니다.

# DDD

이 Repository 는 DDD 관련된 것들을 연구하는 레포지토리 입니다

## keywords

ubiquitous language, ([유비쿼터스 랭귀지](#)),
layered architecture, ([계층형 아키텍처](#)),
entity, ([엔티티](#)),
value object, ([값 객체](#)),
domain service, application service, infrastructure service, ([도메인 서비스, 애플리케이션 서비스, 인프라 서비스](#)),

## index

- jpa-jdbc
- layer
- domain-event

# **research 1.** jpa-jdbc

- jpa 와 jdbc 를 이용해서 간단하게 이것 저것 시도해봅니다.
- `./jpa-jdbc/jdbc/docker-compose.yml` 로 쉽게 database 를 구동할 수 있습니다 

# **research 2.** [layer](https://github.com/my-research/ddd/tree/master/layer)

- DDD 에서 중요하게 생각하는 domain 을 보호하는 layered architecture 에 대해서 연구합니다
- layer (top down)
  - web (presentation)
  - application
  - domain
  - infrastructure

# **research 3.** [domain-event](https://github.com/my-research/ddd/tree/master/domain-event)

- 도메인 이벤트에 대해서 연구합니다

### References

- [https://deviq.com/design-patterns/](https://deviq.com/design-patterns/repository-pattern)
- [spring-data-jdbc implement-caching, spring.io](https://spring.io/blog/2021/10/18/spring-data-jdbc-how-do-i-implement-caching)
