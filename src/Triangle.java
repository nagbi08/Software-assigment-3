public class Triangle {
    public String typeTriangle(int sideA, int sideB, int sideC) {
        if (sideA == 0 || sideB == 0 || sideC == 0){
            return "Invalid dimensions!";
        }
        else if (sideA == sideB && sideA == sideC){
            return "Equilateral triangle";
        }
        else if (sideA == sideB || sideA == sideC || sideB == sideC){
            return "Isosceles triangle";
        }
        else{
            return "Scalene triangle";
        }
    }
}
