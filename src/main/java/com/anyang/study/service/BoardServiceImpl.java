package com.anyang.study.service;

import com.anyang.study.vo.Board;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService{
    @Autowired
    Board board;

    public BoardServiceImpl() {
    }
}
