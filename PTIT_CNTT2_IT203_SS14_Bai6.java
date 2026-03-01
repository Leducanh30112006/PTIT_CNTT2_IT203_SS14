import java.util.*;


public class PTIT_CNTT2_IT203_SS14_Bai6 {
    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(
                new Patient("Lan", 30, "Tim mạch"),
                new Patient("Hùng", 45, "Nội tiết"),
                new Patient("Mai", 25, "Tim mạch"),
                new Patient("An", 50, "Nội tiết"),
                new Patient("Bình", 60, "Tim mạch")
        );

        Map<String, List<Patient>> departmentMap = new HashMap<>();

        for (Patient p : patients) {
            departmentMap.putIfAbsent(p.department, new ArrayList<>());
            departmentMap.get(p.department).add(p);
        }

        System.out.println("Cấu trúc Map:");
        departmentMap.forEach((dept, list) -> System.out.println("Khoa " + dept + " -> " + list));

        String busiestDept = "";
        int maxPatients = -1;

        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            if (entry.getValue().size() > maxPatients) {
                maxPatients = entry.getValue().size();
                busiestDept = entry.getKey();
            }
        }

        System.out.println("\nPhân tích:");
        System.out.println("Khoa " + busiestDept + " đang đông nhất (" + maxPatients + " bệnh nhân).");
    }
}
