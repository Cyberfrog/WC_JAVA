import java.io.*;
public class WC{
	String text;
	public WC(String text){
		this.text =text;
	}
	public WC(FileInputStream fis){
		this.text = readFile(fis);
	}
	private static String readFile(FileInputStream fis){
		BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
		String text ="",line;
		try{
			while((line=reader.readLine())!=null){
				text +=line;
			}
		}catch(Exception e){
			System.out.println(e);
		}
		return text;
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
		try{
			FileInputStream fs = new FileInputStream(new File(agrs[0]));
			WC wcout = new WC(fs);
			System.out.println(wcout.toString());
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
} 