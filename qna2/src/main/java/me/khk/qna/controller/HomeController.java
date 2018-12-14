package me.khk.qna.controller;

import java.util.HashMap;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import me.khk.qna.service.BoardService;
import me.khk.qna.util.PageUtil;

@Controller
public class HomeController {

	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(@RequestParam(defaultValue = "1", name = "pageNum") int pageNum, Model model) {

		HashMap<String, Object> map = new HashMap<String, Object>();
		PageUtil util = new PageUtil(pageNum, boardService.getCount());
		map.put("startRow", util.getStartRow());
		map.put("endRow", util.getEndRow());
		model.addAttribute("board", boardService.list(map));
		map.put("startPage", util.getStartPage());
		map.put("endPage", util.getEndPage());
		model.addAttribute("util", map);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", util.getMaxPage());
		return "home";
		
	}

}
