package in.lpu.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class EmpJdbcRepo implements IEmpRepo {
@Value("EMPLOYEE_JDBC")
private String model;

@Override
public String toString() {
	return "EmpJdbcRepo [model=" + model + "]";
}


}
