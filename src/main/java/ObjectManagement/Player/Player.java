package ObjectManagement.Player;

import ObjectManagement.Attributes.Position;
import ObjectManagement.Direction;
import ObjectManagement.Properties.Controllable;

public class Player implements Controllable {

    @Override
    public Position step(Position startPosition, Direction direction) {
        Position finalPosition = startPosition;
        switch (direction) {
            case UP:
                
                break;
            case DOWN:
                break;
            case LEFT:
                break;
            case RIGHT:
                break;
            case FORWARD:
                break;
            case BACKWARD:
                break;
            default:
                System.out.println("ERROR: this is not a direction! But how?");
                break;
        }
        return finalPosition;
    }
}
