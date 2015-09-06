///////////////////////////////////////////////////////////////////////////////
//Karli Pensabene
//hw02
//Arithmetic Java Program
//
//  first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//

//  define a class
public class Arithmetic {
    
//  add a main method
 public static void main (String[] args) {
     
//number of socks
int nSocks=3;
//cost per pair of socks
//('$' is part of the varibale name)
double sockCosts$=2.58;

//number of drinking glasses
int nGlasses=6;
//cost per glass
double glassCost$=2.29;

//number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost$=3.25;
double taxPercent=0.06;

//total costs and calculations for socks
double totalSockCosts$; //total cost of socks
double totalSockTax$; //total taxes on socks
totalSockCosts$=nSocks*sockCosts$;
totalSockTax$=totalSockCosts$*taxPercent;
double totalSockTax2$ = (int)Math.round(totalSockTax$ * 100)/(double)100; //make int

//total costs and calculations for glass
double totalGlassCosts$; //total cost of glasses 
double totalGlassTax$; //total taxes on glasses
totalGlassCosts$=nGlasses*glassCost$;
totalGlassTax$=totalGlassCosts$*taxPercent;
double totalGlassTax2$ = (int)Math.round(totalGlassTax$ * 100)/(double)100; //make int

//total costs and calculations for envelopes
double totalEnvelopeCosts$; //total cost of envelopes
double totalEnvelopeTax$; //total tax on envelops
totalEnvelopeCosts$=nEnvelopes*envelopeCost$;
totalEnvelopeTax$=totalEnvelopeCosts$*taxPercent;
double totalEnvelopeTax2$ = (int)Math.round(totalEnvelopeTax$ * 100)/(double)100; //make int

//total costs and calculations of order
double totalPurchases$; //total cost without tax
double totalSalesTax$; //total taxes
double finalCosts$; //total cost with tax
totalPurchases$=totalEnvelopeCosts$+totalGlassCosts$+totalSockCosts$;
double totalPurchases2$ = (int)Math.round(totalPurchases$ * 100)/(double)100; //make int
totalSalesTax$=totalPurchases$*taxPercent;
double totalSalesTax2$ = (int)Math.round(totalSalesTax$ * 100)/(double)100; //make int
finalCosts$=totalPurchases$+totalSalesTax$;
double finalCosts2$ = (int)Math.round(finalCosts$ * 100)/(double)100; //make int

//print socks info
System.out.println("Socks");
System.out.println("number of socks: "+nSocks);
System.out.println("cost per sock: $"+sockCosts$);
System.out.println("total cost of socks: $"+totalSockCosts$);
System.out.println("total tax on socks: $"+totalSockTax2$);
System.out.println("------------------");

//print glass info
System.out.println("Glasses");
System.out.println("number of glasses: "+nGlasses);
System.out.println("cost per glass: $"+glassCost$);
System.out.println("total cost of glasses: $"+totalGlassCosts$);
System.out.println("total tax on glasses: $"+totalGlassTax2$);
System.out.println("------------------");

//print envelope info
System.out.println("Envelopes");
System.out.println("number of envelopes: "+nEnvelopes);
System.out.println("cost per envelope: $"+envelopeCost$);
System.out.println("total cost of envelopes: $"+totalEnvelopeCosts$);
System.out.println("total tax on envelopes: $"+totalEnvelopeTax$);
System.out.println("------------------");

//print final purchase info
System.out.println("total cost (without tax): $"+totalPurchases2$);
System.out.println("total sales tax: $"+totalSalesTax2$);
System.out.println("total cost (including tax): $"+finalCosts2$);

    }
    
}
