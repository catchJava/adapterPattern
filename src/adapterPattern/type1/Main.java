package adapterPattern.type1;

public class Main {
    public static void main(String[] args) {
        PgAdapterFactory pgAdapterFactory = new PgAdapterFactory();

        pgAdapterFactory.getAdapter("lgu").payment();
        pgAdapterFactory.getAdapter("lgu").refund();
    }
}
