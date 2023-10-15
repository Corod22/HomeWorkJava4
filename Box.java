import java.util.ArrayList;
class Box<T extends Fruit> {
    private ArrayList<T> fruits; // Хранение фруктов внутри коробки

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            if (fruit instanceof Apple) {
                weight += 1.0f;
            } else if (fruit instanceof Orange) {
                weight += 1.5f;
            }
        }
        return weight;
    }

    public boolean compare(Box<?> otherBox) {
        return Float.compare(this.getWeight(), otherBox.getWeight()) == 0;
    }

    public void transferFruitsTo(Box<T> otherBox) {
        if (this == otherBox) {
            return;
        }
        for (T fruit : fruits) {
            otherBox.addFruit(fruit);
        }
        fruits.clear();
    }
}


