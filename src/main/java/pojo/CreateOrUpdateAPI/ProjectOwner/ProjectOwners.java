package pojo.CreateOrUpdateAPI.ProjectOwner;

import java.util.List;

public class ProjectOwners {
    private String ownerType;
    private int recordAction;


    private List<EstablishmentOwners> EstablishmentOwners;

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

    public List<pojo.CreateOrUpdateAPI.ProjectOwner.EstablishmentOwners> getEstablishmentOwners() {
        return EstablishmentOwners;
    }

    public void setEstablishmentOwners(List<pojo.CreateOrUpdateAPI.ProjectOwner.EstablishmentOwners> establishmentOwners) {
        EstablishmentOwners = establishmentOwners;
    }




}
