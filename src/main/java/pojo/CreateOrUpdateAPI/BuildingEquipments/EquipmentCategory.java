package pojo.CreateOrUpdateAPI.BuildingEquipments;

import java.util.List;

public class EquipmentCategory {
    private int equipmentCategoryId;
    private String equipmentCategoryNameEnglish;
    private String equipmentCategoryNameArabic;
    private int equipmentSubCategoryId;

    private List<ApplicationBuilding> applicationBuilding;
    private List<EquipmentSubCategory> equipmentSubCategory;

    public int getEquipmentCategoryId() {
        return equipmentCategoryId;
    }

    public void setEquipmentCategoryId(int equipmentCategoryId) {
        this.equipmentCategoryId = equipmentCategoryId;
    }

    public String getEquipmentCategoryNameEnglish() {
        return equipmentCategoryNameEnglish;
    }

    public void setEquipmentCategoryNameEnglish(String equipmentCategoryNameEnglish) {
        this.equipmentCategoryNameEnglish = equipmentCategoryNameEnglish;
    }

    public String getEquipmentCategoryNameArabic() {
        return equipmentCategoryNameArabic;
    }

    public void setEquipmentCategoryNameArabic(String equipmentCategoryNameArabic) {
        this.equipmentCategoryNameArabic = equipmentCategoryNameArabic;
    }

    public int getEquipmentSubCategoryId() {
        return equipmentSubCategoryId;
    }

    public void setEquipmentSubCategoryId(int equipmentSubCategoryId) {
        this.equipmentSubCategoryId = equipmentSubCategoryId;
    }

    public List<ApplicationBuilding> getApplicationBuilding() {
        return applicationBuilding;
    }

    public void setApplicationBuilding(List<ApplicationBuilding> applicationBuilding) {
        this.applicationBuilding = applicationBuilding;
    }

    public List<EquipmentSubCategory> getEquipmentSubCategory() {
        return equipmentSubCategory;
    }

    public void setEquipmentSubCategory(List<EquipmentSubCategory> equipmentSubCategory) {
        this.equipmentSubCategory = equipmentSubCategory;
    }


}
