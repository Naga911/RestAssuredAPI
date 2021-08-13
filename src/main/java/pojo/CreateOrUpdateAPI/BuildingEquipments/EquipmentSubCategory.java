package pojo.CreateOrUpdateAPI.BuildingEquipments;

public class EquipmentSubCategory {
    private int equipmentSubCategoryId;
    private int equipmentCategoryId;
    private String equipmentSubCategoryNameEnglish;
    private String equipmentSubCategoryNameArabic;

    public int getEquipmentSubCategoryId() {
        return equipmentSubCategoryId;
    }

    public void setEquipmentSubCategoryId(int equipmentSubCategoryId) {
        this.equipmentSubCategoryId = equipmentSubCategoryId;
    }

    public int getEquipmentCategoryId() {
        return equipmentCategoryId;
    }

    public void setEquipmentCategoryId(int equipmentCategoryId) {
        this.equipmentCategoryId = equipmentCategoryId;
    }

    public String getEquipmentSubCategoryNameEnglish() {
        return equipmentSubCategoryNameEnglish;
    }

    public void setEquipmentSubCategoryNameEnglish(String equipmentSubCategoryNameEnglish) {
        this.equipmentSubCategoryNameEnglish = equipmentSubCategoryNameEnglish;
    }

    public String getEquipmentSubCategoryNameArabic() {
        return equipmentSubCategoryNameArabic;
    }

    public void setEquipmentSubCategoryNameArabic(String equipmentSubCategoryNameArabic) {
        this.equipmentSubCategoryNameArabic = equipmentSubCategoryNameArabic;
    }
}
