package be.ucll.crafsmanship.template.dataprocessor;

public class Demo {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CSVProcessor("input.csv", "output.csv");
        csvProcessor.process();

        DataProcessor jsonProcessor = new JsonProcessor("input.json", "output.json");
        jsonProcessor.process();

        DataProcessor xmlProcessor = new XMLProcessor("input.xml", "output.xml");
        xmlProcessor.process();
    }
}