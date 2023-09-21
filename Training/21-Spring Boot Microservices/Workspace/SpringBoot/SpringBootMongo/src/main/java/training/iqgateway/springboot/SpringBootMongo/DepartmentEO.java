package training.iqgateway.springboot.SpringBootMongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Departments")
public class DepartmentEO {
	
	@Id
	private String id;
	private Integer DEPARTMENT_ID;
	private String DEPARTMENT_NAME;
	private Integer MANAGER_ID;
	private Integer LOCATION_ID;
	
	public DepartmentEO() {
		// TODO Auto-generated constructor stub
	}

	public DepartmentEO(String id, Integer dEPARTMENT_ID, String dEPARTMENT_NAME, Integer mANAGER_ID,
			Integer lOCATION_ID) {
		super();
		this.id = id;
		DEPARTMENT_ID = dEPARTMENT_ID;
		DEPARTMENT_NAME = dEPARTMENT_NAME;
		MANAGER_ID = mANAGER_ID;
		LOCATION_ID = lOCATION_ID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}

	public void setDEPARTMENT_ID(Integer dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}

	public String getDEPARTMENT_NAME() {
		return DEPARTMENT_NAME;
	}

	public void setDEPARTMENT_NAME(String dEPARTMENT_NAME) {
		DEPARTMENT_NAME = dEPARTMENT_NAME;
	}

	public Integer getMANAGER_ID() {
		return MANAGER_ID;
	}

	public void setMANAGER_ID(Integer mANAGER_ID) {
		MANAGER_ID = mANAGER_ID;
	}

	public Integer getLOCATION_ID() {
		return LOCATION_ID;
	}

	public void setLOCATION_ID(Integer lOCATION_ID) {
		LOCATION_ID = lOCATION_ID;
	}

	@Override
	public String toString() {
		return "DepartmentEO [id=" + id + ", DEPARTMENT_ID=" + DEPARTMENT_ID + ", DEPARTMENT_NAME=" + DEPARTMENT_NAME
				+ ", MANAGER_ID=" + MANAGER_ID + ", LOCATION_ID=" + LOCATION_ID + "]";
	}

	

}
