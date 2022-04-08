package pres;

import dao.DaoImpl;
import exten.DaoImp2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args){
        /*
        Injection des dépendances par l'insetenciation
         statique => new
         */
        DaoImpl dao=new DaoImpl();
        DaoImp2 dao1=new DaoImp2();
        MetierImpl metierimpl=new MetierImpl(dao);
        //metierimpl.setIdao(dao1);
        System.out.println("Résultat: "+metierimpl.calcule());

    }
}
