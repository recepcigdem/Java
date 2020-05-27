package com.denemeProje.denemeProje.Entities;

import javax.persistence.*;

@Entity
public class Channel {
    private int channelId;
    private boolean active;
    private String code;
    private String channeltr;
    private String channelen;
    private String currencytype;
    private String nebimcode;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "channel_id")
    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    @Basic
    @Column(name = "active")
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "channeltr")
    public String getChanneltr() {
        return channeltr;
    }

    public void setChanneltr(String channeltr) {
        this.channeltr = channeltr;
    }

    @Basic
    @Column(name = "channelen")
    public String getChannelen() {
        return channelen;
    }

    public void setChannelen(String channelen) {
        this.channelen = channelen;
    }

    @Basic
    @Column(name = "currencytype")
    public String getCurrencytype() {
        return currencytype;
    }

    public void setCurrencytype(String currencytype) {
        this.currencytype = currencytype;
    }

    @Basic
    @Column(name = "nebimcode")
    public String getNebimcode() {
        return nebimcode;
    }

    public void setNebimcode(String nebimcode) {
        this.nebimcode = nebimcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Channel channel = (Channel) o;

        if (channelId != channel.channelId) return false;
        if (active != channel.active) return false;
        if (code != null ? !code.equals(channel.code) : channel.code != null) return false;
        if (channeltr != null ? !channeltr.equals(channel.channeltr) : channel.channeltr != null) return false;
        if (channelen != null ? !channelen.equals(channel.channelen) : channel.channelen != null) return false;
        if (currencytype != null ? !currencytype.equals(channel.currencytype) : channel.currencytype != null)
            return false;
        if (nebimcode != null ? !nebimcode.equals(channel.nebimcode) : channel.nebimcode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = channelId;
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (channeltr != null ? channeltr.hashCode() : 0);
        result = 31 * result + (channelen != null ? channelen.hashCode() : 0);
        result = 31 * result + (currencytype != null ? currencytype.hashCode() : 0);
        result = 31 * result + (nebimcode != null ? nebimcode.hashCode() : 0);
        return result;
    }
}
