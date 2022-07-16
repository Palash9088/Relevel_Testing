public class AnimalBuilder {
    private int value;

    public AnimalBuilder setValue(int value) {
        this.value = value;
        return this;
    }

    public Animal createAnimal() {
        return new Animal(value);
    }
}