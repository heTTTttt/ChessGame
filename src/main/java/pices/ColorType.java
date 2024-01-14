package pices;

public enum ColorType {
    BLACK, WHITE;

    public static boolean isBlack(ColorType colorType) {

        return BLACK.equals(colorType);
    }
    public static boolean isWhite(ColorType colorType) {
        return WHITE.equals(colorType);

    }
}
