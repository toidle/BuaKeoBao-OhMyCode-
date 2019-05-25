import java.util.*;

public class RockPaperScissors {
	
	public static void main(String[] args)
	{
		String choose = "";
		System.out.println("What will you choose?");
		Scanner kb = new Scanner (System.in);
		choose = kb.next();
		RPS_class test = new RPS_class(choose);
		
		System.out.println(test.toString());
	}
}
