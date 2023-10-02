public class AgentDemo{
	public static void main(String[] args) {	
    	Agent ag = new Agent(1, "Shyam");
    	ag.setSuccessRate(100);
    	ag.setHeight(100);
    	ag.setWeight(185);
    	
        System.out.println(ag);
        
        Agent ag2 = new Agent(2, "Abthab");
    	ag2.setSuccessRate(100);
    	ag2.setHeight(100);
    	ag2.setWeight(185);
        
    	System.out.println(ag2);
    }
}
