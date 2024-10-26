public class Cube {
   
    //Varible
    private int length;
    private int width;
    private int height; 

    public Cube (int sides) {
        this.length = sides;
        this.width = sides;
        this.height = sides;
    }
    public void getVolume() {
        System.out.println(length * width * height);
    }
    
}


