package in.String;

public class Str12ReplaceAdv {

	public static void main(String[] args) {
		
		String input="Ram and Raja are studying Btech".toLowerCase();
		String[] str=input.split("\\s+");
		String res="";
		for(String s:str) {
			int length=s.length();
			int middle=length/2;
			res+=" "+s.replace(s.charAt(middle), s.charAt(0));
		}System.out.println(res);
	}

}
