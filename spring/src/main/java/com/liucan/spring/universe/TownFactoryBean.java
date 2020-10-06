package com.liucan.spring.universe;

import com.liucan.spring.mode.Town;
import org.springframework.beans.factory.FactoryBean;

/**
 * {@link Town} factory bean
 *
 * @author liucan
 */
public class TownFactoryBean implements FactoryBean<Town> {
    @Override
    public Town getObject() throws Exception {
        return new Town();
    }

    @Override
    public Class<?> getObjectType() {
        return Town.class;
    }
}
