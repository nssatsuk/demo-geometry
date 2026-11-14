package by.itAcademy.satsuk;

public class Box {
    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }

    void volumePrint(){
        System.out.print("Объем равен ");
        System.out.println(volume());
    }

    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        this.width = 10;
        this.height = 10;
        this.depth = 10;
    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

}
