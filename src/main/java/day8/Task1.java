package day8;

public class Task1 {
	public static void main(String[] args) {
		System.out.println(stringConcat());
		System.out.println(stringBuilder());
	}
	private static long stringBuilder() {
		StringBuilder sb = new StringBuilder();
		long start = System.nanoTime();
		for (int i = 0; i <= 6621; i++) {
			sb.append(i + " ");
		}
		System.out.println(sb);
		return ((System.nanoTime() - start)/1_000_000);
	}
	public static long stringConcat() {

		String result = "";
		long start = System.nanoTime();
		for (int i = 0; i <= 6621; i++) {
			result = result + i + " ";
		}
		System.out.println(result);
		return ((System.nanoTime() - start)/1_000_000);
	}
}