package BoxWeight;

public class Box {
    private double width;
    private double height;
    private double length;


    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double size) {
        width = size;
        height = size;
        length = size;
    }

    public Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    public Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }

    public Box(Box box1, Box box2) {
        this.width = box1.width + box2.width;
        this.height = box1.height + box2.height;
        this.length = box1.length + box2.length;
    }

    public void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box increase(int i) {
        Box box = new Box(width * i, height * i, length * i);
        return box;
    }

    public Box increase(int w, int h, int l) {
        Box box = new Box(width * w, height * h, length * l);
        return box;
    }

    public Box sumBox(Box box) {
        return new Box(this.width + box.width, this.height + box.height, this.length + box.length);
    }

    public double volume() {
        return width * height * length;
    }

    public void showVolume() {
        System.out.println(volume());
    }

    public int compare(Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        int result;
        if (thisVolume > boxVolume) {
            result = 1;
            System.out.println("больше");
        } else if (thisVolume < boxVolume) {
            result = -1;
            System.out.println("меньше");
        } else {
            result = 0;
            System.out.println("равны");
        }
        return result;
    }

    public void showInfo (){
        System.out.println("Ширина " + width + ". Высота " + height+ ". Длинна " + length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }



}

