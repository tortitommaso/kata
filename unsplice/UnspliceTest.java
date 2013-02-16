package unsplice;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnspliceTest {
	
	@Test
	public void test() {
		Unsplice unsplice = new Unsplice();
		assertEquals("abcdef", unsplice.run("ab\\\ncd\\\nef") );
		assertEquals("abcdef", unsplice.run("abc\\\ndef") );
		assertEquals("abc\n\\def", unsplice.run("abc\n\\def") );
		assertEquals("abc\\def", unsplice.run("abc\\def") );
		assertEquals("abcdef", unsplice.run("abcdef\\\n") );
		assertEquals("abcdef", unsplice.run("abcdef") );
	}

}
