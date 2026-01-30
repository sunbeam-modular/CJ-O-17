package com.subeam.p1;

// Singleton design pattern
class FileIo {
	// step2 : Create a static field of the same class
	private static FileIo ref = null;

	// step1 : Make the ctor private
	private FileIo() {
		System.out.println("FileIo Ctor");
	}

	// step3: Create a getter that returns the class instance
	public static FileIo getFileIoInstance() {
		if (ref == null)
			ref = new FileIo();
		return ref;
	}

}

public class Program03 {

	public static void main(String[] args) {
		FileIo i1 = FileIo.getFileIoInstance();
		FileIo i2 = FileIo.getFileIoInstance();
		FileIo i3 = FileIo.getFileIoInstance();
		FileIo i4 = FileIo.getFileIoInstance();
		FileIo i5 = FileIo.getFileIoInstance();
	}

}
