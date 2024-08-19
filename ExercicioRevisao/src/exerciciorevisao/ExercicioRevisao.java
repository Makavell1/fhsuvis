
package exerciciorevisao;

import personagens.*;


public class ExercicioRevisao {


    public static void main(String[] args) {

        MetodosPokemon j1;
        MetodosPokemon j2;
        MetodosPokemon j3;
        MetodosPokemon j4;

        System.out.println("Jogador 1 - Escolha seu pokemon");
        System.out.println("1 - para pikachu");  System.out.println("  ");
        System.out.println("Jogador 2 - Escolha seu pokemon");
        System.out.println("2 - para squirtle");  System.out.println("  ");
        System.out.println("Jogador 3 - Escolha seu pokemon");
        System.out.println("3 - para Charmander"); System.out.println("  ");
        System.out.println("Jogador 4 - Escolha seu pokemon");
        System.out.println("4 - para bulbasaur");

        System.out.println("  ");


        int op = 1;




        switch(op){
            case 1:
                j1 = new Pikachu();
                j2 = new Squirtle();
                j3 = new Charmander();
                j4 = new Bulbasaur();
                break;
        }

        System.out.println("  ");

        MetodosPokemon pika = new Pikachu();
        MetodosPokemon charm = new Charmander();
        MetodosPokemon squir = new Squirtle();
        MetodosPokemon bulb = new Bulbasaur();

        System.out.println("  ");

        System.out.println(pika.tipo().name());
        System.out.println(pika.vida());
        pika.defesa(20);
        System.out.println(pika.vida());
        System.out.println(pika.energia());

        System.out.println("  ");

        System.out.println(squir.tipo().name());
        System.out.println(squir.vida());
        squir.defesa(10);
        System.out.println(squir.vida());
        System.out.println(squir.agua());

        System.out.println("  ");

        System.out.println(charm.tipo().name());
        System.out.println(charm.vida());
        charm.defesa(40);
        System.out.println(charm.vida());
        System.out.println(charm.fogo());

        System.out.println("  ");

        System.out.println(bulb.tipo().name());
        System.out.println(bulb.vida());
        bulb.defesa(60);
        System.out.println(bulb.vida());
        System.out.println(bulb.grama());


        

    }

    
}
