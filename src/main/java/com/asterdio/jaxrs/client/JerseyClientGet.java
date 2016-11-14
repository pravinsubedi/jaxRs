package com.asterdio.jaxrs.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * Created by Admin on 11/13/2016.
 */
public class JerseyClientGet
{
    public static void main(String[] args) {
        try {

            Client client = Client.create();

            WebResource webResource = client
                    .resource("https://api.themoviedb.org/3/search/movie?api_key=6e9ae4a3dbf0cd260c80e3fba62c9da8&language=en-US&query=action");

            ClientResponse response = webResource.accept("application/json")
                    .get(ClientResponse.class);

//            if (response.getStatus() != 200) {
//                throw new RuntimeException("Failed : HTTP error code : "
//                        + response.getStatus());
//            }

            String output = response.getEntity(String.class);

            System.out.println("Output from Server \n");
            System.out.println(output);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
