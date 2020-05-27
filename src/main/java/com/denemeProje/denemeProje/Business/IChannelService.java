package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.Entities.Channel;

import java.util.List;

public interface IChannelService {

    List<Channel> getAll();
    void add(Channel channel);
    void delete(Channel channel);
    void update(Channel channel);
    Channel getById(int channelId);
}
