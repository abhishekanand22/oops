class Pen{
    String color;
    String type;

    public void writing(){
        System.out.println(this.type);
        
    }

}



public class oops{
    public static void main(String args[])
    {
        Pen pen1 = new Pen();

        pen1.color="blue";
        pen1.type="ballpoint";

        pen1.writing();
    }
}
