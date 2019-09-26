package s105;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class MyListTest {

	@Test
	void addOne() {
		MyList ml = new MyList();

		ml.add(24);

	}

	@Test
	void emptySize() {
		MyList ml = new MyList();
		
		assertThat(ml.size(), is(0));
	}

	@Test
	void sizeOne() {
		MyList ml = new MyList();
		
		ml.add(23);
		
		assertThat(ml.size(), is(1));
	}
	@Test
	void sizeTwo() {
		MyList ml = new MyList();
		
		ml.add(34);
		ml.add(34);
		
		assertThat(ml.size(), is(2));
	}
	@Test
	void getOne() {
		MyList ml = new MyList();
		ml.add(23);
		ml.add(12);
		
		assertThat(ml.get(0), is(23));
	}
	
}
