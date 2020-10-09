package com.liucan.spring.loda.event;

import com.liucan.spring.mode.Country;

/**
 * @author liucan
 * @date 10/7/20 10:32 PM
 */
public class CountLoda implements LodaEventListener<LiucanLodaEvent> {
    @Override
    public void onLodaEvent(LiucanLodaEvent event) {
        Country country = event.getCountry();
        country.test();
    }
}
