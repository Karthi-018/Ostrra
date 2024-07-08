package training.demo2;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Test;

@ExtendWith(MockitoExtension.class)
class CourceTest {
	
	@Mock
	private service s;
	
	@InjectMocks
	private Cources cou;

	@Test
	void test() {
		when(s.course()).thenReturn(new String[] {"btech","bcom","mcom","mcs","mca","bca"});
		boolean result = cou.isThere();
		assertEquals(true, result);
	}

}
