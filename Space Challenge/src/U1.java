class U1 extends Rocket {
    U1() {
        super(100, 10000, 18000);
    }

    @Override
    public boolean launch() {
        double chance = 0.05 * (currentWeight - weight) / (maxWeight - weight);
        return Math.random() >= chance;
    }

    @Override
    public boolean land() {
        double chance = 0.01 * (currentWeight - weight) / (maxWeight - weight);
        return Math.random() >= chance;
    }
}
