package metier;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    private IDao idao;

    public MetierImpl(IDao idao) {
        this.idao = idao;
    }

    //couplage faible
    @Override
    public double calcule() {
        double temper= idao.getData();
        double res=temper*564/Math.cos(temper*Math.PI);
        return res;
    }
    /*
       Injecter  dans la varieble idao un objet d'un classe
       qui implemente l'interface IDao
    */
    public void setIdao(IDao idao) {
        this.idao = idao;
    }
}
