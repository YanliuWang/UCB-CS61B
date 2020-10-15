/**
 * @author yanliu
 * @create 2020-10-15-13:29
 */
public class Body {
    public double xxPos; // Its current x position
    public double yyPos; // Its current y position
    public double xxVel; // Its current velocity in the x direction
    public double yyVel; // Its current velocity in the y direction
    public double mass; // Its mass

    // The name of the file that corresponds to the image that depicts the body (for example, jupiter.gif)
    public String imgFileName;

    // the gravitational constant
    private static final double G = 6.67e-11;

    public Body(double xxPos, double yyPos, double xxVel,
                double yyVel, double mass, String imgFileName) {
        this.xxPos = xxPos;
        this.yyPos = yyPos;
        this.xxVel = xxVel;
        this.yyVel = yyVel;
        this.mass = mass;
        this.imgFileName = imgFileName;
    }

    public Body(Body b) {
        this.xxPos = b.xxPos;
        this.yyPos = b.yyPos;
        this.xxVel = b.xxVel;
        this.yyVel = b.yyVel;
        this.mass = b.mass;
        this.imgFileName = b.imgFileName;
    }

    public double calcDistance(Body b) {
        if (b == null) {
            throw new IllegalArgumentException();
        }

        double xDistance = Math.abs(b.xxPos - this.xxPos);
        double yDistance = Math.abs(b.yyPos - this.yyPos);

        return Math.sqrt(xDistance*xDistance + yDistance*yDistance);
    }

    public double calcForceExertedBy(Body b) {
        if (b == null) {
            throw new IllegalArgumentException();
        }

        double r = this.calcDistance(b);

        return G * this.mass * b.mass / (r * r);

    }

}
