
package dndcombat;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Mitchell Bath
 */
public class Model implements Serializable{

    ArrayList<Player> party;
    
    public Model() {
        this.party = new ArrayList<Player>();
    }

    public ArrayList<Player> getParty() {
        return party;
    }
    
    public void addPartyMember(Player player) {
        party.add(player);
    }
    
    public void removePartyMember(Player player) {
        party.remove(player);
    }
    
}
