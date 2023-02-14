package org.youngmin.chap105;

public class FileInputStream implements AutoCloseable {
	
	
	// 필드
	private String file;
	

	// 
	public FileInputStream(String file) {
		this.file = file; // this.필드에 있는 file = 매개 변수로 들어간 여기에서는 String file
	}
	
	public void read() {
		System.out.println(file+"을 읽습니다.");

	
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
	}

}
