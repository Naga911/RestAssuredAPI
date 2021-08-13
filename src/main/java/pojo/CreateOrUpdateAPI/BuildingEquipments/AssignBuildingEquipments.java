package pojo.CreateOrUpdateAPI.BuildingEquipments;

public class AssignBuildingEquipments {
    private int id;
    private int buildingEquipmentSubCategoryId;
    private ApplicationBuilding applicationBuilding;
    private EquipmentCategory equipmentCategory;
    private EquipmentSubCategory equipmentSubCategory;
    private int recordAction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuildingEquipmentSubCategoryId() {
        return buildingEquipmentSubCategoryId;
    }

    public void setBuildingEquipmentSubCategoryId(int buildingEquipmentSubCategoryId) {
        this.buildingEquipmentSubCategoryId = buildingEquipmentSubCategoryId;
    }

    public ApplicationBuilding getApplicationBuilding() {
        return applicationBuilding;
    }

    public void setApplicationBuilding(ApplicationBuilding applicationBuilding) {
        this.applicationBuilding = applicationBuilding;
    }

    public EquipmentCategory getEquipmentCategory() {
        return equipmentCategory;
    }

    public void setEquipmentCategory(EquipmentCategory equipmentCategory) {
        this.equipmentCategory = equipmentCategory;
    }

    public EquipmentSubCategory getEquipmentSubCategory() {
        return equipmentSubCategory;
    }

    public void setEquipmentSubCategory(EquipmentSubCategory equipmentSubCategory) {
        this.equipmentSubCategory = equipmentSubCategory;
    }

    public int getRecordAction() {
        return recordAction;
    }

    public void setRecordAction(int recordAction) {
        this.recordAction = recordAction;
    }

}
