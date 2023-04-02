import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {
    private List<T> elementos;

    public Pilha() {
        this.elementos = new ArrayList<T>();
    }

    public void push(T elemento) {
        this.elementos.add(elemento);
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return this.elementos.remove(elementos.size() - 1);
    }

    public boolean isEmpty() {
        return this.elementos.isEmpty();
    }

    public int size() {
        return this.elementos.size();
    }

    public T top() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return this.elementos.get(elementos.size() - 1);
    }
}