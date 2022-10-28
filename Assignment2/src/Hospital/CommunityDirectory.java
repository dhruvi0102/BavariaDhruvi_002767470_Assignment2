/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.util.ArrayList;

/**
 *
 * @author dhruv
 */
public class CommunityDirectory {
    private ArrayList<Community> communities;

    public CommunityDirectory() {
        communities = new ArrayList<Community>();
    }
    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<Community> communities) {
        communities = communities;
    }
    public Community addCommunity(Community newCommunity) {
        if (communities != null && !communities.stream().anyMatch(o -> o.getName().equals(newCommunity.getName()))) {
            communities.add(newCommunity);
            return newCommunity;
        } else if(communities == null) {
            communities.add(newCommunity);
            return newCommunity;
        }
        return null;
    }

    public void removeSupplier(Community community) {
        communities.remove(community);
    }

}
