package homework19;

public class Select {
	private int num;
	private String ans;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Select [num=" + num + ", ans=" + ans + "]";
	}
	public Select(int num, String ans) {
		super();
		this.num = num;
		this.ans = ans;
	}
	public Select() {
		super();
	}
	
}
