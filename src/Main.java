public class Main {
    public static void main(String[] args) {
        Person mads = new Person("Mads");
        Person abdi = new Person("Abdi");
        Person emil = new Person("Emil");
        Person harry = new Person("Harry Potter");

        DynamicArray dynArr = new DynamicArray();

        dynArr.size();
        dynArr.add(harry);
        dynArr.get(5);
        dynArr.add(mads);
        dynArr.add(mads);
        dynArr.add(mads);
        dynArr.add(mads);
        dynArr.add(mads);
        dynArr.add(mads);
        dynArr.add(mads);
        dynArr.add(emil);
        dynArr.add(abdi);
        dynArr.add(abdi);
        dynArr.add(abdi);
        dynArr.add(abdi);
        dynArr.add(abdi);
        dynArr.add(mads);
        dynArr.add(mads);
        dynArr.add(mads);
        dynArr.add(mads);
        dynArr.add(emil);
        dynArr.add(abdi);
        dynArr.add(abdi);
        dynArr.add(abdi);
        dynArr.add(abdi);
        dynArr.add(abdi);

        dynArr.size();
        dynArr.remove();
        dynArr.remove();
        dynArr.remove();
        dynArr.remove();
        dynArr.remove();
        dynArr.add(abdi);
        dynArr.remove();
        dynArr.size();
        dynArr.remove(0);
        dynArr.set(0, harry);
        dynArr.clear();
        dynArr.size();
        dynArr.add(abdi);
    }
}