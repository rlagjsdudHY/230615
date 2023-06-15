package com.exam.basic.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.exam.basic.dto.BoardDto;

@Mapper
public interface BoardDao {
	
	//목록보기
	public List<BoardDto> boardList();
	
	//데이터 저장
	public void boardInsert(Map<String,String> map);

	//글삭제
	public void boardDel(String num);
	
	//글 상세보기
	public BoardDto boardResult(int num);
	
	//글 수정하기
	public void boardModify(Map<String, String>map);
}
