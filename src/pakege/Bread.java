package pakege;

public class Bread implements Bakedable{
    @Override
    public void bake() {
        System.out.println("Bake bread at 200 degrees for 15 minutes");
    }
}
