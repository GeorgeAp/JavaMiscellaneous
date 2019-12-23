import java.util.Objects;

public class FullHashmapImplementation<K, V> {

    // Hashmap model

    class Entry<K, V>{

        final K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Entry<K, V> getNext() {
            return next;
        }

        public void setNext(Entry<K, V> next) {
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Entry<?, ?> entry = (Entry<?, ?>) o;
            return Objects.equals(key, entry.key) &&
                    Objects.equals(value, entry.value) &&
                    Objects.equals(next, entry.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value, next);
        }
    }

    // Insering elements
    public class MyMap<K, V>{
        private Entry<K, V>[] buckets;
        private static final int INITIAL_CAPACITY = 1 << 4;

        private int size = 0;

        public MyMap(){
            this(INITIAL_CAPACITY);
        }

        public MyMap(int capacity) {
            this.buckets = new Entry[capacity];
        }

        public void put(K key, V value){
            Entry<K, V> entry = new Entry<>(key, value, null);
            int bucket = getHash(key) % getBucketSize();

            Entry<K, V> existing = buckets[bucket];
            if (existing == null){
                buckets[bucket] = entry;
                size++;
            }
            else {
                // Compare the keys to check if they they already exist
                while (existing.next != null){
                    if (existing.key.equals(key)){
                        existing.value = value;
                        return;
                    }
                    existing = existing.next;
                }
                if (existing.key.equals(key))
                    existing.value = value;
                else {
                    existing.next = entry;
                    size++;
                }

            }
        }

        public V get(K key) {
            Entry<K, V> bucket = buckets[getHash(key) % getBucketSize()];

            while (bucket != null) {
                if (key == bucket.key) {
                    return bucket.value;
                }
                bucket = bucket.next;
            }
            return null;
        }

        public int size() {
            return size;
        }

        private int getBucketSize() {
            return buckets.length;
        }

        private int getHash(K key) {
            return key == null ? 0 : Math.abs(key.hashCode());
        }

    }
}
