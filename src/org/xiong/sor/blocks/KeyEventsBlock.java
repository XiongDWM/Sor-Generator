package org.xiong.sor.blocks;

import java.util.List;

public class KeyEventsBlock {
    static class Event{
        short en=1; // event number
        long ept=0; // event propagation time
        short aci=0; // attenuation coefficient lead-in fiber
        short el=0; // event loss
        long er; // event reflectance
        String ec; // event code 6 bytes
        String lmt; // loss measurement technique 2 bytes
        long[] ml=new long[5]; // marker locations size=5
        String cmt="\\0"; //comment

    }
    private String keId="KeyEvents\\0";
    private short tnke;
    private List<Event> events;
    private long eel=0; // end-to-end loss
    private long[] rlmp=new long[2]; // optical return loss marker position

    public String getKeId() {
        return keId;
    }

    public void setKeId(String keId) {
        this.keId = keId;
    }

    public short getTnke() {
        return tnke;
    }

    public void setTnke(short tnke) {
        this.tnke = tnke;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public long getEel() {
        return eel;
    }

    public void setEel(long eel) {
        this.eel = eel;
    }

    public long[] getRlmp() {
        return rlmp;
    }

    public void setRlmp(long[] rlmp) {
        this.rlmp = rlmp;
    }
}
