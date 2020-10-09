package com.liucan.spring.loda.event;

import com.liucan.spring.mode.Town;

/**
 * @author liucan
 * @date 10/7/20 10:30 PM
 */
public class TownLoda implements LodaEventListener<CanliuLodaEvent> {
    @Override
    public void onLodaEvent(CanliuLodaEvent event) {
        Town town = event.getTown();
    }
}
