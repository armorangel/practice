package me.khk.qna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import me.khk.qna.service.BoardService;

@Controller
public class DetailController {

	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(int qnum, Model model) {
		model.addAttribute("vo", boardService.detail(qnum));
		return "detail";
	}

}
