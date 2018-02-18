package pack;

import static org.junit.Assert.*;

import org.junit.Test;

import kalk.klient;

public class test {

	
	@Test
	public void test2() {
		// Мотоцикл
		// <=50 л.с.
		// Свыше 22 лет, стаж до 3 лет
		// Без ограничения
		float k1=(float)0.6,k2=(float)1.7,k3=1215,k4=(float)1.8;
		int s;
		//s - значение из функции sums, расположенной в классе klient
		s=klient.sums(k1,k2,k3,k4);
		// tests - итоговое значение
		int tests=4015;
		// итоговая сверка
		assertEquals((int)tests,s);
	}
	
	}
