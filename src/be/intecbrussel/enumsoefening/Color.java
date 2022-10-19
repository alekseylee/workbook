package be.intecbrussel.enumsoefening;

public enum Color {
//     Constanten
    RED,
    GREEN,
    BLUE,
    BLACK;

    // Field


    private String color;

    // Constructor


    private Color(String color) {
        this.color = color;
    }

    Color() {
    }

    //     Methodes
    String getColorCode() {
        return color;
    }
}
