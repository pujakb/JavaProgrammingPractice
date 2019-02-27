

public class Main {

    public static void main(String[] args) {

      
        System.out.println("-----------------------------------------");
        
        System.out.println("First Senario Start : cost 25 cent ; Accepts one quarter");
        
           
        GumballMachine gumballMachine = new GumballMachine(5,25,1);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        
        System.out.println("-----------------------------------------");
        
        System.out.println("Second Senario Start : cost = 50 cents ; Accepts two quarters");
        
        gumballMachine = new GumballMachine(5,50,2);
        gumballMachine.insertQuarter( 25 );
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();
        
        System.out.println("-----------------------------------------");
        
        System.out.println("Third Senario Start : cost = 50 cents ; accepts nickels, dimes or quarters");
                
        gumballMachine = new GumballMachine(5,50,3);
        gumballMachine.insertQuarter( 25 );
        gumballMachine.insertQuarter( 10 );
        gumballMachine.insertQuarter( 10 );
        gumballMachine.insertQuarter( 5 );
        gumballMachine.turnCrank();
        
        System.out.println("-----------------------------------------");
        
        
        
        
        
        
		
	}
}
