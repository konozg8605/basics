package org.lesson.basics;




public class Point {
    private double x;
    private double y;

    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }

    public Point move(double vectorX, double vectorY){// metoda zwraca punkt
       double vx = x + vectorX;
       double vy = y + vectorY;
       return new Point(vx,vy );
    }

    public Point move(Vector vector){// metoda zwraca punkt
        double vx = x + vector.getX();
        double vy = y + vector.getY();
        return new Point(vx,vy );
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}
