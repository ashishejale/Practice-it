// This program computes the total amount owed for a meal,
// assuming 8% tax and a 15% tip.
public class Receipt {
    public static void main(String[] args) {
        System.out.println("Subtotal:");
        int total = 38 + 40 + 30;
        double taxPercent = 0.08;
        double tipPercent = 0.15;
        double totalTax = total * taxPercent;
        double totalTip = total * tipPercent;
      
        System.out.println(total);
        System.out.println("Tax:");
        System.out.println(totalTax);
        System.out.println("Tip:");
        System.out.println(totalTip);
        System.out.println("Total:");
        System.out.println(total + totalTax + totalTip);

    }
}
