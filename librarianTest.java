package sw_sem7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class librarianTest {

	@Test
	void test() {
		librarian lib1 = new librarian("Solongo", "lib_003", "123");
		lib1.singIn("lib_003", "123");
	}

}
