package test_method;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import test_base.PharmEasy_base;
import test_page.PharmEasy_page;

public class PharmEasy_Cartpage extends PharmEasy_base{
	PharmEasy_page pharmeasy_cartpage;
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		pharmeasy_cartpage=new PharmEasy_page();
		 
	}
	
	
	
	
	@Test(priority=1)
	public void Search_button() throws InterruptedException
	{
		driver.findElement(By.xpath("(//span[text()='Search'])[2]")).click();
		Thread.sleep(500);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/#searchPopoverOpened");
	}
	
	
	@Test(priority=2)
	public void Search_medicine() throws InterruptedException
	{
		
		pharmeasy_cartpage.Search_Medicine().sendKeys("Crocine");
		Thread.sleep(2000);
		pharmeasy_cartpage.Search_Medicine().sendKeys(Keys.ENTER);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/search/all?name=Crocine");
	}
	
	@Test(priority=3)
	public void Crocine() throws InterruptedException
	{
		pharmeasy_cartpage.Crocin().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order/crocin-advance-500mg-strip-of-20-tablets-493507");
		
	}
	
	@Test(priority=4)
	public void Add_crocine() throws InterruptedException
	{
		pharmeasy_cartpage.Add_Crocine().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order/crocin-advance-500mg-strip-of-20-tablets-493507");
	}
	
	@Test(priority=5)
	public void Quantity_crocine() throws InterruptedException
	{
		pharmeasy_cartpage.Quantity_crocine().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order/crocin-advance-500mg-strip-of-20-tablets-493507");
	}
	
	
	
	@Test(priority=6)
	public void Description() throws InterruptedException
	{
		String text=pharmeasy_cartpage.Crocine_decription().getText();
		System.out.println("The text = "+text);
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order/crocin-advance-500mg-strip-of-20-tablets-493507");
	}
	
	@Test(priority=7)
	public void  Summary_Crocine() throws InterruptedException
	{
		String Product_summary=pharmeasy_cartpage.Product_summary().getText();
		System.out.println("The Product summary  = "+Product_summary);
		Thread.sleep(2000);
		String url=driver.getTitle();
		Assert.assertEquals(url,"Crocin Advance 500 MG Tablet (20): Uses, Side Effects, Price & Dosage | PharmEasy");
		
	}
	
	@Test(priority=8)
	public void Saridon_product2() throws InterruptedException
	{
		pharmeasy_cartpage.Saridon().click();
		Thread.sleep(1000);
		String titile=driver.getTitle();
		Assert.assertEquals(titile,"Buy SARIDON HEADACHE RELIEF TABLET- STRIP OF 10 TABLETS Online & Get Upto 60% OFF at PharmEasy");
	}
	
	@Test(priority=9)
	public void AddSaridon_product2() throws InterruptedException
	{
		pharmeasy_cartpage.Add_saridon().click();;
		Thread.sleep(1000);
		String titile=driver.getTitle();
		Assert.assertEquals(titile,"Buy SARIDON HEADACHE RELIEF TABLET- STRIP OF 10 TABLETS Online & Get Upto 60% OFF at PharmEasy");
	}
	
	@Test(priority=10)
	public void QunatitySaridon_product2() throws InterruptedException
	{
		pharmeasy_cartpage.Quantity_saridon().click();
		Thread.sleep(1000);
		String titile=driver.getTitle();
		Assert.assertEquals(titile,"Buy SARIDON HEADACHE RELIEF TABLET- STRIP OF 10 TABLETS Online & Get Upto 60% OFF at PharmEasy");
	}
	
	@Test(priority=11)
	public void View_Cart() throws InterruptedException
	{
		pharmeasy_cartpage.View_cart().click();
		Thread.sleep(1000);
		String titile=driver.getTitle();
		System.out.println("view= "+titile);
		Assert.assertEquals(titile,"Order Medicines Online - Cart - PharmEasy");
	}
	
	@Test(priority=12)
	public void Details_Crocin()
	{
		String details=driver.findElement(By.xpath("//a[1][@class='styles_productContainer__WKZ31 ']")).getText();
		System.out.println("The deatils of Crocin = "+details);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Order Medicines Online - Cart - PharmEasy");
	}
	
	@Test(priority=13)
	public void Details_Saridon()
	{
		String details=driver.findElement(By.xpath("//a[2][@class='styles_productContainer__WKZ31 ']")).getText();
		System.out.println("The deatils of Saridon  = "+details);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Order Medicines Online - Cart - PharmEasy");
	}
	
	@Test(priority=14)
	public void Cart_Total()
	{
		String carttotal=pharmeasy_cartpage.Cart_total().getText();
		System.out.println("The cart total amount = "+carttotal);
		String cart_total=driver.findElement(By.xpath("//div[@class='style_totalText__FF8Tn']")).getText();
		Assert.assertEquals(carttotal,cart_total);
	}
	
	@Test(priority=15)
	public void  Apply_Coupons()
	{
		pharmeasy_cartpage.Apply_coupons().click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"Order Medicines Online - Cart - PharmEasy");
	}
	
	@Test(priority=16)
	public void  Apply_Coupons1()
	{
		pharmeasy_cartpage.Apply_coupon1().click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"Order Medicines Online - Cart - PharmEasy");
	}
	
	@Test(priority=17)
	public void Bill_summary()
	{
		String bill_summary=pharmeasy_cartpage.Bill_summary().getText();
		System.out.println("The bill summary = "+bill_summary);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Order Medicines Online - Cart - PharmEasy");
	}
	
	@Test(priority=18)
	public void Amount_Paid()
	{
		String Amount=pharmeasy_cartpage.Amount().getText();
		System.out.println("The amount to be paid = "+Amount);
		Assert.assertEquals(Amount,driver.findElement(By.xpath("//span[@class='AmountBifurcation_finalValue__MkWUw AmountBifurcation_finalValueBold__r8tdR']")).getText());
	}
	
	@AfterSuite
	public void close()
	{
		terminate();
	}
	
}
