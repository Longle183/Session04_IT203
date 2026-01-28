import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex3 {
    public static void main(String[] args) {

        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};

        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        long startSB = System.nanoTime();

        StringBuilder sb = new StringBuilder();

        sb.append(" BAO CAO MUON SACH \n");
        sb.append("Ngay tao: ").append(today).append("\n");

        for (int i = 0; i < transactions.length; i++) {
            sb.append("Giao dich: ").append(transactions[i]).append("\n");
        }

        String reportBySB = sb.toString();

        long endSB = System.nanoTime();
        long timeSB = endSB - startSB;

        long startStr = System.nanoTime();

        String reportByString = "";
        reportByString += " BAO CAO MUON SACH\n";
        reportByString += "Ngay tao: " + today + "\n";

        for (int i = 0; i < transactions.length; i++) {
            reportByString += "Giao dich: " + transactions[i] + "\n";
        }

        long endStr = System.nanoTime();
        long timeStr = endStr - startStr;

        System.out.println(reportBySB);

        System.out.println("So thoi gian thuc thi doi voi StringBuilder: " + (timeSB / 1_000_000) + " ms");
        System.out.println("So thoi gian thuc thi doi voi String: " + (timeStr / 1_000_000) + " ms");
    }
}