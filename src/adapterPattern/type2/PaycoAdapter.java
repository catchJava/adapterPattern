package adapterPattern.type2;

import adapterPattern.PgAdapter;
import adapterPattern.pg.Payco;

public class PaycoAdapter extends Payco implements PgAdapter {

    @Override
    public void payment() {
        System.out.println("payco 어댑터 사용");
        paycoPayment();
    }

    @Override
    public void refund() {
        System.out.println("payco 어댑터 사용");
        paycoRefund();
    }
}
