package in.lpu.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eob")
public class Employee {
	@Value("10")
	private int empId;
	@Autowired(required = false)
	private Address addr; // HAS-A

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", addr=" + addr + "]";
	}

}
