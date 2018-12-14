package me.khk.qna.vo;

import java.sql.Date;

public class BoardVO {

	private int qnum;
	private String title;
	private String content;
	private int grpno;
	private int grpord;
	private int depth;
	private Date regdate;

	public BoardVO() {
	}

	public BoardVO(int qnum, String title, String content, int grpno, int grpord, int depth, Date regdate) {
		this.qnum = qnum;
		this.title = title;
		this.content = content;
		this.grpno = grpno;
		this.grpord = grpord;
		this.depth = depth;
		this.regdate = regdate;
	}

	public int getQnum() {
		return qnum;
	}

	public void setQnum(int qnum) {
		this.qnum = qnum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getGrpno() {
		return grpno;
	}

	public void setGrpno(int grpno) {
		this.grpno = grpno;
	}

	public int getGrpord() {
		return grpord;
	}

	public void setGrpord(int grpord) {
		this.grpord = grpord;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

}
