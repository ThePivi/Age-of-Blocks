package ObjectManagement.Properties;

import ObjectManagement.Attributes.Position;
import ObjectManagement.Direction;

public interface Movable {

    public Position move (Position startPosition, Direction direction);
}
