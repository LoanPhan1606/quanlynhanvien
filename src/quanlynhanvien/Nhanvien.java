package quanlynhanvien;

public class Nhanvien {
	private String MaNV; 
	private String HoTen;
	private boolean Gioitinh;
	public Nhanvien(String maNV, String hoTen, boolean gioitinh) {
		super();
		MaNV = maNV;
		HoTen = hoTen;
		Gioitinh = gioitinh;
	}
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public boolean isGioitinh() {
		return Gioitinh;
	}
	public void setGioitinh(boolean gioitinh) {
		Gioitinh = gioitinh;
	}
}
