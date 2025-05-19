// Interface to define constants and method signature for tax calculation
interface Taxable {
    double salesTax = 0.07;     // 7% sales tax
    double incomeTax = 0.105;   // 10.5% income tax

    void calcTax();  // Method to be implemented by classes
}
