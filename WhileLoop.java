public class WhileLoop {
public static void main(String args[])
{
	
	int a=1;
	while(a<20)
	{	if (a%2==0)	
		System.out.println("Even numbers "+a);
		a++;
	}
	//-----------------------------------------------------------------------------------
	int b=1;
	while(b<20*2)
	{
		System.out.println("Even numbers "+b*2);
		b++;
	}
	
	//-----------------------------------------------------------------------------------------------------------------
	/*
    while (a<30) {
        if (a%4==0 && a%5!=0) {
            System.out.println("All numbers below 30 which are divisible by 4 but not 5 using while loop "+a);
        }
        a++;
    }
    */
	//-----------------------------------------------------------------------------------------------------------------
    /*
    for(int a=1; a<10; a++)
    {
    	System.out.println("Even numbers "+a*2);
 
    }*/
    //------------------------------------------------------------------------------------------------------------------
	/*for(int a=1; a<30; a++) 
	{
		if(a%4==0 && a%5 !=0)
		{
			System.out.println("Numbers  " +a);
		}
	}*/
	//-------------------------------------------------------------------------------------------------------------------
}

}
