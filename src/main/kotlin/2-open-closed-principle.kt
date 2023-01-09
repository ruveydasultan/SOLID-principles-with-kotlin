//BAD

class Rectangle1 {
    private var length;
    private var height;
    // getters/setters ...
}

class Circle1 {
    private var radius;
    // getters/setters ...
}

class AreaFactory1 {
    public fun calculateArea(shapes: ArrayList<Object>): Double {
        var area = 0;
        for (shape in shapes) {
            if (shape is Rectangle1) {
                var rect = shape as Rectangle1;
                area += (rect.getLength() * rect.getHeight());
            } else if (shape is Circle1) {
                var circle = shape as Circle1;
                area += (circle.getRadius() * cirlce1.getRadius() * Math.PI);
            } else {
                throw new RuntimeException("Shape not supported");
            }
        }
        return area;
    }
}
//BETTER
public interface Shape {
    fun getArea();
}

public class Rectangle2: Shape {
    private var length;
    private var height;
    // getters/setters ...
    @Override
    public getArea(): Double {
        return (length * height);
    }
}

public class Circle2 : Shape{
    private var radius;
    // getters/setters ...
    @Override
    public getArea() : Double {
        return (radius * radius * Math.PI);
    }
}

public class AreaFactory2 {
    fun calculateArea(shapes: ArrayList<String>): Double {
        var area: Double = 0.toDouble();
        for (shape in shapes) {
            area += shape.getArea();
        }
        return area;
    }
}