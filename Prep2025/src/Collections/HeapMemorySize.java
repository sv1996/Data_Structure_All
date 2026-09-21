package Collections;

public class HeapMemorySize {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long maxHeap = runtime.maxMemory();
        long totalHeap = runtime.totalMemory();
        long freeHeap = runtime.freeMemory();
        System.out.println("Max Heap Size: " + (maxHeap / (1024 * 1024)) + " MB");
        System.out.println("Total Heap Size: " + (totalHeap / (1024 * 1024)) + " MB");
        System.out.println("Free Heap Size: " + (freeHeap / (1024 * 1024)) + " MB");
    }
}
