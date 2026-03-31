class BankApplication {

    static void process() throws Exception {
        System.out.println("Transaction processed");
    }

    public static void main(String[] args) {
        try {
            process();
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}