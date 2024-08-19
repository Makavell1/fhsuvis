package personagens;

public class Squirtle extends CartaPokemon {

    public Squirtle(){
        super(120, 70, Tipo.Agua);
    }

    public int pistolaAgua() {return super.getHp();
    }
}

