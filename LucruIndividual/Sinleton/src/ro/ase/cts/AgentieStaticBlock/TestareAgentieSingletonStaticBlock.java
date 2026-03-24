package ro.ase.cts.AgentieStaticBlock;

import ro.ase.cts.AgentieEagerInitialization.AgentieEagerInitialization;

public class TestareAgentieSingletonStaticBlock {
    public static void main(String[] args) {
        AgentieSingletonStaticBlock agentie1= AgentieSingletonStaticBlock.getInstanta();
        System.out.println(agentie1);

        AgentieSingletonStaticBlock agentie2= AgentieSingletonStaticBlock.getInstanta();
        agentie1.setNume("RomAventure");

        System.out.println(agentie1);
        System.out.println(agentie2);
    }
}
