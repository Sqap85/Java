
enum Branch {
    MATH("Information regarding math"),
    PHYSICS("Information regarding physics"),
    CS("Information regarding computer science"),
    ENG("Information regarding engineering");

    private String info;

    // Constructor for enum
    Branch(String info) {
        this.info = info;
    }
    // Getter for info
    public String getInfo() {
        return info;
    }
}