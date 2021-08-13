package pojo.CreateOrUpdateAPI;

public class Submitter {

    private int submitterid;
    private String submitterName;
    private String submitterType;
    private int recordAction;

    /* public Submitter()
     {

     }
     public Submitter(int submitterid,String submitterName,String submitterType,int recordAction)
     {
         this.submitterid=submitterid;
         this.submitterName=submitterName;
         this.submitterType=submitterType;
         this.recordAction=recordAction;
     }*/
    public int getSubmitterid() {
        return submitterid;
    }

    public void setSubmitterid(int submitterid) {
        this.submitterid = submitterid;
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
