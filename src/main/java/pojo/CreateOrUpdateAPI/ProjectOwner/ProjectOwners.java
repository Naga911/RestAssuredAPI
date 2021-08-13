package pojo.CreateOrUpdateAPI.ProjectOwner;

public class ProjectOwners {
    private String ownerType;
    private int recordAction;
    private EstablishmentOwners establishmentOwners;

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public int getRecordAction() {
        return recordAction;
    }

    public void setRecordAction(int recordAction) {
        this.recordAction = recordAction;
    }

    public EstablishmentOwners getEstablishmentOwners() {
        return establishmentOwners;
    }

    public void setEstablishmentOwners(EstablishmentOwners establishmentOwners) {
        this.establishmentOwners = establishmentOwners;
    }


}
