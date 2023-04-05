package third_modul.first;

public class Sword<T extends Metal> {
    private T material;

    public Sword(T material) {
        this.material = material;
    }

    public Boolean isDurable() {
        return getMaterial().getEndurance() > 49;
    }

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }
}
