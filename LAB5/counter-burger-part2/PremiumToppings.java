 

public class PremiumToppings extends Toppings
{
    private String[] options ;
    public PremiumToppings( String d )
    {
        super(d) ;
    }
    // premium topping +3$ if Marinated Tomatoes
    public void setOptions( String[] options )
    {
        this.options = options ;//Marinated Tomatoes
        for (String option  :  options)
        {
            if(option.equals("Marinated Tomatoes"))
            {
                this.price += 3.00;
                
            }
            else
            {
                this.price += 1.00;
            }
        }

    }
    public String getDescription()
    {
        String desc = "" ;
    for ( int i = 0; i<options.length; i++ )
    {
        if (i>0) desc += " + " + options[i] ;
        else desc = options[i] ;
    }
    
        return desc ;
    }
}