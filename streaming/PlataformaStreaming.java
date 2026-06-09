import java.util.ArrayList;
import java.util.List;

class PlataformaStreaming implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String tituloRecente;
    private String generoRecente;

    public void setNovoLancamento(String titulo, String genero) {
        this.tituloRecente = titulo;
        this.generoRecente = genero;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(tituloRecente, generoRecente);
        }
    }
}