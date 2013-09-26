package eu.hurion.opendata.arbre;

import java.io.IOException;

public class NoticeableTrees {

    public static void main(String[] args) throws IOException {
        ExcelReader reader = new ExcelReader();
        reader.read("/arbres-remarquables.xls");
    }



}
