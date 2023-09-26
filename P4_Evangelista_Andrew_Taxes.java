/*
    Name:       Andrew
    Date:       9/20
    Period:     4

    Is this lab fully working?  Yes
*/
public class P4_Evangelista_Andrew_Taxes {
    // Constants
    private static final double FEDERAL_TAX = 0.124;
    private static final double FICA_TAX = 0.0775;
    private static final double STATE_TAX = 0.093;

    // Variables
    private double hoursWorked;
    private double hourlyRate;
    private double grossPay;

    public P4_Evangelista_Andrew_Taxes(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.grossPay = hoursWorked * hourlyRate;
    }

    // Getters
    public double getGrossPay() {
        return this.grossPay;
    }

    public double getFederalTax() {
        return this.grossPay * FEDERAL_TAX;
    }

    public double getFICATax() {
        return this.grossPay * FICA_TAX;
    }

    public double getStateTax() {
        return this.grossPay * STATE_TAX;
    }

    public double getNetPay() {
        return this.grossPay - (getFederalTax() + getFICATax() + getStateTax());
    }

    // Setters
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
        this.grossPay = hoursWorked * this.hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
        this.grossPay = this.hoursWorked * hourlyRate;
    }

    // Method to print taxes
    public void printTaxes() {
        System.out.println("Hours worked: " + String.format("%.2f", this.hoursWorked));
        System.out.println("Hourly rate: " + String.format("%.2f", this.hourlyRate));
        System.out.println("\nGross pay: " + String.format("%.2f", getGrossPay()));
        System.out.println("\nFederal Tax ("+ FEDERAL_TAX*100+"%): " + String.format("%.2f", getFederalTax()));
        System.out.println("FICA Tax ("+FICA_TAX*100+"%): " + String.format("%.2f", getFICATax()));
        System.out.println("State Tax ("+STATE_TAX*100+"%): " + String.format("%.2f", getStateTax()));
        System.out.println("\nNet pay: " + String.format("%.2f", getNetPay()));
    }
}