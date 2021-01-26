//Recieved help from addison
//Kyle Swann
package gamestats;

import javax.swing.JOptionPane;
//import static sun.audio.AudioPlayer.player;

/**
 *
 * @author Zachcollins
 */
public class GameStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Welcome to my database to hold information about the WJU basketball teams."
                + "\nBy: Zach Collins");

        //int[] arr = {7, 9, 8, 2, 6, 3, 5, 4};
        Players[] player = new Players[17];
        player[0] = new Players(1, "Drake Goddard", 71, "Mens");
        player[1] = new Players(2, "Pat Moseh", 312, "Mens");
        player[2] = new Players(3, "Gavin Porter", 0, "Mens");
        player[3] = new Players(4, "Preston Boswell", 282, "Mens");
        player[4] = new Players(11, "Mark Winters", 4, "Mens");
        player[5] = new Players(12, "Chase Lawson", 165, "Mens");
        player[6] = new Players(13, "Curtis Perez", 0, "Mens");
        player[7] = new Players(15, "Dominique Tham", 169, "Mens");
        player[8] = new Players(20, "Zack Duffy", 7, "Mens");
        player[9] = new Players(21, "Zach Collins", 4, "Mens");
        player[10] = new Players(22, "Jarin Hilson", 160, "Mens");
        player[11] = new Players(23, "Jordan Fair", 27, "Mens");
        player[12] = new Players(24, "Haywood Highsmith", 280, "Mens");
        player[13] = new Players(25, "Kyle Ritz", 251, "Mens");
        player[14] = new Players(31, "Charles Aden", 0, "Mens");
        player[15] = new Players(32, "Pierce Griffth", 0, "Mens");
        player[16] = new Players(34, "Matt Stewart", 29, "Mens");

        Teams wju = new Teams();
        //String name = JOptionPane.showInputDialog("name");

        // Players n = new Players(31, name, 0, "Mens");
        //wju.addPlayer(n);
        String playAgain = "y";
        /*String remove = "r";
        String search = "s";*/

        while (playAgain.equalsIgnoreCase("y")) { //While loop for the main program

            //String cont = "y";
            String menu = JOptionPane.showInputDialog("Type (A) to add a player"
                    + "\n(R) to remove a player"
                    + "\n(S) to search for a player"
                    + "\n(D) to display the players");

            if (menu.equalsIgnoreCase("A")) {   //Adding a new player
                int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Whats the number of the player??"));
                String newName = JOptionPane.showInputDialog(null, "Whats the players name??");
                int points = Integer.parseInt(JOptionPane.showInputDialog(null, "How many points has this player scored??"));
                String teamName = JOptionPane.showInputDialog(null, "Is it Mens or Womens?");

                Players b = new Players(num, newName, points, teamName);

                wju.addPlayer(b);
                //wju.update(num, b);
            }

            if (menu.equalsIgnoreCase("R")) {   //removing a player
                int num = Integer.parseInt(JOptionPane.showInputDialog("What the number of the player you want to remove?"));

                wju.deletion(num);
                //wju.update(num, n);

            }
            if (menu.equalsIgnoreCase("S")) { //searching for a player
                int numm = Integer.parseInt(JOptionPane.showInputDialog("What the number of the player you're looking for?"));

                JOptionPane.showMessageDialog(null, wju.search(numm));
            }
            if (menu.equalsIgnoreCase("D")) {   //Displaying all of the players

                JOptionPane.showMessageDialog(null, wju.display());
                //wju.display(Players);
            }

            /* Players[] temp = sort(player);

        for (int i = 0; i < player.length; i++) {
            System.out.println(temp[i]);

        }*/
        }
    }
}
