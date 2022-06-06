package com.company.less2;

public class Main {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("rock");

        System.out.println(builder.toString());

        System.out.println(builder.toString().hashCode());
        System.out.println("scissors".hashCode());

        System.out.println(play(builder.toString(), "scissors"));

    }

    public static String play(String p1, String p2) {

        if (p1.equals("scissors") && p2.equals("paper")) {
            return "Player 1 won!";
        } else if (p1.equals("paper") && p2.equals("scissors")) {
            return "Player 2 won!";
        } else if (p1.equals("rock") && p2.equals("scissors")) {
            return "Player 1 won!";
        } else if (p1.equals("scissors") && p2.equals( "rock")) {
            return "Player 2 won!";
        } else if (p1.equals("paper") && p2.equals( "rock")) {
            return "Player 1 won!";
        } else if (p1.equals("rock") && p2.equals("paper")) {
            return "Player 2 won!";
        } else {
            return "Draw!";
        }
    }
}
