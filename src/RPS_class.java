
public class RPS_class {
	private String comchoice ="";
	private String pchoice="";
	private int rannum = (int) (Math.random() * 2+1);
	public RPS_class(String c)
	{
		pchoice = c;
		this.computerchoice();
	}
	public String computerchoice()
	{	
		
			
		switch(rannum)
		{ 
		case 0: comchoice="Rock"; break;
		case 1: comchoice="Paper"; break;
		case 2: comchoice="Scissors"; break;
		}
		return comchoice;
	}
	 public String toString()
	 {

	 switch(pchoice)
		 {	
		 	case "Rock":
		 		{
		 			switch(comchoice)
		 			{
		 			
		 			case "Rock" : return "COM chose " + comchoice +" TIE!!!"; 
		 			case "Paper": return "COM chose " + comchoice +" YOU LOST :(";
		 			case "Scissors": return "COM chose " + comchoice + " YOU WIN !! :)";
		 			}
		 		}
		 	case "Paper":
		 		{
		 			switch(comchoice)
		 			{
		 			case "Rock" : return "COM chose " + comchoice +" YOU WIN !! :)";
		 			case "Paper": return "COM chose " + comchoice +" TIE!!";
		 			case "Scissors": return "COM chose " + comchoice + " YOU LOST :(";
		 			}
		 			
		 		}
		 	case "Scissors":
	 		{
	 			switch(comchoice)
	 			{
	 			case "Rock" : return "COM chose " + comchoice +" YOU LOST :(";
	 			case "Paper": return "COM chose " + comchoice +" YOU WIN !! :)";
	 			case "Scissors": return "COM chose " + comchoice + " TIE!!! :P ";
	 			}
	 			
	 		}
	 		
	 		default:	return "Wrong";
		 }
	 

	 }

}
