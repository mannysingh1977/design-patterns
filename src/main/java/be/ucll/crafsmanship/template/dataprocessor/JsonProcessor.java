package be.ucll.crafsmanship.template.dataprocessor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonProcessor extends DataProcessor {
    private List<Map<String, Object>> data;

    public JsonProcessor(String inputFile, String outputFile) {
        super(inputFile, outputFile);
        this.data = new ArrayList<>();
    }

    @Override
    protected void load() {
        System.out.println("loading JSON ...");
        Map<String, Object> record1 = new HashMap<>();
        record1.put("id", 1);
        record1.put("name", "Product A");
        record1.put("price", 99.99);
        
        Map<String, Object> record2 = new HashMap<>();
        record2.put("id", 2);
        record2.put("name", "Product B");
        record2.put("price", 149.99);
        
        data.add(record1);
        data.add(record2);
    }

    @Override
    protected void transform() {
        System.out.println("transforming JSON ...");
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        for (Map<String, Object> record : data) {
            record.put("timestamp", timestamp);
        }
    }

    @Override
    protected void save() {
        System.out.println("saving JSON ...");
        for (Map<String, Object> record : data) {
            System.out.println("  -> " + record);
        }
    }
}
