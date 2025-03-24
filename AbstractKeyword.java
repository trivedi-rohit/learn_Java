abstract class Plane
{
//Variables can not be abstracted.
    //abstract int a=10;
//methods without implementation/body/defination, but those method must be declared abstract.If any method in class is abstract then that class must be declared as abstract also.
    abstract public void takeOff();
    abstract public void fly();
    abstract public void landing();
    public void Airport()
    {
        System.out.println("All plane arrives at airport.");
    }
}
class cargoPlane extends Plane
{
    public void takeOff()
    {
        System.out.println("cargoPlane need longer runway to takeOff");
    }
    public void fly()
    {
        System.out.println("cargoPlane flies at lower height");
    }
    public void landing()
    {
        System.out.println("cargoPlane need longer runway for landing");
    }
}
class passengerPlane extends Plane
{
    public void takeOff()
    {
        System.out.println("passangerPlane needs medium height to takeOff");
    }
    public void fly()
    {
        System.out.println("passangerPlane flies at medium height");
    }
    public void landing()
    {
        System.out.println("PP need medium size runway");
    }
}
/*class fighterPlane extends Plane
{
    public void fly()
    {
        System.out.println("cargoPlane flies at higher height");
    }
}
    
*/
class Airport
{
    public void permit(Plane plane)
    {
        plane.takeOff();
        plane.landing();
        plane.fly();
    }
}
class AbstractKeyword
{
    public static void main(String[] args)
    {
        cargoPlane cp = new cargoPlane();
        passengerPlane pp = new passengerPlane();
        //fighterPlane    fp=new fighterPlane();

        Airport a = new Airport();
        a.permit(cp);
        a.permit(pp);
        //a.permit(fp);

    }
}