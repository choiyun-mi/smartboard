package com.anyang.study.respository;

import com.anyang.study.vo.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Integer>{
}
