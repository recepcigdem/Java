package com.denemeProje.denemeProje.DataAccess;

import com.denemeProje.denemeProje.Entities.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISpringChannel extends JpaRepository<Channel,Long> {

    public Channel findChannelByChannelId(Integer id);

}
