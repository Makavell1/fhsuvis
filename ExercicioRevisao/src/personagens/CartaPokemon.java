
package personagens;


public class CartaPokemon extends Cartas implements MetodosPokemon{

    private int hp;
    private int atk;
    private Tipo tipo;

    
    public CartaPokemon(int hp, int atk, Tipo tipo){
        super(hp,atk,tipo);
        this.hp = hp;
        this.atk = atk;
        this.tipo = tipo;
    }
    
    @Override
    public void defesa(int dano) {
        this.hp = this.hp - dano;
    }

    @Override
    public int ataque() {
        return this.atk;
    }

    @Override
    public int vida() {
        return this.hp;
    }

    @Override
    public Tipo tipo() {
        return super.getTipocarta();
    }
    
    @Override
    public int energia(){
        return super.energia();
    }


    @Override
    public int agua(){return super.agua();}


    @Override
    public int fogo(){return super.fogo();}

    @Override
    public int grama(){return super.grama();}
}
