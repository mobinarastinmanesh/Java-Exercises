package com.Company;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
//http://localhost:8081/rest/car/info?name=Dashti&vaheds=pishrafte
@Path("/car")
public class SimRest {
    @Path("/info")
    @GET
    @Produces("text/plain")
    public String sum ()
    {
        String infos;
        System.out.println("save executed in server");
        JSONObject jsonObject1 = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONObject jsonObject4 = new JSONObject();
        JSONObject jsonObject5 = new JSONObject();
        jsonObject1.put("name","bmw");
        jsonObject1.put("engine","1000");
        jsonObject2.put("name","benz");
        jsonObject2.put("engine","2000");
        jsonObject3.put("name","bentli");
        jsonObject4.put("engine","3000");
        jsonObject4.put("name","bugatti");
        jsonObject4.put("engine","4000");
        jsonObject5.put("name","audi");
        jsonObject5.put("engine","5000");
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);
        jsonArray.add(jsonObject3);
        jsonArray.add(jsonObject4);
        jsonArray.add(jsonObject5);
        infos=jsonArray.toJSONString();




        return infos;
    }
}