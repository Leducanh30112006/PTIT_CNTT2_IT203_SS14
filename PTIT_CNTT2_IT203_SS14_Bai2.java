import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class PTIT_CNTT2_IT203_SS14_Bai2 {
    static void main(String[] args) {
        HashMap<String , String> danhMucThuoc = new HashMap<>();
        danhMucThuoc.put("T01","Paracetamol");
        danhMucThuoc.put("T02","Captopril");
        danhMucThuoc.put("T03","Amoxicillin");
        danhMucThuoc.put("T04","Ibuprofen");
        danhMucThuoc.put("T05","Metformin");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma thuoc :");
        String maThuoc = sc.nextLine().trim().toUpperCase();
        if (danhMucThuoc.containsKey(maThuoc)) {
            System.out.println("Ten thuoc : " + danhMucThuoc.get(maThuoc));
        } else {
            System.out.println("Ma thuoc khong ton tai trong danh muc.");
            
        }
        sc.close();
    }
}
