public class Lab11B {
    public static void main(String[] args) {

        turtle t1 = new turtle();
        turtle t2 = new turtle(5, "purple");



        System.out.println(t1.speed);
        System.out.println(t2.color);

    }
}

class turtle{

    int speed;
    String color;

    turtle(){
        speed = 0;
        color = "green";
    }
    turtle(int s, String c){
        speed = s;
        color = c;
    }
}


