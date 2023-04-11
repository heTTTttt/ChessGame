package pices;

public enum ColorType {
    BLACK(true, false), WHITE(false, true);

    private final boolean colorTypeBlack;
    private final boolean colorTypeWhite;
    ColorType(boolean colorTypeBlack, boolean colorTypeWhite) {
        this.colorTypeBlack = colorTypeBlack;
        this.colorTypeWhite = colorTypeWhite;
    }

    public boolean isColorTypeBlack() {
        return colorTypeBlack;
    }

    public boolean isColorTypeWhite() {
        return colorTypeWhite;
    }
}
