import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Simulation simulation = new Simulation();

        //txt dosyalarini arrayliste donusturduk
        ArrayList<Item> phase1Items = simulation.loadItems("phase-1.txt");
        ArrayList<Item> phase2Items = simulation.loadItems("phase-2.txt");

        // U-1 doldurduk
        ArrayList<Rocket> u1Phase1 = simulation.loadU1(phase1Items);
        ArrayList<Rocket> u1Phase2 = simulation.loadU1(phase2Items);

        // U-2 doldurduk
        ArrayList<Rocket> u2Phase1 = simulation.loadU2(phase1Items);
        ArrayList<Rocket> u2Phase2 = simulation.loadU2(phase2Items);

        // Simule ettik
        int u1Budget = simulation.runSimulation(u1Phase1) + simulation.runSimulation(u1Phase2);
        int u2Budget = simulation.runSimulation(u2Phase1) + simulation.runSimulation(u2Phase2);

        System.out.println("Total budget for U1 rockets: $" + u1Budget + " Million");
        System.out.println("Total budget for U2 rockets: $" + u2Budget + " Million");
    }
}