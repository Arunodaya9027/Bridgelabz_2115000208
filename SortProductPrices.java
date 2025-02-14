import java.util.*;

class Sorting {
    public void quickSort(int[] productPrices, int low, int high) {
        if (low < high) {
            int pivot = partition(productPrices, low, high);
            quickSort(productPrices, low, pivot - 1);
            quickSort(productPrices, pivot + 1, high);
        }
    }

    public int partition(int[] productPrices, int low, int high) {
        int pivot = productPrices[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (productPrices[j] < pivot) {
                i++;
                int temp = productPrices[i];
                productPrices[i] = productPrices[j];
                productPrices[j] = temp;
            }
        }

        int temp = productPrices[i + 1];
        productPrices[i + 1] = productPrices[high];
        productPrices[high] = temp;
        return i + 1;
    }
}

public class SortProductPrices {
    private static void display(int[] productPrices) {
        for(int price: productPrices)
            System.out.print(price + " ");
        System.out.println(); 
    }

    public static void main(String[] args) {
        int totalProducts;
        Scanner input = new Scanner(System.in);
        totalProducts = input.nextInt();
        int[] productPrices = new int[totalProducts];
        for(int i=0; i<totalProducts; i++)
            productPrices[i] = input.nextInt();
        
        System.out.println("Product Prices before Sorting:");
        display(productPrices);

        Sorting sort = new Sorting();
        sort.quickSort(productPrices, 0, totalProducts-1);

        System.out.println("Product Prices after Quick Sort:");
        display(productPrices);
        input.close();
    }
}
