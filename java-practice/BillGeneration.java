class BillGeneration {

    void generateBill(int price) {
        System.out.println("Total Bill: " + price);
    }

    void generateBill(int price, int quantity) {
        System.out.println("Total Bill: " + (price * quantity));
    }

    void generateBill(int price, int quantity, double discount) {
        double total = price * quantity;
    }
}
