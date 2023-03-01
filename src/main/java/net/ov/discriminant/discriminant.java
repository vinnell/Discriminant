package net.ov.discriminant;

public class discriminant {
    public Integer x1, x2;
    private int a, b, c;

    public discriminant(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void discSolution(){
        int discriminant = (b * b - 4 * a * c);

        if (discriminant > 0) {
             x1 = (int)((-b - Math.sqrt(discriminant))/(2 * a));
             x2 = (int)((-b + Math.sqrt(discriminant))/(2 * a));

        } else if (discriminant == 0) {
            x1 = x2= -b / (2 * a);

        } else if (discriminant < 0) {
            x1 = x2 = null;

        }
    }
}





