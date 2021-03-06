package com.wipro.Rest_Assign_1;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("hello")
public class MyResource {

    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Hello I am here ";
    }
    
    
}
