public class WC{
	String text;
	public WC(String text){
		this.text =text;
	}
	public int getWordCount(){
		return this.text.split("[ \n\r]").length;
	}
	public int getLineCount(){
		return this.text.split("[\n\r]").length;
	}
	public int getCharCount(){
		return this.text.length();
	}
	public String toString(){
		String outPut = ""+this.getLineCount();
		outPut +=" "+this.getWordCount();
		outPut +=" "+this.getCharCount();
		return outPut;
	}
	public static void main(String agrs[]){
		WC wcout = new WC(agrs[0]);
		System.out.println(wcout.toString());
	}
} 