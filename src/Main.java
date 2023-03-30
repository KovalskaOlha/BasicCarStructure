public class Main {
    public static void main(String[] args) {
       BasicStructure audi=new BasicStructure();
       audi.color="black";
       audi.model="A5";
       audi.power="5000cc";

       Engine x=new Engine();
       x.cylinders="8";
       x.size="12323";
       x.weight="2000";


       Color c=new Color();
       c.colorLights="green";
       c.colorType="neon";
       c.colorWindows="true";

       Lights neon=new Lights();
       neon.color="red";
       neon.size="big";
       neon.intensity="wooooow";

    }
}