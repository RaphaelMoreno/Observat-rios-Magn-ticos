/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.geo.model;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Raphael Moreno
 */


public class Model {
    
 
    public List<String> markers = new ArrayList<String>(); 
    
    
    
    /*public Model() throws FileNotFoundException{
        this.getJson();
    }*/
    
    public List<String> getRes() throws FileNotFoundException{
        return this.markers;
    }
    
    public void getJson() throws FileNotFoundException{
        //this.markers.add("addmarker({lat:" + 46.8 + ", lng:" + 76.9 + "});");
        //this.markers.add("addmarker({lat:" + 80.97 + ", lng:" + 38.77 + "});");
        //this.markers.add("addmarker({lat:" + (90-112.4) + ", lng:" + 316.35 + "});");
        Gson gson = new Gson();
	BufferedReader br = null;
	try {
		br = new BufferedReader(new FileReader("/locals.json"));
		JsonResult res = gson.fromJson(br, JsonResult.class);
                
		if(res != null) {
                    res.getLocais().forEach((Local l) -> {
                        markers.add("addmarker({lat:" + l.getColatitute() + ", lng:" + l.getEastLongitude() + "});");
                        out.println(markers.get(0));
                    });
                    
                    for(Local lo: res.getLocais()){
                        //this.markers.add("addmarker({lat:" + lo.getColatitute() + ", lng:" + lo.getEastLongitude() + "});");
                    }
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} finally {
		if(br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        }
    }
    
    
    
}
