package pojo.CreateOrUpdateAPI.BuildingEquipments;

import java.util.List;

public class ApplicationAssignBuildingEquipments {

    private int recordAction;
    private List<AssignBuildingEquipments> assignBuildingEquipments;

    public List<AssignBuildingEquipments> getAssignBuildingEquipments() {
        return assignBuildingEquipments;
    }

    public void setAssignBuildingEquipments(List<AssignBuildingEquipments> assignBuildingEquipments) {
        this.assignBuildingEquipments = assignBuildingEquipments;
    }

    public int getRecordAction() {
        return recordAction;
    }

    public void setRecordAction(int recordAction) {
        this.recordAction = recordAction;
    }



}
