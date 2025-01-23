public class Main {
    public static void main(String[] args) {
        int nachSchet = 0;
        int popoln = 536;
        if (popoln > 1000) {
            int bonus = popoln / 100;
            System.out.println(nachSchet + popoln + bonus);
        } else System.out.println(nachSchet + popoln);
    }
}