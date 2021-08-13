package pojo.CreateOrUpdateAPI;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.CreateOrUpdateAPI.AppBuilding.ApplicationBuild;
import pojo.CreateOrUpdateAPI.AppBuilding.Buildings;
import pojo.CreateOrUpdateAPI.BuildingEquipments.*;
import pojo.CreateOrUpdateAPI.ProjectOwner.EstablishmentOwners;
import pojo.CreateOrUpdateAPI.ProjectOwner.ProjectOwners;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializeDeserialize {

    public static CreateApplication createApplication() throws IOException {
        String bodyString;
        byte[] bytesFromJson = Files.readAllBytes(Paths.get("C:\\Users\\Nagaraj\\IdeaProjects\\RestAssuredAPI\\src\\main\\java\\pojo\\CreateOrUpdateAPI\\createapi.json"));
        bodyString = new String(bytesFromJson);
        ObjectMapper objectMapper = new ObjectMapper();
        CreateApplication createApplication=objectMapper.readValue(bodyString, CreateApplication.class);


        createApplication.setSubmitterId(1);
        createApplication.setSubmitterName("nagaraj");

        Submitter submitter= new Submitter();
        submitter.setSubmitterid(1);
        submitter.setSubmitterName("nagaraj");
        submitter.setSubmitterType("Establishment");
        submitter.setRecordAction(0);

        Contact contact= new Contact();
        contact.setId(0);
        contact.setMobileNumber(9765432);
        contact.setRecordAction(0);

        ApplicationProject applicationProject= new ApplicationProject();
        applicationProject.setId(0);
        applicationProject.setProjectId("");
        applicationProject.setApplicationProjectDescription("TestProject_API");
        applicationProject.setApplicationProjectTotalArea(5000);
        applicationProject.setApplicationProjectLocationLatitude(1234.45);
        applicationProject.setApplicationProjectLocationLongitude(1444.5);
        applicationProject.setApplicationProjectConstructionLicenseNumber(12345);
        applicationProject.setRecordAction(0);

        EstablishmentOwners establishmentOwners= new EstablishmentOwners();
        establishmentOwners.setId(0);
        establishmentOwners.setEstablishmentName("est123");
        establishmentOwners.setEstablishmentLicense(123);
        establishmentOwners.setRecordAction(1);

        ProjectOwners projectOwners= new ProjectOwners();
        projectOwners.setOwnerType("Establishment");
        projectOwners.setRecordAction(0);
        projectOwners.setEstablishmentOwners(establishmentOwners);

        EquipmentCategory equipmentCategory= new EquipmentCategory();
        equipmentCategory.setEquipmentCategoryId(1);
        equipmentCategory.setEquipmentCategoryNameEnglish("Fire Safety");
        equipmentCategory.setEquipmentCategoryNameArabic("السلامة من الحرائق");

        EquipmentSubCategory equipmentSubCategory= new EquipmentSubCategory();
        equipmentSubCategory.setEquipmentCategoryId(1);
        equipmentSubCategory.setEquipmentSubCategoryId(1);
        equipmentSubCategory.setEquipmentSubCategoryNameEnglish("Sprinklers");
        equipmentSubCategory.setEquipmentSubCategoryNameArabic("الرشاشات");

        ApplicationBuilding applicationBuilding=new ApplicationBuilding();
        applicationBuilding.setApplicationBuildingId(7);
        applicationBuilding.setBuildingId(0);
        applicationBuilding.setApplicationBuildingNickname("BillaComplext");

        AssignBuildingEquipments assignBuildingEquipments= new AssignBuildingEquipments();
        assignBuildingEquipments.setId(0);
        assignBuildingEquipments.setBuildingEquipmentSubCategoryId(0);
        assignBuildingEquipments.setApplicationBuilding(applicationBuilding);
        assignBuildingEquipments.setEquipmentCategory(equipmentCategory);
        assignBuildingEquipments.setEquipmentSubCategory(equipmentSubCategory);
        assignBuildingEquipments.setRecordAction(1);

        ApplicationAssignBuildingEquipments applicationAssignBuildingEquipments= new ApplicationAssignBuildingEquipments();
        applicationAssignBuildingEquipments.setAssignBuildingEquipments(assignBuildingEquipments);
        applicationAssignBuildingEquipments.setRecordAction(0);

        Buildings buildings= new Buildings();
        buildings.setId(0);
        buildings.setBuildingId(0);
        buildings.setApplicationBuildingNickname("BillaComplext");
        buildings.setApplicationBuildingHeight(1250);
        buildings.setApplicationBuildingNumberOfFloors(12);
        buildings.setApplicationBuildingNumberofBasementFloors(2);
        buildings.setApplicationBuildingGroundFloorSize(50);
        buildings.setApplicationBuildingNumberOfStaircases(25);
        buildings.setApplicationBuildingNumberOfExits(2);
        buildings.setApplicationBuildingNumberOfLifts(2);
        buildings.setApplicationBuildingTotalArea(6000);
        buildings.setRecordAction(1);

        ApplicationBuild applicationBuild= new ApplicationBuild();
        applicationBuild.setRecordAction(0);
        applicationBuild.setBuildings(buildings);
        return createApplication;



    }
}
