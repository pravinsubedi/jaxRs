package com.asterdio.jaxrs.resources;

import com.asterdio.jaxrs.model.Track;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Admin on 11/13/2016.
 */
@Path("json")
public class JsonService {
    Track track = new Track("hello","world");
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Track getIt() {
 //       return "Got it!";
//}

//        track.setSongName("Enter Sandman");
//        track.setSinger("Metallica");

        return track;
    }
}
