public class Memory {

    static long MEGABYTE = 1024L * 1024L;

    public static long getMemoryUsage() {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    public static long convertToMegabyte(long memory) {
        return memory / MEGABYTE;
    }

}
