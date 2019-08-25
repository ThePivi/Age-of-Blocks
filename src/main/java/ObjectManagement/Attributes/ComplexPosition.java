package ObjectManagement.Attributes;

import java.util.List;
import java.util.Objects;

public class ComplexPosition extends Position {
    private List<Integer> usableProperties;

    public List<Integer> getUsableProperties() {
        return usableProperties;
    }

    public void setUsableProperties(List<Integer> usableProperties) {
        this.usableProperties = usableProperties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexPosition that = (ComplexPosition) o;
        return Objects.equals(usableProperties, that.usableProperties) &&
                Objects.equals(getX(), that.getX()) &&
                Objects.equals(getY(), that.getY()) &&
                Objects.equals(getZ(), that.getZ());
    }

    @Override
    public int hashCode() {
        return Objects.hash(usableProperties, getX(), getY(), getZ() );
    }
}
