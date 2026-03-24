package ro.ase.cts.AgentieEagerInitialization;

public class TestareEagerInitializationAgentie {
    public static void main(String[] args) {
        AgentieEagerInitialization agentie1= AgentieEagerInitialization.getInstanta();
        System.out.println(agentie1);

        AgentieEagerInitialization agentie2=AgentieEagerInitialization.getInstanta();
        agentie1.setNume("RomAventure");

        System.out.println(agentie1);
        System.out.println(agentie2);
    }
}
