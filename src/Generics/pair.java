package Generics;

public class pair {
    public static class Pair<T>{
        private T first;
        private T second;

        public Pair(T first, T second){
            this.first=first;
            this.second=second;
        }

        public T getFirst() {
            return first;
        }
        public T getSecond(){
            return second;
        }
        public void swap(){
            T temp=second;
            this.second=first;
            this.first=temp;
        }
    }
    public static void main(String[] args){
        Pair<String> pair = new Pair<>("Hello", "World");
        System.out.println(pair.getFirst());  // Output: Hello
        System.out.println(pair.getSecond()); // Output: World
        pair.swap();
        System.out.println(pair.getFirst());  // Output: World
        System.out.println(pair.getSecond()); // Output: Hello

    }
}
