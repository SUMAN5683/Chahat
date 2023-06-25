package com.actitime.testscript;

import java.io.IOException;

import com.actitime.generic.FileLib;

public class demo {
public static void main(String[] args) throws IOException {
	FileLib f=new FileLib();
	String url1 = f.getPropertyData("url");
	System.out.println(url1);
}
}
