public class CircleWithException{

    private double radius, area, diameter;


    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if(radius < 0) throw new IllegalArgumentException("Radius is a negative value");
        this.radius = radius;
        
    }

    public double getArea() throws Exception{
        this.area = Math.PI * this.radius * this.radius;
        if(this.area >= 1000) throw new Exception("Area is >= 1000");
        return this.area;

    }

    public double getDiameter() {
        return this.diameter;
    }

    public static void main(String[] args) {
        CircleWithException circle = new CircleWithException();

        circle.setRadius(100);
        System.out.println(circle.getRadius());
        
        try{
            System.out.println(circle.getArea());
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }


}