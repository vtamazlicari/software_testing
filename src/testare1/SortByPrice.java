package testare1;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> 
{ 
    public int compare(Product a, Product b) 
    { 
        return a.price - b.price; 
    } 
}
