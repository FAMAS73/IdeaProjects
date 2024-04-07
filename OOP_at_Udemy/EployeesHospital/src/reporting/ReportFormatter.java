package reporting;

public class ReportFormatter {
    String formattedOutput;
    public ReportFormatter(Object object, FormatType formatType){
        switch (formatType){
            case CSV: formattedOutput=convertObjectTCSV(object);
            case XML: formattedOutput=convertObjectToXML(object);
        }
    }
    private String convertObjectToXML(Object object){
        return "XML : <title>"+object.toString()+"</title>";
    }
    private String convertObjectTCSV(Object object){
        return "CSV : <title>"+object.toString()+",,,,";
    }
    protected String getFormattedValue(){
        return formattedOutput;
    }
}
