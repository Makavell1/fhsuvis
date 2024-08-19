
package personagens;


public class Cartas {
    
    private int hp;
    private int atk;
    private Tipo tipocarta;
    private int energia;
    private int agua;
    private int fogo;
    private int grama;

    public Cartas(int hp, int atk, Tipo tipocarta) {
        this.hp = hp;
        this.atk = atk;
        this.tipocarta = tipocarta;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public Tipo getTipocarta() {
        return tipocarta;
    }
   
    public int energia(){return 2;}

    public int agua() {return 3;}

public int fogo() {return 4;}

    public int grama() {return 1;}
}
