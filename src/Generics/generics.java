package Generics;

import java.util.ArrayList;

public class generics {
    static class Box<T>{
        private T data;
        public Box(T data){
            this.data=data;
        }
        public T getData(){
            return data;
        }
        public void setData(T data){
            this.data=data;
        }
    }
    public class arraylist{
        static class MyArrayList{
            private int[] data = new int[10];
            private int capacity = 10;
            private int size=0;

            public int get(int idx){
                return data[idx];
            }
            public int set(int val,int idx){
                data[idx]=val;
                return val;
            }
            public void add(int val){
                if(size==capacity){
                    capacity=capacity+capacity/2;
                    int[] copy = new int[capacity];
                    for(int idx=0;idx<data.length;idx++){
                        copy[idx]=data[idx];
                    }
                    data=copy;
                }
                data[size]=val;
            }

        }
    }
    public class pair{
        static class Pair<K extends Number, V>{
            K key;
            V value;

            public Pair(K key, V value){
                this.key=key;
                this.value=value;
            }

            public K getKey() {return key;}
            public void setKey(K key){ this.key=key;}
            public V getValue() {return value;};
            public void setValue(V value){this.value=value;}







        }
    }

    public static class MyHashMap<K, V>{
        K key;
        V value;
        public MyHashMap(K key, V value){
            this.key=key;
            this.value=value;
        }
        public K getKey() {return key;}
        public void setKey(K key){ this.key=key;}
        public V getValue() {return value;}
        public void setValue(V value){this.value=value;}
    }
    public static void main(String[] args) {
        Box<Integer> obj=new Box<>(5);
        System.out.println(obj.getData());
        Box<String> obj1=new Box<>("Hello");
        System.out.println(obj1.getData());
        Box obj3 = new Box(4.5);
        System.out.println(obj3.getData());
        MyHashMap<Integer, String> map1 = new MyHashMap<>(1, "One");
        System.out.println( map1.getKey() );
        System.out.println(map1.getValue());
        MyHashMap ipl1 = new MyHashMap("Delhi",0);
        System.out.println(ipl1.getKey());
        System.out.println(ipl1.getValue());

    }


}
