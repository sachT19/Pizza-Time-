public class PizzaTester 
{
    public static void main(String[] args)
    {
        // Test your Pizza class here.
        Pizza firstOne = new Pizza("veggie", "olives", 12);
        System.out.println(firstOne);
        
        Pizza secondOne = new Pizza("meat", "pepperoni", 8);
        System.out.println(secondOne);
        
        Pizza thirdOne = new Pizza("veggie", "pineapple", 12);
        System.out.println(thirdOne);
    }
}
