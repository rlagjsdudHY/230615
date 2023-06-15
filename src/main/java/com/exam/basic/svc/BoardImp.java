package com.exam.basic.svc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.basic.dao.BoardDao;
import com.exam.basic.dto.BoardDto;

@Service
public class BoardImp implements BoardInter {
	
	@Autowired
	private BoardDao boardDao;
	
	@Override //목록보기
	public List<BoardDto> boardList(){
		return boardDao.boardList();
	}
	
	@Override //데이터저장
	public void boardInsert(Map<String, String> map) {
		boardDao.boardInsert(map);
	}
	
	@Override //글삭제
	public void boardDel(String num) {
		boardDao.boardDel(num);
	}
	
	@Override //글상세보기
	public BoardDto boardResult(int num) {
		return boardDao.boardResult(num);
	}
	
	@Override //글수정하기
	public void boardModify(Map<String,String> map) {
		boardDao.boardModify(map);
	}
	

}
