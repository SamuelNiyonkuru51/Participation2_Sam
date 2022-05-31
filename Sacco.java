import java.sql.Timestamp;
import java.util.*;


public class Sacco extends Company {

    static Scanner scan = new Scanner(System.in);
    static Scanner scan2 = new Scanner(System.in);

    static List<Sacco> ctList = new ArrayList<>();
    static List<History> histList = new ArrayList<>();
    int ctId;
    int ctBalance;

    //constructor
    Sacco(int ctId, int ctBalance) {
        this.ctId = ctId;
        this.ctBalance = ctBalance;
    }

    public int getCtId() {
        return ctId;
    }

    public int getCtBalance() {
        return ctBalance;
    }

    public String toString() {
        return ctId + "\t" + ctBalance;
    }

    public Sacco() {
    }

    public float interestRate() {
        return 0.99f;
    }

    static public void displayData() {
        for (Company company : ctList) {
            System.out.println(company);
        }
    }

    public static void deposit() {
        int depAmount, oldAmount, newAmount, a, cd;
        boolean b2 = false;
        //CampA ct;
        ArrayList<Sacco> ctAList = new ArrayList<>();
        ArrayList<Sacco> histAList = new ArrayList<>();
        ListIterator<Sacco> li = ctAList.listIterator();
        ListIterator<History> pi = histList.listIterator();
        for (Sacco ct : ctList) {
            System.out.print("Amount to deposit: ");
            depAmount = scan2.nextInt();
            a = ct.getCtBalance() + depAmount;
            oldAmount = ct.getCtBalance();
            Company company = (new Sacco(ct.getCtId(), a));
            //histList.add(new History(pi.next().getMyCampany(), depAmount, new Timestamp(System.currentTimeMillis())));

            b2 = true;
        }
        if (b2) {
            System.out.println("Deposit is Successful");
        } else {
            System.out.println("Deposit Failed");
        }

    }

    public static void displayHistory() {
        Iterator iter = histList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    class History {
        Company myCompany;
        int cumulPay;
        Timestamp mTime;

        //constructor
        History(Company myCompany, int cumulPay, Timestamp mTime) {
            this.myCompany = myCompany;
            this.cumulPay = cumulPay;
            this.mTime = mTime;
        }

        public Company getMyCompany() {
            return this.myCompany;
        }

        public int cumulPay() {
            return this.cumulPay;
        }

        public Timestamp mTime() {
            return mTime;
        }

        public String toString() {
            return myCompany + "\t" + cumulPay + "\t" + mTime;
        }
    }
}