package adapterPattern.type2;

import adapterPattern.PgAdapter;

public class PgAdapterFactory {

    public PgAdapter getAdapter(String pg_code){
        switch (pg_code){
            case "payco":
                return new PaycoAdapter();
            default:
                return new LguAdapter();
        }
    }
}
