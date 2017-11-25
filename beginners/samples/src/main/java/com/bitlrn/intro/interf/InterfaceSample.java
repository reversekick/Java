/*
 * Copyright (c) 2017 Bitlrn Inc.
 * All rights reserved.
 */

package com.bitlrn.intro.interf;

import java.util.Scanner;

/**
 * This is not at all a proper Queue implementation. This sample is more to
 * show the interface declaration and then implementation.
 *
 * The Queue itself is implemented using an array hence doesn't resize itself
 * properly -- you need to delete the items in queue for its re-use.
 *
 */
interface Queue {
    boolean insert ();
    boolean delete();
}
public class InterfaceSample implements Queue {
    private static int QUEUE_SIZE = 10;
    private int[] queue = null;
    public Scanner scanner = new Scanner(System.in );
    int front = 0;
    int rear = 0;
    public void create(int size){
        queue = new int[size];
    }
    public boolean insert() {
        if(queue != null && (rear < queue.length) ){
            System.out.println("Please enter the number to be added to Queue: ");
            queue[rear++] = scanner.nextInt();
            return true;
        }else{
            System.out.println(" Queue overflow : " + rear +" index is more than the queue length "+queue.length );
        }
        return false;
    }

    public boolean delete() {
        if(front < rear){
          System.out.println("Removing the item at "+ front + " of the queue");
          queue[front++]=0;
          if(front == rear){
              front =0;
              rear = 0;
          }
        }
        return false;
    }

    public void display (){
        System.out.println("Current contents of queue are: ");
        for(int i=front; i < rear; ++i){
            System.out.print(queue[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main (String args[])
    {
        InterfaceSample is = new InterfaceSample();

        System.out.println("Enter the size of the queue");
        int size = is.scanner.nextInt();
        if (size <= 0){
            System.out.printf("Please enter proper queue size...existing");
        }
        is.create(size);
        int option = 0;
        do {

            System.out.println("Please enter 1 for insert, 2 for delete , 3 for exit ");
            option = is.scanner.nextInt();
            switch(option){
                case 1:
                    is.insert();
                    is.display();
                break;
                case 2:
                    is.delete();
                    is.display();
                break;
                case 3:
                    is.display();
                    return;
            }
        }while (option != 3);

    }
}

