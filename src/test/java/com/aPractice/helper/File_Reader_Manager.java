package com.aPractice.helper;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {

	
	}
	
	
	public static File_Reader_Manager get_Instance() {

		File_Reader_Manager obj = new File_Reader_Manager();
		
		return obj;
		
	}
	
	
	public Configuration_Reader get_InstanceCR() throws Throwable {

		Configuration_Reader reader = new Configuration_Reader();
		
		return reader;
		
	}

}
