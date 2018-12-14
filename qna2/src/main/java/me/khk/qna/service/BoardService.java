package me.khk.qna.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.khk.qna.dao.BoardDao;
import me.khk.qna.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardDao boardDao;

	public List<BoardVO> list(HashMap<String, Object> map) {
		return boardDao.list(map);
	}

	public int getMaxNum() {
		return boardDao.getMaxNum();
	}

	public int getCount() {
		return boardDao.getCount();
	}

	public int order(HashMap<String, Object> map) {
		return boardDao.order(map);
	}

	public int insert(BoardVO vo) {
		return boardDao.insert(vo);
	}

	public BoardVO detail(int qnum) {
		return boardDao.detail(qnum);
	}

	public int update(BoardVO vo) {
		return boardDao.update(vo);
	}

	public int delete(int qnum) {
		return boardDao.delete(qnum);
	}
}
