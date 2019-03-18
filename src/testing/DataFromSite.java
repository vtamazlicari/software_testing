package testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import testare1.Product;

public class DataFromSite {

	 public static void main(String[] args) throws InterruptedException {
		 String driverPath = "C:\\Users\\vtamazlicari\\Desktop/chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", driverPath);
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.enter.online");
		 driver.findElement(By.id("iam_search")).sendKeys("telefoane");
		 driver.findElement(By.id("iam_search")).click();
		 Thread.sleep(1000);
		 List <WebElement> products = driver.findElements(By.className("uk-margin-remove-bottom"));
		 List <WebElement> prices = driver.findElements(By.className("tm-price"));
		 ArrayList<String> productsList = new ArrayList<>(); 
		 int[] pricesList = new int[20]; 
		 int i = 0;
		 for(WebElement we:products){
			 productsList.add(we.getText());
			}
		 for(WebElement we:prices){
			 String priceString = we.getText().replace(" lei","");
			 int priceInt = Integer.parseInt(priceString);
			 pricesList[i] = priceInt;
			 i++;
			}
		 ArrayList <Product> arrayProducts = new ArrayList<Product>();
		 i = 0;
		 for(String s:productsList){
			 arrayProducts.add(new Product(s, pricesList[i]));
			 i++;
		 }
		 Collections.sort(arrayProducts, Comparator.comparing(Product::getPrice));
		 i = 0;
		 for(Product s:arrayProducts) {
			 System.out.println("| " + s.getPrice() + " | " + s.getName().toString() + " |");
			 i++;
		 } 
		 System.out.println("Cel mai ieftin produx este: " + arrayProducts.get(0).getName().toString());
	 }
}
