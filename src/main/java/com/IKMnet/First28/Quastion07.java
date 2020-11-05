package com.IKMnet.First28;


class Invoice {
    public static String formatId(String oldId) {
        return oldId + "_Invoce";
    }

    String data = "Hello";
    public String checkQuastion8() {
        this.data = "Quastion8-TOP";
        return this.data;
    }
}

class SalesInvoice extends Invoice {
    String data;
    public static String formatId(String oldId) {
        return oldId + "_SalesInvoice";
    }

    public String checkQuastion8() {
        this.data = super.checkQuastion8();
        return this.data;
    }

}

public class Quastion07 {

    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        SalesInvoice salesInvoice = new SalesInvoice();

        // A = No
        System.out.println(Invoice.formatId("A 1234"));

        // B = No
        //System.out.println((SalesInvoice) Invoice.formatId("1234"));

        // C = Yes
        System.out.println(invoice.formatId("C 1234"));

        // D = No
        System.out.println(salesInvoice.formatId("D 1234"));

        // E = Yes
        System.out.println(salesInvoice.formatId("E 1234"));

    }

}
