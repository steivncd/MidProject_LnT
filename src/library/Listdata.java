package library;

import java.util.ArrayList;

public class Listdata {
	ArrayList<Data> mydata = new ArrayList<>();
	
	public void addData(Data data) {
		mydata.add(data);
	}
	
	public void sortData() {
		Collections.sort(mydata, new Comparator<Data>() {
		@Override
		public int compare(Data m1, Data m2) {
			return m1.getName().compareTo(m2.getName());
		}		
		});
	}
	
	public void uptData(int idx, String kode, String nama, String gender, String jabatan) {
		
		Data newData = mydata.get(idx-1);
		
		if(nama.equals("0")) {
		
		} else {
			newData.setName(nama);
		}
		
		if(kode.equals("0")) {
		
		} else {
			newData.setCode(kode);
		}
		
		if(gender.equals("0")) {
		
		} else {
			newData.setGender(gender);
		}
		
		if(jabatan.equals("0")) {

		} else {
			newData.setPosition(jabatan);
		}
		
	}
	
	public void delete(int del) {
		Data data = mydata.get(del);
		System.out.println("Karyawan dengan kode " + data.code + " telah berhasil dihapus");
		mydata.remove(del);
	}
	
	public void salary() {
		for(Data data : mydata) {
			if(data.position.equals("Manager")) {
				data.salary = 8000000;
			} else if(data.position.equals("Supervisor")) {
				data.salary = 6000000;
			} else if(data.position.equals("Admin")) {
				data.salary = 4500000;
			}
		}
	}
	
	public void bonus(int m, int s, int a) {
		
		if(m % 3 == 1) {
			int countM = 1;
			for(Data data : mydata) {
				if(countM < m && data.position.equals("Manager")) {
					data.salary += data.salary * 0.1;
					countM++;
				}
			}
		}
		
		if(s % 3 == 1) {
			int countS = 1;
			for(Data data : mydata) {
				if(countS < s && data.position.equals("Supervisor")) {
					data.salary += data.salary * 0.075;
					countS++;
				}
			}
		}
		
		if(a % 3 == 1) {
			int countA = 1;
			for(Data data : mydata) {
				if(countA < a && data.position.equals("Admin")) {
					data.salary += data.salary * 0.05;
				}
			}
		}
		
	}
	
	public void displayData() {
		
		sortData();
		
		System.out.printf("%-5s %-15s %-20s %-20s %-15s %s","No", "Kode karyawan", "Nama karyawan", "Jenis kelamin", "Jabatan", "Gaji karyawan");
		System.out.printf("\n");
		
		int i = 1;
		for(Data data : mydata) {
			System.out.printf("%-5d %-15s %-22s %-17s %-18s %d\n", i, data.code, data.name, data.gender, data.position, data.salary);
			i++;
		}
		System.out.printf("\n");
	}
}
