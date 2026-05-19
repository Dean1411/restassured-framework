package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import api.endpoints.EmsMethods;
import api.payload.Customer;
import api.payload.User;
import api.utilities.TestDataLoader;
import io.restassured.response.Response;

public class testApi {

    User user;
    Customer customer;
    String message;
    

    @BeforeClass
    public void setup() {
        user = TestDataLoader.getAccess();
        customer = TestDataLoader.getCustomer();
    }


    @Test
    public void emsVendTest() {

    	Response response = EmsMethods.emsVend(customer); 
		message = response.jsonPath().getString("creditToken");
		System.out.println("\nCredit Token: " + message);
    	Assert.assertEquals(response.getStatusCode(), 200);
    }
    
    @Test(dependsOnMethods= "emsVendTest")
    public void confirmTransactionTest() {

    	Response response = EmsMethods.confirmTransaction(); 
		message = response.jsonPath().getString("message");
		System.out.println("Response Message: " + message);
    	Assert.assertEquals(response.getStatusCode(), 200);
    }
    
    @Test(dependsOnMethods="confirmTransactionTest")
    public void cancelTransaction() {
    	
    	Response response = EmsMethods.cancelTransaction();
		message = response.jsonPath().getString("message");
		System.out.println("Response Message: " + message);
    	Assert.assertEquals(response.getStatusCode(), 200);
    }
}
