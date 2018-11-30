package sw_sem7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class studentTest {

	@Test
	void test() {
		student stu1 = new student("15b1seas1122", "Batbold", "Otgonbileg", "SHD-16khoroo-32-14", 377663471);
		stu1.stuIdCheck("15b1seas1122");
		
	}

}
