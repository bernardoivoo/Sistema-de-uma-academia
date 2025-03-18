package Academia;

import java.util.Date;

/**
 *
 * @author berna
 */
public class Estoque extends Produto {

    /**
     *
     * @param nomeDoProduto
     * @param categoria
     * @param valor
     * @param id
     * @param quantidade
     */
    public Estoque(String nomeDoProduto, String categoria, double valor, int id, int quantidade) {
        super(nomeDoProduto, categoria, valor, id, quantidade);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Estoque{" + '}';
    }
    
    
    
}
