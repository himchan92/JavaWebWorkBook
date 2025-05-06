package org.zerock.jdbcex.domain;

import lombok.*;

import java.time.LocalDate;

@Getter //읽기전용이니 getter 만 추가
@Builder // 생성시 패턴
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TodoVO {

    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
}
