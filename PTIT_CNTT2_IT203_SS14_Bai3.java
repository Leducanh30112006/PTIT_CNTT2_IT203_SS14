import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PTIT_CNTT2_IT203_SS14_Bai3 {
    public static void main(String[] args) {
        Set<String> setA = new HashSet<>(Arrays.asList("Aspirin", "Caffeine", "Paracetamol"));
        Set<String> setB = new HashSet<>(Arrays.asList("Penicillin", "Aspirin"));

        Set<String> canhBao = new HashSet<>(setA);
        canhBao.retainAll(setB);

        Set<String> anToan = new HashSet<>(setA);
        anToan.removeAll(setB);

        System.out.println("Thuốc: " + setA);
        System.out.println("Dị ứng: " + setB);
        System.out.println("------------------------------");
        System.out.println("Cảnh báo dị ứng: " + canhBao);
        System.out.println("Thành phần an toàn: " + anToan);
    }
}
