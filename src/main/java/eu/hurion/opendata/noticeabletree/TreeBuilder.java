package eu.hurion.opendata.noticeabletree;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.util.Iterator;

public class TreeBuilder {

    private static final int SITE_NR = 0;
    private static final int TREE_NR = 1;
    private static final int TOWN = 2;
    private static final int MUNICIPALITY = 3;
    private static final int DOMAIN = 4;
    private static final int TYPE = 5;
    private static final int SPECIES_LATIN = 6;
    private static final int SPECIES_FRENCH = 7;
    private static final int SANIT = 8;
    private static final int CIRCUMFERENCE = 9;
    private static final int HEIGHT = 10;
    private static final int ANOBS = 11;
    private static final int INTEREST = 12;
    private static final int ENV1 = 13;
    private static final int ENV2 = 14;
    private static final int REF = 15;
    private static final int COMMENT = 16;
    private static final int EVOLUTION = 17;
    private static final int OFFICIAL_DATE = 18;
    private final Row row;

    public TreeBuilder(final Row row) {

        this.row = row;
    }

    public Tree buildTree() {
        //For each row, iterate through each columns
        Iterator<Cell> cellIterator = row.cellIterator();
        Tree tree = new Tree();
        int i = 0;
        while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();
            switch (i) {
                case SITE_NR:
                    tree.setSiteNr(cell.getNumericCellValue());
                    break;
                case TREE_NR:
                    tree.setTreeNr(cell.getNumericCellValue());
                    break;
                case TOWN:
                    tree.setTown(cell.getStringCellValue());
                    break;
                case MUNICIPALITY:
                    tree.setMunicipality(cell.getStringCellValue());
                    break;
                case DOMAIN:
                    tree.setDomain(cell.getStringCellValue());
                    break;
                case TYPE:
                    tree.setType(cell.getStringCellValue());
                    break;
                case SPECIES_LATIN:
                    tree.setSpeciesLatin(cell.getStringCellValue());
                    break;
                case SPECIES_FRENCH:
                    tree.setSpeciesFrench(cell.getStringCellValue());
                    break;
                case SANIT:
                    tree.setSanit(cell.getStringCellValue());
                    break;
                case CIRCUMFERENCE:
                    tree.setCircumference(getNumericCellOrZero(cell));
                    break;
                case HEIGHT:
                    tree.setHeight(getNumericCellOrZero(cell));
                    break;
                case ANOBS:
                    tree.setAnobs((int) getNumericCellOrZero(cell));
                    break;
                case INTEREST:
                    tree.setInterest(cell.getStringCellValue());
                    break;
                case ENV1:
                    tree.setEnv1(getStringValue(cell));
                    break;
                case ENV2:
                    tree.setEnv2(getStringValue(cell));
                    break;
                case REF:
                    tree.setRef(getStringValue(cell));
                    break;
                case COMMENT:
                    tree.setComment(getStringValue(cell));
                    break;
                case EVOLUTION:
                    tree.setEvolution(getStringValue(cell));
                    break;
                case OFFICIAL_DATE:
                    tree.setOfficialDate(cell.getDateCellValue());
                    break;
            }

            i++;
        }
        return tree;
    }

    private String getStringValue(Cell cell) {
        if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
            return cell.getStringCellValue();
        }
        return "";
    }

    private double getNumericCellOrZero(Cell cell) {
        if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
            return cell.getNumericCellValue();
        } else {
            return 0;
        }

    }
}
