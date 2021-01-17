package com.Company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/car")
public class SimRest {
    /////////////////////////////////////////////////////////////////////
    @Path("/info")
    @GET
    @Produces("text/plain")

    //////////////////////////////////////////////////////////////////////
    public String car ()
    {
        String info;

        System.out.println("save executed in server");
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("name","bmw");
        jsonObject1.put("engine","1000");

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("name","benz");
        jsonObject2.put("engine","2000");

        JSONObject jsonObject3 = new JSONObject();
        jsonObject3.put("name","bentli");
        jsonObject3.put("engine","3000");

        JSONObject jsonObject4 = new JSONObject();
        jsonObject4.put("name","bugatti");
        jsonObject4.put("engine","4000");

        JSONObject jsonObject5 = new JSONObject();
        jsonObject5.put("name","ferari");
        jsonObject5.put("engine","5000");

        JSONArray jsonA = new JSONArray();

        jsonA.add(jsonObject1);
        jsonA.add(jsonObject2);
        jsonA.add(jsonObject3);
        jsonA.add(jsonObject4);
        jsonA.add(jsonObject5);

        info=jsonA.toJSONString();


        return info;
    }
}