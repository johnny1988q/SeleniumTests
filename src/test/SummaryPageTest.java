package test;

import main.java.BasePage;
import main.java.BaseTest;
import main.java.SummaryPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static main.java.PageConstants.*;
import static main.java.SummaryPage.*;
import static org.junit.Assert.*;


/**
 * Created by ionuta on 3/16/15.
 */
    public class SummaryPageTest extends BaseTest {




    @Test
    public void summaryPageIsPresent() {

        BasePage basePage = loadBasePage();

        SummaryPage summaryPage = basePage.goToSummaryPage(GET_A_PERSONAL_ASSISTANT, PLAN_MY_JOURNEY, 57000);

        assertTrue("Summary page is not displayed", summaryPage.assertElementIsPresent(SUMMARY_BODY));

    }





    }

