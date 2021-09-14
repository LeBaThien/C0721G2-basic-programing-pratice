package b10_DSA_list.exercise.arraylist;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public int size() {
        return size;
    }

    public void addElement(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    public void add(int index, E e) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else {
            if (size == elements.length) {
                ensureCapacity();
            }
            size++;
            for (int i = size - 1; i > index; i--) {
                            elements[i] = elements[i - 1];
                        }
//            if (size - 1 - index >= 0) System.arraycopy(elements, index, elements, index + 1, size - 1 - index);
            elements[index] = e;
        }
    }

    public E get(int i) {
        if (i >= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public boolean contains(E e) {
        for (int i = 0; i <elements.length ; i++) {
            if (e.equals(elements[i])){
                return true;
            }
        }
        return false;
    }

}
