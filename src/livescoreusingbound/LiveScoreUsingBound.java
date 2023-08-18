/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livescoreusingbound;

import java.util.Scanner;

/**
 *
 * @author Tong
 */
public class LiveScoreUsingBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBean liveScore = new LiveScoreBean();
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        liveScore.addPropertyChangeListener(sub1);
        liveScore.addPropertyChangeListener(sub2);
        System.out.print("Enter Score ");
        Scanner in = new Scanner(System.in);
        while(true){
            String scoreLine = in.nextLine();
            if (scoreLine.equals("")){
                break;
            }
            liveScore.setScoreLine(scoreLine);
        }
        in.close();
    }
    
}
