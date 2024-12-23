class Rocket implements SpaceShip {
    int cost;
    int weight;
    int maxWeight;
    int currentWeight;

    Rocket(int cost, int weight, int maxWeight) {
        this.cost = cost;
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.currentWeight = weight;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return currentWeight + item.weight <= maxWeight;
    }

    @Override
    public void carry(Item item) {
        currentWeight += item.weight;
    }
}
