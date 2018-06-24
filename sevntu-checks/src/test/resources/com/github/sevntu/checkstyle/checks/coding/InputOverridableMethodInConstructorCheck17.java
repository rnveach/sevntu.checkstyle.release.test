package com.github.sevntu.checkstyle.checks.coding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InputOverridableMethodInConstructorCheck17 {


	private class Object1 implements Serializable {

		public void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
			 doSmth(); //!!
			 Object1.this.doSmth(); //!!
		}

		public final void doSmth(String value) {
			System.out.println(value);
		}

		public void doSmth() {
			System.out.println("Bar!");
		}
	}

	private class Object2 {

		public void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		}
	}

}
