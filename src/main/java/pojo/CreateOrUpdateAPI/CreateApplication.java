package pojo.CreateOrUpdateAPI;

import pojo.CreateOrUpdateAPI.AppBuilding.ApplicationBuildings;
import pojo.CreateOrUpdateAPI.BuildingEquipments.ApplicationAssignBuildingEquipments;
import pojo.CreateOrUpdateAPI.ProjectOwner.ProjectOwners;


public class CreateApplication {

   private int applicationId;
   private int serviceId;
   private int channelId;
   private int submitterId;
   private String submitterName;
   private ApplicationBuildings applicationBuildings; //AppBuilding package
   private Submitter submitter;
   private ApplicationProject applicationProject;
   private Contact contact;
   private ProjectOwners projectOwners; //ProjectOwner package
   private ApplicationAssignBuildingEquipments applicationAssignBuildingEquipments; //BuildingEquipment package


    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public int getSubmitterId() {
        return submitterId;
    }

    public void setSubmitterId(int submitterId) {
        this.submitterId = submitterId;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public void setSubmitterName(String submitterName) {
        this.submitterName = submitterName;
    }

    public ApplicationProject getApplicationProject() {
        return applicationProject;
    }

    public void setApplicationProject(ApplicationProject applicationProject) {
        this.applicationProject = applicationProject;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }


    public ApplicationBuildings getApplicationBuildings() {
        return applicationBuildings;
    }

    public void setApplicationBuildings(ApplicationBuildings applicationBuildings) {
        this.applicationBuildings = applicationBuildings;
    }

    public ProjectOwners getProjectOwners() {
        return projectOwners;
    }

    public void setProjectOwners(ProjectOwners projectOwners) {
        this.projectOwners = projectOwners;
    }

    public ApplicationAssignBuildingEquipments getApplicationAssignBuildingEquipments() {
        return applicationAssignBuildingEquipments;
    }

    public void setApplicationAssignBuildingEquipments(ApplicationAssignBuildingEquipments applicationAssignBuildingEquipments) {
        this.applicationAssignBuildingEquipments = applicationAssignBuildingEquipments;
    }

    public Submitter getSubmitter() {
        return submitter;
    }

    public void setSubmitter(Submitter submitter) {
        this.submitter = submitter;
    }


}
