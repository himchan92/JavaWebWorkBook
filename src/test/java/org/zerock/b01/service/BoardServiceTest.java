package org.zerock.b01.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.b01.dto.BoardDTO;

@Log4j2
@SpringBootTest
class BoardServiceTest {

    @Autowired
    private BoardService boardService;

    @Test
    public void testRegister() {
        log.info(boardService.getClass().getName());

        BoardDTO boardDTO = BoardDTO.builder()
            .title("Sample Title...")
            .content("Sample Content...")
            .writer("user00")
            .build();

        Long bno = boardService.register(boardDTO);

        log.info("bno: " + bno);
    }

    @Test
    public void testModify() {
        //변경필요한 데이터만 대상
        BoardDTO boardDTO = BoardDTO.builder()
            .bno(101L)
            .title("updated...101")
            .content("update content 101...")
            .build();

        boardService.modify(boardDTO);
    }
}