public class Main {
    public static void main(String[] args) {
        long[] sales = {254, 804, 107, 896};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
        System.out.println();
        System.out.println(salesManager.average(sales, salesManager.max()));
    }
}