package API.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

    private static final Logger logger = LogManager.getLogger(TestListeners.class);

    @Override
    public void onStart(ITestContext context) {
        logger.info("===== Suite started: {} =====", context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        logger.info("TEST STARTED : {}", result.getMethod().getMethodName());
        logger.info("Description  : {}", result.getMethod().getDescription());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("TEST PASSED  : {}", result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.error("TEST FAILED  : {}", result.getMethod().getMethodName(), result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.warn("TEST SKIPPED : {}", result.getMethod().getMethodName());
    }

    @Override
    public void onFinish(ITestContext context) {
        logger.info("===== Suite finished: {} =====", context.getName());
    }
}
