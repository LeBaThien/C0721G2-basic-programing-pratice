package b6_inheritance_polymorphism.excercise.point2d_and_point3d;

public class Point3d extends Point2d {
    private float z;

    public Point3d() {

    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array1 = new float[3];
        array1[0] = getX();
        array1[1] = getY();
        array1[2] = getZ();
        return array1;
    }

    public Point3d(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3d{" + "x=" + getX() + ", y=" + getY() +
                ", z=" + z +
                '}';
    }
}
