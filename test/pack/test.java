package pack;

import static org.junit.Assert.*;

import org.junit.Test;

import kalk.klient;

public class test {

	
	@Test
	public void test2() {
		// ��������
		// <=50 �.�.
		// ����� 22 ���, ���� �� 3 ���
		// ��� �����������
		float k1=(float)0.6,k2=(float)1.7,k3=1215,k4=(float)1.8;
		int s;
		//s - �������� �� ������� sums, ������������� � ������ klient
		s=klient.sums(k1,k2,k3,k4);
		// tests - �������� ��������
		int tests=4015;
		// �������� ������
		assertEquals((int)tests,s);
	}
	
	}
