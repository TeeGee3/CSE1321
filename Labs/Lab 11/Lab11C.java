public class Lab11C {
    public static void main(String args[]){

        KoalaBear k1 = new KoalaBear((float) 100);
            //k1.showWeight();
        k1.eat(400);
            k1.showWeight();
        k1.eat(300);
            k1.showWeight();
        k1.eat(650);
            k1.showWeight();

    }
}

class KoalaBear{
    float weightinK =0;

    KoalaBear(Float w ){
        weightinK = w;
    }

    void eat(float leaves){
        weightinK += (leaves * .001);
    }
    void showWeight(){
        System.out.println("This koala weighs "+weightinK+ " kilos");
    }
}
