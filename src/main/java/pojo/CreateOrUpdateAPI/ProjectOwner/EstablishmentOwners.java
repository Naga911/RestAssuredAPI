package pojo.CreateOrUpdateAPI.ProjectOwner;

public class EstablishmentOwners {
    private int id;
    private int establishmentLicense;
    private String establishmentName;
    private int recordAction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstablishmentLicense() {
        return establishmentLicense;
    }

    public void setEstablishmentLicense(int establishmentLicense) {
        this.establishmentLicense = establishmentLicense;
    }

    public String getEstablishmentName() {
        return establishmentName;
    }

    public void setEstablishmentName(String establishmentName) {
        this.establishmentName = establishmentName;
    }

    public int getRecordAction() {
        return recordAction;
    }

    public void setRecordAction(int recordAction) {
        this.recordAction = recordAction;
    }
}
