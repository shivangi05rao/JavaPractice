package designpattern.singleton;

//Bill Pugh Solution
public class BillPughSolution {
    private BillPughSolution() {

    }

    private static class DBConnectionHelper {
        private static final BillPughSolution INSTANCE_OBJECT = new BillPughSolution();
    }

    public static BillPughSolution getInstance() {
        return DBConnectionHelper.INSTANCE_OBJECT;
    }
}
