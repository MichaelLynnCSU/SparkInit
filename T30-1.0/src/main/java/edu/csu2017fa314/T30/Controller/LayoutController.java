package edu.csu2017fa314.T30.Controller;

import com.google.gson.Gson;
import edu.csu2017fa314.T30.Model.Itinerary.Data.DataService;
import org.apache.velocity.app.VelocityEngine;

import java.util.Properties;

import static spark.Spark.*;

public class LayoutController {

    VelocityEngine ve;
    Properties props;
    DataService myModel;
    Gson gson;


    public LayoutController() {


        ve = new VelocityEngine();
        props = new Properties();
        props.put("file.resource.loader.path", "src/main/resources/");
        ve.init(props);

      //  myModel = new DataService();
        gson = new Gson();

        get("/layout", (request, response) -> {
           return "test";
        });

    }




}
