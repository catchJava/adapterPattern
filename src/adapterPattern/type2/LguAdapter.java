package adapterPattern.type2;

import adapterPattern.PgAdapter;
import adapterPattern.pg.Lgu;

public class LguAdapter extends Lgu implements PgAdapter {

    @Override
    public void payment() {
        System.out.println("Lgu 어댑터 사용");
        lguPayment();
    }

    @Override
    public void refund() {
        System.out.println("Lgu 어댑터 사용");
        lguRefund();
    }
}
