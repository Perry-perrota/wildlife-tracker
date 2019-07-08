package modules;

import org.sql2o.*;
public class DB {

   // public static Sql2o sql2o=new Sql2o("jdbc:postgresql://localhost:5432/wildlife","postgres","1234");

    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-54-83-1-101.compute-1.amazonaws.com:5432/d26kfpd5t7279h",
            "wevigoyjvejmxj",  "d2d42bb28aa2607054e02ca20d440907b3ed7c8018f09cf252780825cc217bfb");
}


