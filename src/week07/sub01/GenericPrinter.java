package week07.sub01;

public class GenericPrinter <T>{
    T material;

    public GenericPrinter() {
    }


    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return material.toString();
    }
}
