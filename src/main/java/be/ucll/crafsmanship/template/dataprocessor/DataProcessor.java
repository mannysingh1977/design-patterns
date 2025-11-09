package be.ucll.crafsmanship.template.dataprocessor;

public abstract class DataProcessor {
    protected String inputFile;
    protected String outputFile;

    public DataProcessor(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    public final void process() {
        load();
        transform();
        if (shouldValidate()) {
            validate();
        }
        save();
    }

    protected abstract void load();
    protected abstract void transform();
    protected abstract void save();

    protected boolean shouldValidate() {
        return false;
    }

    protected void validate() {
    }
}
