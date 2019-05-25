
public class playerset {
	
public String playerChoice="";
private String comChoice ="";

private int rannum = (int) (Math.random() * 2+1);

	public playerset(String pc)
	{
		playerChoice=pc;
	}
	
	public String computerTurn()
	{
		switch(rannum)
		{ 
		case 0: comChoice="Rock"; break;
		case 1: comChoice="Paper"; break;
		case 2: comChoice="Scissors"; break;
		}
		return comChoice;
	}
	 public String toString()
	 {

	 switch(playerChoice)
		 {	
		 	case "Rock":
		 		{
		 			switch(comChoice)
		 			{
		 			
		 			case "Rock" : return "COM chose " + comChoice +" TIE!!!"; 
		 			case "Paper": return "COM chose " + comChoice +" YOU LOST :(";
		 			case "Scissors": return "COM chose " + comChoice + " YOU WIN !! :)";
		 			}
		 		}
		 	case "Paper":
		 		{
		 			switch(comChoice)
		 			{
		 			case "Rock" : return "COM chose " + comChoice +" YOU WIN !! :)";
		 			case "Paper": return "COM chose " + comChoice +" TIE!!";
		 			case "Scissors": return "COM chose " + comChoice + " YOU LOST :(";
		 			}
		 			
		 		}
		 	case "Scissors":
	 		{
	 			switch(comChoice)
	 			{
	 			case "Rock" : return "COM chose " + comChoice +" YOU LOST :(";
	 			case "Paper": return "COM chose " + comChoice +" YOU WIN !! :)";
	 			case "Scissors": return "COM chose " + comChoice + " TIE!!! :P ";
	 			}
	 			
	 		}
	 		default:	return "Wrong";
		 }
}}
