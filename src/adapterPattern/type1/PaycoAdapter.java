package adapterPattern.type1;

import adapterPattern.PgAdapter;
import adapterPattern.pg.Payco;

public class PaycoAdapter implements PgAdapter {

    private Payco payco = new Payco();

    @Override
    public void payment() {
        System.out.println("payco 어댑터 사용");
        payco.paycoPayment();
    }

    @Override
    public void refund() {
        System.out.println("payco 어댑터 사용");
        payco.paycoRefund();
    }
}
