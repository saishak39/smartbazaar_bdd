package screenshot;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import browser.browser;

public class capture extends browser
{
    public static void screenShot(String name) throws Exception
    {
        TakesScreenshot shot = ((TakesScreenshot)driver);
        File source = shot.getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir")+"\\target\\ScreenShot\\"+name+".png";
        File destination = new File(path);
        FileUtils.copyFile(source, destination);
    }
}