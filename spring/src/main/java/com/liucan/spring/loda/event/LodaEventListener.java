package com.liucan.spring.loda.event;

import java.util.EventListener;

/**
 * {@link LodaEvent} listenner
 *
 * @author liucan
 * @date 10/7/20 10:10 PM
 */
@FunctionalInterface
public interface LodaEventListener<E extends LodaEvent> extends EventListener {
    /**
     * Handler an loda event
     *
     * @param event loda event
     */
    void onLodaEvent(E event);
}
