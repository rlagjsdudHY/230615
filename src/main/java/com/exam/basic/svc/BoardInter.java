package com.exam.basic.svc;

import java.util.List;
import java.util.Map;

import com.exam.basic.dto.BoardDto;

public interface BoardInter {
	
	//목록보기
	public List<BoardDto> boardList();

	//데이터저장
	public void boardInsert(Map<String,String>map);
	
	//글삭제
	public void boardDel(String num);
	
	//글자세히보기
	public BoardDto boardResult(int num);
	
	//글 수정하기
	public void boardModify(Map<String,String>map);
	
}
