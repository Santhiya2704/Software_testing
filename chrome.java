package gc1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class chrome {

	 public static void main(String[] args)throws InterruptedException {


        System.getProperty("webdriver","C:\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver test = new ChromeDriver();
		
		test.get("https://in.linkedin.com/");
		
		test.manage().window().maximize();
		
		Thread.sleep(2000);

		//Clicking Jobs
		test.findElement(By.xpath("/html/body/nav/ul/li[4]/a")).click();		
		
		Thread.sleep(2000);

		//Searching Jobs
		test.findElement(By.xpath("/html/body/div[1]/header/nav/section/section[2]/form/section[1]/input")).sendKeys("3D Artist"+Keys.ENTER);	
		
		Thread.sleep(2000);
		
		//Applying filter
		test.findElement(By.xpath("//*[@id=\"jserp-filters\"]/ul/li[4]/div/div/button")).click();
		
		Thread.sleep(2000);

		//Entering filters
		test.findElement(By.name("f_E")).click();
		
		Thread.sleep(2000);

		//clicking done in filters
		test.findElement(By.xpath("//*[@id=\"jserp-filters\"]/ul/li[4]/div/div/div/button")).click();
		
		Thread.sleep(2000);

		//Back to linkedin home (Click Linkedin logo)
		test.findElement(By.xpath("/html/body/div[1]/header/nav/a")).click();
		
		Thread.sleep(2000);

		//Clicking learning option
		test.findElement(By.xpath("/html/body/nav/ul/li[3]/a")).click();
		
		Thread.sleep(2000);

		//searching skills
		test.findElement(By.xpath("/html/body/div/header/nav/section/section[3]/form/section/input")).sendKeys("blender"+Keys.ENTER);
		
		Thread.sleep(2000);

		//clicking course
		test.findElement(By.linkText("Blender 3 Essential Training")).click();
		
		Thread.sleep(2000);
		
		//preview the video
		test.findElement(By.xpath("/html/body/main/section[1]/section/section/a/span")).click();
        Thread.sleep(5000);
		
		test.quit();
	 }
}
