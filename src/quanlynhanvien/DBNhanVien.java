package quanlynhanvien;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


@SuppressWarnings("unused")
public class DBNhanVien {
	List<Nhanvien> dsNhanVien;
	public List<Nhanvien> getdsNhanVien(){
		return dsNhanVien;
	}
	
	 @SuppressWarnings("unused")
	public DBNhanVien()
	 {
		 Nhanvien nv1= new Nhanvien("001", "Phan Thi Bich Loan", true);
		 Nhanvien nv2= new Nhanvien("002", "Phan Thi Bich Loan", true);
		 Nhanvien nv3= new Nhanvien("003", "Phan Thi Bich Loan", true);
		 Nhanvien nv4= new Nhanvien("004", "Phan Thi Bich Loan", true);
		 Nhanvien nv5= new Nhanvien("005", "Phan Thi Bich Loan", true);
		 Nhanvien nv6= new Nhanvien("006", "Phan Thi Bich Loan", true);
		 Nhanvien nv7= new Nhanvien("007", "Phan Thi Bich Loan", true);
		 Nhanvien nv8= new Nhanvien("008", "Phan Thi Bich Loan", true);
		 Nhanvien nv9= new Nhanvien("009", "Phan Thi Bich Loan", true);
		 Nhanvien nv10= new Nhanvien("010", "Phan Thi Bich Loan", true);
		 
		 dsNhanVien = new ArrayList<Nhanvien>();
		 dsNhanVien.add(nv1);			dsNhanVien.add(nv6);			
		 dsNhanVien.add(nv2);			dsNhanVien.add(nv7);			
		 dsNhanVien.add(nv3);			dsNhanVien.add(nv8);			
		 dsNhanVien.add(nv4);			dsNhanVien.add(nv9);			
		 dsNhanVien.add(nv5);			dsNhanVien.add(nv10);			
	 }
}



	
}

