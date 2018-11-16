import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        DateClass dateClass = new DateClass(date);
        System.out.println(dateClass.getDate());
        dateClass.incremtDays(3);
        System.out.println(dateClass.getDate());

        Triangle triangle = new Triangle();
        System.out.println(triangle.typeTriangle(0,5,2));
        System.out.println(triangle.typeTriangle(5,2,5));
        System.out.println(triangle.typeTriangle(7,9,11));
        System.out.println(triangle.typeTriangle(8,8,8));

    }
}
