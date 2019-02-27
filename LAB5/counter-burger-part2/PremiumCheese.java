
/**
 * Write a description of class PremiumCheese here.
 *
 * @author (Puja)
 * @version (a version number or a date)
 */
public class PremiumCheese extends Cheese
{
    
    private String[] options ;
    public PremiumCheese( String d )
    {
        super(d) ;
    }
    // every premium cheese +1.50, extra cheese +1.50
    public void setOptions( String[] options )
    {
        this.options = options ;
        if ( options.length >0)
        this.price += (options.length) * 1.50 ;
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
