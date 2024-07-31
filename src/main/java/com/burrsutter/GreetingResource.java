package com.burrsutter;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    @Inject
    GreeterAiService greeter;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greeter.greet("Burr");
    }

    @GET
    @Path("/time")
    @Produces(MediaType.TEXT_PLAIN)
    public String time() {
        return greeter.time();
    }
}
