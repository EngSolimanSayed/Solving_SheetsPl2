//Q4.3
public class Main11 {
    public static void main(String[] args) {
        final double RADIUS = 6371.01;
        double XAtlanta = 33.7489954, YAtlanta = -84.3879824;
        double XOrlando = 28.5383355, YOrlando = -81.3792365;
        double XSavannah = 32.0835407, YSavannah = -81.0998342;
        double XCharlotte = 35.2270869, YCharlotte = -80.8431267;
        XAtlanta = Math.toRadians(XAtlanta);
        YAtlanta = Math.toRadians(YAtlanta);
        XOrlando = Math.toRadians(XOrlando);
        YOrlando = Math.toRadians(YOrlando);
        XSavannah = Math.toRadians(XSavannah);
        YSavannah = Math.toRadians(YSavannah);
        XCharlotte = Math.toRadians(XCharlotte);
        YCharlotte = Math.toRadians(YCharlotte);
        double d1 = RADIUS * Math.acos(Math.sin(XAtlanta) * Math.sin(XCharlotte)
                + Math.cos(XAtlanta) * Math.cos(XCharlotte) * Math.cos(YAtlanta - YCharlotte));
        double d2 = RADIUS * Math.acos(Math.sin(XAtlanta) * Math.sin(XOrlando)
                + Math.cos(XAtlanta) * Math.cos(XOrlando) * Math.cos(YAtlanta - YOrlando));
        double d3 = RADIUS * Math.acos(Math.sin(XOrlando) * Math.sin(XSavannah)
                + Math.cos(XOrlando) * Math.cos(XSavannah) * Math.cos(YOrlando - YSavannah));
        double d4 = RADIUS * Math.acos(Math.sin(XSavannah) * Math.sin(XCharlotte)
                + Math.cos(XSavannah) * Math.cos(XCharlotte) * Math.cos(YSavannah - YCharlotte));
        double r = RADIUS * Math.acos(Math.sin(XAtlanta) * Math.sin(XSavannah)
                + Math.cos(XAtlanta) * Math.cos(XSavannah) * Math.cos(YAtlanta - YSavannah));
        double s1 = (d2 + d3 + r) / 2;
        double s2 = (d1 + d4 + r) / 2;
        double area1 = Math.sqrt(s1 * (s1 - d2) * (s1 - d3) * (s1 - r));
        double area2 = Math.sqrt(s2 * (s2 - d1) * (s2 - d4) * (s2 - r));
        double area = area1 + area2;
        System.out.println("Area is : " + area);
    }
}