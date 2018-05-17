public class DrawTriangle{
	public static void main(String[] args){
		String t = "*";
		int n = 5;
		int i = 1;
		while (i <= n){
			String s = t;
			System.out.println(s);
			s = s + t; 
			i = i+1;
		}
	}
}