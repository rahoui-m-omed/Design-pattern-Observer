package dz_univ_observer;

import java.util.ArrayList;

public class Subject implements ISubject {

    private int flog;
    ArrayList<Observer> observers = new ArrayList();

    public int getFlog() {
        return flog;
    }

    public void setFlag(int flog) {
        this.flog = flog;
        for (int i = 0; i < observers.size(); i++) {
            notifyall(observers.get(i));
        }
    }

    @Override
    public void register(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyall(Observer obj) {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update();
        }
    }
}
