package design.specification2;
public class MyUtility {
    public static boolean isValidAddress(Address address)
    {
        boolean response = false;
        int pincode = address.getPincode();
        int flatnumber = address.getFlatNumber();
        if(flatnumber>0){
            if(pincode>99999 && pincode<999999)
            {
                response = true;
            }
        }
        return response;
    }
    public static boolean isValidPanCard(Employee employee)
    {
        boolean response = false;
        String panCard = employee.getPanCard();
        String[] name = employee.getName().split("");
        if(panCard.charAt(3)==name[1].charAt(0))
        {
            response = true;
        }
        return  response;
    }
}
