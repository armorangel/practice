package me.khk.qna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import me.khk.qna.service.BoardService;

@Controller
public class DeleteController {

	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteBoard(int qnum) {
		boardService.delete(qnum);
		return "redirect:/";
	}
}
