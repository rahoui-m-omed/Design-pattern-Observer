package dz_univ_observer;

public class testObserver {

    public static void main (String args []) {
        
        Observer obj = new Observer ();
        Subject s = new Subject ();
        
        s.register(obj);
        s.setFlag(1);
}
}
