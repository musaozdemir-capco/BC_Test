package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testBase.PageInitializer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonMethods extends PageInitializer {

    /**
     * Method that send text to any given elements
     * @param element
     * @param text
     */
    public static void sendText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }
    public static void click(WebElement element){
        waitForClickability(element);
        element.click();
    }

    public static WebDriverWait getWaitObject(){

        return new WebDriverWait(driver , Constants.EXPLICIT_WAIT_TIME);
    }

    public static void waitForClickability(WebElement element){
        getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Method that will take a screenshot and store with name in specified location with .png extension
     * @param fileName
     */

    public static byte[] takeScreenshot(String fileName){
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] bytes = ts.getScreenshotAs(OutputType.BYTES);
        File src = ts.getScreenshotAs(OutputType.FILE);

        try{
            FileUtils.copyFile(src, new File(Constants.SCREENSHOT_FILEPATH + fileName + getTimeStamps()+".png"));
        }catch (IOException e){
            e.printStackTrace();
        }
        return bytes;
    }

    public static String getTimeStamps(){
        Date date =new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH_mm_ss");
        return sdf.format(date);
    }




}
