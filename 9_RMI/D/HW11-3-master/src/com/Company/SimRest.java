package com.Company;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
//http://localhost:8081/rest/save/university
@Path("/save")
public class SimRest {
    @Path("/university")
    @GET
    @Produces("text/plain")
    public String sum ()
    {
        System.out.println("save executed in server");
        JSONObject jsonObject1 = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONObject jsonObject4 = new JSONObject();
        JSONObject jsonObject5 = new JSONObject();
        JSONObject jsonObject6 = new JSONObject();
        JSONObject jsonObject7 = new JSONObject();
        JSONObject jsonObject8 = new JSONObject();
        jsonObject1.put("name","sharif");
        jsonObject1.put("location","jonob");
        jsonObject2.put("name","tehran");
        jsonObject2.put("location","jonob");
        jsonObject3.put("name","amirkabir");
        jsonObject3.put("location","jonob");
        jsonObject4.put("name","elmosanat");
        jsonObject4.put("location","sharq");
        jsonObject5.put("name","elmofarhang");
        jsonObject5.put("location","gharb");
        jsonObject6.put("name","olom tahqiqat");
        jsonObject6.put("location","shomal");
        jsonObject7.put("name","tehran markaz");
        jsonObject7.put("location","markaz");
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