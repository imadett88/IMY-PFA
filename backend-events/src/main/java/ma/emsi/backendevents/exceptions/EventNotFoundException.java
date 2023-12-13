package ma.emsi.backendevents.exceptions;

public class EventNotFoundException extends RuntimeException{


    public EventNotFoundException(){
        super("The event you requested was not found");
    }
}
