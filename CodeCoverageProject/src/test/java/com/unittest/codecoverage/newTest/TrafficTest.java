package com.unittest.codecoverage.newTest;

import com.unittest.codecoverage.models.Traffic;
import com.unittest.codecoverage.models.TrafficLigth;
import com.unittest.codecoverage.models.StreetDirectionFlow;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TrafficTest {

    @Test
    public void setAndGetTrafficLightTest(){
        Traffic t = new Traffic();

        t.setCurrentTrafficLight(TrafficLigth.RED);
        assertEquals(t.getCurrentTrafficLight(),TrafficLigth.RED);

        t.setCurrentTrafficLight(TrafficLigth.GREEN);
        assertEquals(t.getCurrentTrafficLight(),TrafficLigth.GREEN);
    }

    @Test
    public void setAndGetStreetDirectionFlow(){
        Traffic t = new Traffic();

        t.setStreetDirectionFlow(StreetDirectionFlow.ONE_WAY);
        assertEquals(t.getStreetDirectionFlow(),StreetDirectionFlow.ONE_WAY);

        t.setStreetDirectionFlow(StreetDirectionFlow.TWO_WAY);
        assertEquals(t.getStreetDirectionFlow(),StreetDirectionFlow.TWO_WAY);
    }

    @Test
    public void setAndGetMaxSpeedAllowed(){
        Traffic t = new Traffic();

        t.setMaxSpeedAllowed((short) 50);
        assertEquals(t.getMaxSpeedAllowed(),50);

        t.setMaxSpeedAllowed((short) 150);
        assertEquals(t.getMaxSpeedAllowed(),150);

        t.setMaxSpeedAllowed((short) 200);
        assertEquals(t.getMaxSpeedAllowed(),200);
    }

}
