package in.lpu.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aob")
public class Address {
	@Value("5-55")
	private String hno;
	@Value("HYD")
	private String loc;
	@Override
	public String toString() {
		return "Employee [hno=" + hno + ", loc=" + loc + "]";
	}
	

}
