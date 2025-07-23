package week3.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPhone {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
        Search.sendKeys("Mobile phones");
        Search.sendKeys(Keys.RETURN);
        List<WebElement> Search2 = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        List<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < Search2.size(); i++) {
        	String phonesize = Search2.get(i).getText();
        	if(!phonesize.isEmpty()) {
        		int rate = Integer.parseInt(phonesize);
        		num.add(rate);
        		System.out.println(num); 
        	}
			
		}
        
        
        
			}

}
