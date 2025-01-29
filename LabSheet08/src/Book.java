
public class Book {
	private String title;
	private Author auther;
	private int page;
	
	Book() {
		//this(null, null, 0);
		this.title = null;
		this.auther = null;
		this.page = 0;
	}
	
	Book(String title, Author auther, int page) {
		this.title = title;
		this.auther = auther;
		this.page = page;
	}
	
	Book(String title, Author auther) {
		/*
		this.title = title;
		this.auther = auther;
		this.page = 0;
		*/
		this(title,auther,0);
	}
	
	public String getTitle() {
		return title;
	}
	
	public Author getAuthor() {
		return auther;
	}
	
	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public String toString() {
		return getTitle() + " has " + getPage() + " page write by "
				+ getAuthor();
	}
	
	
	
	
	
}
