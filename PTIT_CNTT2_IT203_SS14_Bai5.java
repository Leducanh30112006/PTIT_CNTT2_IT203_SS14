import java.util.Comparator;
import java.util.TreeSet;



public class PTIT_CNTT2_IT203_SS14_Bai5 {


    public static void main(String[] args) {
        Comparator<Patient> priorityComparator = (p1, p2) -> {
            if (p1.severity != p2.severity) {
                return Integer.compare(p1.severity, p2.severity);
            }
            return Integer.compare(p1.arrivalTime, p2.arrivalTime);
        };

        TreeSet<Patient> emergencyRoom = new TreeSet<>(priorityComparator);

        emergencyRoom.add(new Patient("Bệnh nhân A", 3, 800));
        emergencyRoom.add(new Patient("Bệnh nhân B", 1, 815));
        emergencyRoom.add(new Patient("Bệnh nhân C", 1, 805));

        System.out.println("Thứ tự xử lý cấp cứu:");
        for (Patient p : emergencyRoom) {
            System.out.println(p);
        }
    }
}
