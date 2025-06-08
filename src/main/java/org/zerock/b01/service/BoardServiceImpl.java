package org.zerock.b01.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.b01.domain.Board;
import org.zerock.b01.dto.BoardDTO;
import org.zerock.b01.repository.BoardRepository;

@Log4j2
@Service
@RequiredArgsConstructor
@Transactional //모든 변경작업은 한트랜젝션에서 이뤄줘야하므로 그걸위한 셋팅
public class BoardServiceImpl implements BoardService {

    private final ModelMapper modelMapper;

    private final BoardRepository boardRepository;

    @Override
    public Long register(BoardDTO boardDTO) {
        Board board = modelMapper.map(boardDTO, Board.class);

        Long bno = boardRepository.save(board).getBno();

        return bno;
    }
}
