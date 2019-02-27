 

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "\tOrder" ) ;
        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        order.addChild(new Leaf("The Purist", 8.00 ));
        
        BurgerDecorator burgerComponent3 = new Burger("Beef","1/3lb","On a bun");
        burgerComponent3 = new Cheese(burgerComponent3,new String[] {"Dansh Blue Cheese","Horseadish Cheddar"});
        burgerComponent3 = new Toppings(burgerComponent3, new String[] {"Bermuda Red Onion","Black Olives","Carrot Strings","Coleslaw"});
        burgerComponent3 = new Premium(burgerComponent3, new String [] {"Applewood Smoked Bacon"});
        burgerComponent3 = new Sauce(burgerComponent3, new String []{"Apricot Sauce"});
        order.addChild(new CustomBurger(burgerComponent3));
        return order ;
       
    }

}


