package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Produces;

@ApplicationScoped
public class MyConfig {

    @Produces
    @MyQualifier
    public String value() {
        return "dev";
    }
}
