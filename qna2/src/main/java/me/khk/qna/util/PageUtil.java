package me.khk.qna.util;

public class PageUtil {

	private int countRow = 5;
	private int countPage = 5;

	private int startRow;
	private int endRow;

	private int startPage;
	private int endPage;

	private int maxPage;

	public PageUtil(int pageNum, int totRow) {

		this.startRow = (pageNum - 1) * countRow + 1;
		this.endRow = startRow + (countRow - 1);

		this.maxPage = (int) Math.ceil(totRow / (double) countPage);
		this.startPage = ((pageNum - 1) / countPage * countPage) + 1;
		this.endPage = startPage + (countPage - 1);

		if (this.endPage > this.maxPage) {
			this.endPage = this.maxPage;
		}
	}

	public int getMaxPage() {
		return maxPage;
	}

	public int getStartRow() {
		return startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {
		return endPage;
	}

}
