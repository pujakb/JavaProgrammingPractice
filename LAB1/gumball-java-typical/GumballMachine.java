
public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    private int gumball_cost;
    int total_amt;
    int counter;
    int condition;

    public GumballMachine( int size,int gumball_cost,int condition )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.gumball_cost=gumball_cost;
        this.has_quarter = false;
        this.condition=condition;
    }

    public void insertQuarter(int coin)
    {
        if(condition==1)
        {
            if ( coin == 25 )
            this.has_quarter = true ;
            else 
            this.has_quarter = false ;
        }
        else if(condition==2)
         {
            if(coin==25)
            {
                counter++;
                total_amt=total_amt+coin;
                
             if(counter==2 && total_amt==gumball_cost)
               {
                   this.has_quarter = true ;
               } 
            }
        }
        
        else if(condition==3){
                total_amt+=coin;
               if( total_amt==gumball_cost){
                this.has_quarter = true ;
                } 
            }
       
    }
    
    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                this.counter=0;
                this.total_amt=0;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        }        
    }
}
