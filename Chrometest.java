WebDriver test;
	
	
	
	
@SuppressWarnings("deprecation")
	
@BeforeTest
	
public void start() throws InterruptedException {
		
		
System.getProperty("webdriver","C:\\chromedriver-win64.exe");
		
test = new ChromeDriver();
		
		
test.manage().deleteAllCookies();
		
test.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
test.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		
		
	test.get("https://in.linkedin.com/");
		
		
test.manage().window().maximize();
		
		
Thread.sleep(2000);
		
		
	}
	
	
	
@Test
	
public void linkedin() throws InterruptedException {
		
		//Clicking Jobs
				test.findElement(By.xpath("/html/body/nav/ul/li[4]/a")).click();		
				
		Thread.sleep(2000);

				//Searching Jobs
				
test.findElement(By.xpath("/html/body/div[1]/header/nav/section/section[2]/form/section[1]/input")).sendKey("3D Artist"+Keys.ENTER);	
				
				
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
		
				
		}
	
	
		
@AfterTest
		
public void quit() {
			
			
test.quit();
			
		
}
