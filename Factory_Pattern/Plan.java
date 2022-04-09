import java.util.Scanner;

public abstract class Plan {
    double rate;
    abstract void getRates();

    public void calculateBill(int units) {
        System.out.println(units*rate);
    }
}

class DomesticPlan extends Plan {

    @Override
   public void getRates(){
        rate=4.5;
    }
}

class CommercialPlan extends Plan {
    public void getRates() {
        rate=7.5;
    }
}

class InstitutionalPlan extends Plan {
    public void getRates() {
        rate=10.0;
    }
}

class GetPlanFactory {
    public Plan getPlan(String planType) {
        if(planType == null) {
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
class PlanMain {
    public static void main(String[] args) {
        GetPlanFactory GF = new GetPlanFactory();
        System.out.println("Enter The Name Of Plan: ");
        Scanner sc=new Scanner(System.in);
        String planName=sc.nextLine();

        System.out.println("Enter The Units: ");
        int units=sc.nextInt();

        Plan P = GF.getPlan(planName);

        P.getRates();
        P.calculateBill(units);
    }
}
