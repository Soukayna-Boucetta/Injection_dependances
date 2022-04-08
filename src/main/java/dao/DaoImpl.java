package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
        connecter à la base de donnéepour récupérer la températeure
         */
        System.out.println("Verssion Base de donnée");
        double temper=Math.random()*40;
        return temper;
    }
}
