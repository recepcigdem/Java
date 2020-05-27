package com.denemeProje.denemeProje.controller;


import com.denemeProje.denemeProje.Business.IChannelService;
import com.denemeProje.denemeProje.Entities.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChannelController {

    private IChannelService iChannelService;

    @Autowired
    public ChannelController(IChannelService iChannelService) {
        this.iChannelService = iChannelService;
    }
    @GetMapping("/channel")
    public List<Channel> getAll(){
        return iChannelService.getAll();
    }

    @PostMapping("/channel/add")
    public void add(@RequestBody Channel channel){
        iChannelService.add(channel);
    }
    @PutMapping("/channel/update")
    public void update(@RequestBody Channel channel){
        iChannelService.update(channel);
    }
    @PostMapping("/channel/delete")
    public void delete(@RequestBody Channel channel){
        iChannelService.delete(channel);
    }
    @GetMapping("/channel/{channelid}")
    public Channel getById(@PathVariable int channelid){
        return iChannelService.getById(channelid);
    }
}
