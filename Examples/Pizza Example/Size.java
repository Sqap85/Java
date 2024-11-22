public enum Size {
    SMALL(1),
    MEDIUM(2),
    LARGE(3);

    private final int size;

    Size(int size) {
        this.size = size;
    }

    public int getintSize() {
        return size;
    }
}