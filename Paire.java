public class Paire<T> {
    private T first;
    private T second;

    public Paire(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Paire{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}