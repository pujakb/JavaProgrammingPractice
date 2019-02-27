
public class Bun extends LeafDecorator
{
    private String[] options ;
    public Bun( String d )
    {
        super(d) ;
    }
    //selected buns 1:00$ or 0.50$
    public void setOptions( String[] option2 )
    {
        this.options = option2 ;
        //System.out.print(this.price);
    for(String op  : options)
    {
            if ( op.equals("Gluten-Free Bun") || op.equals("Hawaiian Bun") )
            {
                this.price += 1.00 ;
               // System.out.println("bun price added"+this.price);
            }
            else         
                if ( op.equals("Pretzel Bun"))
                {
                    this.price += 0.50 ;
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
