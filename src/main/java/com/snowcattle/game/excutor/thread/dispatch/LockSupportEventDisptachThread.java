package com.snowcattle.game.excutor.thread.dispatch;

import com.snowcattle.game.excutor.event.EventBus;
import com.snowcattle.game.excutor.pool.UpdateBindExcutorService;

/**
 * Created by jwp on 2017/2/23.
 */
public class LockSupportEventDisptachThread extends LockSupportDisptachThread{

    public LockSupportEventDisptachThread(EventBus eventBus, UpdateBindExcutorService updateBindExcutorService
            , int cycleSleepTime , long minCycleTime) {
        super(eventBus, updateBindExcutorService, cycleSleepTime, minCycleTime);
    }

}