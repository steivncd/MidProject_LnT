package main;

import java.util.ArrayList;
import java.util.Scanner;

import library.Data;
import library.Listdata;

public class Main {
	
	public Main() {
		
		Listdata library = new Listdata();
		Scanner scan = new Scanner(System.in);
		int choice;
		
		int countM = 0;
		int countS = 0;
		int countA = 0;
		
		do {
			do {
			System.out.println("________________");
			System.out.println("1. Insert Data");
			System.out.println("2. View Data");
			System.out.println("3. Update Data");
			System.out.println("4. Delete Data");
			System.out.print(">>");
			choice = scan.nextInt();
			scan.nextLine();
			} while(choice < 0 || choice > 5);
			
			switch(choice) {
			
			case 1:
				System.out.print("Input kode karyawan :");
				String code = scan.nextLine();
				
				System.out.print("Input nama karyawan [ >=3 ] :");
				String nama = scan.nextLine();
				
				System.out.print("Input jenis kelamin [ Laki-laki | Perempuan ] :");
				String gender = scan.nextLine();
				
				System.out.print("Input jabatan [Manager | Supervisor | Admin] :");
				String jabatan = scan.nextLine();
				
				Data data = new Data(code, nama, gender, jabatan);
				library.addData(data);
				
				System.out.printf("Berhasil menambahkan karyawan dengan ID %s\n", code);
				
					if(jabatan.equals("Manager")) {
						countM++;
					} else if(jabatan.equals("Supervisor")) {
						countS++;
					} else if(jabatan.equals("Admin")) {
						countA++;
					}
					
					library.salary();
					library.bonus(countM, countS, countA);
					
				break;
			case 2:
				library.sortData();
				library.displayData();
				break;
			case 3:
				library.sortData();
				library.displayData();
				
				System.out.println("Input nomor urutan karyawan yang ingin diupdate :");
				int index = scan.nextInt();
				scan.nextLine();
				
				System.out.print("Input kode karyawan :");
				String newCode = scan.nextLine();
				
				System.out.print("Input nama karyawan [ >=3 ] :");
				String newName = scan.nextLine();
				
				System.out.print("Input jenis kelamin [ Laki-laki | Perempuan ] :");
				String newGender = scan.nextLine();
				
				System.out.print("Input jabatan [Manager | Supervisor | Admin] :");
				String newPosition = scan.nextLine();
				
				library.uptData(index, newCode, newName, newGender, newPosition);
				System.out.printf("Berhasil mengupdate karyawan dengan ID %s", newCode);
				library.sortData();
				library.displayData();
				break;
				
			case 4:
				library.sortData();
				library.displayData();
				System.out.println("Input nomor urutan yang ingin dihapus :");
				int del = scan.nextInt();
				scan.nextLine();
				library.delete(del-1);
				break;
			}
			
		} while(choice < 5 && choice > 0);
	}
	
	
	public static void main(String[] args) {
		new Main();
	}
}
