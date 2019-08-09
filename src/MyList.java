import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY =10;
    private Object elements[];
    public MyList(){}
    public MyList(int capacity, int size){
        elements = new Object[capacity];
        this.size=size;
    }
    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }


    public void add(int index, E element){
        if (size==elements.length){
            ensureCapa();

        }
        if (index>size){
            elements[size++]=element;
        }else {
            for (int i=size-1;i>index;i--){
                elements[i]=elements[i-1];
            }
            elements[index]=element;
            size++;
        }
    }
    public E remove (int index){
        if (index>size||index<0){
            throw new IndexOutOfBoundsException(index);
        }else {
            E temp = (E) elements[index];
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
            return temp;
        }
    }
    public MyList clone(){
        return this;
    }
    public int indexOf(E o){
        for (int i=0;i<size;i++){
            if (elements[i].equals(o)){
                return i;
            }

        }
        return -1;
    }
    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    public boolean add(E e) {
        if (!contains(e)) {
            add(size+1, e);
            return true;
        } else return false;
    }
    public int size() {
        return this.size;
    }

    public E get(int i){
       if (i>= size||i<0){
           throw new IndexOutOfBoundsException("Index: "+i+", Size "+i);
       }
       return (E) elements[i];
    }
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
        System.out.println("Danh sach da bi xoa");
    }




}
