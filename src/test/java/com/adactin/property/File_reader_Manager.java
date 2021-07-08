package com.adactin.property;

import com.adactin.helper.Configuration_Reader;

public class File_reader_Manager {
	
	private File_reader_Manager() {
		
	}
	
	public static File_reader_Manager getInstance() {
      File_reader_Manager helper = new File_reader_Manager();
      return helper;
	}
	
	public Configuration_Reader getInstanceCR() throws Throwable {
		Configuration_Reader reader = new Configuration_Reader();
		return reader;
	}

}
