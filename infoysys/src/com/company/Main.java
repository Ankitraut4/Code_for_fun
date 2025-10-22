package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// While playing an RPG game, you were assigned to complete one of the hardest quests in this game. There are n monsters you’ll need to defeat in this quest. Each monster i is described with two integer numbers – poweri and bonusi. To defeat this monster, you’ll need at least poweri experience points. If you try fighting this monster without having enough experience points, you lose immediately. You will also gain bonusi experience points if you defeat this monster. You can defeat monsters in any order.
        //The quest turned out to be very hard – you try to defeat the monsters but keep losing repeatedly. Your friend told you that this quest is impossible to complete. Knowing that, you’re interested, what is the maximum possible number of monsters you can defeat?
        //(Question difficulty level: Hardest)
        //Input:
        //The first line contains an integer, n, denoting the number of monsters. The next line contains an integer, e, denoting your initial experience.
        //Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, poweri, which represents power of the corresponding monster.
        //Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, bonusi, which represents bonus for defeating the corresponding monster.
        //Input	Output	Output Description
        //2
        //123
        //78
        //130
        //10
        //0
        // output- 2
        //Initial experience level is 123 points.
        //Defeat the first monster having power of 78 and bonus of 10. Experience level is now 123+10=133.
        //Defeat the second monster.
        //3
        //100
        //101
        //100
        //304
        //100
        //1
        //524
        // output- 2
        //Initial experience level is 100 points.
        //Defeat the second monster having power of 100 and bonus of 1. Experience level is now 100+1=101.
        //Defeat the first monster having power of 101 and bonus of 100. Experience level is now 101+100=201.
        //The third monster can’t be defeated.

        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of monster ");
        int n=s.nextInt();
        System.out.println("enter the intial experiance ");
        int exp=s.nextInt();

        int[] power=new int[n];
        int[] bonus=new int[n];

        for(int i=0;i<n;i++){
            power[i]=s.nextInt();
        }

        for(int i=0;i<n;i++){
            bonus[i]=s.nextInt();
        }

        class Monster{
        private final int pow,bon;
           public Monster(int pow,int bon){
                this.pow=pow;
                this.bon=bon;
            }

        }
        Monster[] monster=new Monster[n];

        int count=0;
        for(int i=0;i<n;i++){
            monster[i]=new Monster(power[i],bonus[i]);
        }
        Arrays.sort(monster,Comparator.comparingInt(m -> m.pow));


        for (Monster m: monster){
//            System.out.println(m.pow);
//            System.out.println(m.bon);

            if(exp<=m.pow){
                break;
            }
            exp+=m.bon;
            count++;
        }
        System.out.println(count);













    }
}
