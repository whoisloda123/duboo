package com.liucan.spring.loda.event;

import com.liucan.spring.mode.Town;
import org.springframework.stereotype.Component;

/**
 * @author liucan
 * @date 10/7/20 10:30 PM
 */
@Component
public class TownLoda implements LodaEventListener<CanliuLodaEvent> {
    @Override
    public void onLodaEvent(CanliuLodaEvent event) {
        Town town = event.getTown();
    }
}
