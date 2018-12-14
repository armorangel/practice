package me.khk.qna.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me.khk.qna.vo.BoardVO;

@Repository
public class BoardDao {

	private static final String NAMESPACE = "board.";

	@Autowired
	private SqlSession sqlSession;

	public List<BoardVO> list(HashMap<String, Object> map) {
		return sqlSession.selectList(NAMESPACE + "list", map);
	}

	public int getMaxNum() {
		return sqlSession.selectOne(NAMESPACE + "getMaxNum");
	}

	public int getCount() {
		return sqlSession.selectOne(NAMESPACE + "getCount");
	}

	public int order(HashMap<String, Object> map) {
		return sqlSession.update(NAMESPACE + "order", map);
	}

	public int insert(BoardVO vo) {
		return sqlSession.insert(NAMESPACE + "insert", vo);
	}

	public BoardVO detail(int qnum) {
		return sqlSession.selectOne(NAMESPACE + "detail", qnum);
	}

	public int update(BoardVO vo) {
		return sqlSession.update(NAMESPACE + "update", vo);
	}

	public int delete(int qnum) {
		return sqlSession.delete(NAMESPACE + "delete", qnum);
	}

}
