<%
	String searchKey = (String) session.getAttribute("searchKey");
	searchKey = (searchKey!=null && !" , ".equalsIgnoreCase(searchKey))?searchKey:"";
%>
<!DOCTYPE html>
<html>
  <head>
    <title>Geocoding service</title>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">
    <style>
      /* Always set the map height explicitly to define the size of the div
       * element that contains the map. */
      #map {
        height: 100%;
      }
      /* Optional: Makes the sample page fill the window. */
      html, body {
        height: 100%;
        margin: 0;
        padding: 0;
      }
      #floating-panel {
        position: absolute;
        top: 10px;
        left: 25%;
        z-index: 5;
        background-color: #fff;
        padding: 5px;
        border: 1px solid #999;
        text-align: center;
        font-family: 'Roboto','sans-serif';
        line-height: 30px;
        padding-left: 10px;
      }
    </style>
  </head>
  <script type="text/javascript">
  	console.log("Serch key is : " + '<%=searchKey%>');
  </script>
  <body>
    <div id="floating-panel">
<!--       <input id="address" type="textbox" value="Sydney, NSW"> -->
<!--       <input id="submit" type="button" value="Geocode"> -->
      <label>Your Search key is : '<%=searchKey %>'</label>
    </div>
    <div id="map"></div>
    <script>
      function initMap() {
        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 15,
          center: {lat: -34.397, lng: 150.644}
        });
        var geocoder = new google.maps.Geocoder();
		geocodeAddress(geocoder, map);
        //document.getElementById('submit').addEventListener('click', function() {
        //  geocodeAddress(geocoder, map);
        //});
      }

      function geocodeAddress(geocoder, resultsMap) {
       // var address = document.getElementById('address').value;
       <%if(!searchKey.equalsIgnoreCase("")){%>
		var address = '<%=searchKey%>';
        geocoder.geocode({'address': address}, function(results, status) {
          if (status === 'OK') {
            resultsMap.setCenter(results[0].geometry.location);
            var marker = new google.maps.Marker({
              map: resultsMap,
              position: results[0].geometry.location
            });
          } else {
            alert('Geocode was not successful for the following reason: ' + status);
          }
        });
        <%} else{%>
        // Navigates to current location
        if (navigator.geolocation) {
            navigator.geolocation.getCurrentPosition(function (position) {
                initialLocation = new google.maps.LatLng(position.coords.latitude, position.coords.longitude);
                map.setCenter(initialLocation);
            });
        }
        	
        <%}%>
      }
    </script>
	<script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCuHCmyUX_-MSPoUtQZPPYicd4Vq52zf5k&callback=initMap">
    </script>
  
  </body>
</html>