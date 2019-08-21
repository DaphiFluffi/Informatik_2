public class TestChar {

	/*public static void addStringNums(String b) {

		int sum = 0;
		for (int i = 0; i < b.length(); i++) {
			sum = sum + (int)(b.charAt(i)) - 96;
		}
		System.out.println(sum);
	}*/

	public static void arrayStringTest(String[] c) {
		int sum = 0;
		int a = 0;
		char test;
		for(int i = 0; i < c.length; i++){
			//int sum = 0;
			//System.out.println("name nr." + i + ":" + c[i]); //läuft
			for (int j = 0; j < c[i].length(); j++){
				System.out.println("length name nr." + j + ":" + c[i].length());
				test = c[i].charAt(j);
				System.out.println(test);
				 sum = sum +(int)(c[i].charAt(j))-64;
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {

		String s = "ang";
		String[] strings = {"ANNNA", "BELI", "LUISEP", "MARRRIJ", "NEL", "AAAAAAAA"};
		//int i = (int)(s.charAt(0)) - 96;
		//System.out.println(i);
		arrayStringTest(strings);
		//addStringNums(s);
	}
}
