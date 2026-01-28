import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma the thu vien: ");
        String cardID = sc.nextLine().trim();

        String fullRegex = "^[A-Z]{2}\\d{4}\\d{5}$";

        Pattern pattern = Pattern.compile(fullRegex);
        Matcher matcher = pattern.matcher(cardID);

        if (matcher.matches()) {
            System.out.println("Ma the hop le!");
        } else {
            String error = getErrorMessage(cardID);
            System.out.println("Ma the KHONG hop le! " + error);
        }

        sc.close();
    }

    public static String getErrorMessage(String cardID) {
        Pattern pPrefix = Pattern.compile("^[A-Z]{2}.*");
        if (!pPrefix.matcher(cardID).matches()) {
            return "Ly do: Thieu tien to 2 chu cai IN HOA (VD: TV).";
        }
        Pattern pYearFormat = Pattern.compile("^[A-Z]{2}\\d{4}.*");
        if (!pYearFormat.matcher(cardID).matches()) {
            return "Ly do: Nam khong hop le (phai co 4 chu so sau tien to).";
        }

        String yearStr = cardID.substring(2, 6);
        int year = Integer.parseInt(yearStr);

        if (year < 2000 || year > 2100) {
            return "Ly do: Nam vao hoc khong hop le (2000 - 2100).";
        }

        Pattern pLast5 = Pattern.compile("^[A-Z]{2}\\d{4}\\d{5}$");
        if (!pLast5.matcher(cardID).matches()) {
            return "Ly do: Phan cuoi phai la 5 chu so ngau nhien.";
        }

        return "Ly do: Sai dinh dang.";
    }
}