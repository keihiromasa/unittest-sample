package org.keihiromasa.example;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.keihiromasa.example.SomeClass1;
import org.keihiromasa.example.SomeClass2;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ SomeClass1.class, SomeClass2.class })
public class SomeClass2Test {

	@Test
	public void 午前の場合おはようございますを返す() throws Exception {
		SomeClass1 mock = Mockito.mock(SomeClass1.class);
		PowerMockito.whenNew(SomeClass1.class).withNoArguments().thenReturn(mock);
		doReturn(true).when(mock).isAMNow();
		assertEquals("おはようございます！", SomeClass2.greet());
	}

	@Test
	public void 午後の場合こんにちはを返す() throws Exception {
		SomeClass1 mock = Mockito.mock(SomeClass1.class);
		PowerMockito.whenNew(SomeClass1.class).withNoArguments().thenReturn(mock);
		doReturn(false).when(mock).isAMNow();
		assertEquals("こんにちは！", SomeClass2.greet());
	}
}
