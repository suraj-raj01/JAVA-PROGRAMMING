package design.specification2;

public class Employee {
    private String name;
    private String email;
    private String panCard;
    private String mobile;
    private Address permanentAddress;
    private Address presentAddress;
    private Address communicationAddress;

    public Employee(){

    }

    public Employee(String name, String email, String panCard, String mobile, Address permanentAddress, Address presentAddress, Address communicationAddress) {
        this.name = name;
        this.email = email;
        this.panCard = panCard;
        this.mobile = mobile;
        this.permanentAddress = permanentAddress;
        this.presentAddress = presentAddress;
        this.communicationAddress = communicationAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public Address getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(Address presentAddress) {
        this.presentAddress = presentAddress;
    }

    public Address getCommunicationAddress() {
        return communicationAddress;
    }

    public void setCommunicationAddress(Address communicationAddress) {
        this.communicationAddress = communicationAddress;
    }
    public String employeeDetails() {
        String response;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name : ");
        stringBuilder.append(name);
        stringBuilder.append(", Email : ");
        stringBuilder.append(email);
        stringBuilder.append(", panCard : ");
        stringBuilder.append(panCard);
        stringBuilder.append(", Mobile : ");
        stringBuilder.append(mobile);
        stringBuilder.append(", Address : ");
        Address address = new Address();
        stringBuilder.append(address.fullAddress());
        response = stringBuilder.toString();
        return response;
    }
}
