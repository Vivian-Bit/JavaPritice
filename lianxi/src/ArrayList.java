import java.util.Arrays;
//顺序表
public class ArrayList extends List {
    private int[] array = new int[10];

    @Override
    public void insert(int index, int element) {
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = element;
        size++;

        int[] a = Arrays.copyOfRange(array, 0, size);
        String s = Arrays.toString(a);
        System.out.println(s);
       /* System.out.println(
                Arrays.toString(
                        Arrays.copyOfRange(array, 0, size)));*/
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushFront(10);
        list.pushFront(20);
        list.pushFront(30);
        list.insert(3, 100);
    }
}
