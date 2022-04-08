package exten;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImp2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Verssion capteure");
        double temper=6000;
        return temper;
    }
}
