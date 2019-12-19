package ru.job4j.condition;
import static java.lang.Math.sqrt;
public class Triangle {
    private  Point first;
    private  Point second;
    private  Point third;
    public Triangle(Point a, Point b, Point c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }
    public static double period(double ap, double bp, double cp) {
        if(exist(ap, bp, cp)) {
           double p = (ap + bp + cp) / 2;
           return p;
        }
        return -1;
    }
    public static double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        Point c = new Point(x3, y3);
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        double p = period(ab, ac, bc);
        if (exist(ab, ac, bc)) {
            rsl = sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }
    public static boolean exist(double ab, double ac, double bc) {
        if(ab + ac == bc | ab + bc == ac | ac + bc == ab){
            return false;
        }
            return true;
    }
}