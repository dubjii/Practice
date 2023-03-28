package com.capgemini.practice;

import java.io.IOException;

public class Practice20 {
			public void show()throws IOException{
				throw new IOException("hii");
			}
	public static void main(String[] args) {
		Practice20 p = new Practice20();
		try{
			p.show();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
