package ru.job4j.condition;
import static java.lang.Math.sqrt;
public class Triangle {
    private Point first;
    private Point second;
    private Point third;
    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
    public double period(double a, double b, double c) {
        if(this.exist(a, b, c)) {
           double p = (a + b + c) / 2;
        }
        return -1;
    }
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        Point first = new Point(x1, y1);
        Point second = new Point(x2, y2);
        Point third = new Point(x3, y3);
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = sqrt(p * (p - a) * (p - b) * (p - c));
        }
        else rsl = -1;
        return rsl;
    }
    public static boolean exist(double a, double c, double b) {
        if(a + b == c | a + c == b | c + b == a){
            return false;
        }
            return true;
    }
}