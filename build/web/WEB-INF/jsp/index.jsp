<%-- 
    Document   : index
    Author     : Raphael Moreno
--%>

<%@page import="java.util.List"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.FileNotFoundException"%>
<%@page import="br.com.geo.model.JsonResult"%>
<%@page import="br.com.geo.model.Model"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GeoMap Location</title>
        <style>
        /* Always set the map height explicitly to define the size of the div
         * element that contains the map. */
        #map {
          height: 100%;
          width: 100%;
        }
        /* Optional: Makes the sample page fill the window. */
        html, body {
          height: 100%;
          margin: 0;
          padding: 0;
        }
      </style>
    </head>
    <body>
      
        
         
         <div id="map"></div>
    <script>
      function initMap() {
        var uluru = {lat: 0, lng: 0};
        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 2,
          center: uluru
        });
        
        <%
           Model model = new Model();
           model.getJson();  
           for(String d: model.markers){
               out.println(d);
           }
         %>
        
        
        function addmarker(coords){
            var marker = new google.maps.Marker({
            
                position: coords,
                map: map,
                icon: 'c:/favicon.ico'
                                
        });
        }
        
      }
       
    </script>
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key="API KEY "&callback=initMap">
    </script>
    </body>
</html>
