package pojo.CreateOrUpdateAPI.AppBuilding;

import java.util.List;

public class ApplicationBuildings {

    private int recordAction;
    private List<pojo.CreateOrUpdateAPI.AppBuilding.Building.ApplicationBuildings> ApplicationBuildings;


    public int getRecordAction() {
        return recordAction;
    }

    public void setRecordAction(int recordAction) {
        this.recordAction = recordAction;
    }

    public List<pojo.CreateOrUpdateAPI.AppBuilding.Building.ApplicationBuildings> getApplicationBuildings() {
        return ApplicationBuildings;
    }

    public void setApplicationBuildings(List<pojo.CreateOrUpdateAPI.AppBuilding.Building.ApplicationBuildings> applicationBuildings) {
        ApplicationBuildings = applicationBuildings;
    }

}
