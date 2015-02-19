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
		String text="", line;
		try{
			text = line = reader.readLine();	
			while(line!=null){
				line =reader.readLine();
				text +=(line!=null)?("\n"+line):"";
			}
		}catch(Exception e){
			  System.out.println(e.getMessage());
		}
		return text;
	}
	public int getWordCount(){
		return this.text.split("[ \n]").length;
	}
	public int getLineCount(){
		return this.text.split("[\n\r]").length;
	}
	public int getCharCount(){
		return this.text.length();
	}
	public int getByteCount(){
		return this.text.getBytes().length;
	}
	public String getLagestLine(){
		String lines[] =this.text.split("[\n\r]");
		String longestLine=lines[0];
		for (String line:lines){
			longestLine = longestLine.length()<line.length()?line:longestLine;
		}
		return longestLine;		
	}
	public String getShortestLine(){
		String lines[] =this.text.split("[\n\r]");
		String shortestLine=lines[0];
		for (String line:lines){
			shortestLine = line.length()<shortestLine.length()?line:shortestLine;
		}
		return shortestLine;	
	}
	public String toString(String option){
		String outPut = "";
		switch(option){
			case "":
				outPut += this.getLineCount();
				outPut +=" "+this.getWordCount();
				outPut +=" "+this.getCharCount();
				break;
			case "-c":
				outPut+= this.getByteCount();
				break;
			case "-l":
				outPut+= this.getLineCount();
				break;
			case "-w":
				outPut+=this.getWordCount();
				break;
			case "-L":
				String longline =this.getLagestLine();
				outPut += longline.length()+" "+longline;
				break;
			case "-S": 
				String shortLine = this.getShortestLine(); 
				outPut += shortLine.length()+" "+shortLine;
				break;
		}
			return outPut;

	}
	public static void main(String agrs[]){
		try{
			FileInputStream fs = new FileInputStream(new File(agrs[0]));
			WC wcout = new WC(fs);
			System.out.println(wcout.toString(agrs[1])+" "+agrs[0]);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
} 