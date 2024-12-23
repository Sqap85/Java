class U2 extends Rocket {
    U2() {
        super(120, 18000, 29000);
    }

    @Override
    public boolean launch() {
        double chance = 0.04 * (currentWeight - weight) / (maxWeight - weight);
        return Math.random() >= chance;
    }

    @Override
    public boolean land() {
        double chance = 0.08 * (currentWeight - weight) / (maxWeight - weight);
        return Math.random() >= chance;
    }
}
