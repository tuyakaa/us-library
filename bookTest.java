package sw_sem7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class bookTest {

	@Test
	void test() {
		book book1 = new book("bk003", "hello", "Nomin", 2000, 1);
		book1.bookCheck("hello");
		book1.bookIdCheck("bk003");
	}

}
