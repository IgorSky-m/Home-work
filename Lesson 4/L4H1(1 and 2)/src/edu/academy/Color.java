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
            case RED:
                colorName = "Красный";
                break;
            case ORANGE:
                colorName = "Оранжевый";
                break;
            case YELLOW:
                colorName = "Желтый";
                break;
            case GREEN:
                colorName = "Зеленый";
                break;
            case BLUE:
                colorName = "Голубой";
                break;
            case INDIGO:
                colorName = "Синий";
                break;
            case VIOLET:
                colorName = "Фиолетовый";
                break;
            default:
                colorName = "Неизвестно";
                break;
        }

        return colorName;
    }
}
