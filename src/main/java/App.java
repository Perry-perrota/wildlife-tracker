import modules.Animal;
import modules.Endangered;
import spark.ModelAndView;

import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;


public class App {
    public static void main(String[] args) {
        get("/",(request,response)->{
            Map<String,Object> model=new HashMap<>();
           return new ModelAndView(model,"index.hbs");
        },new HandlebarsTemplateEngine());
        get("/animals",(request,response)->{
            Map<String,Object> model=new HashMap<>();
            return new ModelAndView(model,"animals.hbs");
        },new HandlebarsTemplateEngine());
        get("/endangered",(request,response)->{
            Map<String,Object> model=new HashMap<>();
            return new ModelAndView(model,"endangered.hbs");
        },new HandlebarsTemplateEngine());
        get("/sightings",(request,response)->{
            Map<String,Object> model=new HashMap<>();
            return new ModelAndView(model,"sightings.hbs");
        },new HandlebarsTemplateEngine());
        post("/sightings/new",(request,response)->{
            Map<String,Object> model=new HashMap<>();
            String name=request.queryParams("name");
            model.put("name",name);
            String age=request.queryParams("age");
            model.put("age",age);
            String location=request.queryParams("location");
            model.put("location",location);
            String health=request.queryParams("healthStatus");
            model.put("health",health);
            String rangerName=request.queryParams("rangerName");
            model.put("rangerName",rangerName);

            Endangered newEndangered=new Endangered(name,location,age,rangerName,health);
            newEndangered.saveEndangered();
            return new ModelAndView(model,"success.hbs");
        },new HandlebarsTemplateEngine());
        post("/animals/new",(request,response)->{
            Map<String,Object> model=new HashMap<>();
            String name=request.queryParams("name");
            model.put("name",name);
            Animal  newAnimal=new Animal(name);
            newAnimal.saveAnimal();
            return new ModelAndView(model,"success.hbs");
        }, new HandlebarsTemplateEngine());


    }
}
