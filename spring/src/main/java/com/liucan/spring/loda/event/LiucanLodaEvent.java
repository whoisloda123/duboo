package com.liucan.spring.loda.event;

import com.liucan.spring.mode.Country;

/**
 * Liucan loda event
 *
 * @author liucan
 * @date 10/7/20 10:15 PM
 */
public class LiucanLodaEvent extends LodaEvent {

    private Country country;

    public LiucanLodaEvent(Object source, Country country) {
        super(source);
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }
}
