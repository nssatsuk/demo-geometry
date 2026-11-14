package by.itAcademy.satsuk;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.setDim(10,20,15);
        myBox2.setDim(3,6,9);

        myBox1.volumePrint();
        myBox2.volumePrint();
    }
}
