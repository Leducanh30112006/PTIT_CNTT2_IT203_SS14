import java.util.LinkedHashSet;
import java.util.Set;

public class PTIT_CNTT2_IT203_SS14_Bai1 {
    static void main(String[] args) {
        Set<String> patientList = new LinkedHashSet<>();
        String [] input = {"Nguyễn Văn A – Yên Bái", "Trần Thị B – Thái Bình", "Nguyễn Văn A – Yên Bái", "Lê Văn C – Hưng Yên"};
        for (String patient : input) {
            patientList.add(patient);
            
        }
        System.out.println("Danh sách gọi khám (Theo thứ tự đăng ký):");
        int stt = 1;
        for (String patient : patientList) {
            System.out.println(stt + ". " + patient);
            stt++;
        }    }
}
