class Vehicle{
    protected String brand = "Verna";
    public void honk(){
        System.out.println("Favorite car");
    }
}

class Car extends Vehicle{
    protected String cname = "ford";
    public static void main(String[] args){
        Car myObj = new Car();

        myObj.honk();
    }
}