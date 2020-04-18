/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

/**
 *
 * @author acer
 */
class NewClass {
     private double x;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public NewClass(double x, double y) {
        this.x = x;
        this.y = y;
    }
    private double y;
    
    public void display()
    {
        System.out.println("X:"+x+"\t Y:"+y);
    }
    public void add(NewClass n)
    {
        setX(x+n.x);
        setY(y+n.y);
        
    }
    public void extraction(NewClass n)
    {
        setX(x-n.x);
        setY(y-n.y);
    }
    public double alan()
    {
        return x*y;
    }
    public double cevre()
    {
        return y*2+x*2;
    }
}
