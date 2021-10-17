import java.util.ArrayList;
import java.util.List;

public class XuLySanPham {
	List<SanPham> listSanPham = new ArrayList<SanPham>();
	ArrayList<SanPham> dSSP;
	
	public int themSanPham (SanPham SP) {
		listSanPham.add(SP);
		return 1;
	}
	public SanPham findSanPhamByMaSP(String masp) {
		for(SanPham sp:listSanPham)
		{
			if(sp.getMaSP().equalsIgnoreCase(masp))
				return sp;
		}
		return null;
	}
	public int editSanPham(SanPham sp) {
		for(SanPham sanPham:listSanPham) {
			if(sanPham.getMaSP().equals(sp.getMaSP())) {
				sanPham.setTenSP(sp.getTenSP());
				sanPham.setGiaSP(sp.getGiaSP());
				break;
			}
		}
		return 1;
	}
	
	public int deleteSanPham(String masp) {
		SanPham find= findSanPhamByMaSP(masp);
		if(find!=null) {
			listSanPham.remove(find);
			return 1;
		}
		return -1;
	}
}
