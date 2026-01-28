public class Ex2 {
    public static void main(String[] args) {

        String description = "Sach giao khoa Toan lop 12, Ke: A1-102, tinh trang moi";
        String keyword = "Ke:";

        if (description.contains(keyword)) {
            int startIndex = description.indexOf(keyword);

            int codeStart = startIndex + keyword.length();

            String afterKeyword = description.substring(codeStart);

            afterKeyword = afterKeyword.trim();

            int commaIndex = afterKeyword.indexOf(",");

            String shelfCode;
            if (commaIndex != -1) {
                shelfCode = afterKeyword.substring(0, commaIndex).trim();
            } else {
                shelfCode = afterKeyword.trim();
            }

            System.out.println("Vi tri tim thay: " + shelfCode);

            String newDescription = description.replace(keyword, "Vi tri luu tru:");
            System.out.println("Mo ta moi: " + newDescription);
        } else {
            System.out.println("Khong tim thay tu khoa 'Ke:' trong mo ta.");
        }
    }
}