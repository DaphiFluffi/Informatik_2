import java.util.Stack;
import java.lang.Object;
public class PolishNotation {

	public void pleaseWork(String sequence){
		Stack<Double> T = new Stack<Double>();
		for(int i = 0; i < sequence.length(); i++){
			if(sequence.charAt(i)== '+'){
				double a = T.pop();
				double b = T.pop();
				double c = a + b;
			}else{
				T.push(Double.parseDouble(Character.toString(sequence.charAt(i))));
			}
		}
	}

	public static void main(String[] args) {
		PolishNotation p = new PolishNotation();
		String s = "223+*";
		p.pleaseWork(s);
		//System.out.println(d);
	}

}
