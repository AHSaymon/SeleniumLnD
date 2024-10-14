package Demo;

import org.testng.log4testng.Logger;

import java.util.logging.LogManager;

public class log4JDemo {
    private static final Logger logger= LogManager.getLogManager(log4JDemo.class);
    public static void main(String[] args) {
        System.out.println("This is new");
        logger.info(" day 1");
        logger.fatal("day 2");
        logger.debug("day 3");

    }
}
