// import java.util.Arrays;
public class PowerOfTwoMaxHeap {
    private int[] data;
    private int size;
    private int depth;
    public PowerOfTwoMaxHeap(int depth)
    {
        this.depth = depth;
        data = new int[1 << (depth+1)];
    }
    public void insert(int value)
    {
        data[size] = value;
        size++;
        heapifyUp(size - 1);
    }
    public int popMax()
    {
        int max = data[0];
        data[0] = data[--size];
        heapifyDown(0);
        return max;
    }
    private void heapifyUp(int index)
    {
        while (index > 0 && data[parent(index)] < data[index]) {
            int temp = data[parent(index)];
            data[parent(index)] = data[index];
            data[index] = temp;
            index = parent(index);
        }
    }
    private void heapifyDown(int index)
    {
        int left = leftChild(index);
        int right = rightChild(index);
        int largest = index;
        if(left < size && data[left] > data[largest])
        {
            largest = left;
        }
        if(right < size && data[right] > data[largest])
        {
            largest = right;
        }
        if(largest != index)
        {
            int temp = data[index];
            data[index] = data[largest];
            data[largest] = temp;
            heapifyDown(largest);
        }
    }
    private int parent(int index)
    {
        return (index - 1) / 2;
    }
    private int leftChild(int index)
    {
        return 2 * index + 1;
    }
    private int rightChild(int index)
    {
        return 2 * index + 2;
    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    public int size() 
    {
        return size;
    }
    public static void main(String[] args)
    {
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(2);
        // Insert values into the heap.
        heap.insert(10);
        heap.insert(5);
        heap.insert(15);
        heap.insert(2);
        heap.insert(8);
        // Print the maximum value in the heap.
        System.out.println(heap.popMax());
        // Output is 15
        System.out.println(heap.size());
        // Output is 4
        System.out.println(heap.popMax());
        // Output is 10
        // Print the size of the heap.
        System.out.println(heap.size());
        // Output is 3
    }
}
