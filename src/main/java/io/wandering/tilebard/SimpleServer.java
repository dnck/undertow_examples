package io.wandering.tilebard;

import io.undertow.Undertow;
import io.undertow.util.*;

/*
import io.undertow.security.api.AuthenticationMechanism;
import io.undertow.security.api.AuthenticationMode;
import io.undertow.security.handlers.AuthenticationCallHandler;
import io.undertow.security.handlers.AuthenticationConstraintHandler;
import io.undertow.security.handlers.AuthenticationMechanismsHandler;
import io.undertow.security.handlers.SecurityInitialHandler;
import io.undertow.security.idm.IdentityManager;
import io.undertow.security.impl.BasicAuthenticationMechanism;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import static io.undertow.Handlers.path;
import java.util.*;
*/
//https://www.baeldung.com/jboss-undertow

public class SimpleServer {

    public static void main(String[] args) {
        Undertow server = Undertow.builder().addHttpListener(8080, "localhost").setHandler(exchange -> {
            exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/plain");
            exchange.getResponseSender().send("Hello World!");
        }).build();
        server.start();
    }

}