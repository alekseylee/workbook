package be.intecbrussel.classwerk8;

public class Arrays {
    static void printElements(int arr[], int n)
    {
        for (int i = 1; i < n - 1; i++)
        {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                System.out.print(arr[i] + " ");
        }
    }
}
