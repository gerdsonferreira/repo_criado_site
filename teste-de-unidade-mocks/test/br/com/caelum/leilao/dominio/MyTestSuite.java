package br.com.caelum.leilao.dominio;

import junit.framework.Test;
import junit.framework.TestResult;
import junit.framework.TestSuite;

public class MyTestSuite extends TestSuite {

	public MyTestSuite() {
		this.addTest((Test) new LeilaoTest());
//		this.addTest(new TestClasse2());
//		this.addTest(new TestClasse3());
	}

	@Override
	public void runTest(Test arg0, TestResult arg1) {
		super.runTest(arg0, arg1);
System.out.println("oi");
		//Aqui você trabalha com o resultado de cada teste.
		//Pode pegar os resultados e mandar pra um jasper por exemplo.
	}
}
