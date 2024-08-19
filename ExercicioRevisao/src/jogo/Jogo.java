
package jogo;

import personagens.MetodosPokemon;
import personagens.Tipo;


public class Jogo {
    
    private MetodosPokemon j1;
    private MetodosPokemon j2;
    private MetodosPokemon j3;
    private MetodosPokemon j4;
    
    public Jogo(MetodosPokemon j1, MetodosPokemon j2, MetodosPokemon j3, MetodosPokemon j4){
        this.j1 = j1;
        this.j2 = j2;
        this.j3 = j3;
        this.j4 = j4;

    }
    
    public boolean eficaz(MetodosPokemon ataca, MetodosPokemon defende){
        if ((ataca.tipo() == Tipo.Eletrico) && (defende.tipo() == Tipo.Agua)) {
            return true;
        } else if ((ataca.tipo() == Tipo.Fogo) && (defende.tipo() == Tipo.Grama)) {
            return true;
        }
        return false;
    }
    
    public void turno(){
        System.out.println("j1");
        System.out.println("1 - ata \n 2 - def");
        int op1 = 1;

        System.out.println("j2");
        System.out.println("1 - ata \n 2 - def");
        int op2 = 1;

        if ((op1 == 1) && (op2 == 1)) {
            j1.defesa(j2.ataque());
            j2.defesa(j1.ataque());
        }
        else if ((op1 == 2) && (op2 == 1)) {
            j1.defesa(1);
            j2.defesa(0);
        }
            System.out.println("j1");
            System.out.println("1 - ata \n 2 - def");
            int op3 = 1;

            System.out.println("j2");
            System.out.println("1 - ata \n 2 - def");
            int op4 = 1;

            if ((op3 == 1) && (op4 == 1)) {
                j1.defesa(j2.ataque());
                j2.defesa(j1.ataque());
            }
            else if ((op3 == 1) && (op4 == 1)) {
                j1.defesa(1);
                j2.defesa(0);
            }


}}
