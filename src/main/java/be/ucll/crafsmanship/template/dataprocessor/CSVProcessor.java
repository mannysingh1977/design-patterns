package be.ucll.crafsmanship.template.dataprocessor;

import java.util.ArrayList;
import java.util.List;

public class CSVProcessor extends DataProcessor {
    private List<String> data;

    public CSVProcessor(String inputFile, String outputFile) {
        super(inputFile, outputFile);
        this.data = new ArrayList<>();
    }

    @Override
    protected void load() {
        System.out.println("loading CSV...");
        data.add("name,age,city");
        data.add("john,25,new york");
        data.add("jane,30,london");
        data.add("bob,35,paris");
    }

    @Override
    protected void transform() {
        System.out.println("transforming CSV...");
        data.replaceAll(String::toUpperCase);
    }

    @Override
    protected void save() {
        System.out.println("saving CSV...");
        for (String line : data) {
            System.out.println("  -> " + line);
        }
    }
}
