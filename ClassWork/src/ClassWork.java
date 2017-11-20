import java.util.Scanner;
public class ClassWork {
    public static void main(String[] args) {
        int x1, x2, y1, y2, x3, y3;
        double a, b, c, pl, pp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты x1, x2, x3, y1, y2, y3");
        x1 = scanner.nextInt();
        x2 = scanner.nextInt();
        x3 = scanner.nextInt();
        y1 = scanner.nextInt();
        y2 = scanner.nextInt();
        y3 = scanner.nextInt();
        a = Math.sqrt(Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2);
        b = Math.sqrt(Math.pow((x3 - x2), 2)) + Math.pow((y3 - y2), 2);
        c = Math.sqrt(Math.pow((x3 - x1), 2)) + Math.pow((y3 - y1), 2);
        pp = (a + b + c) / 2;
        pl = Math.sqrt(pp + (pp - a) * (pp - b) * (pp - c));
        System.out.print(pl);
    }
}








