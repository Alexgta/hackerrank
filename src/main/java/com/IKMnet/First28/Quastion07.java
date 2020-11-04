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
        return oldId + "_Sales";
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


        System.out.println(Invoice.formatId("1234"));

        //System.out.println((SalesInvoice) Invoice.formatId("1234"));

        System.out.println(invoice.formatId("1234"));

        System.out.println(salesInvoice.formatId("1234"));

        System.out.println(salesInvoice.formatId("1234"));

    }

}
