import java.util.Objects;

public class FullHashmapImplementation<K, V> {

    // Insering elements
        private Entry<K, V>[] buckets;
        private int capacity;
        private int size = 0;

        private double lf = 0.75;


        public FullHashmapImplementation(){
            this(16);
        }

        public FullHashmapImplementation(int capacity) {
            this.capacity = capacity;
            this.buckets = new Entry[this.capacity];
        }

        public void put(K key, V value){
            if (size == lf * capacity){
                // rehash
                Entry<K, V>[] old = buckets;

                capacity *= 2;
                size = 0;
                buckets = new Entry[capacity];

                for (Entry<K, V> e : old){
                    while (e != null){
                        put(e.key, e.value);
                        e = e.next;
                    }
                }
            }

            Entry<K, V> entry = new Entry<>(key, value, null);
            int bucket = getHash(key) % getBucketSize();

            Entry<K, V> existing = buckets[bucket];
            if (existing == null){
                buckets[bucket] = entry;
                size++;
            }
            else {
                // compare the keys to see if they already exist
                while (existing.next != null) {
                    if (existing.key.equals(key)) {
                        existing.value = value;
                        return;
                    }
                    existing = existing.next;
                }
                if (existing.key.equals(key)){
                    existing.value = value;
                }
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

        @Override
        public String toString(){
            StringBuilder stringBuilder = new StringBuilder();
            for (Entry entry: buckets){
                stringBuilder.append("[");
                while (entry != null){
                    stringBuilder.append(entry);
                    if (entry.next != null)
                        stringBuilder.append(",");
                    entry = entry.next;
                }
                stringBuilder.append("]");
            }
            return "{" + stringBuilder.toString() + "}";
        }


    // Hashmap model

    static class Entry<K, V>{
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

        @Override
        public String toString() {
            return "{" + key + ", " + value + "}";
        }
    }
}

