package dz_univ_observer;

public interface ISubject {
	  
    public abstract void register(Observer obj) ;
    
    public abstract void unregister(Observer obj);
    
    public abstract void notifyall(Observer obj);
    
}
