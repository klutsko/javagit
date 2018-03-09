package com.shop.bag;

import com.shop.position.Position;

/**
 * Created by cube on 21.02.2018.
 */
public class ATBPacket implements Bag {
    private static final int SIZE = 100000;

    private Position[] positions =  new Position[SIZE];

    private int realIndex =0;

    private int iteratorIndex = 0;

    @Override
    public int getNotUsedSize() {
        return SIZE - realIndex;
    }

    public boolean add(Position position){
        positions[realIndex++] = position;
        return false;
    }

    public boolean haveNext(){
        return iteratorIndex<realIndex;
    }

    public Position next(){
        return positions[iteratorIndex++];
    }

    public void initIterator(){
        iteratorIndex = 0;
    }
}
