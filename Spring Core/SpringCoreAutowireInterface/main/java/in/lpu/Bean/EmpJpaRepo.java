package in.lpu.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class EmpJpaRepo implements IEmpRepo {
	
	@Value("EMPLOYEE_JPA")
	private String model;

	@Override
	public String toString() {
		return "EmpJpaRepo [model=" + model + "]";
	}
	
	

}
