public interface iEstateAgent {
    String getAgentName();
    double getPropertyPrice();
    double getAgentCommission();
}
abstract class EstateAgent implements iEstateAgent {
    private String agentName;
    private double propertyPrice;

    public EstateAgent(String agentName, double propertyPrice) {
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
    }

    public String getAgentName() {
        return agentName;
    }

    public double getPropertyPrice() {
        return propertyPrice;
    }

    public double getAgentCommission() {
        return 0.2 * propertyPrice; // Commission is 20% of property price
    }
}

// Create a subclass EstateAgentSales that extends EstateAgent
class EstateAgentSales extends EstateAgent {
    public EstateAgentSales(String agentName, double propertyPrice) {
        super(agentName, propertyPrice);
    }

    // Method to print the property report
    public void printPropertyReport() {
        System.out.println("Estate Agent Name: " + getAgentName());
        System.out.println("Property Sale Price: R" + getPropertyPrice());
        System.out.println("Estate Agent Commission: R" + getAgentCommission());
    }
}
