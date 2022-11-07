package org.acme;

import javax.inject.Inject;
import javax.validation.constraints.Pattern;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    private final String value;

    @Inject
    public GreetingResource(@MyQualifier @Pattern(regexp = "dev|prod") String value) {this.value = value;}

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return value;
    }
}