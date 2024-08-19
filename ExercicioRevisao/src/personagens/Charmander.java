package personagens;

public class Charmander extends CartaPokemon {

    public Charmander(){
        super(120, 70, Tipo.Fogo);
    }

    public int blaze() {return super.getHp();
    }
}
