import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh: ");
        int n = input.nextInt();
        input.nextLine();

        if (n <= 0) {
            System.out.println("Số lượng không hợp lệ");
            return;
        }

        List students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập mã học sinh thứ " + (i + 1) + ": ");
            String id = input.nextLine();
            students.add(id);
        }

        List uniqueStudents = new ArrayList<>();
        for (Object student : students) {
            if (!uniqueStudents.contains(student)) {
                uniqueStudents.add(student);
            }
        }

        for (int i = 0; i < uniqueStudents.size() - 1; i++) {
            for (int j = 0; j < uniqueStudents.size() - i - 1; j++) {
                if (uniqueStudents.get(j).toString().compareTo(uniqueStudents.get(j + 1).toString()) > 0) {
                    Object temp = uniqueStudents.get(j);
                    uniqueStudents.set(j, uniqueStudents.get(j + 1));
                    uniqueStudents.set(j + 1, temp);
                }
            }
        }

        int count = uniqueStudents.size();
        System.out.println("Số học sinh nhận học bổng: " + count);
        System.out.print("Danh sách đã sắp xếp: ");
        for (Object student : uniqueStudents) {
            System.out.print(student);
            System.out.print(" ");
        }
    }
}
