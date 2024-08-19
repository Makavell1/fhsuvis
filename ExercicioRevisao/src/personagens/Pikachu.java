
package personagens;


public class Pikachu extends CartaPokemon{
    
    public Pikachu(){
        super(100, 30, Tipo.Eletrico);
    }
    
    public int choqueTrovao() {
        return super.getHp();
    }
}
