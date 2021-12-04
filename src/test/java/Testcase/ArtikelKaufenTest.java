package Testcase;


import Pages.ArtikelKaufen;
import Pages.LoginPage;
import Pages.VerifyPreisPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ArtikelKaufenTest extends TestBase {

    private ArtikelKaufen Books;
    LoginPage Login;
    VerifyPreisPage Preise;


    @BeforeTest
    public void Logintest() {
        Login = new LoginPage(driver);
        Login.login();
    }

    @Test(priority = 1)
    public void AddBook1ToCartTest() throws InterruptedException {
        Books = new ArtikelKaufen(driver);
        Books.AddBooksToCartPage();
        Thread.sleep(1000);
    }

    @Test(priority = 2)
    public void AddBook2ToCartTest() throws InterruptedException {
        Books.AddBooks2ToCartPage();
        Thread.sleep(1000);
    }



    @Test(priority = 3)
    public void ShoppingCardClickTest() throws InterruptedException {
        Preise = new VerifyPreisPage(driver);
        Preise.ShoppingCardClickPage();
        Thread.sleep(2000);
      //  Preise.VerifyTolalPreisBook2(10);

    }
    @Test(priority = 4)
    public void VerifyPreisBook1() throws InterruptedException {
        Thread.sleep(200);
        Preise.VerifyTolalPreisBook1();
    }

    @Test(priority = 5)
    public void VerifyPreisBook2() throws InterruptedException {
        Thread.sleep(200);
        Preise.VerifyTolalPreisBook2(24);

    }
    @Test(priority = 6)
    public void UpdateCartTest() throws InterruptedException {
        Thread.sleep(2000);
        Books.UpdateCartPage();
    }
}