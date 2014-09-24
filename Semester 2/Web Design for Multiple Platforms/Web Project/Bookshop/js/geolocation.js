		$(document).ready(function() {
			
			var startingLocation;
			var destination = "51.6219439,-8.8863889"; // replace this with any destination
			
			$('a.get-directions').click(function (e) {
				e.preventDefault();				
				
				// check if browser supports geolocation
				if (navigator.geolocation) { 
					
					// get user's current position
					navigator.geolocation.getCurrentPosition(function (position) {   
						
						// get latitude and longitude
						var latitude = position.coords.latitude;
						var longitude = position.coords.longitude;
						startingLocation = latitude + "," + longitude;
						
						// send starting location and destination to goToGoogleMaps function
						goToGoogleMaps(startingLocation, destination);
						
					});
				}
				
				// fallback for browsers without geolocation
				else {
					
					// get manually entered postcode
					startingLocation = $('.manual-location').val();
					
					// if user has entered a starting location, send starting location and destination to goToGoogleMaps function
					if (startingLocation != '') {
						goToGoogleMaps(startingLocation, destination);
					}
					// else fade in the manual postcode field
					else {
						$('.no-geolocation').fadeIn();
					}
					
				}
								
				// go to Google Maps function - takes a starting location and destination and sends the query to Google Maps
				function goToGoogleMaps(startingLocation, destination) {
					window.location = "https://maps.google.ie/maps?saddr=" + startingLocation + "&daddr=" + destination;
				}
				
					
			});
			
		});