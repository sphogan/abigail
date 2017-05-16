package com.oshkindo.abigail.resources;

import com.oshkindo.abigail.models.Post;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class PostsResource {

    @GET
    public Post sean() {
        return new Post()
                .setId(1)
                .setBody("Hello World!  Quite a day, isn't it?")
                .setTitle("Hello World!")
                .setSlug("hello-world")
                .setTimestamp(System.currentTimeMillis());
    }
}
