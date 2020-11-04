package com.IKMnet.Second28;

class SugestionBox {
    private void onSelection() {
        System.out.println("Item Selected");
    }
    public void onRemoveSelection() {
        System.out.println("Item removed");
    }
}

public class Quastion33 {

    public static void main(String[] args) {
        SugestionBox officeSugestionBox = new SugestionBox(){
            public void onSelection() {
                System.out.println("Office Selected");
            }
            public void onRemoveSelection() {
                onSelection();
                System.out.println("Office removed");
            }
        };

        officeSugestionBox.onRemoveSelection();

    }

}
