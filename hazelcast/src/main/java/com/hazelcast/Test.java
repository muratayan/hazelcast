package com.hazelcast;

import com.hazelcast.core.*;

import java.util.Map;

/**
 * Created by muratayan on 2/3/15.
 */
public class Test {
    public static void main( String[] args ) throws Exception {
        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();
        IdGenerator idGen = hazelcastInstance.getIdGenerator("newId");
        while (true) {
            Long id = idGen.newId();
            System.err.println( "Id: " + id );
            Thread.sleep( 1000 );
        }
    }
}

