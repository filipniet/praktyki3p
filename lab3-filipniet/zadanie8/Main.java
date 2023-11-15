package zadanie8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Flat[] homes = new Flat[10];
        Random rand = new Random();
        int los;


        for(int i=0; i<homes.length; i++){
            los = rand.nextInt(3);

            if(los==0){
                homes[i] = new Flat("Gdańsk", "Mickiewicza");

            }else if (los==1) {
                homes[i] = new house("Sopot", "Sienkiewicza", 65.3f);

            }else if (los ==2){
                homes[i] = new Residence("Ujazdowo", "Fredry", 23.7f, 12.5f);

            }

        }
        for(int i=0; i< homes.length; i++){
            if(homes[i] instanceof Residence){

                Residence dom = (Residence) homes[i];
                System.out.println(dom.getGarageSize());

                System.out.println(dom.toString());
            }else if(homes[i] instanceof house){

                house mieszkanie = (house) homes[i];
                System.out.println(mieszkanie.getParcelSize());

                System.out.println(mieszkanie.toString());
            }else{
                Flat pietro = (Flat) homes[i];
                System.out.println(pietro.toString());

            }

        }
    }
}
