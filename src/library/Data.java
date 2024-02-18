package library;

public class Data {
	
	public String code;
	public String name;
	public String gender;
	public String position;
	public int salary;
	
	public Data(String kode, String nama, String jenis, String jabatan) {
		this.code = kode;
		this.name = nama;
		this.gender = jenis;
		this.position = jabatan;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String kode) {
		this.code = kode;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String nama) {
		this.name = nama;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String jenis) {
		this.gender = jenis;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String jabatan) {
		this.position = jabatan;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int gaji) {
		this.salary = gaji;
	}
}
