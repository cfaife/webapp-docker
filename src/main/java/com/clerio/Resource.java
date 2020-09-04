package com.clerio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/v1")
public class Resource {

    @GET
    public Response greeting(){
        Response.ResponseBuilder responseBuilder = Response.ok("Hello-world");
        Response response = responseBuilder.build();
        return response;
    }
}
