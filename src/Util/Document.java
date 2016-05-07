package Util;

public class Document {

	private String name;
	private String content;

	public Document(String name) {
		this.name = name;
		this.content = new String();
	}

	public void setContent(String s) {
		content = s;
	}

	public String getContent() {
		return content;
	}

	public String getName() {
		return name;
	}
}
