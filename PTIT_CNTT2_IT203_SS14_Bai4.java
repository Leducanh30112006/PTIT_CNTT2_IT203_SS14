import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PTIT_CNTT2_IT203_SS14_Bai4 {
    public static void main(String[] args) {
        List<String> danhSach = Arrays.asList("Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết");
        Map<String, Integer> baoCao = new TreeMap<>();

        for (String benh : danhSach) {
            baoCao.put(benh, baoCao.getOrDefault(benh, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : baoCao.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}
