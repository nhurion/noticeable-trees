package eu.hurion.opendata.noticeabletree;

import spark.Request;
import spark.Response;
import spark.Route;

import java.io.IOException;
import java.util.Collection;

import static spark.Spark.get;

public class NoticeableTrees {

    public static void main(String[] args) throws IOException {
        ExcelReader reader = new ExcelReader();
        final Collection<Tree> trees = reader.read("/arbres-remarquables.xls");


        get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World!";
            }
        });

    }



}
