      if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(success, error);
      
      } else {
        /* error('not supported'); */
        // No geolocation fallback: Defaults to Lisbon, Portugal
        createMap({
        coords : false,
        address : "Clonakilty, Cork"
        });
      }

      var directionDisplay;
      var directionsService = new google.maps.DirectionsService();
      var map;

      function success(position) {
        directionsDisplay = new google.maps.DirectionsRenderer();
        var latlng = new google.maps.LatLng(51.6219439,-8.8863889);
        var mapOptions = {
          zoom:15,
          mapTypeId: google.maps.MapTypeId.ROADMAP,
          center: latlng
        }
        map = new google.maps.Map(document.getElementById('mapcanvas'), mapOptions);
        directionsDisplay.setMap(map);
        directionsDisplay.setPanel(document.getElementById("directionPanel"));

        var end = "51.6219439,-8.8863889";
        var start =  position.coords.latitude + ',' + position.coords.longitude;
        var mode;

        switch ( 'driving' )
        {
          case 'bicycling' :
            mode = google.maps.DirectionsTravelMode.BICYCLING;
            break;
          case 'driving':
            mode = google.maps.DirectionsTravelMode.DRIVING;
            break;
          case 'walking':
            mode = google.maps.DirectionsTravelMode.WALKING;
            break;
        }
        var request = {
            origin:start,
            destination:end,
            travelMode: mode
        };
        
        directionsService.route(request, function(response, status) {
          if (status == google.maps.DirectionsStatus.OK) {
            directionsDisplay.setDirections(response);
          }

        });

      }

      function error(msg) {
        var s = document.querySelector('#status');
        s.innerHTML = typeof msg == 'string' ? msg : "failed";
        s.className = 'fail';
  
        console.log(arguments);
       }

    