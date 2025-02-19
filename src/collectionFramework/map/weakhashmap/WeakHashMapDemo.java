package collectionFramework.map.weakhashmap;

import java.util.WeakHashMap;
//WeakHashMap is similar to HashMap, but it uses weak references for its keys. This means if a key is no longer referenced elsewhere, the
// Garbage Collector (GC) can automatically remove its entry from the map.
// It is useful for caching, where entries should be removed when they are no longer needed,
// preventing memory leaks. However, since entries can disappear anytime due to GC, it should be used carefully.
public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        imageCache.put(new String("img1"), new Image("Image 1"));
        imageCache.put(new String("img2"), new Image("Image 2"));
        System.out.println(imageCache);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running some entries may be cleared: " + imageCache);
    }

    private static void simulateApplicationRunning() {
        try {
            System.out.println("Simulating application running...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Image {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}
