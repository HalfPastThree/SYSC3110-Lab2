import java.util.ArrayList;

public class AddressBook {
    ArrayList<BuddyInfo> buddyInfos;
    public AddressBook(){
        buddyInfos = new ArrayList<BuddyInfo>();
    }
    public void addBuddy(BuddyInfo buddyInfo){
        buddyInfos.add(buddyInfo);
    }
    public void removeBuddy(BuddyInfo buddyInfo){
        buddyInfos.remove(buddyInfo);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);

    }
}
