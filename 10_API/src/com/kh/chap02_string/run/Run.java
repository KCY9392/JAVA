package com.kh.chap02_string.run;

import com.kh.chap02_string.controller.A_StringPoolTest;
import com.kh.chap02_string.controller.B_StringMethodTest;
import com.kh.chap02_string.controller.C_StringTokenizerTest;
import com.kh.chap02_string.controller.D_StringBufferAndBuilder;

public class Run {

	public static void main(String[] args) {
		
		A_StringPoolTest as = new A_StringPoolTest();
//		as.method1();
//		as.method2();
//		as.method3();
		
		B_StringMethodTest bs = new B_StringMethodTest();
//		bs.method1();
		
		C_StringTokenizerTest cs = new C_StringTokenizerTest();
//		cs.method1();
		
		D_StringBufferAndBuilder ds = new D_StringBufferAndBuilder();
		ds.method();
	}

}
