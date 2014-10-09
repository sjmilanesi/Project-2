package Main.EventManager;

public class EventManager {
    public Event[] event;

    public EventManager() {
        this.event = new Event[6];

        CanJamEvent canJamEvent = new CanJamEvent();
        CornHoleEvent cornHoleEvent = new CornHoleEvent();
        HorseShoesEvent horseShoesEvent = new HorseShoesEvent();
        LadderBallEvent ladderBallEvent = new LadderBallEvent();
        StickGameEvent stickGameEvent = new StickGameEvent();
        WashoosEvent washoosEvent = new WashoosEvent();

        this.event[0] = canJamEvent;
        this.event[1] = cornHoleEvent;
        this.event[2] = horseShoesEvent;
        this.event[3] = ladderBallEvent;
        this.event[4] = stickGameEvent;
        this.event[5] = washoosEvent;

    }

    public Event[] getEvent(){
        return this.event;
    }
}
