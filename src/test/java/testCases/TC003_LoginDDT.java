package testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class, groups="Datadriven")
	public void verify_LoginDDT(String email, String password, String exp) {

		logger.info("****** Starting TC_003_LoginDDT ******");

		try {
			// HomePage
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();

			// Login
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(email);
			lp.setPassword(password);
			lp.clickLogin();

			// MyAccount
			MyAccountPage macc = new MyAccountPage(driver);
			boolean targetPage = macc.isMyAccountPageExits();

			if (exp.equalsIgnoreCase("Valid")) {
				if (targetPage == true) {
					macc.clickLogout();
					Assert.assertTrue(true);

				} else {
					Assert.assertTrue(false);
				}
			}
			if (exp.equalsIgnoreCase("Invalid")) {
				if (targetPage == true) {
					macc.clickLogout();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
				}
			}

		} catch (Exception e) {
			Assert.fail();
		}

		logger.info("****** Finished TC_003_LoginDDT ******");

	}

}
