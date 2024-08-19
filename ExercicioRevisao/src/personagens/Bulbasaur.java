package personagens;

public class Bulbasaur extends CartaPokemon {

    public Bulbasaur(){
        super(80, 90, Tipo.Grama);
    }

    public int folhaNavalha() {return super.getHp();
    }
}