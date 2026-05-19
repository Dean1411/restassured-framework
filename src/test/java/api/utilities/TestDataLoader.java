package api.utilities;

import com.fasterxml.jackson.databind.ObjectMapper;

import api.payload.Customer;
import api.payload.TestData;
import api.payload.User;

import java.io.File;

public class TestDataLoader {

    private static TestData testData;

    static {
        try {
            ObjectMapper mapper = new ObjectMapper();
            testData = mapper.readValue(
                new File("src/test/resources/payloads.json"),
                TestData.class
            );
        } catch (Exception e) {
        	e.printStackTrace();
            throw new RuntimeException("Failed to load test data", e);
        }
    }

    public static User getAccess() {
        return testData.getValidUserPass();
    }

    public static Customer getCustomer() {
        return testData.getCustomer();
    }
}