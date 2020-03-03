package adapterPattern.type1;

import adapterPattern.PgAdapter;
import adapterPattern.pg.Lgu;

public class LguAdapter implements PgAdapter {

    private Lgu lgu = new Lgu();


    @Override
    public void payment() {
        System.out.println("Lgu 어댑터 사용");
        lgu.lguPayment();
    }

    @Override
    public void refund() {
        System.out.println("Lgu 어댑터 사용");
        lgu.lguRefund();
    }
}
