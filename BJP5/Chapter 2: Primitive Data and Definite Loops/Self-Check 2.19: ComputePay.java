public class ComputePay {
    public static void main(String[] args) {
        // Calculate pay at work based on hours worked each day
        double hourlySalary = 8.75;
        int totalNumberOfHoursWorked = 4 + 5 + 8 + 4; 
        double tax = 0.2;
        double totalPay = hourlySalary * totalNumberOfHoursWorked;
        System.out.println("My total hours worked:");
        System.out.println(totalNumberOfHoursWorked);

        System.out.println("My hourly salary:");
        System.out.println("$" + hourlySalary);

        System.out.println("My total pay:");
        System.out.println(totalNumberOfHoursWorked * hourlySalary);

        System.out.println("My taxes owed:"); // 20% tax
        System.out.println(totalPay * tax);
    }
}
