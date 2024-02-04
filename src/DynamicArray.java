import java.util.Arrays;

public class DynamicArray {
    private final int INITIAL_SIZE = 10;
    private int size = 0;
    private Person[] array = new Person[INITIAL_SIZE];

    public void add(Person person) {
        array[size] = person;
        size++;

        if (canGrow()) grow();

        System.out.println(Arrays.toString(array));
    }

    public void get(int index) {
        try {
            if (index < 0 || array.length <= index) {
                throw new ArrayIndexOutOfBoundsException("Index out of bounds!");
            }

            if (array[index] == null) {
                throw new NullPointerException("No person at that index!");
            }

            System.out.println("Person at index " + index + " is: " + array[index]);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void size() {
        System.out.println("Elements in the array: " + size);
    }

    public void remove() {
        try {
            if (size <= 0)
                throw new ArrayIndexOutOfBoundsException("Nothing to remove, the array is empty!");

            array[size - 1] = null;
            size--;


            if (canShrink()) shrink();

            System.out.println("remove: " + Arrays.toString(array));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

    public void remove(int index) {
        try {
            if (index < 0 || index > array.length)
                throw new ArrayIndexOutOfBoundsException("Chosen index is out of bounds!");
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
                array[i + 1] = null;
            }
            System.out.println("After removal: " + Arrays.toString(array));
            size--;

            if (canShrink()) shrink();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public void set(int index, Person person) {
        array[index] = person;
        System.out.println("After set: " + Arrays.toString(array));
    }

    public void clear() {
        array = new Person[]{null};
        size = 0;
        System.out.println("After clear: " + Arrays.toString(array));
    }

    private void grow() {
        System.out.println("GROW");
        Person[] newArray = new Person[size + INITIAL_SIZE];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    private boolean canGrow() {
        return size == array.length;
    }

    private void shrink() {
        System.out.println("SHRINK");
        Person[] newArray = new Person[array.length - INITIAL_SIZE];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    private boolean canShrink() {
        int shrinkPoint = array.length - INITIAL_SIZE - 1;
        return size <= shrinkPoint;
    }
}