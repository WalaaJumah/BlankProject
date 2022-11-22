package retry_failed_test_cases;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;


public class AnnotationTransfer implements IAnnotationTransformer{

@Override
public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConstructor, Method testMethod) {
    testAnnotation.setRetryAnalyzer(RetryFailedTestCases.class);
    }

}