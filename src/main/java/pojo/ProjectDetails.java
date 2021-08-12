package pojo;

public class ProjectDetails {
    private int id;
    private int projectid;
    private String applicationProjectDescription;
    private int applicationProjectTotalArea;
    private double applicationProjectLocationLongitude;
    private double applicationProjectLocationLatitude;
    private int applicationProjectConstructionLicenseNumber;

    public int getId()
    {
        return id;
    }

    public void setId(int id)

    {
        this.id = id;
    }
    public int getProjectid()
    {
        return projectid;
    }

    public void setProjectid(int projectid)

    {
        this.projectid = projectid;
    }

    public String getapplicationProjectDescription()
    {
        return applicationProjectDescription;
    }

    public void setapplicationProjectDescription(String ProjectDescription)
    {
        this.applicationProjectDescription = ProjectDescription;
    }
    public  int getApplicationProjectTotalArea()
    {
        return applicationProjectTotalArea;
    }
    public void setApplicationProjectTotalArea(int totalArea)
    {
        this.applicationProjectTotalArea =totalArea;
    }

    public double getApplicationProjectLocationLongitude() {
        return applicationProjectLocationLongitude;
    }
    public void setApplicationProjectLocationLongitude(double locationLongitude)
    {
        this.applicationProjectLocationLongitude=locationLongitude;
    }

    public double getApplicationProjectLocationLatitude() {
        return applicationProjectLocationLatitude;
    }
    public void setApplicationProjectLocationLatitude(double locationLatitude)
    {
        this.applicationProjectLocationLatitude=locationLatitude;
    }

    public int getApplicationProjectConstructionLicenseNumber() {
        return applicationProjectConstructionLicenseNumber;
    }
    public void setApplicationProjectConstructionLicenseNumber(int licenseNumber)
    {
        this.applicationProjectConstructionLicenseNumber=licenseNumber;
    }
}
