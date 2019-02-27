 

public class BuildOrder {
    public static Component getOrder()
    {
        
        Component order = new Composite( "Order" ) ;
       
        //Burger 1
        //1st Object of custom burger
        CustomBurger customBurger;
        
        customBurger  = new CustomBurger( "Build Your Own Burger" ) ;
        
            // base price for burger
            Burger burger1 = new Burger( "Burger Options" ) ;
            String[] bo ={ "Organic Bison*", "1/2lb.", "On A Bun" } ;
            burger1.setOptions( bo ) ;
            
            // 1 cheese free, extra cheese +1.00
            Cheese cheese = new Cheese("Cheese Options");
            String[] cheeseOptions = {"Yellow American", "Spicy Jalapeno Jack"};
            cheese.setOptions(cheeseOptions);
            cheese.wrapDecorator(burger1);
            
            // 1 premiumcheese $1.50 extra cheese +1.50
            PremiumCheese pc = new PremiumCheese("PremiumCheese options");
            String[] PremiumCheeseOptions = {"Danish Blue Cheese"};
            pc.setOptions(PremiumCheeseOptions);
            pc.wrapDecorator(cheese);
            
            // Unlimited Toppings
            Toppings toppings = new Toppings("Topping Options");
            String[] toppingsOptions = {"Dill Pickle Chips", "Black Olives", "Spicy Pickles"};
            toppings.setOptions(toppingsOptions);
            toppings.wrapDecorator(pc);
            
            //Premium Toppings  = $1-$3
            PremiumToppings pt = new PremiumToppings("PremiumTopping Options");
            String[] premiumToppingOptions = {"Marinated Tomatoes"};
            pt.setOptions(premiumToppingOptions);
            pt.wrapDecorator(toppings);
            
            //anyside= $3
            Side sides = new Side("Side Options");
            String[] sideOption = {"Shoestring Fries"};
            sides.setOptions(sideOption);
            sides.wrapDecorator(pt);
            
            // 1 sauce free, extra +.75
            Sauce sauces = new Sauce("Sauces Options");
            String[] sauceOptions = {"Mayonnaise","Tahi Peanut Sause"};
            sauces.setOptions(sauceOptions);
            sauces.wrapDecorator(sides);
            
            //Bun Ciabatta = $0
             Bun buns = new Bun("Bun Options");
            String[] bunOptions = {"Ciabatta(Vegan)"};
            buns.setOptions(bunOptions);
            buns.wrapDecorator(sauces);
                        
           //set burger items
            customBurger.setDecorator( sauces ) ;
            customBurger.addChild( burger1 ) ;
            customBurger.addChild( cheese ) ;
            customBurger.addChild( pc ) ;
            customBurger.addChild( sauces ) ;
            customBurger.addChild( toppings ) ;
            customBurger.addChild( pt ) ;
            customBurger.addChild( buns );
            customBurger.addChild( sides );            
            //Add Custom Burger to the Order
            order.addChild( customBurger );
            
            System.out.println("");
            
            //Burger 2
            
            CustomBurger customBurger2;
        
            customBurger2  = new CustomBurger( "Build Your Own Burger" ) ;
        
            // base price for burger
            Burger burger2 = new Burger( "Burger Options 2" ) ;
            String[] bo2 ={ "Hormone & Antibiotic Free Beef", "1/3lb.", "On A Bun" } ;
            burger2.setOptions( bo2 ) ;
            
            // 1 cheese free, extra cheese +1.00
            Cheese cheese2 = new Cheese("Cheese Options 2");
            String[] cheeseOptions2 = {"Smoked Gouda", "Greek Feta"};
            cheese2.setOptions(cheeseOptions2);
            cheese2.wrapDecorator(burger2);
            
            // 1 premiumcheese $1.50 extra cheese +1.50
            PremiumCheese pc2 = new PremiumCheese("PremiumCheese options 2");
            String[] PremiumCheeseOptions2 = {"Fresh Mozzarella"};
            pc2.setOptions(PremiumCheeseOptions2);
            pc2.wrapDecorator(cheese2);
            
            // Unlimited Toppings
            Toppings toppings2 = new Toppings("Topping Options 2");
            String[] toppingsOptions2 = {"Crushed Peanuts"};
            toppings2.setOptions(toppingsOptions2);
            toppings2.wrapDecorator(pc2);
            
            //Premium Toppings  = $1-$3
            PremiumToppings pt2 = new PremiumToppings("PremiumTopping Options 2");
            String[] premiumToppingOptions2 = {"Sunny Side Up Egg*","Marinated Tomatoes"};
            pt2.setOptions(premiumToppingOptions2);
            pt2.wrapDecorator(toppings2);
            
            //Bun Gluten-Free = $1
            Bun buns2 = new Bun("Bun Options 2");
            String[] bunOptions2 = {"Gluten-Free Bun"};
            buns2.setOptions(bunOptions2);
            buns2.wrapDecorator(pt2);
            
            //anyside= $3
            Side sides2 = new Side("Side Options 2");
            String[] sideOption2 = {"Shoestring Fries"};
            sides2.setOptions(sideOption2);
            sides2.wrapDecorator(buns2);
            
            // 1 sauce free, extra +.50
            Sauce sauces2 = new Sauce("Sauces Options 2");
            String[] sauceOptions2 = {"Habanero Salsa"};
            sauces2.setOptions(sauceOptions2);
            sauces2.wrapDecorator(sides2);
            
            
            
                        
           //set burger items
            customBurger2.setDecorator( sauces2 ) ;
            customBurger2.addChild( burger2 ) ;
            customBurger2.addChild( cheese2 ) ;
            customBurger2.addChild( pc2 ) ;
            customBurger2.addChild( sauces2 ) ;
            customBurger2.addChild( toppings2 ) ;
            customBurger2.addChild( pt2 ) ;
            customBurger2.addChild( buns2 );
            customBurger2.addChild( sides2 );            
            //Add Custom Burger to the Order
            
            order.addChild( customBurger2 );
            
            System.out.println("");
            
            return order ;
    }
}