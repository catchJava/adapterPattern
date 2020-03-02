package adapterPattern.type2;

public class Main {
    public static void main(String[] args) {
        PgAdapterFactory pgAdapterFactory = new PgAdapterFactory();

        pgAdapterFactory.getAdapter("payco").payment();
        pgAdapterFactory.getAdapter("payco").refund();
    }
}
