public class DrawTriangle{
	public static void main(String[] args){
		DrawTriangle dt = new DrawTriangle();
		dt.drawTriangle("*", 10);
	}

	public void drawTriangle(String mark, int line){
		String t = mark;
		int i = 1;
		while (i <= line) {
			System.out.println(t);
			t = t + mark; 
			i = i+1;
		}
	}
}