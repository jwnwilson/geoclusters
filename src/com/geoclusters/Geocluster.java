package com.geoclusters;

import java.util.ArrayList;

/**
 * Created by noelwilson on 10/12/2015.
 *
 * Used to store an Array of Geos which are connected and are assigned to a user
 */
public class Geocluster {
    ArrayList<Geo> geocluster;

    public Geocluster(){
        geocluster = new ArrayList<Geo>();
    }

    public void remove(Geo g){
        geocluster.remove(g);
    }

    public void add(Geo g){
        geocluster.add(g);
    }

    public ArrayList<Geo> get_geocluster(){
        return geocluster;
    }

    public boolean has(Geo g){
        for(int i=0;i<geocluster.size();i++){
            if(geocluster.get(i) == g){
                return true;
            }
        }
        return false;
    }

    /**
     * Pretty string output using the Geos output function
     * @return String geo cluster output
     */
    public String output(){
        String output_str = "";
        for(int i=0;i<geocluster.size();i++){
            output_str += geocluster.get(i).output() + "\n";
        }

        return output_str;
    }
}
