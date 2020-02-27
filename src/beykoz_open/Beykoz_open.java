package beykoz_open;

import java.util.*;

/**
 *
 * @author Güven TUNCAY
 */
public class Beykoz_open {

    /**
        Sample Input 0
        7
        11 6 8 2 10 5 9
        16 8 20 20 17 17 4

        Sample Output 0
        Impossible

        Sample Input 1
        5
        13 11 7 19 35
        5 20 10 10 15

        Sample Output 1
        Possible
         
        Find more input & try your code:
        https://www.hackerrank.com/contests/inzva-algorithm-winter-camp-2020-qualification/challenges/beykoz-open/problem
     */
    public static void main(String[] args) {
        //Simple ArrayList declaration for Team Sadik and Team Ekin.
        ArrayList<Integer> teamSadik = new ArrayList<Integer>();
        ArrayList<Integer> teamEkin = new ArrayList<Integer>();
        System.out.println("Please enter a sample input");
        Scanner scn = new Scanner(System.in);
        
        int playersNum = scn.nextInt();//Number of players in each team.
        boolean isPossible = true;//Can Team Sadik always wins the games.
        for(int i = 0 ; i < playersNum ; i++){
            teamSadik.add(scn.nextInt());//Scanning ability points of players in Team Sadik.
        }
        for (int i = 0; i < playersNum ; i++) {
            teamEkin.add(scn.nextInt());//Scanning ability points of players in Team Ekin.
        }
        Collections.sort(teamEkin);//Sorting arrays in order to compare
        Collections.sort(teamSadik);//Each player must match the opponent he can win
        for(int i = 0 ; i < playersNum ; i++){
            if(teamEkin.get(i) > teamSadik.get(i)){//If one player in Team sadik weaker than other player in team Ekin
                isPossible = false;                //Team Sadik can't always wins the games.
                break;
            }
        }
        if(isPossible)
            System.out.println("Possible");
        else
            System.out.println("Impossible");
    }
    
}
