package com.ctrip.infosec.rule.resource;

import org.junit.Test;

import java.util.List;

/**
 * Created by lpxie on 15-7-14.
 */
public class StationToProvinceTest
{
    @Test
    public void testGetPro()
    {
        String single = "六安";
        String singleResult = StationToProvince.getProvinceNames(single);
        System.out.println(singleResult);
    }
}
