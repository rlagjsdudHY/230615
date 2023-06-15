package com.exam.basic;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.basic.dao.BoardDao;
import com.exam.basic.svc.BoardInter;

@Controller
public class ScoreController {
	
	@Autowired
	private BoardInter boardInter; 
	
	
	@RequestMapping("/list") // 리스트페이지
	public String mtdList(Model model) {
	
		model.addAttribute("boardList", boardInter.boardList());
		return "/list";
	}
	
	@RequestMapping("/inputPage") //정보입력페이지
	public String mtdInputPage(HttpServletRequest req ,Model model) {
		
		
		return "/inputPage";
	}
	@RequestMapping("/input") //정보입력처리
	public String mtdInput(HttpServletRequest req ,Model model) {
		
		try {
			String examCode = req.getParameter("examCode");
			String userName = req.getParameter("userName");
			String phone = req.getParameter("phone");
			String histore = req.getParameter("histore");
			String korean = req.getParameter("korean");
			
			int a = Integer.parseInt(histore);
			int b = Integer.parseInt(korean);
			int avga = (a+b)/2;
			String avg = Integer.toString(avga);
			
			Map<String,String> map = new HashMap<>();
			map.put("item1", examCode);
			map.put("item2", userName);
			map.put("item3", phone);
			map.put("item4", histore);
			map.put("item5", korean);
			map.put("item6", avg);
			
			model.addAttribute(req);
			
			boardInter.boardInsert(map);
			
		} catch (Exception e) {
			e.getMessage();
		}
		return "redirect:list";
		
	}
	
	//삭제하기
	@RequestMapping("/del")
	public String mtdDel(HttpServletRequest req, Model model) {
		try {
			String num = req.getParameter("num");
			boardInter.boardDel(num);
		} catch (Exception e) {
			e.getMessage();
		}	
		
		
		return "redirect:list";
	}
	
	//글상세보기
	@RequestMapping("/result")
	public String mtdResult(Model model, HttpServletRequest req) {
		
		int num = Integer.parseInt(req.getParameter("num"));
		model.addAttribute("resultList",boardInter.boardResult(num));
		
		return "/result";
	}
	
	//수정 페이지 진입
	@RequestMapping("/modifyPage")
	public String mtdModify(HttpServletRequest req, Model model) {
	
		int num = Integer.parseInt(req.getParameter("num"));
		model.addAttribute("resultList",boardInter.boardResult(num));
		return "/modifyPage";
	}
	//수정하기 처리
	@RequestMapping("/modify")
	public String mtdModifyProc(Model model,HttpServletRequest req) {
		try {
			String examCode = req.getParameter("examCode");
			String userName = req.getParameter("userName");
			String phone = req.getParameter("phone");
			String histore = req.getParameter("histore");
			String korean = req.getParameter("korean");
			String num = req.getParameter("num");
			
			int a = Integer.parseInt(histore);
			int b = Integer.parseInt(korean);
			int avga = (a+b)/2;
			String avg = Integer.toString(avga);
			
			Map<String,String> map = new HashMap<>();
			map.put("item1", examCode);
			map.put("item2", userName);
			map.put("item3", phone);
			map.put("item4", histore);
			map.put("item5", korean);
			map.put("item6", avg);
			map.put("item7", num);
			
			model.addAttribute(req);
			
			boardInter.boardModify(map);
			
		} catch (Exception e) {
			e.getMessage();
		}
		return "redirect:list";
	}
	

}
