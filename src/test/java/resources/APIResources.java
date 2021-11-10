package resources;
//enum is special class in java which has collection of constants or methods
public enum APIResources {

	CreateOrUpdateAPI("/api/services/app/Application/CreateOrUpdateApplication"),
	RegistrationAPI("/api/services/app/Account/Register"),
	GetApplicationByApplicationIdAPI("/api/services/app/Application/GetApplicationByApplicationId"),
	GetApplicationBuildingsByApplicationId("/api/services/app/Application/GetApplicationBuildingsByApplicationId");


	private String resource;

	APIResources(String resource)
	{
		this.resource=resource;
	}

	public String getResource()
	{
		return resource;
	}


}
