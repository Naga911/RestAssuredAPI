package pojo.CreateOrUpdateAPI;

public class Submitter {

    private int id;
    private String submitterName;
    private String submitterType;
    private int recordAction;


    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public void setSubmitterName(String submitterName) {
        this.submitterName = submitterName;
    }

    public String getSubmitterType() {
        return submitterType;
    }

    public void setSubmitterType(String submitterType) {
        this.submitterType = submitterType;
    }

    public int getRecordAction() {
        return recordAction;
    }

    public void setRecordAction(int recordAction) {
        this.recordAction = recordAction;
    }
}
