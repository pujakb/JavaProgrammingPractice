

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin) {
        gumballMachine.total_amt+=coin;
        System.out.println("You inserted a coin=="+coin);
        if(gumballMachine.scenario==1 && coin==25){gumballMachine.setState(gumballMachine.getHasQuarterState());
         }else if((gumballMachine.scenario==2 || gumballMachine.scenario==3)){
        gumballMachine.setState(gumballMachine.getPendingState());}
    }
 
    public void ejectCoin() {
        System.out.println("You haven't inserted a coin");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no coin");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for coin";
    }
}
