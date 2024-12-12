class Worker {
    private String name;
    private int age;
    private int weight;

    public Worker(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // equals() metodunu özelleştiriyoruz
    @Override
    public boolean equals(Object o) {
        // Aynı nesne referanslarını kontrol etme
        if (this == o) return true;

        // Eğer karşılaştırılan nesne null ya da farklı sınıftansa, eşit değil
        if (o == null || getClass() != o.getClass()) return false;

        // Worker sınıfındaki özellikleri karşılaştırma
        Worker worker = (Worker) o;
        return age == worker.age && weight == worker.weight && name.equals(worker.name);
    }

    @Override
    public String toString() {
        return "Worker{name='" + name + "', age=" + age + ", weight=" + weight + '}';
    }

    public static void main(String[] args) {
        Worker w1 = new Worker("Homer", 35, 120);
        Worker w2 = new Worker("Homer", 35, 120);

        System.out.println(w1 == w2); // false, çünkü farklı nesneler
        System.out.println(w1.equals(w2)); // true, çünkü içerikleri eşit
    }
}
