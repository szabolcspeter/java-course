package szabi.learnjava.oopprinciples;

class Algorithm {

    protected void sort() {
        System.out.println("Sorting the dataset with a standard approach");
    }
}

class BubbleSort extends Algorithm {

    @Override
    protected void sort() {
        System.out.println("Sorting with bubble sort");
    }
}

class MergeSort extends Algorithm {

    @Override
    protected void sort() {
        System.out.println("Sorting with merge sort");
    }
}

public class PolymorphismExample {

    public static void main(String[] args) {

        Algorithm bubbleSort = new BubbleSort();
        Algorithm mergeSort = new MergeSort();

        executeAlgorithm(bubbleSort);
        executeAlgorithm(mergeSort);

    }

    public static void executeAlgorithm(Algorithm algorithm) {

        algorithm.sort();
    }
}
