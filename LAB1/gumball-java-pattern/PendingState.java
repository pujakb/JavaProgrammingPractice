
/**
 * Write a description of class PendingState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PendingState implements State
{
    GumballMachine gumballMachine;
    public PendingState(GumballMachine gumballMachine)
    {
      this.gumballMachine = gumballMachine;  
    }
    public void insertCoin(int coin){  //this is abstract method    dime=10, nickle=5, quarter=25
        gumballMachine.total_amt+=coin;
       System.out.println("You inserted one more coin=="+coin); 
       if((gumballMachine.total_amt==50 && coin==25 && gumballMachine.scenario==2) || 
          (gumballMachine.total_amt==50 && gumballMachine.scenario==2))
          {          
            gumballMachine.setState(gumballMachine.getHasQuarterState());
          }
       
    }
    public void ejectCoin(){
        System.out.println("Coin returned");
	gumballMachine.setState(gumballMachine.getNoQuarterState());  
    }
    public void turnCrank(){
       if(gumballMachine.total_amt<50){ System.out.println("You have to insert one more coin."); }
       else {
             System.out.println("You turned...");
        }
    }
    public void dispense(){
        
         if(gumballMachine.total_amt<50){ System.out.println("No gumball despense");  }
       else {gumballMachine.setState(gumballMachine.getHasQuarterState());
                System.out.println("Gumball despense...");
        }
    }
}
