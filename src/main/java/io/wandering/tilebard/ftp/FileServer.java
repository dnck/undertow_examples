package io.wandering.tilebard.ftp;

import io.undertow.Undertow;
import io.undertow.server.handlers.resource.PathResourceManager;

import java.nio.file.Paths;

import static io.undertow.Handlers.resource;

public class FileServer {

    public static void main(String[] args) {
//        System.out.println(System.getProperty("user.home"));
        Undertow server = Undertow.builder().addHttpListener(8080, "localhost")
                .setHandler(resource(new PathResourceManager(Paths.get(System.getProperty("user.dir")), 100))
                        .setDirectoryListingEnabled(true))
                .build();
        server.start();
    }

}