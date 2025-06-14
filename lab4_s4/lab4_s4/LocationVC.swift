//
//  LocationVC.swift
//  lab4_s4
//
//  Created by Student on 14/06/2025.
//

import UIKit
import MapKit
import CoreLocation

class LocationVC: UIViewController, CLLocationManagerDelegate {
    
    
    @IBOutlet weak var latitudeLabel: UILabel!
    @IBOutlet weak var longitudeLabel: UILabel!
    @IBOutlet weak var mapView: MKMapView!
    @IBOutlet weak var addressLabel: UILabel!
        
    let locationManager = CLLocationManager()
    var currentLocation: CLLocation?

    override func viewDidLoad() {
            super.viewDidLoad()
            
            locationManager.delegate = self
            locationManager.desiredAccuracy = kCLLocationAccuracyBest
            
            locationManager.requestWhenInUseAuthorization()
            
            mapView.showsUserLocation = true
        }
                
        @IBAction func getLocationTapped(_ sender: UIButton) {
            locationManager.startUpdatingLocation()
        }
        
        
    @IBAction func showLocationOnMapTapped(_ sender: UIButton) {
        guard let location = currentLocation else {
            addressLabel.text = "Brak lokalizacji"
            return
        }
        
        let geocoder = CLGeocoder()
        geocoder.reverseGeocodeLocation(location) { placemarks, error in
            if let error = error {
                print("Reverse geocoding error: \(error.localizedDescription)")
                self.addressLabel.text = "Błąd geolokalizacji"
                return
            }
            
            if let placemark = placemarks?.first {
                let address = """
                    \(placemark.name ?? ""), \
                    \(placemark.thoroughfare ?? ""), \
                    \(placemark.locality ?? ""), \
                    \(placemark.postalCode ?? "")
                    """
                
                print("Adres: \(address)")
                self.addressLabel.text = address
                
                
                let annotation = MKPointAnnotation()
                annotation.coordinate = location.coordinate
                annotation.title = address
                self.mapView.addAnnotation(annotation)
                
                
                let region = MKCoordinateRegion(center: location.coordinate,
                                                span: MKCoordinateSpan(latitudeDelta: 0.01, longitudeDelta: 0.01))
                self.mapView.setRegion(region, animated: true)
            }
        }
    }
        @IBAction func resetMapTapped(_ sender: UIButton) {
                let planetariumSilesianCoordinates = CLLocationCoordinate2D(latitude: 50.2844, longitude: 18.9604)
                let region = MKCoordinateRegion(center: planetariumSilesianCoordinates,
                                                latitudinalMeters: 1000,
                                                longitudinalMeters: 1000)

                mapView.setRegion(region, animated: true)
                
                mapView.removeAnnotations(mapView.annotations)
                addressLabel.text = "Planetarium Śląskie"
            latitudeLabel.text = "50"
            longitudeLabel.text = "19"
            }
        
                
        func locationManager(_ manager: CLLocationManager, didUpdateLocations locations: [CLLocation]) {
            guard let location = locations.last else { return }
            currentLocation = location
            let latValue = location.coordinate.latitude
            let lonValue = location.coordinate.longitude

            let latDir = latValue >= 0 ? "N" : "S"
            let lonDir = lonValue >= 0 ? "E" : "W"

            let latitude = String(format: "%.2f", abs(latValue)) + "° \(latDir)"
            let longitude = String(format: "%.2f", abs(lonValue)) + "° \(lonDir)"

            latitudeLabel.text = latitude
            longitudeLabel.text = longitude
                        
            locationManager.stopUpdatingLocation()
        }
        
        func locationManager(_ manager: CLLocationManager, didFailWithError error: Error) {
            print("Nie można pobrać lokalizacji: \(error.localizedDescription)")
        }
    
    
}
