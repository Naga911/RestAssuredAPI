package pojo.CreateOrUpdateAPI;

public class Contact {
    private int id;
    private int MobileNumber;
    private int recordAction;

    /*public Contact()
    {

    }
    public Contact(int id,int MobileNumber,int recordAction)
    {
        this.id=id;
        this.MobileNumber=MobileNumber;
        this.recordAction=recordAction;
    }*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public int getRecordAction() {
        return recordAction;
    }

    public void setRecordAction(int recordAction) {
        this.recordAction = recordAction;
    }
}
