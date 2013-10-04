package eu.hurion.opendata.noticeabletree;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ExcelReader {

    public Collection<Tree> read(final String fileName) throws IOException {
        List<Tree> result = new ArrayList<Tree>();
        InputStream file = getClass().getResourceAsStream(fileName);
        if (file == null){
            throw new IllegalArgumentException("File " + fileName + " not found");
        }
        try {

            //Get the workbook instance for XLS file
            HSSFWorkbook workbook = new HSSFWorkbook(file);

            //Get first sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0);

            //Get iterator to all the rows in current sheet
            Iterator<Row> rowIterator = sheet.iterator();

            rowIterator.next();//ignore column title

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                TreeBuilder reader = new TreeBuilder(row);
                Tree tree = reader.buildTree();
                result.add(tree);
                System.out.println(tree.toString());
            }
        } finally {
           file.close();
        }
        return result;
    }
}
