package com.github.platformoon.presentation.resource;

import java.net.URI;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.platformoon.presentation.resource.request.CreateApplicationRequest;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/applications")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ApplicationResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationResource.class);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createApplicationHandler(CreateApplicationRequest request) {
        LOGGER.info("createApplicationHandler: {}", request);
        return Response.created(URI.create("/applications/" + UUID.randomUUID().toString())).build();
    }
}
