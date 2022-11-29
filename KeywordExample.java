//Use of this and super keywords.
class Flower {
    String color = "Pink";
}
class Rose extends Flower{
    private String color;
    Rose(){
        this.color = "Yellow";
    } //use of 'this' keyword.
    void print(){
        System.out.println(color);
        System.out.println(super.color);  //use of 'super' keyword.
    }
}
public class KeywordExample {
    public static void main(String[] args) {
        Rose rose = new Rose();
        rose.print();
    }
}
