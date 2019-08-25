package ObjectManagement.Doors;

import ObjectManagement.Attributes.Position;
import ObjectManagement.BasicItem;
import ObjectManagement.Properties.Accessible;
import ObjectManagement.Wall;

import java.util.List;

public class SpecialDoor extends Wall implements Accessible {
    private List<BasicItem> leversToOpen;
    private List<Position> leverPositionsToOpen;

    public SpecialDoor(List<BasicItem> leversToOpen, List<Position> leverPositionsToOpen) {
        this.leversToOpen = leversToOpen;
        this.leverPositionsToOpen = leverPositionsToOpen;
    }

    public Boolean openCheck () {
        for (int i = 0; i < leversToOpen.size(); i++) {
            // TODO if (leversToOpen.get(i).getComplexPosition)
        }
        return true;
    }
}
