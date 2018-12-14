package me.khk.qna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import me.khk.qna.service.BoardService;
import me.khk.qna.vo.BoardVO;

@Controller
public class UpdateController {

	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateForm(int qnum, Model model) {
		model.addAttribute("vo", boardService.detail(qnum));
		return "update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateForm(BoardVO vo) {
		boardService.update(vo);
		return "redirect:/detail?qnum=" + vo.getQnum();
	}
}
