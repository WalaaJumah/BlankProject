/**
 * @author w.jumaa
 * @projectName price_comparison_tool
 * @classDescription
 */

package helper_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataExtractor {
    public static String extractDigitsFromString(WebElement element, WebDriver webDriver, int WaitTime) {
        try {
            if (element.isDisplayed()) {

                WaitHelper.waitToBeVisible(element, webDriver, WaitTime);
                String text = element.getText();
//        String numberOnly= text.replaceAll("[^0-9]", "");
                String numberOnly = text.replaceAll("[^0-9.]", "");
                return numberOnly;
            }
        } catch (NumberFormatException e) {
            return "free";
        }
        return "";
    }

    public static String extractNegativeNumberFromString(WebElement element, WebDriver webDriver, int WaitTime) {
        try {
            if (element.isDisplayed()) {

                WaitHelper.waitToBeVisible(element, webDriver, WaitTime);
                String text = element.getText();
//        String numberOnly= text.replaceAll("[^0-9]", "");
                String numberOnly = text.replaceAll("[^-\\d.]", "");
                return numberOnly;
            }
        } catch (Exception e) {
            return null;
        }
        return "";
    }

    public static String extractFirstNumberFromString(WebElement element, WebDriver webDriver) {
        String input = element.getText();
        String[] parts = input.split(" ");
        String firstNumber = parts[1];
        return firstNumber;
    }

    public static String extractFirstCurrencyFromString(WebElement element, WebDriver webDriver) {
        String input = element.getText();
        String[] parts = input.split(" ");
        String firstNumber = parts[0];
        return firstNumber;
    }


    public static String extractLettersFromString(WebElement element, WebDriver webDriver, int WaitTime) {
        WaitHelper.waitToBeVisible(element, webDriver, WaitTime);
        String text = element.getText();
        String numberOnly = text.replaceAll("[^a-zA-Z]", "");
        return numberOnly;
    }

    public static String extractCharacterFromString(WebElement element, WebDriver webDriver, int WaitTime) {
        WaitHelper.waitToBeVisible(element, webDriver, WaitTime);
        String text = element.getText();
        String character = text.replaceAll("[^0-9.]", "");
        return character;
    }

    public static String extractProductNameFromUrl(String url) {
        int startIndex = url.lastIndexOf('/') + 1;
        int endIndex = url.length();

        return url.substring(startIndex, endIndex);
    }

    public static String extractBaseURL(String fullURL) {
        String baseUrl = null;
        try {
            URL url = new URL(fullURL);
            baseUrl = url.getProtocol() + "://" + url.getHost();
//            System.out.println("Base URL: " + baseUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return baseUrl;
    }

    public static String getRelativeFilePath(String rootDirectory, String fullFilePath, WebDriver webDriver) {
        //Determine the full path of the base or root directory. For example, if the root directory is the parent directory of the src directory, you can use the following code snippet in Java to get its full path:
        String rootDirectoryPath = new File(rootDirectory).getParentFile().getAbsolutePath();
        //Determine the full path of the file that you want to convert to a relative path. For example, if the full path of the file is
        String fullPath = fullFilePath;
        //Use the Paths.get() method and the relativize() method to convert the full path to a relative path. For example, you can use the following code snippet in Java to convert the full path to a relative path:
        Path basePath = Paths.get(rootDirectoryPath);
        Path fullPathObj = Paths.get(fullPath);
        Path relativePathObj = basePath.relativize(fullPathObj);
        String relativePath = relativePathObj.toString().replace("\\", "/");
        System.out.println("The Relative file xpath is: " + relativePath);

        return relativePath;

    }

    public static String generateRandomEmail() {
        String pattern2 = "ss";
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);
        String date2 = simpleDateFormat2.format(new Date());
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        return "Walaa" + randomInt + date2 + "@gmail.com";
    }

    public static int generateRandomNumber(int start, int end) {
        Random random = new Random();
        return random.nextInt(end - start + 1) + start;
    }

    public static int generateRandomNumberWithinListSize(List<?> list) {
        Random random = new Random();
        System.out.println("Scenario Number" + random.nextInt(list.size()));

        return random.nextInt(list.size());
    }

    public static String generateRandomText(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();
    }

    public static String extractFirstNumberBeforePercent(WebElement element, WebDriver webDriver, int WaitTime) {
        if (element.isDisplayed()) {
            WaitHelper.waitToBeVisible(element, webDriver, WaitTime);
            String input = element.getText();
            Pattern pattern = Pattern.compile("(\\d+)%");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String numberString = matcher.group(1);
                return numberString;
            }
        }
        return null;

    }

    public static void spentTimeInSecond(long begin) {
        long end = System.currentTimeMillis();
        float time = end - begin;
        float timeInSec = time / 1000F;
        float timeInMin = timeInSec / 60F;
        System.out.println("Elapsed time in sec: " + timeInSec + " sec");
        System.out.println("Elapsed time in minutes: " + timeInMin + " min");
    }

}
