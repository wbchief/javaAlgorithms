package com.chief.one;

import edu.princeton.cs.algs4.*;


public class Draw {
    public static void main(String[] args){
        double xlo = 0.2;
        double xhi = 0.5;
        double ylo = 0.5;
        double yhi = 0.6;
        int T = 10000;
        Interval1D xinterval = new Interval1D(xlo,xhi);
        Interval1D yinterval = new Interval1D(ylo,yhi);
        Interval2D interval = new Interval2D(xinterval,yinterval);
        interval.draw();
        Counter c = new Counter("hit");
        for(int i=0;i<T;i++){
            double x = Math.random();
            double y = Math.random();
            Point2D p = new Point2D(x,y);
            if(interval.contains(p))
                c.increment();
            else
                p.draw();
        }
        StdOut.println(c);
        StdOut.println(interval.area());
        System.out.println(4 + "asda");
        System.out.println("asdas" + 3);
    }

}
