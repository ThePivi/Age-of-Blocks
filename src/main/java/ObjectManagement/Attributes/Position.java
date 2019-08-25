package ObjectManagement.Attributes;

import java.util.Objects;

public class Position {
    private Float x;
    private Float y;
    private Float z;

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public Float getZ() {
        return z;
    }

    public void setZ(Float z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return Objects.equals(x, position.x) &&
                Objects.equals(y, position.y) &&
                Objects.equals(z, position.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
