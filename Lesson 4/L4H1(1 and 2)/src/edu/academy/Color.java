package edu.academy;

public class Color {
    private final int RED = 1, ORANGE = 2, YELLOW = 3, GREEN = 4, BLUE = 5, INDIGO = 6, VIOLET = 7 ;
    int colorNumber;
    /*
    *Соответствия русский/английский:
    *Blue - голубой
    *Indigo - Синий
     */

    public Color (int colorNumber) {
        this.colorNumber = colorNumber;
    }

    public int getColorNumber() {
        return colorNumber;
    }

    public String getColorName() {
        String colorName;
        switch (colorNumber) {
            case 1:
                colorName = "Красный";
                break;
            case 2:
                colorName = "Оранжевый";
                break;
            case 3:
                colorName = "Желтый";
                break;
            case 4:
                colorName = "Зеленый";
                break;
            case 5:
                colorName = "Голубой";
                break;
            case 6:
                colorName = "Синий";
                break;
            case 7:
                colorName = "Фиолетовый";
                break;
            default:
                colorName = "Неизвестно";
                break;
        }

        return colorName;
    }
}
