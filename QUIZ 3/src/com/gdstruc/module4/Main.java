package com.gdstruc.module4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int playerCount;
        int matchMade = 0;

        ArrayQueue arrayQueue = new ArrayQueue(7);

        while (matchMade < 10){

            Random rand = new Random();
            playerCount = rand.nextInt(7) +1;
            System.out.println ("===== " + playerCount + " players are joining the queue =====");

            if (playerCount == 5){
                arrayQueue.enqueue(new Player(1, "_chaechae_1", 801));
                arrayQueue.enqueue(new Player(2, "k_a_z_u_h_a_", 809));
                arrayQueue.enqueue(new Player(3, "jenaissante", 108));
                arrayQueue.enqueue(new Player(4, "39saku_chan", 319));
                arrayQueue.enqueue(new Player(5, "mansaemanchae", 1110));

                System.out.println("PLAYERS IN THE QUEUE: ");
                arrayQueue.printQueue();
                System.out.println("\n");

                System.out.println("5 players left the queue.. \n");
                for(int i =0; i < 5; i++) {
                    arrayQueue.dequeue();
                }
                pressEnter();
                matchMade++;
            }
            else if (playerCount == 6){
                arrayQueue.enqueue(new Player(1, "_chaechae_1", 801));
                arrayQueue.enqueue(new Player(2, "k_a_z_u_h_a_", 809));
                arrayQueue.enqueue(new Player(3, "jenaissante", 108));
                arrayQueue.enqueue(new Player(4, "39saku_chan", 319));
                arrayQueue.enqueue(new Player(5, "mansaemanchae", 1110));
                arrayQueue.enqueue(new Player(6, "minn.__.ju", 251));

                System.out.println("PLAYERS IN THE QUEUE: ");
                arrayQueue.printQueue();
                System.out.println("\n");

                System.out.println("5 players left the queue.. \n");
                for(int i =0; i < 5; i++) {
                    arrayQueue.dequeue();
                }
                pressEnter();
                matchMade++;
            }
            else if (playerCount == 7){
                arrayQueue.enqueue(new Player(1, "_chaechae_1", 801));
                arrayQueue.enqueue(new Player(2, "k_a_z_u_h_a_", 809));
                arrayQueue.enqueue(new Player(3, "jenaissante", 108));
                arrayQueue.enqueue(new Player(4, "39saku_chan", 319));
                arrayQueue.enqueue(new Player(5, "mansaemanchae", 1110));
                arrayQueue.enqueue(new Player(6, "minn.__.ju", 251));
                arrayQueue.enqueue(new Player(7, "blueFlame", 321));

                System.out.println("PLAYERS IN THE QUEUE: ");
                arrayQueue.printQueue();
                System.out.println("\n");

                System.out.println("5 players left the queue.. \n");
                for(int i =0; i < 5; i++) {
                    arrayQueue.dequeue();
                }
                pressEnter();
                matchMade++;
            }
            else {
                System.out.println ("Game can not be started. Not enough players\n");

                pressEnter();
            }
        }
        if (matchMade == 10){
            System.out.println ("10 MATCHES SUCCESSFULLY MADE.");
        }
    }

    public static void pressEnter(){
        System.out.println(">> Press \"ENTER\" to create a new match.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

}