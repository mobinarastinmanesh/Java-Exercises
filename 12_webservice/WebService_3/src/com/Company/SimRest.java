package com.Company;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/save")
public class SimRest {
    @Path("/uni")
    @GET
    @Produces("text/plain")
    public String uni ()
    {
        System.out.println("save executed in server");
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("name","shariiif");
        jsonObject1.put("location","markaz");

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("name","tehran");
        jsonObject2.put("location","markaz");

        JSONObject jsonObject3 = new JSONObject();
        jsonObject3.put("name","amirkabir");
        jsonObject3.put("location","markaz");

        JSONObject jsonObject4 = new JSONObject();
        jsonObject4.put("name","elmosanat");
        jsonObject4.put("location","sharq");

        JSONObject jsonObject5 = new JSONObject();
        jsonObject5.put("name","elmofarhang");
        jsonObject5.put("location","gharb");

        JSONObject jsonObject6 = new JSONObject();
        jsonObject6.put("name","olom tahqiqat");
        jsonObject6.put("location","shomal");

        JSONObject jsonObject7 = new JSONObject();
        jsonObject7.put("name","tehran markaz");
        jsonObject7.put("location","markaz");

        JSONObject jsonObject8 = new JSONObject();
        jsonObject8.put("name","tehran gharb");
        jsonObject8.put("location","gharb");

        JSONArray jsonArray = new JSONArray();

        jsonArray.add(jsonObject1);

        jsonArray.add(jsonObject2);

        jsonArray.add(jsonObject3);

        jsonArray.add(jsonObject4);

        jsonArray.add(jsonObject5);

        jsonArray.add(jsonObject6);

        jsonArray.add(jsonObject7);

        jsonArray.add(jsonObject8);

        return jsonArray.toJSONString();
    }
}