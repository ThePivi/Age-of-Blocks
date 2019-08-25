package ObjectManagement.Properties;

import ObjectManagement.Attributes.Position;
import ObjectManagement.Direction;

public interface Controllable {

    public Position step (Position startPosition, Direction direction);
}
