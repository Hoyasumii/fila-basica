package com.queue.interfaces;

public interface IQueue<T> {
    boolean contains(T desiredItem); // Método que irá percorrer a fila e irá checar se um determinado valor existe
    void enqueue(T item); // Método que irá adicionar um novo item à fila
    T dequeue(); // Método que irá retirar o item inicial e retornar esse valor
    T peek(); // Método que irá pegar o item inicial sem removê-lo
}
