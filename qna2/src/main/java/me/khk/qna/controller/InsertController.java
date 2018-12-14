package me.khk.qna.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import me.khk.qna.service.BoardService;
import me.khk.qna.vo.BoardVO;

@Controller
public class InsertController {

	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insertForm(Model model, @RequestParam(defaultValue = "0", name = "grpno") int grpno,
			@RequestParam(defaultValue = "0", name = "grpord") int grpord,
			@RequestParam(defaultValue = "0", name = "depth") int depth) {
		model.addAttribute("grpno", grpno);
		model.addAttribute("grpord", grpord);
		model.addAttribute("depth", depth);
		return "insert";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(BoardVO vo) {
		int qnum = boardService.getMaxNum() + 1;
		int grpno = vo.getGrpno();
		int grpord = vo.getGrpord();
		int depth = vo.getDepth();
		if (vo.getGrpno() > 0) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("grpno", grpno);
			map.put("depth", depth);
			boardService.order(map);
			grpord = grpord + 1;
			depth = depth + 1;
		} else {
			grpno = qnum;
		}
		vo.setQnum(qnum);
		vo.setGrpno(grpno);
		vo.setGrpord(grpord);
		vo.setDepth(depth);
		boardService.insert(vo);
		return "redirect:/";
	}
}
