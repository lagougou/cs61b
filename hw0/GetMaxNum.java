public class GetMaxNum{

	public static int max(int[] m){
		int answer = m[0];
		int i = 0;
		while ( i< m.length){
			if(answer < m[i]){
				answer = m[i];
			}
			i = i + 1;
		}
		return answer;
	}

	public static void main(String[] args) {
		GetMaxNum g = new GetMaxNum();
		int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
		System.out.println(g.max(numbers));
	}
}