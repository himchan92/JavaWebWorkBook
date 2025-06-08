package org.zerock.b01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.b01.domain.Board;

//< 엔티티명, 엔티티 ID 컬럼자료형 >
// JPA CRUD + Paging 지원
public interface BoardRepository extends JpaRepository<Board, Long> {

}
