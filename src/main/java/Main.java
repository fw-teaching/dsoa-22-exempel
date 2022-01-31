public class Main {

    public static void main(String[] args) {

        Player player = new Player("me");
        Player npc = new Player("ghoul");

        Player attacker, defender, temp;
        attacker = player;

        attacker.setName("new name");
        player.getName(); // new name

        defender = npc;

        while(true) {

            attacker.attack(defender);
            // 1 = player.attack()
            // 2 = npc.attack()
            System.out.println("det gick som det gick " + defender.getName() + " hp:" + defender.getHealth());

            // swap
            /*
            temp = attacker;
            attacker = defender;
            defender = temp;
            */
            if (attacker == player) {
                attacker = npc;
                defender = player;
            } else {
                attacker = player;
                defender = npc;
            }


        }


    }
}
