package com.bridgelabz.hashtable;

public class MyMapNode<K,V> implements INode<K> {

    private K key;
    private V value ;
    private MyMapNode<K,V> next;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    public MyMapNode(K key) {
        this.key = key;
    }

    public MyMapNode() {
    }


    @Override
    public void setKey(K key) {
        this.key=key;
    }

    @Override
    public INode<K> getNext() {
        return next;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setNext(INode<K> next) {
        this.next=(MyMapNode<K,V>) next;
    }

    public String toString() {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append(key).append(" | ").append(value).append("->");
        if (next != null)
            nodeString.append(" , ").append(next);
        return nodeString.toString();
    }

}
