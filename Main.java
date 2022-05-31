import java.util.*;

public class Main {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Sacco ca1 = new Sacco(101, 700);
        Company cb1 = new Equity(111, 800);
        Company cc1 = new BPR();

        String chn;
        String cht;

        do {
            System.out.print("1 Sacco\n2 Equity\n3 BPR\n\n Enter Your choice: ");
            chn=scan.nextLine();
            cht=scan.nextLine();
            switch (chn) {
                case "1" -> {
                    System.out.println("This is CampA");
                    Company company = new Sacco();
                    System.out.println("Company's interest is: " + company.interestRate() + "\n" + "The minimum duration is 3years");
                    do{
                        System.out.print("1 Display\n2 Deposit\n3 Withdraw\n4 History\n\n Enter Your choice: ");
                        cht=scan.nextLine();
                        switch (cht){
                            case "1" -> {
                                System.out.println("This is CompA\n");
                                Sacco.displayData();
                            }
                            case "2" -> {
                                System.out.println("You are going to deposit\n");
                                Sacco.deposit();
                            }
                            case "3" -> {
                                System.out.println("You are going to withdraw\n");
                                //CampA.withdraw();
                            }
                            case "4" -> {
                                System.out.println("You are going to display history\n");
                                Sacco.displayHistory();
                            }
                        }
                    }while(!cht.equals("0"));
                }
                case "2" -> {
                    System.out.println("This is CampB\n");
                    Company company = new Equity();
                    System.out.println("Company's interest is: " + company.interestRate() + "\n" + "The minimum duration is 3years");

                    do{
                        System.out.print("1 Display\n2 Deposit\n3 Withdraw\n4 History\n\n Enter Your choice: ");
                        cht=scan.nextLine();
                        switch (cht){
                            case "1" -> {
                                System.out.println("You are going to display\n");
                                Equity.displayData();
                            }
                            case "2" -> {
                                System.out.println("You are going to deposit\n");
                                Equity.deposit();
                            }
                            case "3" -> {
                                System.out.println("You are going to withdraw\n");
                                //CampB.withdraw();
                            }
                            case "4" -> {
                                System.out.println("You are going to display history\n");
                                Equity.displayHistory();
                            }
                        }
                    }while(!cht.equals("0"));

                }
                case "3" -> {
                    System.out.println("This is CampC\n");
                    Company company = new BPR();
                    System.out.println("Company's interest is: " + company.interestRate() + "\n" + "The minimum duration is 3years");

                    do{
                        System.out.print("1 Display\n2 Deposit\n3 Withdraw\n4 History\n\n Enter Your choice: ");
                        cht=scan.nextLine();
                        switch (cht){
                            case "1" -> {
                                System.out.println("You are going to display\n");
                                BPR.displayData();
                            }
                            case "2" -> {
                                System.out.println("You are going to deposit\n");
                                BPR.deposit();
                            }
                            case "3" -> {
                                System.out.println("You are going to withdraw\n");
                                //CampC.withdraw();
                            }
                            case "4" -> {
                                System.out.println("You are going to display history\n");
                                BPR.displayHistory();
                            }
                        }
                    }while(!cht.equals("0"));

                }
            }

        } while (!chn.equals("0"));

    }
    static public void displayData() {
        for (Sacco company : Equity.ctList) {
            boolean Sacco = false;
            System.out.println(Sacco);
        }
    }
}