package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.DataAccess.ISpringChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ChannelManager implements IChannelService{

    private ISpringChannel iSpringChannel;

    @Autowired
    public ChannelManager(ISpringChannel iSpringChannel) {
        this.iSpringChannel = iSpringChannel;
    }

    @Override
    @Transactional
    public List<com.denemeProje.denemeProje.Entities.Channel> getAll() {
        return this.iSpringChannel.findAll();
    }

    @Override
    public void add(com.denemeProje.denemeProje.Entities.Channel channel) {
        this.iSpringChannel.save(channel);
    }

    @Override
    public void delete(com.denemeProje.denemeProje.Entities.Channel channel) {
        this.iSpringChannel.delete(channel);
    }

    @Override
    public void update(com.denemeProje.denemeProje.Entities.Channel channel) {
        this.iSpringChannel.save(channel);
    }

    @Override
    public com.denemeProje.denemeProje.Entities.Channel getById(int channelId) {
        return this.iSpringChannel.findChannelByChannelId(channelId);
    }
}
