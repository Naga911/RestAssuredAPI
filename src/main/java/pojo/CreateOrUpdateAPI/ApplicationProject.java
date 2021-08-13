package pojo.CreateOrUpdateAPI;

public class ApplicationProject {

    private int id;
    private String projectId;
    private String applicationProjectDescription;
    private double applicationProjectTotalArea;
    private double applicationProjectLocationLongitude;
    private double applicationProjectLocationLatitude;
    private int applicationProjectConstructionLicenseNumber;
    private int recordAction;

  /*  public ApplicationProject()
    {

    }

    public ApplicationProject(int id,String projectId,String applicationProjectDescription,double applicationProjectTotalArea,double applicationProjectLocationLatitude,double applicationProjectLocationLongitude,int applicationProjectConstructionLicenseNumber,int recordAction)
    {
        this.id=id;
        this.projectId=projectId;
        this.applicationProjectDescription=applicationProjectDescription;
        this.applicationProjectTotalArea=applicationProjectTotalArea;
        this.applicationProjectLocationLongitude=applicationProjectLocationLongitude;
        this.applicationProjectLocationLatitude=applicationProjectLocationLatitude;
        this.applicationProjectConstructionLicenseNumber=applicationProjectConstructionLicenseNumber;
        this.recordAction=recordAction;
    }*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getApplicationProjectDescription() {
        return applicationProjectDescription;
    }

    public void setApplicationProjectDescription(String applicationProjectDescription) {
        this.applicationProjectDescription = applicationProjectDescription;
    }

    public double getApplicationProjectTotalArea() {
        return applicationProjectTotalArea;
    }

    public void setApplicationProjectTotalArea(double applicationProjectTotalArea) {
        this.applicationProjectTotalArea = applicationProjectTotalArea;
    }

    public double getApplicationProjectLocationLongitude() {
        return applicationProjectLocationLongitude;
    }

    public void setApplicationProjectLocationLongitude(double applicationProjectLocationLongitude) {
        this.applicationProjectLocationLongitude = applicationProjectLocationLongitude;
    }

    public double getApplicationProjectLocationLatitude() {
        return applicationProjectLocationLatitude;
    }

    public void setApplicationProjectLocationLatitude(double applicationProjectLocationLatitude) {
        this.applicationProjectLocationLatitude = applicationProjectLocationLatitude;
    }

    public int getApplicationProjectConstructionLicenseNumber() {
        return applicationProjectConstructionLicenseNumber;
    }

    public void setApplicationProjectConstructionLicenseNumber(int applicationProjectConstructionLicenseNumber) {
        this.applicationProjectConstructionLicenseNumber = applicationProjectConstructionLicenseNumber;
    }

    public int getRecordAction() {
        return recordAction;
    }

    public void setRecordAction(int recordAction) {
        this.recordAction = recordAction;
    }
}
