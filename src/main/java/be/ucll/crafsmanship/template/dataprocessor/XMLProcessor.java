package be.ucll.crafsmanship.template.dataprocessor;

import java.util.ArrayList;
import java.util.List;

public class XMLProcessor extends DataProcessor {
    private List<String> data;

    public XMLProcessor(String inputFile, String outputFile) {
        super(inputFile, outputFile);
        this.data = new ArrayList<>();
    }

    @Override
    protected void load() {
        System.out.println("loading XML ...");
        data.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        data.add("<users>");
        data.add("  <user id=\"1\">");
        data.add("    <name>Alice</name>");
        data.add("    <email>alice@example.com</email>");
        data.add("  </user>");
        data.add("  <user id=\"2\">");
        data.add("    <name>Charlie</name>");
        data.add("    <email>charlie@example.com</email>");
        data.add("  </user>");
        data.add("</users>");
    }

    @Override
    protected void transform() {
        System.out.println("transforming XML ...");
        data.add(1, "<!-- Processed at: " + java.time.LocalDateTime.now() + " -->");
    }

    @Override
    protected void save() {
        System.out.println("saving XML ...");
        for (String line : data) {
            System.out.println("  -> " + line);
        }
    }

    @Override
    protected boolean shouldValidate() {
        return true;
    }

    @Override
    protected void validate() {
        System.out.println("validating XML ...");
        boolean hasRoot = data.stream().anyMatch(line -> line.contains("<users>"));
        if (hasRoot) {
            System.out.println("  validation passed: XML is valid");
        } else {
            System.out.println("  validation failed: missing root element");
        }
    }
}

